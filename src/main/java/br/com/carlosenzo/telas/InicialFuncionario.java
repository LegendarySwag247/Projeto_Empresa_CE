
package br.com.carlosenzo.telas;

import br.com.carlosenzo.classes.ModeloDAO;
import br.com.carlosenzo.classes.Usuario;
import br.com.carlosenzo.classes.UsuarioModelo;
import java.awt.Image;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InicialFuncionario extends javax.swing.JFrame {

    private Usuario user;
    
    public InicialFuncionario() {
        initComponents();
        ColocarIcone();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBemVindo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        btnColocarPreco = new javax.swing.JButton();
        btnSalvarArquivo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGap(0, 462, Short.MAX_VALUE)
        );

        txtBemVindo.setBackground(new java.awt.Color(255, 248, 209));
        txtBemVindo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBemVindo.setForeground(new java.awt.Color(255, 248, 209));
        txtBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBemVindo.setText("Bem-vindo \"Funcionario\"!");

        jPanel4.setBackground(new java.awt.Color(39, 36, 30));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155, 132, 105), 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 248, 209));
        jLabel2.setText("Pedidos de Clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 248, 209))); // NOI18N

        tableInfo.setBackground(new java.awt.Color(217, 217, 217));
        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario_id", "Nome_cliente", "CPF", "E-mail", "Endereço", "Mensagem", "Arquivo", "Tipo_de_arquivo", "Preço", "Pagamento"
            }
        ));
        jScrollPane1.setViewportView(tableInfo);

        btnColocarPreco.setBackground(new java.awt.Color(120, 112, 87));
        btnColocarPreco.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnColocarPreco.setForeground(new java.awt.Color(232, 221, 164));
        btnColocarPreco.setText("Colocar Preço");
        btnColocarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColocarPrecoActionPerformed(evt);
            }
        });

        btnSalvarArquivo.setBackground(new java.awt.Color(120, 112, 87));
        btnSalvarArquivo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSalvarArquivo.setForeground(new java.awt.Color(232, 221, 164));
        btnSalvarArquivo.setText("Salvar Arquivo");
        btnSalvarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarArquivoActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(120, 112, 87));
        btnSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(232, 221, 164));
        btnSair.setText("Sair");
        btnSair.setToolTipText("");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBemVindo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSair)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvarArquivo)
                            .addGap(18, 18, 18)
                            .addComponent(btnColocarPreco))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBemVindo)
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnColocarPreco)
                    .addComponent(btnSalvarArquivo)
                    .addComponent(btnSair)))
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

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarArquivoActionPerformed
        SalvarArquivo();
    }//GEN-LAST:event_btnSalvarArquivoActionPerformed

    private void btnColocarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColocarPrecoActionPerformed
        ColocarPreco();
    }//GEN-LAST:event_btnColocarPrecoActionPerformed

    public void setUser(Usuario user){
        this.user = user;
    }
    
    public Usuario getUser(){
        return user;
    }
    
    public void Sair(){
        dispose();
        Login tela = new Login();
        tela.setVisible(true);
    }
    
    public void SalvarArquivo(){
        try{
            int row = tableInfo.getSelectedRow();
            String nomeModelo = (String) tableInfo.getValueAt(row, 5);
            String tipo = (String) tableInfo.getValueAt(row, 7);
            byte[] arquivo = (byte[]) tableInfo.getValueAt(row, 6);
            
            String caminho = System.getProperty("user.home") + "/Desktop/";
            
            File pasta = new File(caminho + nomeModelo + tipo);
            
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pasta));
            bos.write(arquivo);
            bos.close();
            
            JOptionPane.showMessageDialog(null, "Seu arquivo foi salvo na área de trabalho!");
            
        }catch(ArrayIndexOutOfBoundsException ea){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um modelo para salvar arquivo!");  
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um modelo para salvar arquivo!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    public void ColocarPreco(){
        try{
            int row = tableInfo.getSelectedRow();
            String txtpreco = JOptionPane.showInputDialog("Informe o preço:");
            String pagamento = (String)tableInfo.getValueAt(row, 9);
            String nomeModel = (String)tableInfo.getValueAt(row, 5);
            String tipo = (String) tableInfo.getValueAt(row, 7);
            byte[] arquivo = (byte[]) tableInfo.getValueAt(row, 6);
            double dpreco = Double.parseDouble(txtpreco);
            
            String preco = "R$" + dpreco;
            
            if(pagamento.equals("Pendente")){
                ModeloDAO dao = new ModeloDAO();
                dao.mudarPreco(nomeModel, preco, arquivo, tipo);
                tableInfo.setValueAt(preco,row, 8);
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível alterar o valor do pagamento, pois ele não está pendente.");
            }
            
        }catch(ArrayIndexOutOfBoundsException ea){
            JOptionPane.showMessageDialog(null, "Por favor, selecione um modelo para colocar o preço");  
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Troca de valor cancelado!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    public void adicionarRow(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel) tableInfo.getModel();
        model.addRow(dataRow);
    }
    
    public void CarregarLista(){
        try{
            ModeloDAO dao= new ModeloDAO();
            List<UsuarioModelo> userModels = dao.listarTodosPedidos();
            for(UsuarioModelo userModel : userModels){
                adicionarRow(new Object[]{
                    userModel.getUsuario().getId(),
                    userModel.getUsuario().getNome(),
                    userModel.getUsuario().getCpf(),
                    userModel.getUsuario().getEmail(),
                    userModel.getUsuario().getEndereco(),
                    userModel.getModelo().getMensagem(),
                    userModel.getModelo().getArquivo(),
                    userModel.getModelo().getTipo(),
                    userModel.getModelo().getPreco(),
                    userModel.getModelo().getPagamento()
                });
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Houve um erro ao carregar lista: " + e.getMessage());
        }
    }
    
    public void abrirInicialFun(InicialFuncionario tela, Usuario user){
        tela.setVisible(true);
        setUser(user);
        txtBemVindo.setText("Bem-vindo " + user.getNome());
        tela.CarregarLista();
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
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create andtxtBemVindoy the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColocarPreco;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarArquivo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInfo;
    private javax.swing.JLabel txtBemVindo;
    // End of variables declaration//GEN-END:variables
}
