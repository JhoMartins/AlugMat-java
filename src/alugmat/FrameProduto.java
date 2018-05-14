/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugmat;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xdeiv
 */
public class FrameProduto extends javax.swing.JFrame {

    /**
     * Creates new form FrameProduto
     */
    public FrameProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcd_interno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtvalor_diaria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cbmarca = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaCaracteristicas = new javax.swing.JTextArea();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Código Interno");

        jLabel3.setText("Valor da Diária");

        jLabel4.setText("Caracteristicas");

        jLabel5.setText("Marca");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código Interno", "Descrição", "Valor da diária", "Marca", "Caracteristicas"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Cadastro de Produto");

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        txtId.setEditable(false);

        txtAreaCaracteristicas.setColumns(20);
        txtAreaCaracteristicas.setRows(5);
        jScrollPane5.setViewportView(txtAreaCaracteristicas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btn_salvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_cancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_excluir))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtcd_interno, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtvalor_diaria, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Cbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 16, Short.MAX_VALUE))))
                            .addComponent(jScrollPane3))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(274, 274, 274))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtvalor_diaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcd_interno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salvar)
                            .addComponent(btn_cancelar)
                            .addComponent(btn_excluir))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        try {
            if (formErrors() > 0) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha os campos obrigatórios!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
            else {
                Connection con = Conexao.Conectar();
                
                Produto p = new Produto();
                p.setCd_interno(Integer.parseInt(txtcd_interno.getText()));
                p.setDescricao(txtdescricao.getText());
                p.setValor_diaria(Float.parseFloat(txtvalor_diaria.getText()));
                p.setCaracteristicas(txtAreaCaracteristicas.getText());
                p.setCd_marca(p.procurarMarcaID(Cbmarca.getSelectedItem() + ""));

                String sql = "";
                PreparedStatement ps = null;

                if (txtId.getText().equals("")) {
                    sql = "INSERT INTO PRODUTO (CD_INTERNO, DESCRICAO, VALOR_DIARIA, CARACTERISTICAS, CD_MARCA) VALUES (?, ?, ?, ?, ?)";
                    ps = con.prepareStatement(sql);
                } else {
                    p.setId(Integer.parseInt(txtId.getText()));
                    sql = "UPDATE PRODUTO SET CD_INTERNO = ?, DESCRICAO = ?, VALOR_DIARIA = ?, CARACTERISTICAS, CD_MARCA = ? WHERE id = ?";
                    ps = con.prepareStatement(sql);
                    ps.setInt(6, p.getId());
                }
                ps.setInt(1, p.getCd_interno());
                ps.setString(2, p.getDescricao());
                ps.setFloat(3, p.getValor_diaria());
                ps.setString(4, p.getCaracteristicas());
                ps.setInt(5, p.getCd_marca());

                ps.execute();
                carregarGrid();
                limpar();
                removerErros();
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        carregarCombo();
        carregarGrid();
        txtdescricao.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
      int linha = jTable.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        
        txtId.setText((int) modelo.getValueAt(linha, 0) + "");
        txtcd_interno.setText((int) modelo.getValueAt(linha, 1) + "");
        txtdescricao.setText((String) modelo.getValueAt(linha, 2));
        txtvalor_diaria.setText((float) modelo.getValueAt(linha, 3) + "");
//        Cbmarca.selected(String) modelo.getValueAt(linha, 4));;
        txtAreaCaracteristicas.setText((String) modelo.getValueAt(linha, 5));
    }//GEN-LAST:event_jTableMouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        try{
            Connection con = Conexao.Conectar();
           
            int id = Integer.parseInt(txtId.getText());
            String sql = "DELETE FROM PRODUTO WHERE ID = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            
            carregarGrid();
            limpar();            
        }
        catch(SQLException e){
           System.out.println("ERRO: " + e.getMessage());
       }
    }//GEN-LAST:event_btn_excluirActionPerformed
    
    private void carregarGrid(){
        try{
            ResultSet rs = carregarProdutos();
            
            DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
            
            modelo.setRowCount(0);
            
            while(rs.next()){
                Produto p = new Produto();                                
                p.setId(rs.getInt("id"));
                p.setCd_interno(rs.getInt("cd_interno"));
                p.setDescricao(rs.getString("descricao"));
                p.setValor_diaria(rs.getFloat("valor_diaria"));
                p.setCd_marca(rs.getInt("cd_marca"));
                p.setCaracteristicas(rs.getString("caracteristicas"));
                
                modelo.addRow(new Object[]{p.getId(), p.getCd_interno(), p.getDescricao(), p.getValor_diaria(), p.procurarMarcaNome(), p.getCaracteristicas()});
            }
        }
        catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }
    
    private void carregarCombo() {
        try {
            List<String> list = new ArrayList<String>();
            ResultSet rs = carregarMarcas();
            while(rs.next()) {
                list.add(rs.getString("descricao"));
            }
            DefaultComboBoxModel comboModel = new DefaultComboBoxModel(list.toArray());
            Cbmarca.setModel(comboModel);
        }
        catch(Exception e) {
           System.out.println("ERRO: " + e.getMessage()); 
        }
    }
    
    private ResultSet carregarMarcas() {
        ResultSet rs = null;
        try {
            Connection con = Conexao.Conectar();
            
            String sql = "SELECT * FROM MARCA";
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        return rs;
    }
    
    private ResultSet carregarProdutos() {
        ResultSet rs = null;
        try {
            Connection con = Conexao.Conectar();
            
            String sql = "SELECT * FROM PRODUTO";
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        return rs;
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        limpar();
    }                                           

    public int formErrors() {
      int erros = 0;
      if (validarTxt(txtcd_interno, "Por favor, preencha a Descrição da Marca!")) erros++;
      if (validarTxt(txtdescricao, "Por favor, preencha a Descrição da Marca!")) erros++;
      if (validarTxt(txtvalor_diaria, "Por favor, preencha a Descrição da Marca!")) erros++;
      return erros;
    }
    
    public boolean validarTxt(JTextField txt, String mensagem) {
        if (txt.getText().equals("")) {
                txt.setBorder(BorderFactory.createLineBorder(Color.RED));
                txt.requestFocus();
                return true;
            }
        return false;
    }
    
     private void limpar() {
        txtId.setText("");
        txtcd_interno.setText("");
        txtdescricao.setText("");
        txtvalor_diaria.setText("");
        txtAreaCaracteristicas.setText("");
    }
     
     private void removerErros() {
          txtdescricao.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
          txtcd_interno.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
          txtvalor_diaria.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
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
            java.util.logging.Logger.getLogger(FrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbmarca;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea txtAreaCaracteristicas;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtcd_interno;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtvalor_diaria;
    // End of variables declaration//GEN-END:variables
}
