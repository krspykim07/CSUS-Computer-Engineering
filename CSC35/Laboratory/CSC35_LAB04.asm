#lab4.asm
#Vigomar Kim Algador
#07 March 2022

.intel_syntax noprefix        #use Intel formatting
.data                         #Start the data section

Heading:
    .ascii "Sutter's Mill Contract\n\0"

Ordered:
    .quad 0

Trees:
    .quad 0

Question1:
     .ascii "How many trees were ordered?\n\0"

Question2:
     .ascii "How many trees were cut down?\n\0"

Question3:
     .ascii "How many trees were rejected?\n\0"

Question4:
     .ascii "How many trees were lost down the river?\n\0"

Harvest1:
     .ascii "\nThey harvested \0"

Harvest2:
     .ascii " trees.\n\n\0"

SuccessMessage:
     .ascii "They SUCCESSFULLY fulfilled the contract!\n\0"

FailMessage:
     .ascii "They FAILED to fulfill the contract!\n\0"

.text
.global _start

_start:
     lea rcx, Heading         #Put address Heading to rcx
     call PrintStringZ        #Print out the heading

     lea rcx, Question1       #Put address Question 1 to rcx
     call PrintStringZ        #Print out the Question 1
     call ScanInt             #call the scanner
     add Ordered, rcx         #add the value to the Ordered

     lea rcx, Question2       #Put address Question 2 to rcx
     call PrintStringZ        #Print out the Question 2
     call ScanInt             #call the scanner
     add Trees, rcx           #subtract the value to the Trees
          
     lea rcx, Question3       #Put address Question 3 to rcx  
     call PrintStringZ        #Print out the Question 3
     call ScanInt             #call the scanner
     sub Trees, rcx           #subtract the value to the Trees

     lea rcx, Question4       #Put address Question 4 to rcx
     call PrintStringZ        #Print out the Question 4
     call ScanInt             #call the scanner
     sub Trees, rcx           #subtract the value to the Trees

     lea rcx, Harvest1        #Put address Harvest1 to rcx
     call PrintStringZ        #Print out the Harvest1
     mov rcx, Trees           #move Trees value to rcx
     call PrintInt            #Print out the final value rcx
     lea rcx, Harvest2        #Put address Harvest2 to rcx
     call PrintStringZ        #Print out the Harvest2     

     mov rcx, Trees           #move Trees value to rcx
     mov rbx, Ordered         #move Ordered value to rbx
     cmp rbx, rcx             #Comparing rbx to rcx
     jg else                  #if (rbx > rcx), jump to else
     
     lea rcx, SuccessMessage  #Put address SuccessMessage to rcx
     call PrintStringZ        #Print out the SuccessMessage
     jmp end                  #jump to end

else:
     lea rcx, FailMessage     #Put address FailMessage to rcx
     call PrintStringZ        #Print out the FailMessage
end:
     call Exit                #exit
