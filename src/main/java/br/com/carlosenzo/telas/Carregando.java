
package br.com.carlosenzo.telas;

import br.com.carlosenzo.classes.Modelo;
import br.com.carlosenzo.classes.ModeloDAO;
import br.com.carlosenzo.classes.Usuario;
import br.com.carlosenzo.classes.UsuarioDAO;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Carregando extends javax.swing.JFrame {

    
    public Carregando() {
        initComponents();
        ColocarIcone();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        imageIni = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C&E Invenções 3D (Carregando)");
        setBackground(new java.awt.Color(155, 132, 105));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(650, 50));
        setMaximumSize(new java.awt.Dimension(158, 201));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(70, 62, 49));

        jPanel2.setBackground(new java.awt.Color(155, 132, 105));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
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
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(155, 132, 105));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        label.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        label.setForeground(new java.awt.Color(155, 132, 105));
        label.setText("Carregando...");

        bar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imageIni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CriandoConta(Carregando tela, String cpf,String nome, String usuario, String senha, String tipo, String email, String endereco){
        tela.setVisible(true);
        new Thread(() -> {
        try{
                Usuario user = new Usuario(nome, cpf, usuario, senha, tipo, email, endereco);
                UsuarioDAO dao = new UsuarioDAO();
                dao.cadastrar(user);
                
                for(int i = 0; i <= 100; i += 25){
                    Thread.sleep(500);
                    label.setText("Carregando.");
                    Thread.sleep(500);
                    label.setText("Carregando..");
                    Thread.sleep(500);
                    label.setText("Carregando...");
                    bar.setValue(i);
                }
                
                JOptionPane.showMessageDialog(null, "Sua conta foi criada!");
                tela.dispose();
                Login telaLog = new Login();
                telaLog.setVisible(true);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar!" + e.getMessage());
                Cadastrar telacads = new Cadastrar();
                tela.dispose();
                telacads.setVisible(true);
            }
        }).start();
    }
    
    public void verificarUser(Carregando tela, String login, String senha) {
        tela.setVisible(true);
        new Thread(() -> {
        try{
            UsuarioDAO dao = new UsuarioDAO();
            Usuario user = dao.entrar(login, senha);
            for(int i = 0; i <= 100; i += 25){
                Thread.sleep(500);
                label.setText("Carregando.");
                Thread.sleep(500);
                label.setText("Carregando..");
                Thread.sleep(500);
                label.setText("Carregando...");
                bar.setValue(i);
            }
            tela.dispose();
            if(user != null){
                if(user.getTipo().equals("Cliente")){
                    InicialCliente inicli = new InicialCliente();
                    inicli.AbrirClienteInicial(inicli, user);
                }else{
                    InicialFuncionario telafun = new InicialFuncionario();
                    telafun.abrirInicialFun(telafun, user);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado! Verifique o seu login ou cadastre-se para entrar.");
                tela.dispose();
                Login telaL = new Login();
                telaL.setVisible(true);
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Usuário não encontrado! Verifique o seu login ou cadastre-se para entrar.");
            tela.dispose();
            Login telaL = new Login();
            telaL.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            tela.dispose();
            Login telaL = new Login();
            telaL.setVisible(true);
        }
        }).start();
    }
    
    public void setsUser(Usuario user, String nome, String email, String endereco, byte[] image){
            user.setNome(nome);
            user.setEmail(email);
            user.setEndereco(endereco);
            user.setImagem(image);
    }
    
    
    public void atualizandoConta(Carregando tela, Usuario user, String nome, String email, String endereco, FileInputStream fis){
        tela.setVisible(true);
        new Thread(() -> {
        try{
            byte[] image;
            if(fis != null){
                image = fis.readAllBytes();
            }else{
                image = user.getImagem();
            }
            UsuarioDAO dao = new UsuarioDAO();
            dao.atualizar(user, nome, email, endereco, image);
            for(int i = 0; i <= 100; i += 25){
                Thread.sleep(500);
                label.setText("Carregando.");
                Thread.sleep(500);
                label.setText("Carregando..");
                Thread.sleep(500);
                label.setText("Carregando...");
                bar.setValue(i);
            }
            setsUser(user,nome,email,endereco, image);
            tela.dispose();
            JOptionPane.showMessageDialog(null, "Seu perfil foi atualizado!!");
            InicialCliente telaIn = new InicialCliente();
            telaIn.AbrirClienteInicial(telaIn, user);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Houve um erro ao atualizar! " + e.getMessage());
            tela.dispose();
            ConfigurarPerfilCliente telaconfig = new ConfigurarPerfilCliente();
            telaconfig.abrirConfigPerfil(telaconfig, user);
        }
        }).start();
    }
    
    public void CriandoModelo(Carregando tela, int userId, String nome, FileInputStream fis, String tipo){
        tela.setVisible(true);
        new Thread(() -> {
        try{
            byte[] arquivo;
            if(fis != null){
                arquivo = fis.readAllBytes();
                Modelo modelo = new Modelo(userId, nome, "Definindo", "Pendente", arquivo, tipo.toLowerCase());
                ModeloDAO dao = new ModeloDAO();
                dao.adicionar(modelo);
                for(int i = 0; i <= 100; i += 25){
                    Thread.sleep(500);
                    label.setText("Carregando.");
                    Thread.sleep(500);
                    label.setText("Carregando..");
                    Thread.sleep(500);
                    label.setText("Carregando...");
                    bar.setValue(i);
                }
                tela.dispose();
                JOptionPane.showMessageDialog(null, "Seu modelo foi enviado.");
            }
            
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null: " + ex.getMessage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Houve um erro ao criar modelo! " + e.getMessage());
            tela.dispose();
        }
        }).start();
    }
    
    public void CarregandoTabela(Carregando tela, Usuario user){
        tela.setVisible(true);
        new Thread(() -> {
        try{
            AnalizarModeloCliente telaA = new AnalizarModeloCliente();
            for(int i = 0; i <= 100; i += 25){
                    Thread.sleep(500);
                    label.setText("Carregando.");
                    Thread.sleep(500);
                    label.setText("Carregando..");
                    Thread.sleep(500);
                    label.setText("Carregando...");
                    bar.setValue(i);
                }
            telaA.abrirAnalizarModelo(telaA, user);
            tela.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Houve um erro no carregamento!" + e.getMessage());
        }
        }).start();
    }
    
    public void ColocarIcone(){
        String caminho = "/image/logo.jpg";
        String caminhoInical = "/image/Faixa.png";
        InputStream pastaI = getClass().getResourceAsStream(caminhoInical);
        InputStream pasta = getClass().getResourceAsStream(caminho);
        try{
            if(pastaI != null || pasta != null){
                ImageIcon imlog = new ImageIcon(ImageIO.read(pastaI));
                Image imagem = new ImageIcon(ImageIO.read(pasta)).getImage();
                imageIni.setIcon(imlog);
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
            java.util.logging.Logger.getLogger(Carregando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carregando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carregando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carregando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carregando().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel imageIni;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
