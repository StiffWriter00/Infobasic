#!/usr/bin/bash
# A simple script to make a jar file out of Java source code!

# STATIC FUNCTIONS
# Ask for the main class
ask_mainClass() {
	printf "\nPlease, insert the name of the main class:\n"
	read main_class
}

# Ask for the name of the jar file
ask_jarName() {
	printf "\nPlease, insert the name of the jar file you want to create:\n"
	read jar_name
}

# Ask for the directory in which to save the jar file
ask_destinationPath() {
	printf "\nPlease, insert the path in which to save the jar file:\n"
	read destination_path
	if [ "${destination_path: -1}" != "/" ]
	then
		destination_path="${destination_path}/"
	fi
}
# END

# SCRIPT
# Ask for the directory in which there is the source code and then compile it to ByteCode
printf "\nHello!\n\nPlease, give me the path to the source code:\n(Enter the path to one .java file or to the directory containing every .java file of the project.)\n\n"
read source_path
java_file=""

if [ "${source_path: -5}" = ".java" ]
then

	# Compile Java file
	javac $source_path

	# Get main class && create MANIFEST file
	ask_mainClass
	echo "Main-Class: ${main_class}" >> MANIFEST.MF

	# Get necessary info && create jar file
	ask_destinationPath
	ask_jarName
	source_pathClass="${source_path::-5}.class"
	jar_path="${destination_path}${jar_name}.jar"
	jar cvmf MANIFEST.MF $jar_path $source_pathClass
	chmod +x $jar_path

	# Clean unnecessary files
	rm -rf MANIFEST.MF $source_pathClass

else
	if [ "$source_path: -1}" = "/"]
	then
		javac "${source_path}*.java"
	else
		javac "${source_path}*/.java"
	fi
fi
# END