# Vigomar Kim Algador
# CSC35
# Lab 08
# 02 May 2022

.intel_syntax noprefix
.data

Hello:
     .ascii "Oh! Hello little friend!\n"
     .ascii "You look rather cute today, Jinro!\n"
Sound:
     .ascii "Whoosh!\n"
Thanks:
     .ascii "Oh! Thank you! You brought me a stick.\n"

.text
.global _start
_start:

     mov rax, 1           # WRITE
     mov rdi, 1           # SCREEN
     lea rsi, Hello
     mov rdx, 60
     syscall
     
     call Sounding
     call Sounding

     mov rax, 1           # WRITE
     mov rdi, 1           # SCREEN
     lea rsi, Thanks
     mov rdx, 39
     syscall
 
     mov rax, 60          # EXIT
     mov rdi, 0
     syscall

Sounding:
     mov rax, 1
     mov rdi, 1
     lea rsi, Sound
     mov rdx, 8
     syscall
     ret

