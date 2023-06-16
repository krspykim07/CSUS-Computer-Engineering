# Title: Town Life
# Name: Vigomar Kim Algador
# CSC35-01 PROJECT

# Description:
# This program is a game titled Town Life
# This game is a like a farming game living in a small town
# It allows the user to do things such as farming, mining, cooking, and others


.intel_syntax noprefix        #use Intel formatting
.data                         #Start the data section

HeadingDivider:
     .ascii "=================================================================\n\0"
HeaderTitle:
     .ascii "        _____                         _     _   ___\n"
     .ascii "       |_   _| ___ __ __ __ _ __     | |   (_) |  _| ___\n"
     .ascii "         | |  / _ \\\\ V  V /| '  \\    | |__ | | |  _|/ -_)\n"
     .ascii "         |_|  \\___/ \\_/\\_/ |_||_|    |____||_| |_|  \\___|\n\0"
GameDeveloperName:
     .ascii "\n                                    Game by: Vigomar Kim Algador\n\0"
UpperBricker:
     .ascii "_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___\n"
     .ascii "___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_\n"
     .ascii "_|___|                                                     |_|___\n\0"
BrickSide1:
     .ascii "_|___|                                                     |_|___\n\0"
BrickSide2:
     .ascii "___|_|                                                     |___|_\n\0"
LowerBricker1:
     .ascii "_|___|_____________________________________________________|_|___\n"
     .ascii "___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_\n"
     .ascii "_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___\n\0"
LowerBricker2:
     .ascii "___|_|_____________________________________________________|___|_\n"
     .ascii "_|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___\n"
     .ascii "___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|___|_\n\0"

MainMenuChoices1:
     .ascii "___|_|       (\0"
MainMenuChoices2:
     .ascii ") Start Game          (\0"
MainMenuChoices3:
     .ascii ") Exit Game         |___|_\n\0"

# Game Play Messages
GameplayMessage:
     .ascii "___|_|  GAMEPLAY:                                          |___|_\n"
     .ascii "_|___|     MONEY        »» currency                        |_|___\n"
     .ascii "___|_|     ENERGY LEVEL »» function to work                |___|_\n"
     .ascii "_|___|     HUNGER LEVEL »» function to survive             |_|___\n"
     .ascii "___|_|                                                     |___|_\n"
     .ascii "_|___|  ⦿ You are given options to do for a day.           |_|___\n"
     .ascii "___|_|  ⦿ There are 4 seasons: 30 days each season.        |___|_\n"
     .ascii "_|___|     (Spring, Summer, Fall, Winter).                 |_|___\n"
     .ascii "___|_|  ⦿ You are only given a max Crops count of 500      |___|_\n"
     .ascii "_|___|    and gold count of 200.                           |_|___\n"
     .ascii "___|_|                                                     |___|_\n"
     .ascii "_|___|     (1) Continue to the game                        |_|___\n"
     .ascii "___|_|     (2) Go to Instructions                          |___|_\n\0"
GameplayMessageBack:
     .ascii "_|___|     (3) Go Back                                     |_|___\n\0"

StartingGameMessage1:
     .ascii "___|_|  Welcome to Town Life!                              |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|       You are just moved in and                     |___|_\n"
     .ascii "_|___|          now starting a new life in a farm!         |_|___\n"
     .ascii "___|_|                                                     |___|_\n"
     .ascii "_|___|       You are given a $\0"
StartingGameMessage2:
     .ascii " to start up.             |_|___\n\0"

# MAIN GAME MESSAGES
MainGameChoices:
     .ascii "___|_|   (1) Farm       (4) Go to town     (7) Exit Game   |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|   (2) Mine       (5) Rest                           |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|   (3) Eat Food   (6) Help                           |___|_\n\0"

# FARMING MESSAGES
CropsStatusEmptyMessage:
     .ascii "___|_|  FARMING STATUS: No crops planted                   |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|   Do you want to plant seeds?                       |___|_\n"
     .ascii "_|___|      (1) Yes               (2) No                   |_|___\n\0"
CropsEmptyAskPlanting:
     .ascii "\n      How many seeds do you want to plant? ► \0"

CropsStatusPlantMessage:
     .ascii "___|_|  FARMING STATUS: you planted successfully           |___|_\n"
     .ascii "_|___|                                                     |_|___\n\0"

CropsDaysMessage1:
     .ascii "___|_|     ⦿ DAYS TO HARVEST:      \0"
CropsDaysMessage2:
     .ascii " days\t           |___|_\n\0"

CropsStatusWaitMessage:
     .ascii "___|_|  FARMING STATUS: Crops are not ready to harvest!    |___|_\n"
     .ascii "_|___|                                                     |_|___\n\0"

CropsStatusReadyMessage:
     .ascii "___|_|  FARMING STATUS: Crops are ready to harvest!        |___|_\n\0"
CropsStatusHarvestMessage:
     .ascii "_|___|                  You harvested \0"
CropsHarvestCount:
     .ascii " crops\t\t   |_|___\n"
     .ascii "___|_|                                                     |___|_\n\0"

NotEnoughSeedAvailableMessage:
     .ascii "\n      NOT ENOUGH SEEDS TO PLANT!! \n\0"
FarmingCropsStorageFullMessage:
     .ascii "_|___|     However, your Crops storage is Full!            |_|___\n"
     .ascii "___|_|     Please make some space first before harvest.    |___|_\n\0"
MaxFieldMessage:
     .ascii "\n      YOU CAN ONLY PLANT 100 MAX!! \n\0"

CropsWinterMessage:
     .ascii "___|_|  Its winter! You can't farm right now!              |___|_\n\0"

CropsWitheredMessage:
     .ascii "___|_|  All of your crops gone bad! What a waste!          |___|_\n\0"

# MINING MESSAGE
MiningMessage1:
     .ascii "___|_|    You went to Mine!                                |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|            Ting... Ting... Ting...                  |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|       You mined \0"
MiningMessage2:
    .ascii " gold(s)!\t\t\t   |___|_\n\0"
MiningGoldStorageFullMessage:
    .ascii "\n      Your Gold Storage is full!! \n\0"

# EATING MESSAGE
EatingNoFoodMessage:
     .ascii "___|_|      It seems you have no crops to cook.            |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|       You better start farming you Lazy!            |___|_\n"
     .ascii "_|___|         or buy some food in town!!                  |_|___\n\0"

EatingFoodMessage1:
     .ascii "___|_|      You use, prepare, and cook \0"
EatingFoodMessage2:
     .ascii " crop(s).\t   |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|      You spent \0"
EatingFoodMessage3:
     .ascii " hours\t\t\t\t   |___|_\n"
     .ascii "_|___|         for cooking, eating, and resting!           |_|___\n\0"

# TOWN MESSAGE
TownMessage:
     .ascii "___|_|  Welcome to SACRAMENTO TOWN!                        |___|_\n"
     .ascii "_|___|        What should we do here??                     |_|___\n"
     .ascii "___|_|           (1) Go to Market Place                    |___|_\n"
     .ascii "_|___|           (2) Go to Saloon                          |_|___\n"
     .ascii "___|_|           (3) Go Back                               |___|_\n\0"

# MarketPlace MESSAGES
MarketPlaceMessage:
     .ascii "___|_| ++++++++++++++++  MARKET PLACE  ++++++++++++++++++  |___|_\n"
     .ascii "_|___|                                                     |_|___\n\0"
MarketPlaceMessageBuySeed:
     .ascii "___|_|    (1) Buy Seeds       Current seed cost $ \0"
MarketPlaceMessageSellCrops:
     .ascii "\t   |___|_\n"
     .ascii "_|___|    (2) Sell Crops      Current Crops cost $ \0"
MarketPlaceMessageSellGold:
     .ascii "\t   |_|___\n"
     .ascii "___|_|    (3) Sell Gold       Current Gold cost $ \0"
MarketPlaceMessageGoBack:
     .ascii "\t   |___|_\n"
     .ascii "_|___|    (4) Go Back                                      |_|___\n\0"
BuyingSeedMessage:
     .ascii "\n      How Many Seeds you want to buy? ►  \0"
SellingCropsMessage:
     .ascii "\n      How Many Crops you want to sell? ►  \0"
SellingGoldMessage:
     .ascii "\n      How Many Golds you want to sell? ►  \0"

MarketPlaceClosedMessage:
     .ascii "___|_|      Market Place is currently closed!              |___|_\n"
     .ascii "_|___|      Come back when its open                        |_|___\n"
     .ascii "___|_|          OPEN: 6:00 - 18:00                         |___|_\n\0"

# Buying Seeds and Selling MESSAGES
BuySellMessage1:
     .ascii "___|_|      The total will be: $\0"
BuySellMessage2:
     .ascii "\t                   |___|_\n\0"
BuySeedsConfirmMessage:
     .ascii "_|___|      (1) Buy Seeds                                  |_|___\n\0"
