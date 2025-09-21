package Janela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCadastroLivro extends  JFrame {

    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtAno;
    private JButton btnSalvar;
    private JButton btnCancelar;
    private JTextField txtNumeroPagina;
    private JPanel jpanel;

    public FormCadastroLivro() {
        this.setTitle("Cadastro Livro");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(480, 350);
        this.setVisible(true);
        this.add(jpanel);
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
