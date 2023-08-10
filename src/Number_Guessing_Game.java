import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Number_Guessing_Game {
    private JButton guessButton;
    private JTextField mynumber;
    private JTextField computernumber;
    private JTextField message;
    private JPanel mypanel;

    public Number_Guessing_Game() {
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int myno = Integer.parseInt(mynumber.getText());
              int no2=(int)(Math.random()*100);
                if (myno == no2) {

                   message.setText("Correct You Win!");


                }
                else if (myno >= no2 ) {

                   message.setText("Nope!  number is higher. Guess again.");

                }
                else  {

                    message.setText("Nope!  number is lower. Guess again.");

                }
                computernumber.setText(Integer.toString(no2));

            }

        });

    }

    public static void main(String[] args) {
        JFrame frame=new JFrame( "Guessinggame");
        frame.setContentPane(new Number_Guessing_Game().mypanel);
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