SellCropsConfirmMessage:
     .ascii "_|___|      (1) Sell Crops                                 |_|___\n\0"
SellGoldConfirmMessage:
     .ascii "_|___|      (1) Sell Gold                                  |_|___\n\0"
BuySellMessageGoBack:
     .ascii "___|_|      (2) Go Back                                    |___|_\n\0"
NotEnoughMoneyMessage:
     .ascii "\n      NOT ENOUGH MONEY!! \n\0"
NotEnoughCropsAvailableMessage:
     .ascii "\n      NOT ENOUGH CROPS TO SELL!! \n\0"
NotEnoughGoldAvailableMessage:
     .ascii "\n      NOT ENOUGH GOLD TO SELL!! \n\0"

# SALOON MESSAGE
SaloonHeadingMessage:
     .ascii "___|_| +++++++++++++++++++  SALOON  +++++++++++++++++++++  |___|_\n"
     .ascii "_|___|                                                     |_|___\n\0"
SaloonChoicesMessage1:
     .ascii "___|_|     (1) Buy Food          Need minimum $ \0"
SaloonChoicesMessage2:
     .ascii "         |___|_\n"
     .ascii "_|___|     (2) Go get a drink    Need minimum $ \0"
SaloonChoicesMessage3:     
     .ascii "        |_|___\n"
     .ascii "___|_|     (3) Go Back                                     |___|_\n\0"

# SALOON GET FOOD
SaloonGetFoodMessage1:
     .ascii "___|_|     You ordered their specialty!                    |___|_\n"
     .ascii "_|___|     You spent $ \0"
SaloonGetFoodMessage2:
     .ascii " for the food.\t                   |_|___\n\0"

# SALOON GET DRINK
SaloonGoDrinkMessage1:
     .ascii "___|_|  You get yourself a drink...                        |___|_\n"
     .ascii "_|___|     You can't resist yourself and drink more...     |_|___\n"
     .ascii "___|_|           and more...    and more...                |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|     You spent all night drinking...                 |___|_\n"
     .ascii "_|___|      You spent a total of $\0"
SaloonGoDrinkMessage2:
     .ascii ".\t\t           |_|___\n\0"

SaloonGoodMorningMessage:
     .ascii "___|_| Good Morning!                                       |___|_\n"
     .ascii "_|___|                                                     |_|___\n\0"
SaloonSafeMessage1:
     .ascii "___|_|  You were able to get home safely...                |___|_\n\0"
SaloonSafeMessage2:
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|      You found \0"
SaloonSafeMessage3:
     .ascii " gold in your pocket.\t\t   |___|_\n\0"
SaloonRobMessage1:
     .ascii "___|_|  You found yourself lying on the streets            |___|_\n"
     .ascii "_|___|      you checked your pocket and lost some money    |_|___\n"
     .ascii "___|_|                                                     |___|_\n"
     .ascii "_|___|      You got robbed and lost $ \0"
SaloonRobMessage2:
     .ascii "!\t\           |_|___\n\0"
SaloonGetDrinkNoMoneyMessage:
     .ascii "___|_|     Bartender rejected to give you drink!           |___|_\n\0"
SaloonGetFoodNoMoneyMessage:
     .ascii "___|_|     Server rejected to serve you food!              |___|_\n\0"
SaloonNoMoneyMessage:
     .ascii "_|___|     You don't have enough money!                    |_|___\n"
     .ascii "___|_|        Go back next time                            |___|_\n\0"

SaloonClosedMessage:
     .ascii "___|_|      Saloon is currently closed!                    |___|_\n"
     .ascii "_|___|      Come back when its open                        |_|___\n"
     .ascii "___|_|          OPEN: 15:00 till midnight                  |___|_\n\0"

# RESTING MESSAGE
RestingMessage:
     .ascii "___|_|  You went back home to rest!                        |___|_\n"
     .ascii "___|_|        (1) Spend 1 hour rest                        |___|_\n"
     .ascii "_|___|        (2) call for the day                         |_|___\n"
     .ascii "___|_|        (3) Go back outside                          |___|_\n\0"
RestOneHourMessage:
     .ascii "\n      You spend 1 hour doing nothing! \n\0"
RestJustSleepMessage:
     .ascii "\n      Its midnight! You cannot rest for 1 hour! \n\0"
RestForTheDayMessage:
     .ascii "\n      You rest for the day and went to bed \n\0"

# INSTRUCTION MESSAGES
InstructionMessage:
     .ascii "___|_|  INSTRUCTIONS AND GUIDELINES:                       |___|_\n"
     .ascii "_|___|       (1) Farming guide                             |_|___\n"
     .ascii "___|_|       (2) Mining guide                              |___|_\n"
     .ascii "_|___|       (3) The town                                  |_|___\n"
     .ascii "___|_|       (4) Energy and Hunger level                   |___|_\n"
     .ascii "_|___|       (5) Lives                                     |_|___\n"
     .ascii "___|_|       (6) Go Back                                   |___|_\n\0"

GuideFarmingMessage:
     .ascii "___|_|  FARMING GUIDE:                                     |___|_\n"
     .ascii "_|___|  ⦿ You need to have seeds to farm.                  |_|___\n"
     .ascii "___|_|  ⦿ You can only plant a maximum of 50 seeds.        |___|_\n"
     .ascii "_|___|  ⦿ Farming cost hours, energy level, increase       |_|___\n"
     .ascii "___|_|    hunger level when planting and harvest.          |___|_\n"
     .ascii "_|___|  ⦿ NOTE:                                            |_|___\n"
     .ascii "___|_|    » If you forgot to harvest the crops on time,    |___|_\n"
     .ascii "_|___|      some of crops starting to withered.            |_|___\n"
     .ascii "___|_|    » You can't plant on WINTER!                     |___|_\n\0"

GuideMiningMessage:
     .ascii "___|_|  MINING GUIDE                                       |___|_\n"
     .ascii "_|___|     ⦿ Mining cost hours, energy level, increase     |_|___\n"
     .ascii "___|_|        hunger level when planting and harvest.      |___|_\n\0"

GuideTownMessage:
     .ascii "___|_|  THE TOWN:                                          |___|_\n"
     .ascii "_|___|  ⦿ In the Market Place:                             |_|___\n"
     .ascii "___|_|      You can buy seed, sell crops, sell gold.       |___|_\n"
     .ascii "_|___|      Everyday the cost changes randomly.            |_|___\n"
     .ascii "___|_|  ⦿ In the Saloon:                                   |___|_\n"
     .ascii "_|___|      You spend money to drink till midnight.        |_|___\n"
     .ascii "___|_|      After, it resets to the next day.              |___|_\n\0"

GuideEnergyHungerMessage:
     .ascii "___|_|  ENERGY AND HUNGER LEVEL GUIDE:                     |___|_\n"
     .ascii "_|___|  ⦿ Ways to decrease Energy and increase Hunger:     |_|___\n"
     .ascii "___|_|        Farming, Mining                              |___|_\n"
     .ascii "_|___|  ⦿ Ways to replenish Energy and decrease Hunger:    |_|___\n"
     .ascii "___|_|        Eating food, Rest, Go to Saloon.             |___|_\n\0"

GuideLivesMessage:
     .ascii "___|_|  LIVES:                                             |___|_\n"
     .ascii "_|___|  ⦿ You are given 3 hearts.                          |_|___\n"
     .ascii "___|_|    Losing 3 hearts means Game Over.                 |___|_\n"
     .ascii "_|___|  Conditions:                                        |_|___\n"
     .ascii "___|_|  ⦿ You must maintain your Energy level above 0.     |___|_\n"
     .ascii "_|___|  ⦿ You must maintain your Hunger level below 100.   |_|___\n"
     .ascii "___|_|  ⦿ You must Rest before the Time reaches 24:00.     |___|_\n\0"

GuidingAddress:
     .quad GuideFarmingMessage
     .quad GuideMiningMessage
     .quad GuideTownMessage
     .quad GuideEnergyHungerMessage
     .quad GuideLivesMessage

# ATTRIBUTES MESSAGES
LivesHeart3:
     .ascii "      | ♥ ♥ ♥ |\0"
LivesHeart2:
     .ascii "      | ♥ ♥   |\0"
LivesHeart1:
     .ascii "      | ♥     |\0"
LivesNum:
     .quad LivesHeart1
     .quad LivesHeart2
     .quad LivesHeart3

Spring:
     .ascii "     SPRING\0"
Summer:
     .ascii "     SUMMER\0"
Fall:
     .ascii "     FALL\0"
Winter:
     .ascii "     WINTER\0"
SeasonNum:
     .quad Spring
     .quad Summer
     .quad Fall
     .quad Winter

DayMessage:                                         # Day message
     .ascii "   Day \0"
TimeMessage1:                                       # Time message
     .ascii "   Time: \0"
TimeMessage2:
     .ascii ":00\n\0"
