import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Read_Period_Form extends JFrame implements ActionListener
{
  JLabel lbtitle,lbstart_date,lbend_date;
  JTextField tfstart_date,tfend_date; 
  JButton butreport,butcancel;
  int nn;
  Read_Period_Form(int n)
  {
    nn=n;
    setSize(950,450);
    setVisible(true);
    setLayout(null);
    getContentPane().setBackground(Color.PINK);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font f1=new Font("Arial Black",Font.PLAIN,28);
    Font f2=new Font("Arial",Font.BOLD,18);
    if(n==1)
    lbtitle=new JLabel("Read Period to Produce SCHEDULED INTERVIEWS REPORT");
    else if(n==2)
    lbtitle=new JLabel("Reading Period to Produce APPEARED STUDENTS REPORT");
    else if(n==3)
    lbtitle=new JLabel("Reading Period to Produce QUALIFIED STUDENTS REPORT");
    else if(n==4)
    lbtitle=new JLabel("Reading Period to Produce SELECTED STUDENTS REPORT");
    lbstart_date=new JLabel("Enter Starting Date");
    lbend_date=new JLabel("Enter Ending Date");
    
    tfstart_date=new JTextField("10/04/2025");
    tfend_date=new JTextField("19/04/2025");
    
    butreport=new JButton("Produce Report");
    butcancel=new JButton("Cancel");
    butreport.addActionListener(this);
    butcancel.addActionListener(this);
  
    lbtitle.setFont(f1);
    lbstart_date.setFont(f2);
    lbend_date.setFont(f2);
    
    tfstart_date.setFont(f2);
    tfend_date.setFont(f2);
    
    butreport.setFont(f2);
    butcancel.setFont(f2);
    
    add(lbtitle);
    add(lbstart_date);
    add(tfstart_date);
    add(lbend_date);
    add(tfend_date);
    add(butreport);
    add(butcancel);
    
    lbtitle.setBounds(10,75,930,35);
    lbstart_date.setBounds(225,175,200,20);
    tfstart_date.setBounds(435,175,150,20);
    lbend_date.setBounds(225,225,200,20);
    tfend_date.setBounds(435,225,150,20);
    butreport.setBounds(175,300,200,25);
    butcancel.setBounds(425,300,200,25);   
}
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==butreport)
    {
       if(tfstart_date.getText().length() == 0)
        {
         tfstart_date.requestFocus();
         JOptionPane.showMessageDialog(this, "You did not enter the starting Date, Please enter");
       }
    else if(tfend_date.getText().length() == 0)
        {
         tfend_date.requestFocus();
         JOptionPane.showMessageDialog(this, "You did not enter the ending Date, Please enter");
       }
   else  
    {
       dispose();
       if(nn==1)
       new Report_Scheduled_Interviews(tfstart_date.getText(),tfend_date.getText());  
       else if(nn==2)
       new Report_Interviews_Students(tfstart_date.getText(),tfend_date.getText());  
       else if(nn==3)
       new Report_Interview_Rounds(tfstart_date.getText(),tfend_date.getText());  
       else if(nn==4)
       new Report_Selected_Students(tfstart_date.getText(),tfend_date.getText());  
     }
}
    else  if(ae.getSource()==butcancel)
    {
       dispose();     
    }
}

}