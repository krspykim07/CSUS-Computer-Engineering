#lab5.asm
#Vigomar Kim Algador
#14 March 2022

.intel_syntax noprefix        #use Intel formatting
.data                         #Start the data section

Heading:
     .ascii "Let's play Chuck-a-Luck!\nEnter 0 to exit\n\0"

Template1:
     .ascii "\nYou have $\0"
Template2:
     .ascii "\nHow much are you betting?\n\0"

ErrorMessage:
     .ascii "\nYour bet is more than the money you have!\n\0"

Message1:
     .ascii "\nFirst die is: \0"
Message2:
     .ascii "\nSecond die is: \0"
Message3:
     .ascii "\nThird die is: \0"

Lost:
    .ascii "\n\nYou lose!\n\0"
Won:
    .ascii "\n\nYou win!\n\0"

Money:
     .quad 100
Bet:
     .quad 0

Dice1:
     .quad 0
Dice2:
     .quad 0
Dice3:
     .quad 0


.text
.global _start

_start:
     #heading
     lea rcx, Heading
     call PrintStringZ

Betting:
     lea rcx, Template1
     call PrintStringZ
     mov rcx, Money
     call PrintInt
     lea rcx, Template2
     call PrintStringZ
     call ScanInt
     mov Bet, rcx           #moving input num to Bet
     cmpq Bet, 0            #compare Bet
     jle End                #jump End (Bet <= 0)
     
     mov rcx, Money
     cmpq Bet, rcx          #compare Bet
     jg Error               #Jump Error (Bet > Money)

     jmp Rolling            #jump to Rolling

Error:
     lea rcx, ErrorMessage  #Error message
     call PrintStringZ
     jmp Betting            #jump to Betting

Rolling:
#FIRST DIE
     lea rcx, Message1      #Die 1 message
     call PrintStringZ
     mov rcx, 6             #range number
     call Random            #random num 0-5
     add rcx, 1             #rcx num 1-6
     call PrintInt
     mov Dice1, rcx

#SECOND DIE
     lea rcx, Message2      #Die 2 message
     call PrintStringZ
     mov rcx, 6             #range number
     call Random            #random num 0-5
     add rcx, 1             #rcx num 1-6
     call PrintInt
     mov Dice2, rcx

#THIRD DIE
     lea rcx, Message3      #Die 3 message
     call PrintStringZ
     mov rcx, 6             #range number
     call Random            #random num 0-5
     add rcx, 1             #rcx num 1-6
     call PrintInt
     mov Dice3, rcx
     
#JUMP HEADER
     cmpq Dice1, 6
     je caseWon
     cmpq Dice2, 6
     je caseWon
     cmpq Dice3, 6
     je caseWon
     jmp Default

#GAME WON
caseWon:
     lea rcx, Won            #Won message
     call PrintStringZ
     mov rcx, Bet
     add Money, rcx          #Money += Bet
     jmp Betting

#GAME LOST
Default:
     lea rcx, Lost           #Lost message
     call PrintStringZ
     mov rcx, Bet
     sub Money, rcx          # Money -= Bet
     jmp Betting

#EXIT
End:
     call Exit                #exit