MoneyMessage:                                       # Money message
     .ascii "         Money: $ \0"
EnergyLevelMessage:                                      # EnergyLevel Level message
     .ascii "\t\n         Energy Level: \0"
HungerMessage:
     .ascii "\t\n         Hunger Level: \0"
SeedsMessage:
     .ascii "\t\t\tSeeds count: \0"
CropsMessage:                                       # number of Crops message
     .ascii "\t\tCrops count: \0"
GoldMessage:                                        # number of Gold message
     .ascii "\t\tGold count:  \0"
PercentSign:                                        # Percent sign output
     .ascii "%\0"
NextLine:                                           # next line
     .ascii "\n\0"

# FILLING UP ATTRIBUTES
EnergyIncreasedMess:
     .ascii "      ⦿ ENERGY REPLENISHED: \0"
HungerDecreasedMess:
     .ascii "      ⦿ HUNGER LEVEL:       \0"

# WORKING EFFECT ATTRIBUTES
WorkHoursMessage1:
     .ascii "_|___|     ⦿ HOURS WORKED:         \0"
WorkHoursMessage2:
     .ascii " hours\t\t   |_|___\n\0"
EnergyConsumedMessage1:
     .ascii "___|_|     ⦿ ENERGY CONSUMED:      \0"
EnergyConsumedMessage2:
     .ascii " %\t\t\t   |___|_\n\0"
HungerIncreaseMessage1:
     .ascii "_|___|     ⦿ HUNGER INCREASE BY:   \0"
HungerIncreaseMessage2:
     .ascii " %\t\t\t   |_|___\n\0" 

# RESTING & EATING EFFECT ATTRIBUTES
EnergyIncreasedMessage1:
     .ascii "___|_|     ⦿ ENERGY REPLENISHED BY:   \0"
EnergyIncreasedMessage2:
     .ascii " %\t\t   |___|_\n\0" 
HungerDecreasedMessage1:
     .ascii "_|___|     ⦿ HUNGER DECREASED BY:     \0"
HungerDecreasedMessage2:
     .ascii " %\t\t   |_|___\n\0" 

PassOutMessage:
     .ascii "___|_|  You passed out!                                    |___|_\n"
     .ascii "_|___|     Someone saw you lying on the ground             |_|___\n"
     .ascii "___|_|     You got treated in the hospital.                |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|     You paid \0"
PassOutMessage2:
     .ascii " dollars\t\t                   |___|_\n\0"
OptionMessage:
     .ascii "\n      Option ► \0"
DeathMessage:
     .ascii "___|_|              You died! Game Over!                   |___|_\n\0"
PausingSectionMessage:
     .ascii "\nPress ENTER to Continue  ► \0"
QuitMessage:
     .ascii "___|_|             Thank You for Playing!                  |___|_\n\0"

YearFinishGame:
     .ascii "___|_|  CONGRATS!                                          |___|_\n"
     .ascii "_|___|     You made it in a year life as a farmer!         |_|___\n"
     .ascii "___|_|     Do you still want to continue playing?          |___|_\n"
     .ascii "_|___|                                                     |_|___\n"
     .ascii "___|_|        (1) Continue playing                         |___|_\n"
     .ascii "_|___|        (2) Quit game                                |_|___\n\0"

Seasons:                                           # Season (Spring, Summer, Fall, Winter)
     .quad 1
Time:                                              # Time (starts at 6 am)
     .quad 6
Day:                                               # Day (starts at Day 1)
     .quad 1
Money:                                             # Money (starts on $100)
     .quad 100
EnergyLevel:                                       # Energy Level at 100%
     .quad 100
HungerLevel:                                       # Hunger Level at 0%
     .quad 0
CropsCount:                                        # Crops Count: 0
     .quad 0
GoldCount:                                         # Gold Count: 0
     .quad 0
Lives:                                             # 3 Lives
     .quad 3
Option:                                            # Option for User
     .quad 0
RobbingMoney:                                      # Robbing Money (After Drinking in Saloon)
     .quad 0
CropsStatus:                                       # Crops Status (Planting, Planted, Harvest)
     .quad 0
PlantingSeeds:                                     # number of seeds planted
     .quad 0
CropsSeeds:                                        # number of seeds
     .quad 0
CropsDays:                                         # number of Days till Harvest
     .quad 0
RemainPlant:                                       # Remaining planted (when the crops storage is full)
     .quad 0
GoldMined:                                         # Gold Mined (when the Gold is full)
     .quad 0
SeedCost:                                          # Seed cost
     .quad 0
BuyingSeeds:                                       # number of seeds to buy
     .quad 0
CropsCost:                                         # Crops cost to sell
     .quad 0
SellingCrops:                                      # number of crops to sell
     .quad 0
GoldCost:                                          # Gold cost
     .quad 0
SellingGold:                                       # number of Gold to sell
     .quad 0
TotalCost:                                         # Total cost
     .quad 0
FoundGold:                                         # Founded Gold (after Drinking in Saloon)
     .quad 0

.text
.global _start

_start:
     call SetBackColor                             # call to set Backgrould Color
     call DefaultColor                             # call to set text to Default Color

StartingMenu:                                      # STARTING MENU SCREEN (OPENING GAME)
     call Heading
     call UpperBrick
     lea rcx, MainMenuChoices1
     call PrintStringZ
     
     call CyanColor                                # call Cyan color
     mov rcx, 1                                    # output 1
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, MainMenuChoices2                     # Print 1st choice (Start Game)
     call PrintStringZ
     
     call CyanColor                                # call Cyan color
     mov rcx, 2                                    # output 2
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, MainMenuChoices3                     # Print 2nd choice (Exit Game)
     call PrintStringZ

     lea rcx, BrickSide1
     call PrintStringZ
     call LowerBrick2
     
     call OptionalSection                          # call OptionalSection (lets the user input option)
     cmpq Option, 1                                # If option = 1 (Go to GamePlay)
     je GamePlay                        
     cmpq Option, 2                                # If option = 2 (Go to QuitGame)
     je QuitGame                        
     jmp StartingMenu                              # Loop to StartingMenu

GamePlay:                                          # GAME PLAY INSTRUCTION SCREEN
     call Heading
     call HelpingSection                           # call HelpingSection (Outputs the Gameplay)
     lea rcx, GameplayMessageBack
     call PrintStringZ
     call LowerBrick2

     call OptionalSection                          # call OptionalSection (lets the user input option)
     cmpq Option, 1                                # if option = 1 (Go to Starting Game)
     je StartingGame
     cmpq Option, 2                                # if option = 2 (Go to FirstInstruction)
     je FirstInstructions
     cmpq Option, 3                                # if option = 3 (Go back to Starting Menu)
     je StartingMenu
     jmp GamePlay                                  # Loop to GamePlay

     FirstInstructions:
          call Instructions                        # call Instruction (full instructions)
          jmp GamePlay                             # go back to GamePlay

StartingGame:                                      # FIRST-TIME STARTING GAME SCREEN
     call Heading
     call UpperBrick
     lea rcx, StartingGameMessage1                 # Output the first message for playing new game
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, 100                                  # output 100
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, StartingGameMessage2
     call PrintStringZ
     call LowerBrick2

     call PausingSection                           # Call to pause the screen
     call ChangeStoreCost                          # call ChangeStoreCost (Change the values of goods in the store)

MainGame:                                          # MAIN GAME SCREEN
     call Attributes                               # call Attributes (Output the attributes)
     call UpperBrick

     lea rcx, MainGameChoices                      # Output the choices for main game
     call PrintStringZ
     call LowerBrick1

     call OptionalSection
     cmpq Option, 1                                # if option = 1 (Go to Farming Menu)
     je FarmingMenu
     cmpq Option, 2                                # if option = 2 (Go to Mining Menu)
     je MiningMenu
     cmpq Option, 3                                # if option = 3 (Go to Eating Menu)
     je EatingMenu
     cmpq Option, 4                                # if option = 4 (Go to Town Menu)
     je TownMenu
     cmpq Option, 5                                # if option = 5 (Go to Resting Menu)
     je RestingMenu
     cmpq Option, 6                                # if option = 6 (Go to Helping Menu)
     je HelpingMenu
     cmpq Option, 7                                # if option = 7 (Go to Quit Menu)
     je QuitGame
     jmp MainGame                                  # Loop to MainGame

FarmingMenu:                                       # FARMING MENU
     cmpq Seasons, 4                               # compare the Season = 4: Winter (Jump to CropsWinter)
     je CropsStatusWinter
     cmpq CropsStatus, 0                           # If CropsStatus == 0 : Jump to CropsStatusEmpty
     je CropsStatusEmpty                           
     cmpq CropsStatus, 1                           # If CropsStatus == 1 : Jump to CropStatusWithered
     je CropsStatusWithered
     cmpq CropsDays, 0                             # compare the crops days left to 0
     jg CropsStatusWait                            # if there are still days left jump to waitCrops (cropsdays > 0)
     jmp CropsStatusReady                          # jump to harvestCrops

