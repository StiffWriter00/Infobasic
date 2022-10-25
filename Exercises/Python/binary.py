# CONVERT INTEGERS TO BINARY
import platform
import os

# SYSTEM VERIFICATION FOR CLEAR COMMAND
if platform.system() == "Windows":
    clear = lambda: os.system('cls')
else:
    clear = lambda: os.system('clear')
clear()

# PROGRAM
print("Insert number (type 'exit' to close the program or press 'ctrl+c' to clear the screen).\n")
while True:
    try:
        try:

            Input = input()
            if Input == 'exit':
                clear()
                exit()

            Input = int(Input)
            if Input >= 0:
                print('\n' + bin(Input)[2:] + '\n\n')
            else:
                print('\n-' + bin(Input)[3:] + '\n\n')
            del Input

        except ValueError:
            print("\nInsert numbers only!\n\n")
    except KeyboardInterrupt:
        clear()
        print("Insert number (type 'exit' to close the program or press 'ctrl+c' to clear the screen).\n")