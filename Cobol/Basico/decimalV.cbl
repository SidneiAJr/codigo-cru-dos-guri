
       IDENTIFICATION DIVISION.
       PROGRAM-ID. teste.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 numero-um       PIC 9(10)V99 VALUE ZEROS.
       01 numero-dois     PIC 9(10)V99 VALUE ZEROS.
       01 soma            PIC 9(10)V99 VALUE ZEROS.
       01 soma-formatada  PIC Z(6)9,99 VALUE ZEROS.
       PROCEDURE DIVISION.
       DISPLAY "Bem vindo ao programa de Soma em Cobol"
       DISPLAY "POR FAVOR INFORME UM NUMERO (2 DIGITOS):"
       ACCEPT numero-um
       DISPLAY "Bem vindo ao programa de Soma em Cobol"
       DISPLAY "POR FAVOR INFORME UM NUMERO (2 DIGITOS):"
       ACCEPT numero-dois
       ADD numero-um TO numero-dois GIVING soma
       ON SIZE ERROR
       MOVE ZEROS TO soma
       END-ADD
       MOVE soma TO soma-formatada
       IF soma > 0
           DISPLAY "Saldo Positivo: " , soma-formatada
       ELSE
           DISPLAY "Saldo Negativo: " , soma-formatada
           END-IF.  
           STOP RUN.
       END PROGRAM teste.