CropsStatusWinter:                                 # WINTER SEASON FARMING
     call Attributes
     call UpperBrick
     lea rcx, CropsWinterMessage                   # Prompt Crops Winter Message
     jmp CropsBad

CropsStatusWithered:
     call Attributes
     call UpperBrick
     lea rcx, CropsWitheredMessage                 # Prompt Crops Winter Message

CropsBad:
     call PrintStringZ
     call LowerBrick1

     call PausingSection                           # Call to pause the screen
     movq CropsStatus, 0                           # Change Crops Status to 0 (empty field)
     movq PlantingSeeds, 0                         # Change Planting Seeds to 0 (no seeds planted)
     jmp MainGame 
     
CropsStatusEmpty:                                  # FARMING STATUS: EMPTY FARM
     call Attributes
     call UpperBrick
     lea rcx, CropsStatusEmptyMessage              # print Farm Status: No crops planted
     call PrintStringZ
     call LowerBrick2

     call OptionalSection                     
     cmpq Option, 1                                # if Option = 1: Go to AskingSeeds
     je AskingSeeds
     cmpq Option, 2                                # if Option = 2: Go to MainGame
     je MainGame
     jmp CropsStatusEmpty                          # Loop the CropsStatusEmpty window

AskingSeeds:                                       # FARMING STATUS: ASK USER TO PLANT SEED
     lea rcx, CropsEmptyAskPlanting                # Prompt user to input seeds to plant
     call PrintStringZ

     call ScanInt                                  # Enables user to input how many seeds to plant
     
     cmp rcx, 0                                    # If Input <= 0: Go to Asking seeds (loop)
     jle CropsStatusEmpty
     
     cmp CropsSeeds, rcx                           # If CropsSeeds < input: Go to NotEnoughSeedsAvailable
     jl NotEnoughSeedAvailable

     cmp rcx, 100                                  # If Input (rcx) > 100 : jump to MaxField
     jg MaxField
     
     mov PlantingSeeds, rcx                        # Store input (rcx) to PlantingSeeds

     call Attributes                               # New Screen with Attributes
     call UpperBrick
     mov rcx, PlantingSeeds
     sub CropsSeeds, rcx                           # CropsSeeds (Available) - PlantingSeeds (Seeds that are using to plant)

     lea rcx, CropsStatusPlantMessage
     call PrintStringZ
     lea rcx, CropsDaysMessage1
     call PrintStringZ
     
     call GreenColor                               # call Green Color

     mov rcx, 10                                   # creating random number of how many days till harvest (3-12 days)
     call Random
     add rcx, 3
     call PrintInt
     mov CropsDays, rcx                            # Store random number day to CropsDays

     call DefaultColor                             # call Default color

     lea rcx, CropsDaysMessage2
     call PrintStringZ

     movq CropsStatus, 2                           # Setting CropsStatus = 2 (Field is not empty)
     jmp WorkingAttributes                         # Jump to WorkingAttributes

NotEnoughSeedAvailable:
     lea rcx, NotEnoughSeedAvailableMessage        # Print out message not enough seeds available
     call PrintStringZ

     call PausingSection                           # Call to pause the screen
     jmp CropsStatusEmpty                          # Jump to CropsStatusEmpty

MaxField:
     lea rcx, MaxFieldMessage                      # Prompt Max field message
     call PrintStringZ

     call PausingSection                           # Call to pause the screen
     jmp CropsStatusEmpty                          # Jump to CropsStatusEmpty

CropsStatusWait:                                   # FARMING STATUS: CROPS STATUS WAIT
     call Attributes
     call UpperBrick
     lea rcx, CropsStatusWaitMessage               # Prompt Crops Status Wait Message
     call PrintStringZ
     lea rcx, CropsDaysMessage1
     call PrintStringZ

     call GreenColor                               # call Green Color

     mov rcx, CropsDays                            # Print out Days left till Harvest
     call PrintInt

     call DefaultColor                             # call Default color

     lea rcx, CropsDaysMessage2
     call PrintStringZ
     call LowerBrick1

     call PausingSection                           # Call to pause the screen 
     jmp MainGame                                  # Go back to Main Game screen

CropsStatusReady:                                  # FARMING STATUS: CROPS STATUS READY TO HARVEST
     call Attributes
     call UpperBrick
     lea rcx, CropsStatusReadyMessage
     call PrintStringZ

     cmpq CropsCount, 500                          # If CropsCount > 500 (Crops Capacity): Go to Farming Storage Full
     jge FarmingCropsStorageFull
     
     lea rcx, CropsStatusHarvestMessage            # prompt harvest message
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, 500                                  # move 500 to rcx
     sub rcx, CropsCount                           # subtract CropsCount to rcx
     cmp rcx, PlantingSeeds                        # If rcx < PlantingSeeds : jump to CropsRemainPlanted   (If remaining available crops storage < seeds planted)
     jl CropsRemainPlanted
     
     mov rcx, PlantingSeeds                        # output seeds planted

     movq CropsStatus, 0                           # store 0 to CropsStatus (Empty field)
     jmp CropsStatusReadyAddCrops

CropsRemainPlanted:
     subq PlantingSeeds, rcx                       # subtract rcx to PlantingSeeds (remaining crops to harvest)

CropsStatusReadyAddCrops:
     call PrintInt                                 # prompt the crops harvested
     add CropsCount, rcx                           # add seeds planted to crops count
     call DefaultColor                             # call Default color

     lea rcx, CropsHarvestCount
     call PrintStringZ

     jmp WorkingAttributes                         # Go to Working Attributes

FarmingCropsStorageFull:
     lea rcx, FarmingCropsStorageFullMessage       # Prompt Crops Storage Full Message
     call PrintStringZ
     call LowerBrick1
     
     call PausingSection                           # Call to pause the screen 
     jmp MainGame

MiningMenu:
     cmpq GoldCount, 200                           # If GoldCount >= 200: Go to MiningGoldFull (indicate full gold storage)
     jge MiningGoldFull

     call Attributes
     call UpperBrick

     lea rcx, MiningMessage1
     call PrintStringZ
     
     call YellowColor                              # call Yellow color
     mov rcx, 10                                   # generate Random number from 0 - 10
     call Random
     add GoldCount, rcx                            # add the number (rcx) to GoldCount
     mov GoldMined, rcx
     cmpq GoldCount, 200                           # If GoldCount > 200 : Jump MiningGoldNowFull
     jg MiningGoldNowFull
     jmp MiningGoldContinue                        # Jump to MiningGoldContinue

MiningGoldNowFull:
     mov rcx, GoldCount                            # move GoldCount to rcx
     sub rcx, 200                                  # subtract 200 to rcx (rcx = GoldCount - 200)
     sub GoldMined, rcx                            # subtract rcx to GoldMined
     mov rcx, GoldMined
     movq GoldCount, 200                           # Set GoldCount to 200

MiningGoldContinue:
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, MiningMessage2
     call PrintStringZ

     jmp WorkingAttributes

MiningGoldFull:
     lea rcx, MiningGoldStorageFullMessage         # Prompt Gold Storage is full message
     call PrintStringZ

     call PausingSection                           # Call to pause the screen 
     jmp MainGame

EatingMenu:
     call Attributes
     call UpperBrick

     cmpq CropsCount, 0                            # If CropsCount >= 0 : Go to EatingNoCrops (indicate no crops in storage)
     jle EatingNoCrops

     lea rcx, EatingFoodMessage1
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, 7                                    # Create random number of how many crops to eat (1-5)
     call Random
     add rcx, 3

     cmpq CropsCount, rcx                          # if CropsCount <= rcx : Go to EatingAllCrops (indicate to eat all crops in storage left)
     jle EatingAllCrops
     
     sub CropsCount, rcx                           # (else) subtract the generated number to CropsCount
     jmp ContinueEating                            # Jump to ContinueEating

EatingAllCrops:
     mov rcx, CropsCount                           # Move CropsCount to rcx
     movq CropsCount, 0                            # Set CropsCount to 0

ContinueEating:
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, EatingFoodMessage2
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, 3                                    # creating random number time for cooking and eating (1-3 hrs)
     call Random
     add rcx, 1
     call PrintInt                                 # Prompt the rand number
     add Time, rcx                                 # Add the rand number to the time
     call DefaultColor                             # call Default color

     lea rcx, EatingFoodMessage3
     call PrintStringZ
     jmp EnergyReplenished

EatingNoCrops:
     lea rcx, EatingNoFoodMessage                  # Prompt No crops available to cook message
     call PrintStringZ
     call LowerBrick2

     call PausingSection                           # Call to pause the screen 
     jmp MainGame

