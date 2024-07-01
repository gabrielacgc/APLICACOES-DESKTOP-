import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;


public class ProgramaGUI { 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World "); 
        JLabel label = new JLabel("Hello World!", JLabel.CENTER);
        JButton btn = new JButton("0k"); 
        btn.setBounds(400, 400, 100,20);
        label.setBounds(200,200,100,20);

        frame.add(label);
        frame.add(btn);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);  

        btn.addActionListener(e -> {
            label.setText("Hello World - Seja Bem Vindo");
        });

        
    } // fim do public static 
} // fim da classe Programa