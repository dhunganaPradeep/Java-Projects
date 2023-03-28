// Create guess number game where user have to guess the randomly generated number. The user should be able to enter any number through the textfield and click the 'try' button. If the number does not match with the randomly generated number, allow the user to try again. If the user manages to succeed in guessing the number, display a congratulations message in a dialog box. Also display the number of attempts in a label

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame implements ActionListener {
    JLabel label;
    JButton btn;
    JTextField tf;
    int num;
    int attempts;
    JOptionPane.showMessageDialog(this, "Congratulations!!! successful in " +attempts + " tries"); 
    setRandomNumber(); // if the guess is correct generate a new random number }else { 
    JOptionPane.showMessageDialog(this, "Wrong guess.. try 
    again",null,JOptionPane.ERROR_MESSAGE); 
    } 
    tf.setText(""); // Clear the text field after each attempt 
    } 
    public static void main(String [] args ){ 
    new GUI(); 
    } 
    } 
    
    public GUI() {
        setSize(400, 400);
        tf = new JTextField();
        btn = new JButton("Try");
        label = new JLabel();
        setRandomNumber();
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(tf);
        add(btn);
        add(label);
        btn.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setRandomNumber() {
        Random random = new Random();
        this.num = random.nextInt(10); // generates a random number between 1- 10 attempts = 0;
        label.setText("Number of attempts: " + attempts);
    }

    public void actionPerformed(ActionEvent e) {
        attempts++; // increment the attempts count after every click
        label.setText("Number of attempts: " + attempts);
        int guess = Integer.parseInt(tf.getText());
        if (guess == num) {

            JOptionPane.showMessageDialog(this, "Congratulations!!! successful in " + attempts + " tries");
            setRandomNumber(); // if the guess is correct generate a new random number }else {
            JOptionPane.showMessageDialog(this, "Wrong guess.. try again", null, JOptionPane.ERROR_MESSAGE);
        }
        tf.setText(""); // Clear the text field after each attempt
    }

    public static void main(String[] args) {
        new GUI();
    }
}
