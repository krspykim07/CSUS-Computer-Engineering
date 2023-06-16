.intel_syntax noprefix
.data

Header:
     .ascii "Welcome to The Gold Bug Saloon!\n\n\0"
FrshStk:
     .ascii "1. Fresh elk steaks (323 cents)\n\0"
NotFrshStk:
     .ascii "2. Not-so-fresh steaks (152 cents)\n\0"
ChknSndwch:
     .ascii "3. Chicken sandwiches (215 cents)\n\0"
MlkMshBwls:
     .ascii "4. Milk and mush bowls (97 cents)\n\0"
BgBrrlBeer:
     .ascii "5. Big-o-barrel-of-beer (737 cents)\n\0"
Ordermssg:
     .ascii "\nWhat is your order?\n\0"
Partymssg:
     .ascii "\nYour party enjoyed:\n\0"
SpltBillmssg:
     .ascii "\nHow many people are splitting the bill\n\0"
PayUpmssg1:
     .ascii "\nOkay, witches and wizards, give \0"
PayUpmssg2:
     .ascii " cents each.\n\0"
Errormssg:
     .ascii "Invalid choice!\n\0"

Food:
     .quad FrshStk
     .quad NotFrshStk
     .quad ChknSndwch
     .quad MlkMshBwls
     .quad BgBrrlBeer

Costs:
     .quad 323
     .quad 152
     .quad 215
     .quad 97
     .quad 737

.text
.global _start

_start:

     lea rcx, Header
     call PrintStringZ
     mov rax, 0

DoWhile:
     mov rcx, [Food + rax * 8]
     call PrintStringZ
     add rax, 1
     cmp rax, 5
     jl DoWhile

OrderUp:
     lea rcx, Ordermssg
     call PrintStringZ
     call ScanInt

     cmp rcx, 1
     jl NotInChoices
     cmp rcx, 5
     jg NotInChoices
     mov rax, rcx
     sub rax, 1
     
     lea rcx, Partymssg
     call PrintStringZ
     
     mov rcx, [Food + rax * 8]
     call PrintStringZ
     
     mov rcx, [Costs + rax * 8]
     mov rax, rcx
     
     lea rcx, SpltBillmssg
     call PrintStringZ
     call ScanInt
     CQO
     DIV rcx
     
     lea rcx, PayUpmssg1
     call PrintStringZ
     
     mov rcx, rax
     call PrintInt
     
     lea rcx, PayUpmssg2
     call PrintStringZ
     call Exit

NotInChoices:
     lea rcx, Errormssg
     call PrintStringZ
     jmp OrderUp

