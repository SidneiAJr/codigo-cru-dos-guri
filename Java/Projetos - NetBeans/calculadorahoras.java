 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String salario = txtsal.getText();
        String tempo = txttmp.getText();

        double salariobru = Double.parseDouble(salario);
        int tempo2 = Integer.parseInt(tempo);

        int horastrab = tempo2*30;
        double salariodiv = salariobru/horastrab;

        String convres2 = String.valueOf(horastrab);
        String convres3 = String.valueOf(salariodiv);
        
        if(salariobru<=2500){
            double liquido = salariobru;
            String convres5 = String.valueOf(liquido);
            lbimp.setText ("Valor Liquido é R$"+convres5);
        }else if(salariobru>=2259.21){
            double impostos = salariobru*0.075;
            double liquido = salariobru - impostos;
            String convres4 = String.valueOf(impostos);
            String convres5 = String.valueOf(liquido);
            lbliq.setText ("O valor dos impostos será R$"+convres4);
            lbimp.setText ("Valor Liquido é R$"+convres5);
        }else if(salariobru>=2826.66){
            double impostos = salariobru*0.15;
            double liquido = salariobru - impostos;
            String convres4 = String.valueOf(impostos);
            String convres5 = String.valueOf(liquido);
            lbliq.setText ("O valor dos impostos será R$"+convres4);
            lbimp.setText ("Valor Liquido é R$"+convres5);
        }
        else if(salariobru>=3751.06){
            double impostos = salariobru*0.225;
            double liquido = salariobru - impostos;
            String convres4 = String.valueOf(impostos);
            String convres5 = String.valueOf(liquido);
            lbliq.setText ("O valor dos impostos será R$"+convres4);
            lbimp.setText ("Valor Liquido é R$"+convres5);
        }else{
           double impostos = salariobru*0.275;
            double liquido = salariobru - impostos;
            String convres4 = String.valueOf(impostos);
            String convres5 = String.valueOf(liquido);
            lbliq.setText ("O valor dos impostos será R$"+convres4);
            lbimp.setText ("Valor Liquido é R$"+convres5); 
        }
        lbhoras.setText("O total de horas trabalhadas é: " + convres2);
        lbdesc.setText ("Valor da Hora Trabalhada R$: " +convres3);
    
    }                                        