TownMenu:                                          # TOWN MENU SECTION
     call Attributes
     call UpperBrick
     lea rcx, TownMessage                          # Prompt Town Message
     call PrintStringZ
     call LowerBrick1

     call OptionalSection                          # call OptionalSection
     cmpq Option, 1                                # If Option == 1 : Jump to MarketPlace
     je MarketPlace
     cmpq Option, 2                                # If Option == 2 : Jump to Saloon
     je Saloon
     cmpq Option, 3                                # If Option == 3 : Jump to MainGame
     je MainGame
     jmp TownMenu                                  # Loop to TownMenu

MarketPlace:
     call Attributes
     call UpperBrick

     lea rcx, MarketPlaceMessage                   # prompt market place message
     call PrintStringZ

     cmpq Time, 18                                 # if Time >= 18 : Jump to MarketPlaceClosed
     jge MarketPlaceClosed

     lea rcx, MarketPlaceMessageBuySeed            # prompt for buying seed option
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, SeedCost                             # Print Seed Cost
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, MarketPlaceMessageSellCrops          # prompt for selling crops option
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, CropsCost                            # Print Crops Cost
     call PrintInt
     call DefaultColor                             # call Default Color

     lea rcx, MarketPlaceMessageSellGold           # prompt for selling Gold option
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, GoldCost                             # Print Gold cost
     call PrintInt
     call DefaultColor                             # call Default Color

     lea rcx, MarketPlaceMessageGoBack             # prompt for go back option
     call PrintStringZ
     call LowerBrick2

     call OptionalSection
     cmpq Option, 1                                # If Option == 1 : Go to BuyingSeedsOption
     je BuyingSeedsOption
     cmpq Option, 2                                # If Option == 2 : Go to SellingCropsOption
     je SellingCropsOption
     cmpq Option, 3                                # If Option == 3 : Go to SellingGoldOption
     je SellingGoldOption
     cmpq Option, 4                                # If Option == 4 : Go back to Town Menu
     je TownMenu

     jmp MarketPlace                               # Loop to Market Place screen

MarketPlaceClosed:
     lea rcx, MarketPlaceClosedMessage             # Prompt Market Place closed message
     call PrintStringZ
     call LowerBrick1
     
     call PausingSection                           # Call to pause the screen 
     jmp TownMenu                                  # Jump to Town Menu screen

BuyingSeedsOption:                                 # BUYING SEEDS OPTION
     lea rcx, BuyingSeedMessage
     call PrintStringZ
     
     call ScanInt                                  # Allows the user to input
     cmp rcx, 0                                    # If input (rcx) >= 0 : loop to MarketPlace
     jle MarketPlace

     mov BuyingSeeds, rcx                          # store the input (rcx) to BuyingSeeds
     IMUL rcx, SeedCost                            # multiple input (rcx) to SeedCost
     mov TotalCost, rcx                            # store the product to TotalCost

BuyingSeedsConfirmation:
     call Attributes
     call UpperBrick
     lea rcx, MarketPlaceMessage                   # prompt Market Place message
     call PrintStringZ
     lea rcx, BuySellMessage1                      # prompt total message
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, TotalCost                            # output the TotalCost
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, BuySellMessage2
     call PrintStringZ
     lea rcx, BuySeedsConfirmMessage               # Prompt Choice (1) Buy Seed
     call PrintStringZ
     lea rcx, BuySellMessageGoBack                 # Prompt Choice (2) Go Back
     call PrintStringZ
     call LowerBrick1

     call OptionalSection                          # call Optional Section
     cmpq Option, 1                                # if Option == 1 : Jump to NowBuyingSeeds
     je NowBuyingSeeds
     cmpq Option, 2                                # if Option == 2 : Jump back to MarketPlace
     je MarketPlace

     jmp BuyingSeedsConfirmation                   # loop to BuyingSeedsConfirmation

NowBuyingSeeds:
     mov rcx, TotalCost                            # Move TotalCost to rcx
     cmp Money, rcx                                # If Money < TotalCost (rcx) : Jump to NotEnoughMoney
     jl NotEnoughMoney

     sub Money, rcx                                # subtract TotalCost (rcx) to Money
     mov rcx, BuyingSeeds
     add CropsSeeds, rcx                           # add BuyingSeeds (rcx) to CropsSeeds (seeds available in storage)
     movq TotalCost, 0                             # Flush TotalCost
     movq BuyingSeeds, 0                           # Flush BuyingSeeds
     addq Time, 1                                  # add 1 to Time (spent 1 hour in MarketPlace)
     
     jmp ContinueFlushingMarket                    # Jump to ContinueFlushingMarket (flush addresses)

NotEnoughMoney:                                    # NOT ENOUGH MONEY SECTION
     lea rcx, NotEnoughMoneyMessage                # Prompt Not enough money
     call PrintStringZ
     jmp ContinueFlushingMarket                    # Jump to ContinueFlushingMarket (flush addresses)

SellingCropsOption:                                # SELL CROPS OPTION
     lea rcx, SellingCropsMessage                  # prompt Selling Crops Message
     call PrintStringZ
     call ScanInt                                  # let the user input how many crops to sell
     cmp rcx, 0                                    # If input <= 0 : Jump back to MarketPlace
     jle MarketPlace

     mov SellingCrops, rcx                         # store input (rcx) to SellingCrops
     IMUL rcx, CropsCost                           # multiply CropsCost to the input (rcx)
     mov TotalCost, rcx                            # move rcx to TotalCost  (Total = Crops selling * Crops cost)

SellingCropsConfirmation:   
     call Attributes
     call UpperBrick
     lea rcx, MarketPlaceMessage                   # prompt Market Place message
     call PrintStringZ

     lea rcx, BuySellMessage1                      # prompt the total message
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, TotalCost                            # print TotalCost
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, BuySellMessage2
     call PrintStringZ

     lea rcx, SellCropsConfirmMessage              # prompt sell crops option
     call PrintStringZ

     lea rcx, BuySellMessageGoBack                 # prompt go back option
     call PrintStringZ
     call LowerBrick1

     call OptionalSection                          # call Optional Section
     cmpq Option, 1                                # if Option == 1 : Jump to NowSellingCrops
     je NowSellingCrops
     cmpq Option, 2                                # if Option == 2 : Jump to MarketPlace
     je MarketPlace
     jmp SellingCropsConfirmation                  # loop to SellingCropConfirmation

NowSellingCrops:
     mov rcx, SellingCrops
     cmpq CropsCount, rcx                          # if CropsCount < SellingCrops : jump to NotEnoughCropsAvailable
     jl NotEnoughCropsAvailable

     sub CropsCount, rcx                           # CropsCount - input SellingCrops (rcx)
     mov rcx, TotalCost
     add Money, rcx                                # add TotalCost to Money

     addq Time, 1
     jmp ContinueFlushingMarket                    # Jump to ContinueFlushingMarket (flush addresses)
     
NotEnoughCropsAvailable:
     lea rcx, NotEnoughCropsAvailableMessage       # prompt Not Enough Crops Message
     call PrintStringZ
     jmp ContinueFlushingMarket                    # Jump to ContinueFlushingMarket (flush addresses)

SellingGoldOption:
     lea rcx, SellingGoldMessage                   # Prompt asking the user selling gold
     call PrintStringZ
     call ScanInt                                  # input number of Gold to sell
     cmp rcx, 0                                    # if input (rcx) <= 0 : jump to MarketPlace
     jle MarketPlace

     mov SellingGold, rcx                          # move input (rcx) to SellingGold
     IMUL rcx, GoldCost                            # Multiply input to GoldCost -> store to rcx
     mov TotalCost, rcx                            # move rcx to TotalCost

SellingGoldConfirmation:   
     call Attributes
     call UpperBrick
     lea rcx, MarketPlaceMessage                   # prompt MarketPlace message header
     call PrintStringZ

     lea rcx, BuySellMessage1                      # prompt total cost message
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, TotalCost                            # output TotalCost
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, BuySellMessage2
     call PrintStringZ
     lea rcx, SellGoldConfirmMessage               # prompt Sell Gold option
     call PrintStringZ

     lea rcx, BuySellMessageGoBack                 # prompt Go back option
     call PrintStringZ
     call LowerBrick1

     call OptionalSection                          # call Optional Section
     cmpq Option, 1                                # if Option == 1 : Jump to NowSellingGold
     je NowSellingGold
     cmpq Option, 2                                # If Option == 2 : jump back to MarketPlace
     je MarketPlace
     jmp SellingGoldConfirmation                   # loop to SellingGoldConfirmation

NowSellingGold:
     mov rcx, SellingGold                          # move SellingGold to rcx
     cmpq GoldCount, rcx                           # If GoldCount < SellingGold (rcx) : Jump to NotEnoughGoldAvailable
     jl NotEnoughGoldAvailable

     sub GoldCount, rcx                            # subtract the SellingGold (rcx) to GoldCount
     mov rcx, TotalCost                            # move TotalCost to rcx
     add Money, rcx                                # add TotalCost (rcx) to Money
     addq Time, 1                                  # Add 1 to Time (spent 1 hour on the MarketPlace)
     jmp ContinueFlushingMarket                    # Jump to ContinueFlushingMarket (flush addresses)
     
