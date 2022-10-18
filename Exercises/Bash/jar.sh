#!/usr/bin/bash
# A simple script to make a jar file out of Java source code!

# SCRIPT

# Ask for the directory in which there is the source code and then compile it to ByteCode
printf "\nHello!\n\nPlease, give me the path to the source code:\n(Enter the path to one .java file or to the directory containing every .java file of the project.)\n"
read source_path

if [ "${source_path: -5}" = ".java" ]
then
	# Get info
	main_class=ask_mainClass()
	jar_name=ask_jarName()
	destination_path=ask_destinationPath()


	javac $source_path
	echo "Main-Class: ${main_class}" >> MANIFEST.MF
	jar cvmf MANIFEST.MF 

else
	if [ "$source_path: -1}" = "/"]
	then
		javac "${source_path}*.java"
	else
		javac "${source_path}*/.java"
	fi
fi

# END

##echo "Main-Class: Module_1" >> MANIFEST.MF
##javac Module_1.java
##jar cvmf MANIFEST.MF Module_1.jar Module_1.class
##chmod +x Module_1.jar
##rm -rf *.MF *.class

# STATIC FUNCTIONS

# Ask for the main class
ask_mainClass() {
	printf "\nPlease, tell which is the main class."
	read main_class
	return main_class
}

# Ask for the name of the jar file
ask_jarName() {
	printf "\n Please, tell me the name of the jar file you want to create"
	read jar_name
	return jar_name
}

# Ask for the directory in which to save the jar file
ask_destinationPath() {
	dprintf "\nPlease, give me the path in which to save the jar file:"
	read destination_path
	return destination_path
}

# END
