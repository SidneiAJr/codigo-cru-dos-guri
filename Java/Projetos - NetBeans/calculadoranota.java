 private void btncalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
       String nota1 = txtn1.getText();
       String nota2 = txtn2.getText();
       String nota3 = txtn3.getText();
       
       int notas1 = Integer.parseInt(nota1);
       int notas2 = Integer.parseInt(nota2);
       int notas3 = Integer.parseInt(nota3);
       
       int res = (notas1+notas2+notas3)/3;
       String convres = String.valueOf(res);
       if(res>5){
           lbst.setText("Aprovado!");
       }else{
           lbst.setText("Reprovado!");
       }
       txtres.setText(convres);
       
       
    }                             