NotEnoughGoldAvailable:
     lea rcx, NotEnoughGoldAvailableMessage        # Prompt Not Enough Gold Message
     call PrintStringZ

ContinueFlushingMarket:
     movq TotalCost, 0                             # flushing TotalCost
     movq SellingCrops, 0                          # flushing SellingCrops
     movq SellingGold, 0                           # flushing SellingGold
     call PausingSection                           # Call to pause the screen 
     jmp MarketPlace                               # jump to MarketPlace

Saloon:
     call Attributes
     call UpperBrick
     lea rcx, SaloonHeadingMessage                 # prompt Saloon Heading Message
     call PrintStringZ

     cmpq Time, 15                                 # If Time < 15 : Jump to SaloonClosed
     jl SaloonClosed

     lea rcx, SaloonChoicesMessage1                 # prompt Saloon Choices Message
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, 25                                   # prompt number 25
     call PrintInt
     call DefaultColor                             # call Default Color

     lea rcx, SaloonChoicesMessage2                # prompt Saloon Choices Message
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, 100                                  # prompt number 100
     call PrintInt
     call DefaultColor                             # call Default Color

     lea rcx, SaloonChoicesMessage3                 # prompt Saloon Choices Message
     call PrintStringZ

     call LowerBrick1

     call OptionalSection                          # call Optional Section
     cmpq Option, 1                                # If Option == 1 : Jump to SaloonGetFood
     je SaloonGetFood
     cmpq Option, 2                                # If Option == 2 : Jump to SaloonGoDrink
     je SaloonGoDrink
     cmpq Option, 3                                # If Option == 3 : Jump back to TownMenu
     je TownMenu
     jmp Saloon                                    # loop back to Saloon

SaloonClosed:
     lea rcx, SaloonClosedMessage                  # Prompt Saloon Closed Message
     call PrintStringZ
     call LowerBrick1
     call PausingSection                           # Call to pause the screen 
     jmp TownMenu                                  # jump back to TownMenu

SaloonGetFood:
     call Attributes
     call UpperBrick

     cmpq Money, 25                                # If Money < 25 : jump to SaloonGetFoodNoMoney
     jl SaloonGetFoodNoMoney

     lea rcx, SaloonGetFoodMessage1                # prompt Saloon Get Food message
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, 16                                   # create random number from 10-25 (cost of ordered food)
     call Random
     add rcx, 10
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, SaloonGetFoodMessage2
     call PrintStringZ

     addq Time, 1                                  # Time++ (spend 1 hour eating in Saloon)
     jmp EnergyReplenished

SaloonGoDrink:
     call Attributes
     call UpperBrick
     lea rcx, SaloonHeadingMessage                 # Prompt Saloon Heading Message
     call PrintStringZ

     cmpq Money, 100                               # If Money < 100 : Jump to SallonGetDrinkNoMoney (not enough money)
     jl SaloonGetDrinkNoMoney
     
     lea rcx, SaloonGoDrinkMessage1
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, 71                                   # Generate random number 30 - 100 (total spent in the Saloon)
     call Random
     add rcx, 30
     sub Money, rcx                                # subtract the number to Money
     call PrintInt
     call DefaultColor                             # call Default color

     lea rcx, SaloonGoDrinkMessage2
     call PrintStringZ
     call LowerBrick2

     call PausingSection                           # Call to pause the screen 
     call NewDay                                   # call NewDay
     movq HungerLevel, 0                           # Set HungerLevel to 0
     
     call Attributes
     call UpperBrick
     lea rcx, SaloonGoodMorningMessage             # prompt morning message
     call PrintStringZ

     mov rcx, 2                                    # Generate Random number 0-1 (50:50 on getting home safe or robbed)
     call Random

     cmp rcx, 0                                    # if number <= 0 : Jump to SaloonSafe
     jle SaloonSafe

     cmpq Money, 0                                 # if Money <= 0 : Jump to SaloonSafe
     jle SaloonSafe

     jmp SaloonRob                                 # jump to SaloonRob

SaloonSafe:
     lea rcx, SaloonSafeMessage1
     call PrintStringZ
     
     mov rcx, 101                                  # Generate Random number 0-100
     call Random
     cmp rcx, 75                                   # If number <= 75: Go to NextSafe (No gold found)
     jle SaloonNextSafe

     mov rcx, 10                                   # Generate Random number 1 - 10
     call Random
     add rcx, 1

     mov FoundGold, rcx                            # store number (rcx) to FoundGold
     add GoldCount, rcx                            # add number (rcx) to GoldCount

     lea rcx, SaloonSafeMessage2
     call PrintStringZ

     call YellowColor                              # call Yellow Color
     mov rcx, FoundGold                            # Print out the FoundGold
     call PrintInt
     call DefaultColor                             # call Default color
     
     lea rcx, SaloonSafeMessage3                   
     call PrintStringZ
     
SaloonNextSafe:
     call LowerBrick1
     call PausingSection                           # Call to pause the screen 
     jmp MainGame

SaloonRob:
     lea rcx, SaloonRobMessage1                    # prompt got robbed message
     call PrintStringZ

     call GreenColor                               # call Green Color
     mov rcx, 76                                   # generate random number from 25 - 75 (percentage of money you have got stolen)
     call Random
     add rcx, 25
     
     IMUL rcx, Money                               # Multiply Money available to rcx -> product in rcx

     mov rax, rcx                                  # mov rcx to rax
     mov rcx, 100                                  # mov 100 to rcx
     CQO
     IDIV rcx                                      # divide 100 (rcx) to rax (product)
     mov rcx, rax                                  # mov rax to rcx   ->   rcx (stolen money) = Money * (random num / 100)
     call PrintInt                                 # prompt the stolen money
     sub Money, rcx                                # subtract rcx to Money

     call DefaultColor                             # call Default color

     lea rcx, SaloonRobMessage2
     call PrintStringZ
     call LowerBrick2
     
     call PausingSection                           # Call to pause the screen 
     jmp MainGame                                  # jump back to MainGame

SaloonGetFoodNoMoney:
     lea rcx, SaloonGetFoodNoMoneyMessage          # prompt not enough money to buy Food
     call PrintStringZ
     jmp SaloonNoMoney                             # Jump to SaloonNoMoney

SaloonGetDrinkNoMoney:
     lea rcx, SaloonGetDrinkNoMoneyMessage         # prompt not enough money to buy Drink
     call PrintStringZ

SaloonNoMoney:
     lea rcx, SaloonNoMoneyMessage                 # prompt not enough money
     call PrintStringZ
     call LowerBrick1

     call PausingSection                           # Call to pause the screen 
     jmp TownMenu

ChangeStoreCost:                                   # CHANGING THE STORE COST SECTION
     mov rcx, 9                                    # Generate Random Number from 2 - 10
     call Random
     add rcx, 2
     mov SeedCost, rcx                             # set the number to SeedCost

     mov rcx, 11                                   # Generate Random Number from 10 - 20
     call Random
     add rcx, 5
     mov CropsCost, rcx                            # set the number to CropsCost

     mov rcx, 31                                   # Generate Random Number from 20 - 50
     call Random
     add rcx, 20
     mov GoldCost, rcx                             # set the number to GoldCost
     ret

RestingMenu:                                       # RESTING MENU
     call Attributes
     call UpperBrick
     lea rcx, RestingMessage                       # prompt Resting Message
     call PrintStringZ
     call LowerBrick1

     call OptionalSection                          # Call optional Section
     cmpq Option, 1                                # If Option == 1 : Jump to RestOneHour
     je RestOneHour
     cmpq Option, 2                                # If Option == 2 : Jump to RestForTheDay
     je RestForTheDay
     cmpq Option, 3                                # If Option == 3 : Jump to MainGame
     je MainGame
     jmp RestingMenu                               # Loop to RestingMenu

RestOneHour:                                       # RESTING FOR ONE HOUR
     cmpq Time, 24                                 # If Time >= 24 : Jump to JustSleep
     jge JustSleep
     addq Time, 1                                  # add 1 to Time
     addq HungerLevel, 5                           # add 5% to HungerLevel
     lea rcx, RestOneHourMessage                   # prompt resting for one hour
     jmp RestOneHourContinue                       # Jump RestOneHourContinue

JustSleep:
     lea rcx, RestJustSleepMessage                 # prompt just sleep message

RestOneHourContinue:
     call PrintStringZ

     call PausingSection                           # call Pausing Section
     jmp MainGame                                  # Jump to MainGame


