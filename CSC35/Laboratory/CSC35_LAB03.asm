≈#lab3.asm
#Vigomar Kim Algador

#1. Assembly : as -o lab3.o lab3.asm
#2. Link     : ld -o a.out lab2.o csc35.o
#3. Execute  : ./a.out

.intel_syntax noprefix        #use Intel formatting
.data                         #Start the data section

Heading:
    .ascii "Sutter's Fort Finance Calculator\n\0"

Money:
    .quad 0

Question1:
     .ascii "How much did the Fort collect?\n\0"

Question2:
     .ascii "How much was spent on employee salaries?\n\0"

Question3:
     .ascii "How much was spent on repairs?\n\0"

Cashflow:
     .ascii "Mr. Sutter, your cash flow is $\0"

.text
.global _start

_start:
     lea rcx, Heading         #Put address Heading to rcx
     call PrintStringZ        #Print out the heading

     lea rcx, Question1       #Put address Question 1 to rcx
     call PrintStringZ        #Print out the Question 1
     call ScanInt             #call the scanner
     add Money, rcx           #add the value to the Money

     lea rcx, Question2       #Put address Question 2 to rcx
     call PrintStringZ        #Print out the Question 2
     call ScanInt             #call the scanner
     sub Money, rcx           #subtract the value to the Money
          
     lea rcx, Question3       #Put address Question 3 to rcx  
     call PrintStringZ        #Print out the Question 3
     call ScanInt             #call the scanner
     sub Money, rcx           #subtract the value to the Money

     lea rcx, Cashflow        #Put address Cashflow to rcx
     call PrintStringZ        #Print out the final message
     mov rcx, Money           #move Money value to rcx
     call PrintInt            #Print out the final value rcx
     
     call Exit
