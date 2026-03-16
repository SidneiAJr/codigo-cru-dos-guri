       IDENTIFICATION DIVISION.
       PROGRAM-ID. soma.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 numero-um       PIC 9 VALUE ZEROS.
       01 numero-dois     PIC 9 VALUE ZEROS.
       01 resultado       PIC 999 VALUE ZEROS.
       PROCEDURE DIVISION.
       DISPLAY "*************Calculadora dos guri***********"
       DISPLAY "Bem vindo ao programa de Soma em Cobol"
       DISPLAY "POR FAVOR INFORME UM NUMERO :".
       ACCEPT numero-um
       DISPLAY "POR FAVOR INFORME UM NUMERO :".
       ACCEPT numero-dois
       DIVIDE numero-um BY numero-dois GIVING resultado
       ON SIZE ERROR
       MOVE ZEROS TO resultado
       DISPLAY "ERRO RESULTADO MAIOR QUE A CAPACIDADE"
       END-DIVIDE
       DISPLAY "O RESULTADO DO CALCULO E = ",resultado
            STOP RUN.
       END PROGRAM soma.
