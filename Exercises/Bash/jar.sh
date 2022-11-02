#!/usr/bin/bash
# -------------------------------------------------------------------------
# A SIMPLE SCRIPT TO MAKE A JAR FILE OUT OF JAVA SOURCE CODE!
# It works with the JDK by compiling the code first with the "javac" command.
# -------------------------------------------------------------------------

# STATIC METHODS ---> coming soon (for case n°2)

# START SCRIPT
while :
do

	# ASK FOR THE PATH TO SOURCE CODE
	clear; printf "Welcome!\n\nPlease, give me the path to the source code:\n(Enter the path to one .java file or to the project directory containing every .java file.)\n"
	read input

	# CASE N°1 ---> USE A SINGLE JAVA FILE
	if [ "${input: -5}" = ".java" ]
	then

		# COMPILE JAVA FILE AND MOVE CLASS FILE TO CURRENT DIRECTORY
		echo ""
		if ! javac $input
		then
			printf "\nFile not found! Try again.\n"
			sleep 5
			continue
		fi
		java_file=$(basename $input); java_class="${java_file::-5}.class"; unset java_file
		mv "${input::-5}.class" $java_class

		# GET MAIN CLASS AND CREATE MANIFEST FILE
		clear; printf "Please, insert the name of the main class:\n(WARNING! No error handling on this one, please enter a valid name or the jar file won't run!)\n"
		read main_class
		echo "Main-Class: ${main_class}" >> MANIFEST.MF

		# GET JAR FILE NAME
		clear; printf "Please, insert the name of the jar file you want to create:\n"
		read jar_name
		if [ "${jar_name: -4}" != ".jar" ]
		then
			jar_name="${jar_name}.jar"
		fi

		# GET THE PATH WHERE TO SAVE THE JAR FILE
		clear; printf "Please, insert the path in which to save the jar file:\n"
		read destination_path
		while [ ! -d $destination_path ]
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
		echo ""
		jar cvmf MANIFEST.MF "${destination_path}${jar_name}" $java_class
		chmod +x "${destination_path}${jar_name}"
		echo ""; sleep 3; clear

		# CLEAN UNNECESSARY FILES
		rm -rf MANIFEST.MF $java_class
		break

	# CASE N°2 ---> USE AN ENTIRE DIRECTORY
	else

		# CHECK IF DIRECTORY EXISTS
		if [ ! -d $(dirname $input) ]
		then
			printf "\nDirectory does not exist!"
			sleep 5
			continue
		fi

	fi

done
# END SCRIPT