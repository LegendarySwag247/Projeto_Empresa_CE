
package br.com.carlosenzo.telas;

import br.com.carlosenzo.classes.Modelo;
import br.com.carlosenzo.classes.ModeloDAO;
import br.com.carlosenzo.classes.Usuario;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AnalizarModeloCliente extends javax.swing.JFrame {

    private Usuario user;
    
    public AnalizarModeloCliente() {
        initComponents();
        ColocarIcone();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableModelo = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));

        jPanel1.setBackground(new java.awt.Color(70, 62, 49));

        jPanel2.setBackground(new java.awt.Color(155, 132, 105));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(155, 132, 105));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(39, 36, 30));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 132, 105), 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 248, 209));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Analizar Modelos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 248, 209));
        jLabel2.setText("Pesquisa:");

        txtPesquisa.setBackground(new java.awt.Color(217, 217, 217));
        txtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modelos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 248, 209))); // NOI18N

        tableModelo.setBackground(new java.awt.Color(217, 217, 217));
        tableModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mensagem", "Arquivo", "Preço", "Pagamento"
            }
        ));
        tableModelo.setShowGrid(false);
        jScrollPane1.setViewportView(tableModelo);

        btnVoltar.setBackground(new java.awt.Color(120, 112, 87));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(232, 221, 164));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(120, 112, 87));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(232, 221, 164));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(120, 112, 87));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(232, 221, 164));
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPagar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Voltar();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
       PagarModelo();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        pesquisa();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    public Usuario getUser(){
        return user;
    }
    
    public void setUser(Usuario user){
        this.user = user;
    }
    
    public void Voltar(){
        dispose();
        InicialCliente tela= new InicialCliente();
        tela.AbrirClienteInicial(tela, getUser());
    }
    
    public void abrirAnalizarModelo(AnalizarModeloCliente tela, Usuario user){
        setUser(user);
        tela.CarregandoDados();
        tela.setVisible(true);
    }
    
    public void adicionarRow(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel) tableModelo.getModel();
        model.addRow(dataRow);
    }
    public void retirarRow(int row){
        DefaultTableModel model = (DefaultTableModel) tableModelo.getModel();
        model.removeRow(row);
    }
    
    public void apagarListas(){
        DefaultTableModel model = (DefaultTableModel) tableModelo.getModel();
        model.setRowCount(0);
    }
    
    public void CarregandoDados(){
        try{
            ModeloDAO dao = new ModeloDAO();
            List<Modelo> modelos = dao.listAllModels(getUser());
            for(Modelo modelo : modelos){
                adicionarRow(new Object[]{
                        modelo.getId(),
                        modelo.getMensagem(),
                        modelo.getArquivo(),
                        modelo.getPreco(),
                        modelo.getPagamento()
                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados!" + e.getMessage());
        }
    }
    
    public void Excluir(){
        try{
            int row = tableModelo.getSelectedRow();
            int id = (int) tableModelo.getValueAt(row,0);
            String pagamento= (String) tableModelo.getValueAt(row,4);
            int res = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir este modelo?");
            
            if(res == JOptionPane.YES_OPTION){
                ModeloDAO dao = new ModeloDAO();
                if(pagamento.equals("Confirmado")){
                    JOptionPane.showMessageDialog(null, "Não é permitido a exclusão de pagamentos confirmados!");
                }else{
                    dao.excluir(id);
                    retirarRow(row);
                }
            }
            
        }catch(ArrayIndexOutOfBoundsException ea){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um modelo para excluir");  
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um modelo para excluir");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    public void PagarModelo(){
        try{
            int row = tableModelo.getSelectedRow();
            int id = (int) tableModelo.getValueAt(row, 0);
            String pagamento = (String) tableModelo.getValueAt(row, 4);
            String preco = (String) tableModelo.getValueAt(row, 3);
            
            if(pagamento.equals("Pendente") && !preco.equals("Definindo")){
                int escolha = JOptionPane.showConfirmDialog(null, "Gostaria de comprar este modelo para impressão 3D?");
                ModeloDAO dao = new ModeloDAO();
                String pag = dao.pagarEcancelar(escolha, id);
                
                tableModelo.setValueAt(pag, row, 4);
                
            }else{
                JOptionPane.showMessageDialog(null, "Modelos pagos, cancelados ou preços sendo ajustados não podem ser comprados!");
            }
            
        }catch(ArrayIndexOutOfBoundsException ea){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um modelo para pagar!");  
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um modelo para pagar!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    public void pesquisa(){
        String nome = txtPesquisa.getText();
        try{
            ModeloDAO dao = new ModeloDAO();
            List<Modelo> modelos = dao.listModeloSearch(getUser(),nome);
            apagarListas();
            for(Modelo modelo : modelos){
                adicionarRow(new Object[]{
                        modelo.getId(),
                        modelo.getMensagem(),
                        modelo.getArquivo(),
                        modelo.getPreco(),
                        modelo.getPagamento()
                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados!" + e.getMessage());
        }
    }
    
    public void ColocarIcone(){
        String caminho = "/image/logo.jpg";
        InputStream pasta = getClass().getResourceAsStream(caminho);
        try{
            if( pasta != null){
                Image imagem = new ImageIcon(ImageIO.read(pasta)).getImage();
                this.setIconImage(imagem);
            }else{
                System.out.println("Imagem Nao encontrado!");
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(AnalizarModeloCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalizarModeloCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalizarModeloCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalizarModeloCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalizarModeloCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableModelo;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
