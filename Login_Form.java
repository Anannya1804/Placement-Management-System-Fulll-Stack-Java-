import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login_Form extends JFrame implements ActionListener {
  JLabel lb1, lb2, lb3, lb4, lbtitle, lbusername, lbpassword;
  JTextField tfusername;
  JPasswordField tfpassword;
  JButton butlogin, butcancel;
  JPanel panel;

  Login_Form() {
    setSize(1275, 750);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // ✅ Background Image
    ImageIcon ii = new ImageIcon("Image.jpg");
    Image img = ii.getImage().getScaledInstance(1275, 750, Image.SCALE_SMOOTH);
    JLabel background = new JLabel(new ImageIcon(img));
    setContentPane(background);
    background.setLayout(null);

    // Fonts
    Font f1 = new Font("Arial Black", Font.PLAIN, 30);
    Font f2 = new Font("Arial", Font.BOLD, 22);
    Font f3 = new Font("Arial", Font.BOLD, 18);

    // ✅ Centered Title Labels
    lb1 = new JLabel("A Mini Project", SwingConstants.CENTER);
    lb2 = new JLabel("Students Campus Placement Information System", SwingConstants.CENTER);
    lb3 = new JLabel("Developed for", SwingConstants.CENTER);
    lb4 = new JLabel("TNP Section, MIT WPU, Pune", SwingConstants.CENTER);

    lb1.setFont(f3);
    lb2.setFont(f1);
    lb3.setFont(f3);
    lb4.setFont(f2);

    // Better contrast colors
    lb1.setForeground(Color.WHITE);
    lb2.setForeground(new Color(255, 215, 0)); // gold
    lb3.setForeground(Color.WHITE);
    lb4.setForeground(Color.CYAN);

    // Full width centered
    lb1.setBounds(0, 40, 1275, 30);
    lb2.setBounds(0, 80, 1275, 40);
    lb3.setBounds(0, 130, 1275, 30);
    lb4.setBounds(0, 170, 1275, 30);

    background.add(lb1);
    background.add(lb2);
    background.add(lb3);
    background.add(lb4);

    // ✅ Center Login Panel
    panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(450, 300, 380, 260); // centered
    panel.setBackground(new Color(0, 0, 0, 170)); // dark transparent

    lbtitle = new JLabel("LOGIN", SwingConstants.CENTER);
    lbtitle.setFont(new Font("Arial", Font.BOLD, 26));
    lbtitle.setForeground(Color.WHITE);
    lbtitle.setBounds(0, 10, 380, 30);

    lbusername = new JLabel("Username");
    lbpassword = new JLabel("Password");

    lbusername.setFont(f3);
    lbpassword.setFont(f3);

    lbusername.setForeground(Color.WHITE);
    lbpassword.setForeground(Color.WHITE);

    tfusername = new JTextField();
    tfpassword = new JPasswordField();
    tfpassword.setEchoChar('*');

    tfusername.setFont(f3);
    tfpassword.setFont(f3);

    butlogin = new JButton("Login");
    butcancel = new JButton("Cancel");

    butlogin.setFont(f3);
    butcancel.setFont(f3);

    butlogin.setBackground(new Color(0, 150, 136));
    butlogin.setForeground(Color.WHITE);

    butcancel.setBackground(new Color(200, 50, 50));
    butcancel.setForeground(Color.WHITE);

    butlogin.addActionListener(this);
    butcancel.addActionListener(this);

    // Layout inside panel
    lbusername.setBounds(40, 70, 120, 25);
    tfusername.setBounds(170, 70, 150, 25);

    lbpassword.setBounds(40, 110, 120, 25);
    tfpassword.setBounds(170, 110, 150, 25);

    butlogin.setBounds(60, 180, 100, 35);
    butcancel.setBounds(200, 180, 100, 35);

    panel.add(lbtitle);
    panel.add(lbusername);
    panel.add(tfusername);
    panel.add(lbpassword);
    panel.add(tfpassword);
    panel.add(butlogin);
    panel.add(butcancel);

    background.add(panel);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == butlogin) {
      if ((tfusername.getText().equals("Ananya") || tfusername.getText().equals("Grisham"))
          && tfpassword.getText().equals("Ananya@123")) {
        JOptionPane.showMessageDialog(this, "You are authorized user, please continue the project");
        new Menu_Project();
        dispose();
      } else {
        JOptionPane.showMessageDialog(this, "Sorry you are unauthorized user");
      }
    } else if (ae.getSource() == butcancel) {
      dispose();
    }
  }

  public static void main(String args[]) {
    new Login_Form();
  }
}