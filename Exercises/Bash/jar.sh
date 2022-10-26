#!/usr/bin/bash
# A SIMPLE SCRIPT TO MAKE A JAR FILE OUT OF JAVA SOURCE CODE!
# It works with the JDK by compiling the code first with javac, it's recommended to use it in Debian based systems.

# ASK FOR THE DIRECTORY IN WHICH THERE IS THE SOURCE CODE AND THEN COMPILE IT TO BYTECODE
clear; printf "Hello!\n\nPlease, give me the path to the source code:\n(Enter the path to one (or the name of one) .java file or to the directory containing every .java file of the project.)\n"
read input

# SINGLE JAVA FILE CASE
if [ "${input: -5}" = ".java" ]
then

	# CHECK IF DIRECTORY EXISTS OR IF FILE EXISTS IN CURRENT WORKING DIRECTORY
	while [ ! -d $(dirname $input) ] || [ ! -f "$input" ]
	do
	  printf "\nDirectory or file does not exist!"; sleep 3
	  clear; printf "Hello!\n\nPlease, give me the path to the source code:\n(Enter the path to one (or the name of one) .java file or to the directory containing every .java file of the project.)\n"
	  read input
	done

	# COMPILE JAVA FILE
	javac $input
	java_file=$(basename $input); java_class="${java_file::-5}.class"; unset java_file
	mv "${input::-5}.class" $java_class

	# GET MAIN CLASS AND CREATE MANIFEST FILE
	clear; printf "Please, insert the name of the main class:\n(WARNING! No error handling on this one, enter a valid name!)\n"
	read main_class
	echo "Main-Class: ${main_class}" >> MANIFEST.MF

	# GET JAR FILE NAME
	clear; printf "Please, insert the name of the jar file you want to create:\n"
	read jar_name
	if [ "${jar_name: -4}" != ".jar"]
	then
		jar_name="${jar_name}.jar"
	fi

	# GET THE PATH WHERE TO SAVE THE JAR FILE
	clear; printf "Please, insert the path in which to save the jar file:\n"
	read destination_path
	while [ ! -d "destination_path" ]
	do
	  printf "\nDirectory does not exist!"; sleep 3
	  clear; printf "Please, insert the path in which to save the jar file:\n"
	  read destination_path
	done
	if [ "${destination_path: -1}" != "/" ]
	then
		destination_path="${destination_path}/"
	fi

	# GENERATE JAR FILE
	jar cvmf MANIFEST.MF "${destination_path}${jar_name}" $java_class
	chmod +x "${destination_path}${jar_name}"

	# CLEAN UNNECESSARY FILES
	rm -rf MANIFEST.MF $java_class

fi