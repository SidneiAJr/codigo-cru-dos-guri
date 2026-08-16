        IDENTIFICATION DIVISION.
            PROGRAM-ID. SISTEMA.
        DATA DIVISION.
        FILE SECTION.
        WORKING-STORAGE SECTION.
       01 numero-um       PIC 9(9)V99 VALUE ZEROS.
       01 numero-dois     PIC 9(9)V99 VALUE ZEROS.
       01 resultado       PIC 9(9)V99 VALUE ZEROS.
       01 opcao           PIC 9 VALUE ZEROS.

        PROCEDURE DIVISION.
           PERFORM menu UNTIL opcao = 5.
           DISPLAY "Saindo..."
           PERFORM somar        
           PERFORM subtrair
           PERFORM divisao
           PERFORM multiplicao
           STOP RUN.

            menu.
            DISPLAY "===================="
            DISPLAY "SISTEMA | CALCULADORA"
            DISPLAY "===================="
            DISPLAY "1- Soma"
            DISPLAY "2- Subtracao"
            DISPLAY "3- divisao"
            DISPLAY "4- multiplicao"
            ACCEPT OPCAO.
            EVALUATE opcao
            WHEN 1 PERFORM somar
            WHEN 2 PERFORM subtrair
            WHEN 3 PERFORM divisao
            WHEN 4 PERFORM multiplicao
            WHEN Other DISPLAY "Opcao Invalida"
            END-EVALUATE.


           somar.
           DISPLAY "Sistema | Soma"
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-UM
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-DOIS
           ADD numero-um TO numero-dois GIVING resultado
           DISPLAY "Soma: ", resultado.

           subtrair.
           DISPLAY "Sistema | Subtração"
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-UM
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-DOIS
           SUBTRACT numero-um FROM numero-dois GIVING resultado
           DISPLAY "Subtracao: ",resultado. 
           
           divisao.
           DISPLAY "Sistema | Subtração"
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-UM
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-DOIS
           DIVIDE numero-um by numero-dois GIVING resultado
                   ON SIZE ERROR
            MOVE ZEROS TO resultado
           DISPLAY "ERRO - Divisao por zero!"
           END-DIVIDE
           DISPLAY "Divisao: " resultado.
           
           multiplicao.
           DISPLAY "Sistema | Subtração"
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-UM
           DISPLAY "Insira um Numero: "
           ACCEPT NUMERO-DOIS
           MULTIPLY numero-um BY numero-dois GIVING resultado
           ON SIZE ERROR
           MOVE ZEROS TO resultado
           DISPLAY "ERRO - Resultado muito grande!"
           END-MULTIPLY
           DISPLAY "Multiplicao: " resultado.
           




  
