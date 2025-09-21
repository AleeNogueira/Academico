package Janela;

import model.Livro;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class FormCadastroLivro extends  JFrame {

    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtAno;
    private JButton btnSalvar;
    private JButton btnCancelar;
    private JTextField txtNumeroPaginas;
    private JPanel jpanel;


    public FormCadastroLivro() {
        this.setTitle("Cadastro Livro");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(480, 350);
        this.add(jpanel);
        this.setVisible(true);




        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Livro livro = new Livro();
                livro.setTitulo(txtTitulo.getText());
                livro.setAutor(txtAutor.getText());
                livro.setAno(Integer.parseInt(txtAno.getText()));
                livro.setNumeroPaginas(Integer.parseInt(txtNumeroPaginas.getText()));
                JOptionPane.showMessageDialog(null, livro.toCSV());


            }
        });
    }

    private void createUIComponents() {
        try{
            NumberFormat formato = NumberFormat.getInstance();
            NumberFormatter formatter = new NumberFormatter(formato);
            formatter.setValueClass(Integer.class);
            formatter.setAllowsInvalid(false);

            txtNumeroPaginas = new JFormattedTextField(formatter);
            txtAno = new JFormattedTextField(formatter);

        }catch (Exception e){
            throw  new RuntimeException(e);
        }

    }

}
