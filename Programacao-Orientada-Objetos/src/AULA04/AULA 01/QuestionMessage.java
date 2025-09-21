import javax.swing.*;

public class QuestionMessage {
    public QuestionMessage(){
        String[] dado = {"Azul", "Vermelho", "Verde"};
        Object valor = JOptionPane.showInputDialog(null,
                "Qual sua cor?",
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                dado,
                dado[0]);
        JOptionPane.showMessageDialog(null, valor, "Ensware" ,JOptionPane.WARNING_MESSAGE);
    }
}
