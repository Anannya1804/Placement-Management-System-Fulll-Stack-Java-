import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Associated_Companies_Form extends JFrame implements ActionListener
{
  JLabel lbtitle,lbcomp_idno,lbcomp_name,lbaddress,lbcp1_name,lbcp1_desig,lbcp1_email,lbcp1_mobile,lbcp2_name,lbcp2_desig,lbcp2_email,lbcp2_mobile;
 JTextField tfcomp_idno,tfcomp_name,tfaddress,tfcp1_name,tfcp1_desig,tfcp1_email,tfcp1_mobile,tfcp2_name,tfcp2_desig,tfcp2_email,tfcp2_mobile;
JButton butadd,butsave,butclose;
BufferedWriter bw;
   Associated_Companies_Form()
  {
    setSize(1275,750);
    setVisible(true);
    setLayout(null);
    getContentPane().setBackground(Color.PINK);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font f1=new Font("Arial Black",Font.PLAIN,30);
    Font f2=new Font("Arial",Font.BOLD,20);
    Font f3=new Font("Times New Roman",Font.BOLD,16);
    
    lbtitle=new JLabel("Associated Job Provider Company's Data Form");
    lbcomp_idno=new JLabel("Company ID No.");
    lbcomp_name=new JLabel("Company's Name");
    lbaddress=new JLabel("Office Address");
    lbcp1_name=new JLabel("Contact Person-1: Name");
    lbcp1_desig=new JLabel("Designation");
    lbcp1_email=new JLabel("Email ID");
    lbcp1_mobile=new JLabel("Mobile No.");
    lbcp2_name=new JLabel("Contact Person-2: Name");
    lbcp2_desig=new JLabel("Designation");
    lbcp2_email=new JLabel("Email ID");
    lbcp2_mobile=new JLabel("Mobile No.");
    
    tfcomp_idno=new JTextField();
    tfcomp_name=new JTextField();
    tfaddress=new JTextField();
    tfcp1_name=new JTextField();
    tfcp1_desig=new JTextField();
    tfcp1_email=new JTextField();
    tfcp1_mobile=new JTextField();
    tfcp2_name=new JTextField();
    tfcp2_desig=new JTextField();
    tfcp2_email=new JTextField();
    tfcp2_mobile=new JTextField();

    butadd=new JButton("Add New Company");
    butsave=new JButton("Save Copmany's Data");
    butclose=new JButton("Back to Menu");
    butadd.addActionListener(this);
    butsave.addActionListener(this);
    butclose.addActionListener(this);
  
    lbtitle.setFont(f1);
    lbcomp_idno.setFont(f2);
    lbcomp_name.setFont(f2);
    lbaddress.setFont(f2);
    lbcp1_name.setFont(f2);
    lbcp1_desig.setFont(f2);
    lbcp1_email.setFont(f2);
    lbcp1_mobile.setFont(f2);
    lbcp2_name.setFont(f2);
    lbcp2_desig.setFont(f2);
    lbcp2_email.setFont(f2);
    lbcp2_mobile.setFont(f2);
    
    tfcomp_idno.setFont(f3);
    tfcomp_name.setFont(f3);
    tfaddress.setFont(f3);
    tfcp1_name.setFont(f3);
    tfcp1_desig.setFont(f3);
    tfcp1_email.setFont(f3);
    tfcp1_mobile.setFont(f3);
    tfcp2_name.setFont(f3);
    tfcp2_desig.setFont(f3);
    tfcp2_email.setFont(f3);
    tfcp2_mobile.setFont(f3);

    butadd.setFont(f3);
    butsave.setFont(f3);
    butclose.setFont(f3);
    
    add(lbtitle);
    add(lbcomp_idno);
    add(tfcomp_idno);
    add(lbcomp_name);
    add(tfcomp_name);
    add(lbaddress);
    add(tfaddress);
    add(lbcp1_name);
    add(tfcp1_name);
    add(lbcp1_desig);
    add(tfcp1_desig);
    add(lbcp1_email);
    add(tfcp1_email);
    add(lbcp1_mobile);
    add(tfcp1_mobile);
    add(lbcp2_name);
    add(tfcp2_name);
    add(lbcp2_desig);
    add(tfcp2_desig);
    add(lbcp2_email);
    add(tfcp2_email);
    add(lbcp2_mobile);
    add(tfcp2_mobile);
    add(butadd);
    add(butsave);
    add(butclose);
    
    lbtitle.setBounds(250,75,800,35);
    lbcomp_idno.setBounds(100,200,200,20);
    tfcomp_idno.setBounds(310,200,150,20);
    lbcomp_name.setBounds(100,250,200,20);
    tfcomp_name.setBounds(310,250,600,20);
    lbaddress.setBounds(100,300,200,20);
    tfaddress.setBounds(310,300,850,20);
    lbcp1_name.setBounds(10,350,290,20);
    tfcp1_name.setBounds(310,350,350,20);
    lbcp1_desig.setBounds(700,350,150,20);
    tfcp1_desig.setBounds(860,350,300,20);
    lbcp1_email.setBounds(100,400,200,20);
    tfcp1_email.setBounds(310,400,350,20);
    lbcp1_mobile.setBounds(700,400,150,20);
    tfcp1_mobile.setBounds(860,400,300,20);
    lbcp2_name.setBounds(10,450,290,20);
    tfcp2_name.setBounds(310,450,350,20);
    lbcp2_desig.setBounds(700,450,150,20);
    tfcp2_desig.setBounds(860,450,300,20);
    lbcp2_email.setBounds(100,500,200,20);
    tfcp2_email.setBounds(310,500,350,20);
    lbcp2_mobile.setBounds(700,500,150,20);
    tfcp2_mobile.setBounds(860,500,300,20);
    butadd.setBounds(300,650,200,25);
    butsave.setBounds(550,650,200,25);
    butclose.setBounds(800,650,200,25);
    
    tfcomp_idno.setEditable(false);
    tfcomp_name.setEditable(false);
    tfaddress.setEditable(false);
    tfcp1_name.setEditable(false);
    tfcp1_desig.setEditable(false);
    tfcp1_email.setEditable(false);
    tfcp1_mobile.setEditable(false);
    tfcp2_name.setEditable(false);
    tfcp2_desig.setEditable(false);
    tfcp2_email.setEditable(false);
    tfcp2_mobile.setEditable(false);
    butsave.setEnabled(false);
   
    try
    {
      bw=new BufferedWriter(new FileWriter("job_companies.dat",true));
    }
    catch(IOException e1)
    {
       JOptionPane.showMessageDialog(this,"Problems Occured during creating/opening the file");  
    }

                                   tfcomp_idno.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcomp_idno.getText().length()>=4)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfcomp_name.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcomp_name.getText().length()>=20)
		           ke.consume();
		    }
		}
);
                                   tfaddress.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfaddress.getText().length()>=30)
		           ke.consume();
		    }
		}
);
                                   tfcp1_name.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp1_name.getText().length()>=20)
		           ke.consume();
		    }
		}
);
                                   tfcp1_desig.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp1_desig.getText().length()>=20)
		           ke.consume();
		    }
		}
);
                                   tfcp1_email.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp1_email.getText().length()>=20)
		           ke.consume();
		    }
		}
);
                                   tfcp1_mobile.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp1_mobile.getText().length()>=10)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfcp2_name.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp2_name.getText().length()>=30)
		           ke.consume();
		    }
		}
);
                                   tfcp2_desig.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp2_desig.getText().length()>=20)
		           ke.consume();
		    }
		}
);
                                   tfcp2_email.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp2_email.getText().length()>=20)
		           ke.consume();
		    }
		}
);
                                   tfcp2_mobile.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcp2_mobile.getText().length()>=10)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);

}
public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==butadd)
    {
     tfcomp_idno.setEditable(true);
     tfcomp_name.setEditable(true);
     tfaddress.setEditable(true);
     tfcp1_name.setEditable(true);
     tfcp1_desig.setEditable(true);
     tfcp1_email.setEditable(true);
     tfcp1_mobile.setEditable(true);
     tfcp2_name.setEditable(true);
     tfcp2_desig.setEditable(true);
     tfcp2_email.setEditable(true);
     tfcp2_mobile.setEditable(true);
     butsave.setEnabled(true);    
     butadd.setEnabled(false); 
     tfcomp_idno.requestFocus();
    }
    else if(ae.getSource()==butsave)
    {
      if(tfcomp_idno.getText().length()==0)
      {
        tfcomp_idno.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Company's ID Number, Please Enter");
      }
     else if(tfcomp_name.getText().length()==0)
      {
        tfcomp_name.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Company's Name, Please Enter");
      }
     else if(tfaddress.getText().length()==0)
      {
        tfaddress.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter the Company's address, Please Enter");
      }
     else if(tfcp1_name.getText().length()==0)
      {
        tfcp1_name.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter the Name of Contact Person 1, Please Enter");
      }
     else if(tfcp1_desig.getText().length()==0)
      {
        tfcp1_desig.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter the Designation of Contact Person 1, Please Enter");
      }
     else if(tfcp1_email.getText().length()==0)
      {
        tfcp1_email.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Email ID of Contact Person 1, Please Enter the Marks");
      }
     else if(tfcp1_mobile.getText().length()==0)
      {
        tfcp1_mobile.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Mobile No of Contact Person 1, Please Enter the Marks");
      }
     else if(tfcp2_name.getText().length()==0)
      {
        tfcp2_name.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter the Name of Contact Person 2, Please Enter");
      }
     else if(tfcp2_desig.getText().length()==0)
      {
        tfcp2_desig.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter the Designation of Contact Person 2, Please Enter");
      }
     else if(tfcp2_email.getText().length()==0)
      {
        tfcp2_email.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Email ID of Contact Person 2, Please Enter");
      }
     else if(tfcp2_mobile.getText().length()==0)
      {
        tfcp2_mobile.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Mobile No of Contact Person 2, Please Enter");
      }
     else
     {
       String data=tfcomp_idno.getText()+"$"+tfcomp_name.getText()+"$"+tfaddress.getText()+"$"+tfcp1_name.getText()+"$"+tfcp1_desig.getText()+"$"+tfcp1_email.getText()+"$"+tfcp1_mobile.getText()+"$"+tfcp2_name.getText()+"$"+tfcp2_desig.getText()+"$"+tfcp2_email.getText()+"$"+tfcp2_mobile.getText();
       try
      {
        bw.write(data);
        bw.newLine();
        bw.flush();
        JOptionPane.showMessageDialog(this,"Student's Academic Results Data is saved successfully");    
     
    tfcomp_idno.setText("");
    tfcomp_name.setText("");
    tfaddress.setText("");
    tfcp1_name.setText("");
    tfcp1_desig.setText("");
    tfcp1_email.setText("");
    tfcp1_mobile.setText("");
    tfcp2_name.setText("");
    tfcp2_desig.setText("");
    tfcp2_email.setText("");
    tfcp2_mobile.setText("");
    
    tfcomp_idno.setEditable(false);
    tfcomp_name.setEditable(false);
    tfaddress.setEditable(false);
    tfcp1_name.setEditable(false);
    tfcp1_desig.setEditable(false);
    tfcp1_email.setEditable(false);
    tfcp1_mobile.setEditable(false);
    tfcp2_name.setEditable(false);
    tfcp2_desig.setEditable(false);
    tfcp2_email.setEditable(false);
    tfcp2_mobile.setEditable(false);
    butsave.setEnabled(false);
    
     }
      catch(IOException e2)
      {
        JOptionPane.showMessageDialog(this,"Problems Occured during writing/saving the data into file");  
      }
     butadd.setEnabled(true); 
    }
     
  }    
    else if(ae.getSource()==butclose)
    {
      try
      {
        bw.close();
      }
    catch(IOException e3)
    {
       JOptionPane.showMessageDialog(this,"Problems Occured during closing the file");  
    }
       dispose();
    }    
 }

public static void main(String args[])
 {
   Associated_Companies_Form obj=new Associated_Companies_Form();
  } 
}