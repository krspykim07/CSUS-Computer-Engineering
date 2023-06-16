# Vigomar Kim Algador
# CSC35_LAB06

.intel_syntax noprefix
.data

Greetings:
     .ascii "\n\n Welcome to the Market Place! What do you want?\n\0"
OptionBeginning:
     .ascii "\n (\0"
Option1:
     .ascii ") Corn Seed         -  $\0"
Option2:
     .ascii ") Strawberry Seed   -  $\0"
Option3:
     .ascii ") Watermelon Seed   -  $\0"
Option4:
     .ascii ") Pumpkin Seed      -  $\0"
Option5:
     .ascii ") Melon Seed        -  $\0"
Option6:
     .ascii ") Eggplant Seed     -  $\0"
NextLine:
     .ascii "\n\0"

SelectionMessage:
     .ascii "\n\n   Enter your selection: \0"
PaymentMessage:
     .ascii "\n   How much did you give the clerk?\n   \0"
ChangeMessage1:
     .ascii "\n   Your change is $\0"
ChangeMessage2:
     .ascii ". Good fortune to you.\n\n\0"
Money:
     .quad 0
Option:
     .quad 0
Change:
     .quad 0

CornSeedCost:
     .quad 0
StrawberrySeedCost:
     .quad 0
WatermelonSeedCost:
     .quad 0
PumpkinSeedCost:
     .quad 0
MelonSeedCost:
     .quad 0
EggplantSeedCost:
     .quad 0

.text
.global _start

_start:
     lea rcx, Greetings
     call PrintStringZ

# Option 1: Corn Seed     
     lea rcx, OptionBeginning
     call PrintStringZ
     
     mov rcx, 6
     call SetForeColor
     mov rcx, 1
     call PrintInt
     mov rcx, 7
     call SetForeColor
     
     lea rcx, Option1
     call PrintStringZ

     mov rcx, 3
     call SetForeColor
     mov rcx, 13
     call Random
     add rcx, 3
     call PrintInt
     mov CornSeedCost, rcx
     mov rcx, 7
     call SetForeColor

# Option 2: Strawberry Seed
     lea rcx, OptionBeginning
     call PrintStringZ
     
     mov rcx, 6
     call SetForeColor
     mov rcx, 2
     call PrintInt
     mov rcx, 7
     call SetForeColor

     lea rcx, Option2
     call PrintStringZ

     mov rcx, 3
     call SetForeColor
     mov rcx, 13
     call Random
     add rcx, 3
     call PrintInt
     mov StrawberrySeedCost, rcx
     mov rcx, 7
     call SetForeColor

# Option 3: Watermelon Seed
     lea rcx, OptionBeginning
     call PrintStringZ
     
     mov rcx, 6
     call SetForeColor
     mov rcx, 3
     call PrintInt
     mov rcx, 7
     call SetForeColor

     lea rcx, Option3
     call PrintStringZ

     mov rcx, 3
     call SetForeColor
     mov rcx, 13
     call Random
     add rcx, 3
     call PrintInt
     mov WatermelonSeedCost, rcx
     mov rcx, 7
     call SetForeColor

# Option 4: Pumpkin Seed
     lea rcx, OptionBeginning
     call PrintStringZ
     
     mov rcx, 6
     call SetForeColor
     mov rcx, 4
     call PrintInt
     mov rcx, 7
     call SetForeColor

     lea rcx, Option4
     call PrintStringZ

     mov rcx, 3
     call SetForeColor
     mov rcx, 13
     call Random
     add rcx, 3
     call PrintInt
     mov PumpkinSeedCost, rcx
     mov rcx, 7
     call SetForeColor

# Option 5: Melon Seed
     lea rcx, OptionBeginning
     call PrintStringZ
     
     mov rcx, 6
     call SetForeColor
     mov rcx, 5
     call PrintInt
     mov rcx, 7
     call SetForeColor

     lea rcx, Option5
     call PrintStringZ

     mov rcx, 3
     call SetForeColor
     mov rcx, 13
     call Random
     add rcx, 3
     call PrintInt
     mov MelonSeedCost, rcx
     mov rcx, 7
     call SetForeColor

# Option 6: Eggplant Seed
     lea rcx, OptionBeginning
     call PrintStringZ
     
     mov rcx, 6
     call SetForeColor
     mov rcx, 6
     call PrintInt
     mov rcx, 7
     call SetForeColor

     lea rcx, Option6
     call PrintStringZ

     mov rcx, 3
     call SetForeColor
     mov rcx, 13
     call Random
     add rcx, 3
     call PrintInt
     mov EggplantSeedCost, rcx
     mov rcx, 7
     call SetForeColor

     lea rcx, SelectionMessage
     call PrintStringZ

     mov rcx, 2
     call SetForeColor
     call ScanInt
     mov Option, rcx
     mov rcx, 7
     call SetForeColor
     
     lea rcx, PaymentMessage
     call PrintStringZ

     mov rcx, 2
     call SetForeColor
     call ScanInt
     mov Money, rcx
     mov rcx, 7
     call SetForeColor

     cmpq Option, 1
     je CornSection
     cmpq Option, 2
     je StrawberrySection
     cmpq Option, 3
     je WatermelonSection
     cmpq Option, 4
     je PumpkinSection
     cmpq Option, 5
     je MelonSection
     cmpq Option, 6
     je EggplantSection
     call Exit

CornSection:
     mov rcx, CornSeedCost
     sub Money, rcx
     jmp End
StrawberrySection:
     mov rcx, StrawberrySeedCost
     sub Money, rcx
     jmp End
WatermelonSection:
     mov rcx, WatermelonSeedCost
     sub Money, rcx
     jmp End
PumpkinSection:
     mov rcx, PumpkinSeedCost
     sub Money, rcx
     jmp End
MelonSection:
     mov rcx, MelonSeedCost
     sub Money, rcx
     jmp End
EggplantSection:
     mov rcx, EggplantSeedCost
     sub Money, rcx

End:
     lea rcx, ChangeMessage1
     call PrintStringZ

     mov rcx, 1
     call SetForeColor
     mov rcx, Money
     call PrintInt
     mov rcx, 7
     call SetForeColor

     lea rcx, ChangeMessage2
     call PrintStringZ
     call Exit

