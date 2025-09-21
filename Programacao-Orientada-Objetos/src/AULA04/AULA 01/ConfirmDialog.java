import javax.swing.*;

public class ConfirmDialog {
    public ConfirmDialog(){
        int opcao = JOptionPane.showConfirmDialog(null, "Teste");
        if(opcao == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Opah");
        }else if(opcao == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Clicou aqui por quê?");
        } else if (opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Clicou nãoo? ");

        }
    }
}
