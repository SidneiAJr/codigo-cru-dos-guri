      ******************************************************************
      * Author:Albertaodasmassa
      * Date:21/09
      * Purpose:
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. soma.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 numero-um       PIC 9 VALUE ZEROS.
       01 numero-dois     PIC 9 VALUE ZEROS.
       01 resultado       PIC 99 VALUE ZEROS.
       PROCEDURE DIVISION.
       DISPLAY "Bem vindo ao programa de Soma em Cobol"
       DISPLAY "POR FAVOR INFORME UM NUMERO (2 DIGITOS):".
       ACCEPT numero-um
       DISPLAY "POR FAVOR INFORME UM NUMERO (2 DIGITOS):".
       ACCEPT numero-dois
       ADD numero-um TO numero-dois GIVING resultado
       ON SIZE ERROR
       MOVE ZEROS TO resultado
       DISPLAY "ERRO RESULTADO MAIOR QUE A CAPACIDADE"
       END-ADD
       DISPLAY "O RESULTADO DO CALCULO E = ",resultado
            STOP RUN.
       END PROGRAM soma.
