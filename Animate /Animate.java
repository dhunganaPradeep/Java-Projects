
//  Create a frame with a red circular object in the center. Also add four buttons named up, down, right and left. When a button is pressed the ball should move in the direction corresponding to the name of the button. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Animate extends JPanel implements ActionListener {
    JButton left, right, up, down;
    JPanel btnPanel;
    int x = 200;
    int y = 150;

    public Animate() {
        btnPanel = new JPanel();
        up = new JButton("Up");
        down = new JButton("Down");
        left = new JButton("Left");
        right = new JButton("Right");
        btnPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        left.addActionListener(this);
        right.addActionListener(this);
        up.addActionListener(this);
        down.addActionListener(this);
        btnPanel.add(left);
        btnPanel.add(up);
        btnPanel.add(down);
        btnPanel.add(right);
        setLayout(new BorderLayout());
        add(btnPanel, BorderLayout.SOUTH);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 20, 20);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == left) {
            x = x - 10;
        } else if (e.getSource() == right) {
            x = x + 10;
        } else if (e.getSource() == up) {
            y = y - 10;
        } else {
            y = y + 10;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 400);
        f.add(new Animate());
        f.setVisible(true);
    }
}
