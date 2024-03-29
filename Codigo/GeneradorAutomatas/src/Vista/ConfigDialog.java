/*
 * Configuracion.java
 *
 * Created on 20 de noviembre de 2008, 09:25 AM
 */

package Vista;

import estructuras.Configuracion;
import java.io.File;
import javax.swing.JFileChooser;
import org.jdesktop.application.Action;

/**
 *
 * @author  ghuttemann
 */
public class ConfigDialog extends javax.swing.JDialog {
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;

    /** Creates new form Configuracion */
    public ConfigDialog(java.awt.Frame parent, boolean modal, Configuracion config) {
        super(parent, modal);
        initComponents();
        
        /* Valores iniciales */
        graphvizPath.setText(config.getGraphvizPath());
        tempPath.setText(config.getTempPath());
        graphvizPathStr = graphvizPath.getText();
        tempPathStr = tempPath.getText();
    }

    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarBtn = new javax.swing.JButton();
        SalirBtn = new javax.swing.JButton();
        graphvizLabel = new javax.swing.JLabel();
        graphvizPath = new javax.swing.JTextField();
        graphvizBtn = new javax.swing.JButton();
        tempLabel = new javax.swing.JLabel();
        tempPath = new javax.swing.JTextField();
        tempBtn = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(Vista.AplicacionAnalizadorLexico.class).getContext().getResourceMap(ConfigDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        guardarBtn.setText(resourceMap.getString("guardarBtn.text")); // NOI18N
        guardarBtn.setName("guardarBtn"); // NOI18N
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        SalirBtn.setText(resourceMap.getString("SalirBtn.text")); // NOI18N
        SalirBtn.setName("SalirBtn"); // NOI18N
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        graphvizLabel.setText(resourceMap.getString("graphvizLabel.text")); // NOI18N
        graphvizLabel.setName("graphvizLabel"); // NOI18N

        graphvizPath.setText(resourceMap.getString("graphvizPath.text")); // NOI18N
        graphvizPath.setName("graphvizPath"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(Vista.AplicacionAnalizadorLexico.class).getContext().getActionMap(ConfigDialog.class, this);
        graphvizBtn.setAction(actionMap.get("graphvizBtnAction")); // NOI18N
        graphvizBtn.setText(resourceMap.getString("graphvizBtn.text")); // NOI18N
        graphvizBtn.setName("graphvizBtn"); // NOI18N

        tempLabel.setText(resourceMap.getString("tempLabel.text")); // NOI18N
        tempLabel.setName("tempLabel"); // NOI18N

        tempPath.setText(resourceMap.getString("tempPath.text")); // NOI18N
        tempPath.setName("tempPath"); // NOI18N

        tempBtn.setAction(actionMap.get("tempBtnAction")); // NOI18N
        tempBtn.setText(resourceMap.getString("tempBtn.text")); // NOI18N
        tempBtn.setName("tempBtn"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(graphvizLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(graphvizPath, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tempPath, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(graphvizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(graphvizLabel)
                            .addComponent(graphvizPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempLabel)
                            .addComponent(tempPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempBtn))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(graphvizBtn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn)
                    .addComponent(SalirBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        /* Cambiar valores */
        graphvizPathStr = graphvizPath.getText();
        tempPathStr = tempPath.getText();
        
        doClose(RET_OK);
}//GEN-LAST:event_guardarBtnActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        doClose(RET_CANCEL);
}//GEN-LAST:event_SalirBtnActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    
    private String ObtenerDirectorio(File directorioActual) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        chooser.setCurrentDirectory(directorioActual);
        int valor = chooser.showOpenDialog(this);
        String resultado = "";
        
        if (valor == JFileChooser.APPROVE_OPTION)
            resultado = chooser.getSelectedFile().getPath();
        
        return resultado;
    }

    @Action
    public void graphvizBtnAction() {
        /* 
         * Por defecto, el directorio actual será
         * el directorio por defecto del usuario
         */
        File dir = null;
        
        /*
         * Hacemos el intento de ubicar el directorio
         * actual en la raíz del sistema de archivo,
         * para el caso de Windows (C:\) y para el
         * caso de Unix/Linux (/).
         */
        for (File root : File.listRoots()) {
            if (root.toString().startsWith("C") || root.toString().startsWith("/")) {
                dir = root;
                break;
            }
        }
        
        String ruta = ObtenerDirectorio(dir);
        graphvizPath.setText(ruta);
    }

    @Action
    public void tempBtnAction() {
        File dir = new File(".");
        String ruta = ObtenerDirectorio(dir);
        tempPath.setText(ruta);
    }
    
    public String getGraphvizPath() {
        return graphvizPathStr;
    }
    
    public String getTempPath() {
        return tempPathStr;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirBtn;
    private javax.swing.JButton graphvizBtn;
    private javax.swing.JLabel graphvizLabel;
    private javax.swing.JTextField graphvizPath;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JButton tempBtn;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JTextField tempPath;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
    private String graphvizPathStr;
    private String tempPathStr;
}