RestForTheDay:                                     # RESTING FOR THE DAY
     lea rcx, RestForTheDayMessage                 # prompt resting for the day
     call PrintStringZ
     call PausingSection                           # Call to pause the screen 
     
     call NewDay                                   # Call NewDay (setting attributes for the next day)
     mov rcx, 8                                    # Generate Random Number from 3-10
     call Random
     add rcx, 3
     sub HungerLevel, rcx                          # subtract the number to HungerLevel
     cmpq HungerLevel, 0                           # If HungerLevel >= 0 : Jump to ThenRestingHunger
     jge ThenRestingHunger
     movq HungerLevel, 0                           # set HungerLevel to 0 (indicate that the HungerLevel went negative)

ThenRestingHunger:
     jmp MainGame

HelpingMenu:                                       # HELPING MENU
     call HelpingSection                           # call Helping Section
     call LowerBrick1
     call OptionalSection                          # call Optional Section
     cmpq Option, 1                                # If Option == 1 : Jump to MainGame
     je MainGame
     cmpq Option, 2                                # If Option == 2 : Jump to MainInstruction
     je MainInstructions
     jmp HelpingMenu                               # loop to HelpingMenu

MainInstructions:
     call Instructions                             # call Instructions
     jmp HelpingMenu                               # Jump back to Helping Menu

# WORKING ATTRIBUTES
WorkingAttributes:                                 # STARTS WORKING HOURS
     lea rcx, WorkHoursMessage1
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, 5                                    # creating random number for working hours (3-7hrs)
     call Random
     add rcx, 3
     call PrintInt
     add Time, rcx                                 # add the number to Time
     call DefaultColor                             # call Default color

     lea rcx, WorkHoursMessage2
     call PrintStringZ

EnergyConsumedLevel:                               # ENERGY CONSUMED ATTRIBUTE
     lea rcx, EnergyConsumedMessage1               # prompt EnergyConsumedMessage1
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     mov rcx, 6                                    # creating random number for energy consumed (10% - 15%)
     call Random
     add rcx, 10
     call PrintInt     
     sub EnergyLevel, rcx                          # subtract the number to EnergyLevel
     call DefaultColor                             # call Default color

     lea rcx, EnergyConsumedMessage2               # prompt EnergyConsumedMessage2
     call PrintStringZ

HungerIncreasedLevel:                              # HUNGER INCREASED ATTRIBUTE
     lea rcx, HungerIncreaseMessage1               # Prompt HungerIncreaseMessage1
     call PrintStringZ 

     call GreenColor                               # call Green Color
     mov rcx, 11                                   # Generate random number for hunger level increase (20% - 30%)
     call Random
     add rcx, 20
     call PrintInt                                 # prompt the number
     add HungerLevel, rcx                          # add the number to HungerLevel
     call DefaultColor                             # call Default color

     lea rcx, HungerIncreaseMessage2               # Prompt HungerIncreaseMessage2
     call PrintStringZ
     call LowerBrick2
     call PausingSection                           # Call to pause the screen 

     jmp CheckVitals                               # Jump to check Vitals

# GENERAL RESTING / EAT ATTRIBUTE
EnergyReplenished:                                 # ENERGY REPLENISHED ATTRIBUTE
     lea rcx, EnergyIncreasedMessage1              # Prompt EnergyIncreasedMessage1
     call PrintStringZ 
     
     call GreenColor                               # call Green Color
     mov rcx, 21                                   # Generate random number for energy replenished (40% - 60%)
     call Random
     add rcx, 40
     call PrintInt                                 # prompt the number
     add EnergyLevel, rcx                          # add the number to EnergyLevel
     call DefaultColor                             # call Default color

     cmpq EnergyLevel, 100                         # If EnergyLevel <= 100 : Jump to ThenAddEnergy
     jle ThenAddEnergy
     movq EnergyLevel, 100                         # set EnergyLevel to 100 (full Energy level)

ThenAddEnergy:
     lea rcx, EnergyIncreasedMessage2
     call PrintStringZ

HungerDecreased:                                   # HUNGER DECREASED ATTRIBUTE
     lea rcx, HungerDecreasedMessage1              # Prompt HungerDecreasedMessage1
     call PrintStringZ 
     
     call GreenColor                               # call Green Color
     mov rcx, 20                                   # creating random number to decrease hunger (50 - 70%)
     call Random
     add rcx, 50 
     call PrintInt                                 # prompt the number
     sub HungerLevel, rcx                          # subtract the number to HungerLevel
     call DefaultColor                             # call Default color

     cmpq HungerLevel, 0                           # If HungerLevel >= 0 : Jump to ThenSubHungerLevel
     jge ThenSubHunger
     movq HungerLevel, 0                           # Set HungerLevel to 0 (User is not hungry / is full)

ThenSubHunger:
     lea rcx, HungerDecreasedMessage2
     call PrintStringZ
     call LowerBrick2
     call PausingSection                           # Call to pause the screen 
     jmp MainGame                                  # Jump to MainGame

CheckVitals:                                       # CHECKING VITALS SECTION
     cmpq HungerLevel, 100                         # If HungerLevel >= 100 : Jump to LostLife (Passout from Hunger)
     jge LostLife
     cmpq EnergyLevel, 0                           # If EnergyLevel <= 0 : Jump to LostLife (Passout from Energy)
     jle LostLife
     cmpq Time, 24                                 # If Time > 24 : Jump to LostLife (Passout from overworked time)
     jg LostLife
     jmp MainGame                                  # Jump to MainGame

LostLife:                                          # LOST LIFE SECTION
     call Attributes
     call UpperBrick
     lea rcx, PassOutMessage                       # prompt the Passout Message    
     call PrintStringZ
     
     call GreenColor
     mov rcx, 401                                  # Generate Random number (100-500) for Medical Bill
     call Random
     add rcx, 100
     call PrintInt
     sub Money, rcx                                # subtract rcx to Money
     call DefaultColor

     lea rcx, PassOutMessage2
     call PrintStringZ
     call LowerBrick1
     call PausingSection                           # Call to pause the screen 
     
     subq Lives, 1                                 # subtract 1 to Lives
     cmpq Lives, 0                                 # If Lives <= 0 : Jump to GameOver
     jle GameOver

     call NewDay                                   # call NewDay
     movq HungerLevel, 0                           # Flush HungerLevel
     jmp MainGame                                  # jump back to MainGame

NewDay:                                            # NEW DAY SECTION
     addq Day, 1                                   # Add 1 to Day
     subq CropsDays, 1                             # subtract 1 to CropsDays
     call CropsChecker                             # call CropsWithering (check the crops)
     movq Time, 6                                  # Set Time to 6
     movq EnergyLevel, 100                         # Set EnergyLevel to 100
     call SeasonalSection                          # Call SeasonalSection
     call ChangeStoreCost                          # call ChangeStoreCost (change the prices in MarketPlace)
     ret

CropsChecker:
     cmpq CropsStatus, 2                           # If CropsStatus != 2 : Jump Returning (If its not planted)
     jne Returning
     cmpq CropsDays, 0                             # If CropsDays < 0 : Jump to CropsWithered
     jl CropsWithered
     ret

CropsWithered:
     mov rcx, 5                                    # Generate random number from 1-5
     call Random
     add rcx, 1

     sub PlantingSeeds, rcx                        # subtract the random number to PlantingSeeds
     cmpq PlantingSeeds, 0                         # If PlantingSeeds < 0 : jump to CropsWitheredAll
     jl CropsWitheredAll
     ret
     
CropsWitheredAll:
     movq PlantingSeeds, 0                         # Set PlantingSeeds to 0
     movq CropsStatus, 1
     ret

GameOver:                                          # GAME OVER SECTION
     call Heading
     call UpperBrick     
     lea rcx, DeathMessage                         # prompt Game Over Message
     call PrintStringZ
     call LowerBrick1

     call PausingSection                           # Call to pause the screen 
     jmp ResetGame                                 # Jump to ResetGame

Heading:                                           # HEADING SECTION
     call ClearScreen                              # Clear the screen
     lea rcx, NextLine
     call PrintStringZ
     lea rcx, HeadingDivider                       # Print out the Heading Divider
     call PrintStringZ
     
     call GreenColor                               # call Green Color
     lea rcx, HeaderTitle                          # Prompt the Heading Title
     call PrintStringZ

     call CyanColor                                # call Cyan Color
     lea rcx, GameDeveloperName                    # Prompt Developer Name
     call PrintStringZ
     call DefaultColor                             # call Default color
     
     lea rcx, HeadingDivider                       # Print out the Heading Divider
     call PrintStringZ
     ret

