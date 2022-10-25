#!/usr/bin/bash
# A SIMPLE SCRIPT TO MAKE A JAR FILE OUT OF JAVA SOURCE CODE!

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

# Ask for the directory in which there is the source code and then compile it to ByteCode
clear
printf "Hello!\n\nPlease, give me the path to the source code:\n(Enter the path to one .java file or to the directory containing every .java file of the project.)\n"
read source_path
while [ ! -d "$source_path" ]
do
  printf "\nDirectory does not exist!"
  sleep 3
  clear
  printf "Hello!\n\nPlease, give me the path to the source code:\n(Enter the path to one .java file or to the directory containing every .java file of the project.)\n"
  read source_path
done

# Single Java file case
if [ "${source_path: -5}" = ".java" ]
then

	# Compile Java file
	javac $source_path
	java_file=$(basename $source_path) && java_class="${java_file::-5}.class" && unset java_file
	mv "${source_path::-5}.class" $java_class

	# Get main class && create MANIFEST file
	ask_mainClass
	echo "Main-Class: ${main_class}" >> MANIFEST.MF

	# Get necessary info && create jar file
	ask_jarName
	ask_destinationPath
	jar cvmf MANIFEST.MF "${destination_path}${jar_name}" $java_class
	chmod +x "${destination_path}${jar_name}"

	# Clean unnecessary files
	rm -rf MANIFEST.MF $java_class

else
	if [ "$source_path: -1}" = "/"]
	then
		javac "${source_path}*.java"
	else
		javac "${source_path}*/.java"
	fi
fi