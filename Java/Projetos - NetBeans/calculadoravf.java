private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valorIni = txtvalor.getText();
        String tempo = txttmp.getText();
        String juro = txtjuros.getText();

        double valorInicial = Double.parseDouble(valorIni);
        int tempo2 = Integer.parseInt(tempo);
        double jurostotal = Double.parseDouble(juro);
        double jurosdiv = jurostotal/100;
        double vf = valorInicial * Math.pow(1 + jurosdiv, tempo2);
        DecimalFormat df = new DecimalFormat("#.##");
    
        if(tempo2<=1){
            double ir = vf*0.22;
            double liquido = vf - ir;
            String irFormatado = df.format(ir);
            String liquidoFormatado = df.format(liquido);
            lbimp.setText ("Valor dos impostos R$: " +irFormatado);
            lbfinal.setText("O total futuro será R$ " + liquidoFormatado);
            String brutototal = df.format(vf);
            lbbruto.setText("O Valor Bruto R$"+brutototal);
        }else if(tempo2>2){
            double ir = vf*0.175;
            double liquido = vf - ir;
            String irFormatado = df.format(ir);
            String liquidoFormatado = df.format(liquido);
            lbimp.setText ("Valor dos impostos R$: " +irFormatado);
            lbfinal.setText("O total futuro será R$ " + liquidoFormatado);
            String brutototal = df.format(vf);
            lbbruto.setText("O Valor Bruto R$"+brutototal);
        }else{
            double ir = vf*0.15;
            double liquido = vf - ir;            
            String irFormatado = df.format(ir);
            String liquidoFormatado = df.format(liquido);
            lbimp.setText ("Valor dos impostos R$: " +irFormatado);
            lbfinal.setText("O total futuro será R$ " + liquidoFormatado);
            String brutototal = df.format(vf);
            lbbruto.setText("O Valor Bruto R$"+brutototal);
        }
            
     
 
    }                                        