Attributes:                                        # ATTRIBUTES SECTION
     call ClearScreen                              # Clear the screen
     lea rcx, NextLine                             # add newline twice
     call PrintStringZ
     call PrintStringZ

     lea rcx, HeadingDivider                       # Print Divider
     call PrintStringZ

     call RedColor                                 # call Red color
     mov rdi, Lives                  
     sub rdi, 1
     mov rcx, [LivesNum + rdi * 8]
     call PrintStringZ
     call DefaultColor                             # call Default color     
     call GreenColor                               # call Green Color

     call CheckSeason                              # call SeasonalSection to check the season
     

     lea rcx, DayMessage                           # Print Day Message
     call PrintStringZ
     mov rcx, Day                                  # Show Day
     call PrintInt 
     
     lea rcx, TimeMessage1                         # Print Time Message 1
     call PrintStringZ

     cmpq Time, 12                                 # If Time <= 12 : Jump to ContinueAttributes
     jle ContinueAttributes
     call YellowColor                              # call YellowColor
     cmpq Time, 20                                 # If Time <= 20 : Jump to ContinueAttributes
     jle ContinueAttributes
     call RedColor                                 # call RedColor

ContinueAttributes:
     mov rcx, Time                                 # Show Time in 24-hour format
     call PrintInt
     lea rcx, TimeMessage2                         # Print Time Message 2
     call PrintStringZ
     Call DefaultColor                             # call Default color

     lea rcx, HeadingDivider                       # Print Divider
     call PrintStringZ
     
     lea rcx, MoneyMessage                         # Money Message
     call PrintStringZ
     call GreenColor                               # call Green Color
     mov rcx, Money                                # Show Money number
     call PrintInt
     call DefaultColor                             # call Default color
     
     lea rcx, SeedsMessage                         # Crops Count
     call PrintStringZ
     mov rcx, CropsSeeds                           # move CropsSeeds to rcx to print
     call PrintInt

     lea rcx, EnergyLevelMessage                   # EnergyLevel Message
     call PrintStringZ
     
     # Color Scheme for EnergyLevel
     cmpq EnergyLevel, 50                          # if EnergyLevel >= 50 : Change text color to green
     jge EnergyGreen
     cmpq EnergyLevel, 25                          # if EnergyLevel >= 25 : Change text color to yellow
     jge EnergyYellow
     call RedColor
     jmp DailyContinueEnergy

EnergyGreen:                                       # EnergyLevel >= 50
     call GreenColor                               # call Green Color
     jmp DailyContinueEnergy

EnergyYellow:                                      # 50 > EnergyLevel >= 25
     call YellowColor                              # Change text color to red

DailyContinueEnergy:
     mov rcx, EnergyLevel
     call PrintInt
     lea rcx, PercentSign
     call PrintStringZ
     
     call DefaultColor                             # call Default color

     lea rcx, CropsMessage                         # Crops Count
     call PrintStringZ
     mov rcx, CropsCount
     call PrintInt

     lea rcx, HungerMessage                        # Hunger Level Message
     call PrintStringZ
     cmpq HungerLevel, 50                          # if Hunger <= 50 : Go to HungerGreen
     jle HungerGreen
     cmpq HungerLevel, 75                          # if Hunger <= 75 : Go to HungerYellow
     jle HungerYellow

     call RedColor                                 # call Red Color
     jmp DailyContinueHunger

HungerGreen:
     call GreenColor                               # call Green Color
     jmp DailyContinueHunger

HungerYellow:                                      # Hunger > 75
     call YellowColor                              # Change text color to red

DailyContinueHunger:
     mov rcx, HungerLevel                          # Prompt the Hunger Level
     call PrintInt
     lea rcx, PercentSign                          # prompt percent sign
     call PrintStringZ
     call DefaultColor                             # call Default Color

     lea rcx, GoldMessage                          # Print the Gold Count
     call PrintStringZ
     call YellowColor                              # call Yellow Color
     mov rcx, GoldCount                            # prompt the Gold count
     call PrintInt
     call DefaultColor                             # call Default Color

     lea rcx, NextLine                             # Prompt NextLine
     call PrintStringZ

     lea rcx, HeadingDivider
     call PrintStringZ
     ret

SeasonalSection:                                   # SEASON SECTION
     cmpq Day, 30                                  # If Day <= 30 : Go to SameSeason
     jle Returning
     addq Seasons, 1                               # add 1 to Seasons
     movq Day, 1                                   # move to Day 1

     cmpq Seasons, 4                               # If Seasons > 4 : Jump to Yearly
     jg Yearly                                     # Return
     ret

Yearly:                                            # 1 YEAR SECTION
     call Heading
     call UpperBrick
     lea rcx, YearFinishGame                       # Prompt the Year Finish Message
     call PrintStringZ
     call LowerBrick2

     call OptionalSection                          # Call Optional Section
     cmpq Option, 1                                # If Option == 1 : Jump to YearlyContinue
     je YearlyContinue
     cmpq Option, 2                                # If Option == 1 : Jump to QuitGame
     je QuitGame
     jmp Yearly                                    # Loop to Yearly

YearlyContinue:
     movq Seasons, 1                               # Set Seasons to 1
     ret                                           # Return

CheckSeason:                                       # Check the current season
     mov rdi, Seasons                              # move Seasons to rdi
     sub rdi, 1                                    # Seasons (rdx) --
     mov rcx, [SeasonNum + rdi * 8]                # SeasonNum + rdi to rcx with scale of 8
     call PrintStringZ
     ret                                           # return

HelpingSection:                                    # HELPING SECTION
     call Heading
     call UpperBrick

     lea rcx, GameplayMessage                      # prompt GamePlay Message
     call PrintStringZ
     ret                                           # return

Instructions:                                      # INSTRUCTION SECTION
     call Heading
     call UpperBrick

     lea rcx, InstructionMessage                   # Prompt the Instruction Message
     call PrintStringZ
     call LowerBrick1

     call OptionalSection                          # call the Optional Section
     
     call Heading
     call UpperBrick
     
     cmpq Option, 0                                # If Option <= 0 : Loop to Instruction
     jle Instructions
     cmpq Option, 6                                # If Option > 6 : Loop to Instruction
     jg Instructions
     cmpq Option, 6                                # If Option == 6 : Jump to Returning
     je Returning

     subq Option, 1                                # Option--
     mov rdi, Option                               # move Option to rdi
     mov rcx, [GuidingAddress + rdi * 8]           # move the GuidingAddress + rdi to rcx with scale of 8
     call PrintStringZ
     call LowerBrick1

     call PausingSection                           # call the PausingSection
     jmp Instructions                              # Jump back to Instructions

Returning:                                         # RETURNING SECTION
     ret                                           # return

PausingSection:                                    # PAUSING SECTION
     lea rcx, NextLine
     call PrintStringZ
     lea rcx, PausingSectionMessage                # Prompt the pausing message
     call PrintStringZ
     call ScanChar                                 # let User to input any character
     ret                                           # return

OptionalSection:                                   # OPTIONAL SECTION
     movq Option, 0                                # clean any option stored (Option = 0)
     lea rcx, OptionMessage
     call PrintStringZ
     call ScanInt                                  # User input the number of choice
     mov Option, rcx                               # store the input to Option
     ret                                           # return

QuitGame:                                          # QUIT GAME SECTION
     call ClearScreen                              # Clear the screen

     call Heading                                  # call Heading
     call UpperBrick

     lea rcx, QuitMessage                          # output Quit Message
     call PrintStringZ
     call LowerBrick1

     call PausingSection                           # Call to pause the screen
     call ClearScreen                              # Clear the screen
     call Exit

ResetGame:
     movq Money, 100                               # setting Money to 100
     movq EnergyLevel, 100                         # setting Energy Level to 100
     movq HungerLevel, 0                           # setting Hunger Level to 0
     movq CropsSeeds, 0                            # setting number of Seeds to 0
     movq CropsCount, 0                            # setting number of Crops to 0
     movq GoldCount, 0                             # setting number of Gold to 0
     movq Lives, 3                                 # setting to 3 lives
     movq Seasons, 1                               # setting to Season 1 (Spring)
     movq Time, 6                                  # setting time to 6 (6 am)
     movq Day, 1                                   # setting to Day 1
     jmp StartingMenu                              # jump to StartingGame

UpperBrick:                                        # UPPER BRICK OUTPUT
     lea rcx, UpperBricker
     call PrintStringZ
     ret

LowerBrick1:                                       # LOWER BRICK 1 OUTPUT
     lea rcx, LowerBricker1
     call PrintStringZ
     ret

LowerBrick2:                                       # LOWER BRICK 2 OUTPUT
     lea rcx, LowerBricker2
     call PrintStringZ
     ret

# COLOR SETTING
RedColor:                                          # Make text color Red
     mov rcx, 1
     call SetForeColor
     ret

GreenColor:                                        # Make text color Green
     mov rcx, 2
     call SetForeColor
     ret
YellowColor:                                       # Make text color Yellow
     mov rcx, 3
     call SetForeColor
     ret

CyanColor:                                         # Make text color Cyan
     mov rcx, 6
     call SetForeColor
     ret

DefaultColor:                                      # Make text color Default (white)
     mov rcx, 7
     call SetForeColor
     ret
