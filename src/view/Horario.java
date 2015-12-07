/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.genetics.Individuo;
import model.universidad.Aula;
import model.universidad.Grupo;
import model.universidad.Laboratorio;

/**
 *
 * @author Joel
 */
public class Horario extends javax.swing.JFrame {

    private Individuo horario;
    
    /**
     * Creates new form Horarios
     */
    public Horario() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
     * Setter para horario
     * @param hr - el horario ganador
     */
    public void setHorario(Individuo hr) {
        this.horario = hr;
    }
    
    /**
     * Mostrar el horario en el textArea
     */
    public void representarHorario() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                
                pegarTxt("➢ " + traducirJ(j) + " a las " + traducirI(i) + "\n");
                
                if (!horario.getHorario()[i][j].isEmpty()) {
                    
                    for (int k = 0; k < horario.getHorario()[i][j].size(); k++) {
                        String espacio;
                        Grupo lol = (Grupo) horario.getHorario()[i][j].get(k);
                        
                        if (lol.getCurso().isOcupaLab()) {
                            Laboratorio lab = (Laboratorio) horario.getLab()[i][j].get(0);
                            horario.getLab()[i][j].remove(lab);
                            espacio =  lab.getNombreLab();
                        }   
                        else {
                            Aula aul =  (Aula) horario.getAula()[i][j].get(0);
                            horario.getAula()[i][j].remove(aul);
                            espacio = aul.getNombre();
                        }
                        
                        pegarTxt(lol.getCurso().getNombre() + " - " + 
                                         lol.getProfesor()+ " - " +
                                         lol.getCurso().getHoras() + " horas - " +
                                         espacio + " \n");
                    }
                    pegarTxt("\n");
                }
                else {
                    pegarTxt("No hay cursos a esta hora. \n");
                }
            }
        }   
    }
    
    private String getEspacio(Object aula, Object lab) {
        return "";
    }
    
    private String traducirJ(int j) {
        if (j== 0) { return "Martes"; }
        if (j == 1) { return "Miércoles"; }
        if (j == 2) { return "Jueves"; }
        if (j == 3) { return "Viernes"; }
        else { return "Desconocido"; }
    }    
    
    private String traducirI(int i) {
        if (i == 0) { return "07:30"; }
        if (i == 1) { return "09:30"; }
        if (i == 2) { return "13:00"; }
        if (i == 3) { return "15:00"; }
        if (i == 4) { return "17:00"; }
        if (i == 5) { return "19:00" ;}
        else { return "00:00"; }
    }
    
    private void pegarTxt(String txt) {
        txtbHorario.setText(txtbHorario.getText() + "\n" + txt);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbHorario = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtbHorario.setColumns(20);
        txtbHorario.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtbHorario.setRows(5);
        txtbHorario.setWrapStyleWord(true);
        txtbHorario.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(txtbHorario);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("HORARIO GENERADO");

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Horario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtbHorario;
    // End of variables declaration//GEN-END:variables
}
