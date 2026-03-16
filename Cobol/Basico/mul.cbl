      ******************************************************************
      * Author: Albertaodasmassa
      * Date: 21/09
      * Purpose: calculadora
      * Tectonics: cobc
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. Progmult.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 numero-um       PIC 9 VALUE ZEROS.
       01 numero-dois     PIC 9 VALUE ZEROS.
       01 resultado       PIC 99 VALUE ZEROS.
       PROCEDURE DIVISION.
       DISPLAY "Bem vindo ao programa de Multiplicação em Cobol"
       DISPLAY "POR FAVOR INFORME UM NUMERO (2 DIGITOS):".
       ACCEPT numero-um
       DISPLAY "POR FAVOR INFORME UM NUMERO (2 DIGITOS):".
       ACCEPT numero-dois
       MULTIPLY numero-um BY numero-dois GIVING resultado
       ON SIZE ERROR
       MOVE ZEROS TO resultado
       DISPLAY "ERRO RESULTADO MAIOR QUE A CAPACIDADE"
       END-MULTIPLY
       DISPLAY "O RESULTADO DO CALCULO E = ",resultado
            STOP RUN.
       END PROGRAM Progmult.
