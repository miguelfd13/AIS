package calculadora_interfaz;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Autores:
 * 	- Miguel Ferrer Dones
 * 	- Ester Cortés García
 * 	- Luis Revaliente Tallón
 * 	- Cristina González Cid de Rivera
 * 	- Pedro Díaz Cruz
 * 
 */

import java.awt.Color;
import java.awt.Font;
import javax.script.ScriptEngine; 
import javax.script.ScriptEngineManager; 
import javax.script.ScriptException; 


public class Calculadora extends javax.swing.JFrame {

    
    private String operacion="";
    
    public Calculadora() {
        initComponents();
        this.panel.setText("0");
        this.panel.setEditable(false);
        this.jLabel1.setForeground(Color.red);
        this.cero_boton.setBackground(Color.red);
        this.uno_boton.setBackground(Color.red);
        this.dos_boton.setBackground(Color.red);
        this.tres_boton.setBackground(Color.red);
        this.cuatro_boton.setBackground(Color.red);
        this.cinco_boton.setBackground(Color.red);
        this.seis_boton.setBackground(Color.red);
        this.siete_boton.setBackground(Color.red);
        this.ocho_boton.setBackground(Color.red);
        this.nueve_boton.setBackground(Color.red);
        this.igual_boton.setBackground(Color.red);
        this.mas_boton.setBackground(Color.red);
        this.menos_boton.setBackground(Color.red);
        this.por_boton.setBackground(Color.red);
        this.div_boton.setBackground(Color.red);
        this.parAb_boton.setBackground(Color.red);
        this.parCerr_boton.setBackground(Color.red);
        this.C_boton.setBackground(Color.red);
        this.CE_boton.setBackground(Color.red);
        this.punto_boton.setBackground(Color.red);
        this.cero_boton.setForeground(Color.black);
        this.uno_boton.setForeground(Color.black);
        this.dos_boton.setForeground(Color.black);
        this.tres_boton.setForeground(Color.black);
        this.cuatro_boton.setForeground(Color.black);
        this.cinco_boton.setForeground(Color.black);
        this.seis_boton.setForeground(Color.black);
        this.siete_boton.setForeground(Color.black);
        this.ocho_boton.setForeground(Color.black);
        this.nueve_boton.setForeground(Color.black);
        this.punto_boton.setForeground(Color.black);
        this.igual_boton.setForeground(Color.black);
        this.parAb_boton.setForeground(Color.black);
        this.parCerr_boton.setForeground(Color.black);
        this.mas_boton.setForeground(Color.black);
        this.menos_boton.setForeground(Color.black);
        this.por_boton.setForeground(Color.black);
        this.div_boton.setForeground(Color.black);
        this.C_boton.setForeground(Color.black);
        this.CE_boton.setForeground(Color.black);
        
      
   
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */	
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        uno_boton = new javax.swing.JButton();
        dos_boton = new javax.swing.JButton();
        tres_boton = new javax.swing.JButton();
        parAb_boton = new javax.swing.JButton();
        mas_boton = new javax.swing.JButton();
        cero_boton = new javax.swing.JButton();
        parCerr_boton = new javax.swing.JButton();
        igual_boton = new javax.swing.JButton();
        cuatro_boton = new javax.swing.JButton();
        cinco_boton = new javax.swing.JButton();
        seis_boton = new javax.swing.JButton();
        siete_boton = new javax.swing.JButton();
        ocho_boton = new javax.swing.JButton();
        nueve_boton = new javax.swing.JButton();
        div_boton = new javax.swing.JButton();
        por_boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        punto_boton = new javax.swing.JButton();
        menos_boton = new javax.swing.JButton();
        C_boton = new javax.swing.JButton();
        CE_boton = new javax.swing.JButton();
        panel = new javax.swing.JTextField();

       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uno_boton.setText("1");
        uno_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno_botonActionPerformed(evt);
            }
        });

        dos_boton.setText("2");
        dos_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos_botonActionPerformed(evt);
            }
        });

        tres_boton.setText("3");
        tres_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres_botonActionPerformed(evt);
            }
        });

        parAb_boton.setText("(");
        parAb_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parAb_botonActionPerformed(evt);
            }
        });

        mas_boton.setText("+");
        mas_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mas_botonActionPerformed(evt);
            }
        });

        cero_boton.setText("0");
        cero_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cero_botonActionPerformed(evt);
            }
        });

        parCerr_boton.setText(")");
        parCerr_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parCerr_botonActionPerformed(evt);
            }
        });

        igual_boton.setText("=");
        igual_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igual_botonActionPerformed(evt);
            }
        });

        cuatro_boton.setText("4");
        cuatro_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatro_botonActionPerformed(evt);
            }
        });

        cinco_boton.setText("5");
        cinco_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco_botonActionPerformed(evt);
            }
        });

        seis_boton.setText("6");
        seis_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis_botonActionPerformed(evt);
            }
        });

        siete_boton.setText("7");
        siete_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siete_botonActionPerformed(evt);
            }
        });

        ocho_boton.setText("8");
        ocho_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocho_botonActionPerformed(evt);
            }
        });

        nueve_boton.setText("9");
        nueve_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve_botonActionPerformed(evt);
            }
        });

        div_boton.setText("/");
        div_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_botonActionPerformed(evt);
            }
        });

        por_boton.setText("*");
        por_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                por_botonActionPerformed(evt);
            }
        });

        jLabel1.setText("Calculadora");

        punto_boton.setText(".");
        punto_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punto_botonActionPerformed(evt);
            }
        });

        menos_boton.setText("-");
        menos_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menos_botonActionPerformed(evt);
            }
        });

        C_boton.setText("C");
        C_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_botonActionPerformed(evt);
            }
        });

        CE_boton.setText("CE");
        CE_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CE_botonActionPerformed(evt);
            }
        });

        panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uno_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dos_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tres_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cero_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(punto_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(parAb_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mas_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(parCerr_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(menos_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siete_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuatro_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ocho_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nueve_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cinco_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seis_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C_boton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CE_boton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(div_boton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(por_boton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siete_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(por_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CE_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cinco_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cuatro_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(div_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(C_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parCerr_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mas_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cero_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(punto_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parAb_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>                        

    private void uno_botonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.operacion+="1";
        this.panel.setText(operacion);
        
    }                                         

    private void cero_botonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.operacion+="0";
        this.panel.setText(operacion);
    }                                          

    private void dos_botonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.operacion+="2";
        this.panel.setText(operacion);
    }                                         

    private void tres_botonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.operacion+="3";
        this.panel.setText(operacion);
    }                                          

    private void cuatro_botonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.operacion+="4";
        this.panel.setText(operacion);
    }                                            

    private void cinco_botonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       this.operacion+="5";
       this.panel.setText(operacion);
    }                                           

    private void seis_botonActionPerformed(java.awt.event.ActionEvent evt) {                                           
       this.operacion+="6";
       this.panel.setText(operacion);
    }                                          

    private void siete_botonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       this.operacion+="7";
       this.panel.setText(operacion);
    }                                           

    private void ocho_botonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.operacion+="8";
        this.panel.setText(operacion);
    }                                          

    private void nueve_botonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.operacion+="9";
        this.panel.setText(operacion);
    }                                           

    private void punto_botonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.operacion+=".";
        this.panel.setText(operacion);
    }                                           

    private void mas_botonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.operacion+="+";
        this.panel.setText(operacion);
    }                                         

    private void igual_botonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ScriptEngineManager manager = new ScriptEngineManager(); 
        ScriptEngine engine = manager.getEngineByName("js"); 

        try {  
            Object result = engine.eval(operacion); 
            String resultado = result.toString();
            this.panel.setText(resultado);
            operacion=resultado;
        } 
        catch(ScriptException se) { 
            this.panel.setText("Sintax Error");
            this.operacion="";
        } 
    }                                           

    private void parCerr_botonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.operacion+=")";
        this.panel.setText(operacion);
    }                                             

    private void parAb_botonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.operacion+="(";
        this.panel.setText(operacion);
    }                                           

    private void menos_botonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.operacion+="-";
        this.panel.setText(operacion);
    }                                           

    private void div_botonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.operacion+="/";
        this.panel.setText(operacion);
    }                                         

    private void por_botonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.operacion+="*";
        this.panel.setText(operacion);
    }                                         

    private void C_botonActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
    }                                       

    private void CE_botonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void panelActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CE_boton;
    private javax.swing.JButton C_boton;
    private javax.swing.JButton cero_boton;
    private javax.swing.JButton cinco_boton;
    private javax.swing.JButton cuatro_boton;
    private javax.swing.JButton div_boton;
    private javax.swing.JButton dos_boton;
    private javax.swing.JButton igual_boton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mas_boton;
    private javax.swing.JButton menos_boton;
    private javax.swing.JButton nueve_boton;
    private javax.swing.JButton ocho_boton;
    private javax.swing.JTextField panel;
    private javax.swing.JButton parAb_boton;
    private javax.swing.JButton parCerr_boton;
    private javax.swing.JButton por_boton;
    private javax.swing.JButton punto_boton;
    private javax.swing.JButton seis_boton;
    private javax.swing.JButton siete_boton;
    private javax.swing.JButton tres_boton;
    private javax.swing.JButton uno_boton;
    // End of variables declaration                   
}
