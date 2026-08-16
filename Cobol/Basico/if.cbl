
       IDENTIFICATION DIVISION.
       PROGRAM-ID. teste.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       01 numero-um       PIC 9 VALUE ZEROS.
       01 numero-dois       PIC 9 VALUE ZEROS.
       PROCEDURE DIVISION.
       IF numero-um > numero-dois
           DISPLAY "Maior"
       ELSE
           DISPLAY "Menor"
            DISPLAY "Hello world"
            STOP RUN.
       END PROGRAM teste.

