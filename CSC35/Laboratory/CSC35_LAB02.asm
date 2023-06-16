# lab2.asm
# Vigomar Kim Algador
#
# 1. Assemble : as -o lab2.o lab2.asm
# 2. Link     : ld -o a.out lab2.o csc35.o
# 3. Execute  : ./a.out

.intel_syntax noprefix
.data
Greeting:
    .ascii "Howdy, world!\n\0"

MyName:
    .ascii "My name is Vigomar Kim Algador!\n\0"

Advice:
    .ascii "My advice is just chering every moment.\n\0"

TriviaOne:
    .ascii "Did you know that the first computer bug happened in \0"

TriviaTwo:
    .ascii " where it is literally a moth inside the computer which the term is now used as a flaw or glitch in a system.\n\0"

.text
.global _start

_start:
    lea rcx, Greeting
    call PrintStringZ

    lea rcx, MyName
    call PrintStringZ

    lea rcx, Advice
    call PrintStringZ

    lea rcx, TriviaOne
    call PrintStringZ

    mov rcx, 1947
    call PrintInt

    lea rcx, TriviaTwo
    call PrintStringZ

    call Exit
