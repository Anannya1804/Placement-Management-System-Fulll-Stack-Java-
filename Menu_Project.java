import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Menu_Project extends JFrame implements ActionListener {

    JMenuBar jmn;
    JMenu menu1, menu2, menu3, menu4;
    JMenuItem mi11, mi12, mi13, mi14, mi21, mi22, mi23, mi24,
            mi31, mi32, mi33, mi34, mi35, mi36, mi37, mi38, mi41;

    public Menu_Project() {

        setTitle("Campus Placement System");
        setSize(1380, 900);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🎨 PROFESSIONAL DARK GRADIENT
        JPanel bg = new JPanel() {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                Color c1 = new Color(28, 28, 28); // dark charcoal
                Color c2 = new Color(70, 70, 70); // soft gray
                GradientPaint gp = new GradientPaint(0, 0, c1, getWidth(), getHeight(), c2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        bg.setLayout(null);
        setContentPane(bg);

        // 🌟 TITLE
        JLabel title = new JLabel("Campus Placement Management System", JLabel.CENTER);
        title.setBounds(250, 20, 900, 50);
        title.setFont(new Font("Segoe UI", Font.BOLD, 32));
        title.setForeground(new Color(230, 230, 230));
        bg.add(title);

        // 📦 GLASS PANEL
        JPanel glass = new JPanel();
        glass.setBounds(150, 100, 1080, 700);
        glass.setBackground(new Color(255, 255, 255, 40)); // subtle transparency
        glass.setLayout(null);
        glass.setBorder(new LineBorder(new Color(200, 200, 200), 1, true));
        bg.add(glass);

        // 🖼 IMAGE
        ImageIcon ii = new ImageIcon("Image.jpg");
        Image img = ii.getImage().getScaledInstance(1000, 650, Image.SCALE_SMOOTH);
        JLabel lbimage = new JLabel(new ImageIcon(img));
        lbimage.setBounds(40, 25, 1000, 650);
        glass.add(lbimage);

        // 🎯 MENU BAR
        jmn = new JMenuBar();
        jmn.setBackground(new Color(20, 20, 20));
        jmn.setBorder(new EmptyBorder(5, 10, 5, 10));

        Font menuFont = new Font("Segoe UI", Font.BOLD, 15);

        menu1 = new JMenu("Primary Data Retrieval");
        menu2 = new JMenu("Placement Data Entry");
        menu3 = new JMenu("Reports");
        menu4 = new JMenu("Exit");

        JMenu[] menus = { menu1, menu2, menu3, menu4 };

        for (JMenu m : menus) {
            m.setForeground(new Color(220, 220, 220));
            m.setFont(menuFont);
        }

        // MENU ITEMS
        mi11 = createItem("Student Registration");
        mi12 = createItem("Academic Results Retrieval");
        mi13 = createItem("Certified Courses Retrieval");
        mi14 = createItem("Companies Retrieval");

        mi21 = createItem("Scheduled Interviews Entry");
        mi22 = createItem("Appeared Students Entry");
        mi23 = createItem("Qualified Rounds Entry");
        mi24 = createItem("Selected Students Entry");

        mi31 = createItem("Student Report");
        mi32 = createItem("Academic Report");
        mi33 = createItem("Courses Report");
        mi34 = createItem("Company Report");
        mi35 = createItem("Interview Schedule Report");
        mi36 = createItem("Appeared Students Report");
        mi37 = createItem("Qualified Students Report");
        mi38 = createItem("Selected Students Report");

        mi41 = createItem("Exit");

        // ADD ITEMS
        menu1.add(mi11);
        menu1.add(mi12);
        menu1.add(mi13);
        menu1.add(mi14);
        menu2.add(mi21);
        menu2.add(mi22);
        menu2.add(mi23);
        menu2.add(mi24);
        menu3.add(mi31);
        menu3.add(mi32);
        menu3.add(mi33);
        menu3.add(mi34);
        menu3.add(mi35);
        menu3.add(mi36);
        menu3.add(mi37);
        menu3.add(mi38);
        menu4.add(mi41);

        jmn.add(menu1);
        jmn.add(menu2);
        jmn.add(menu3);
        jmn.add(menu4);

        setJMenuBar(jmn);

        setVisible(true);
    }

    // 🎨 Styled Menu Item
    private JMenuItem createItem(String text) {
        JMenuItem item = new JMenuItem(text);
        item.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        item.setBackground(new Color(245, 245, 245));
        item.setForeground(Color.BLACK);
        item.setFocusPainted(false);
        item.addActionListener(this);
        return item;
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == mi11)
            new Students_Registration_Form();
        else if (ae.getSource() == mi12)
            new Academic_Results_Form();
        else if (ae.getSource() == mi13)
            new Certified_Courses_Form();
        else if (ae.getSource() == mi14)
            new Associated_Companies_Form();
        else if (ae.getSource() == mi21)
            new Scheduled_Interview_DEF();
        else if (ae.getSource() == mi22)
            new Appeared_Students_DEF();
        else if (ae.getSource() == mi23)
            new Interview_Rounds_DEF();
        else if (ae.getSource() == mi24)
            new Selected_Students_DEF();
        else if (ae.getSource() == mi31)
            new Report_Students_Registration();
        else if (ae.getSource() == mi32)
            new Report_Academic_Results();
        else if (ae.getSource() == mi33)
            new Report_Certified_Courses();
        else if (ae.getSource() == mi34)
            new Report_Job_Companies();
        else if (ae.getSource() == mi35)
            new Read_Period_Form(1);
        else if (ae.getSource() == mi36)
            new Read_Period_Form(2);
        else if (ae.getSource() == mi37)
            new Read_Period_Form(3);
        else if (ae.getSource() == mi38)
            new Read_Period_Form(4);
        else if (ae.getSource() == mi41)
            dispose();
    }

    public static void main(String args[]) {
        new Menu_Project();
    }
}