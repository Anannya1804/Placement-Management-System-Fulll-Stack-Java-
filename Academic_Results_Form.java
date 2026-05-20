import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Academic_Results_Form extends JFrame implements ActionListener
{
  JLabel lbtitle,lbprn,lbsem1,lbsem2,lbsem3,lbsem4,lbsem5,lbsem6,lbsem7,lbsem8,lbbacklogs; 
  JTextField tfprn,tfsem1,tfsem2,tfsem3,tfsem4,tfsem5,tfsem6,tfsem7,tfsem8,tfbacklogs;  
  Button butadd,butsave,butclose;
  BufferedWriter bw;
  Academic_Results_Form()
  {
    setSize(1275,750);
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    getContentPane().setBackground(Color.PINK);  
    
    Font f1=new Font("Arial Black",Font.PLAIN,30);
    Font f2=new Font("Arial",Font.BOLD,20);
    Font f3=new Font("Times New Roman",Font.BOLD,16);
    
    lbtitle=new JLabel("Registered Student's: Academic Results");
    lbprn=new JLabel("Student's PRN");
    lbsem1=new JLabel("Sem 1 CGPA");
    lbsem2=new JLabel("Sem 2 CGPA");
    lbsem3=new JLabel("Sem 3 CGPA");
    lbsem4=new JLabel("Sem 4 CGPA");
    lbsem5=new JLabel("Sem 5 CGPA");
    lbsem6=new JLabel("Sem 6 CGPA");
    lbsem7=new JLabel("Sem 7 CGPA");
    lbsem8=new JLabel("Sem 8 CGPA");
    lbbacklogs=new JLabel("No. of Backlogs");
    
    tfprn=new JTextField();
    tfsem1=new JTextField();
    tfsem2=new JTextField();
    tfsem3=new JTextField();
    tfsem4=new JTextField();
    tfsem5=new JTextField();
    tfsem6=new JTextField();
    tfsem7=new JTextField();
    tfsem8=new JTextField();
    tfbacklogs=new JTextField();
    
    butadd=new Button("Add New Record");
    butsave=new Button("Save Results Data");
    butclose=new Button("Back to Menu");
    butadd.addActionListener(this);
    butsave.addActionListener(this);
    butclose.addActionListener(this);
  
    lbtitle.setFont(f1);
    lbprn.setFont(f2);
    lbsem1.setFont(f2);
    lbsem2.setFont(f2);
    lbsem3.setFont(f2);
    lbsem4.setFont(f2);
    lbsem5.setFont(f2);
    lbsem6.setFont(f2);
    lbsem7.setFont(f2);
    lbsem8.setFont(f2);
    lbbacklogs.setFont(f2);
    
    tfprn.setFont(f3);
    tfsem1.setFont(f3);
    tfsem2.setFont(f3);
    tfsem3.setFont(f3);
    tfsem4.setFont(f3);
    tfsem5.setFont(f3);
    tfsem6.setFont(f3);
    tfsem7.setFont(f3);
    tfsem8.setFont(f3);
    tfbacklogs.setFont(f3);
    
    butadd.setFont(f3);
    butsave.setFont(f3);
    butclose.setFont(f3);
    
    add(lbtitle);
    add(lbprn);
    add(tfprn);
    add(lbsem1);
    add(tfsem1);
    add(lbsem2);
    add(tfsem2);
    add(lbsem3);
    add(tfsem3);
    add(lbsem4);
    add(tfsem4);
    add(lbsem5);
    add(tfsem5);
    add(lbsem6);
    add(tfsem6);
    add(lbsem7);
    add(tfsem7);
    add(lbsem8);
    add(tfsem8);
    add(lbbacklogs);
    add(tfbacklogs);
    add(butadd);
    add(butsave);
    add(butclose);
    
    lbtitle.setBounds(250,75,800,35);
    lbprn.setBounds(100,225,200,20);
    tfprn.setBounds(310,225,150,20);
    lbsem1.setBounds(100,275,200,20);
    tfsem1.setBounds(310,275,150,20);
    lbsem2.setBounds(650,275,200,20);
    tfsem2.setBounds(860,275,150,20);
    lbsem3.setBounds(100,325,200,20);
    tfsem3.setBounds(310,325,150,20);
    lbsem4.setBounds(650,325,200,20);
    tfsem4.setBounds(860,325,150,20);
    lbsem5.setBounds(100,375,200,20);
    tfsem5.setBounds(310,375,150,20);
    lbsem6.setBounds(650,375,200,20);
    tfsem6.setBounds(860,375,150,20);
    lbsem7.setBounds(100,425,200,20);
    tfsem7.setBounds(310,425,150,20);
    lbsem8.setBounds(650,425,200,20);
    tfsem8.setBounds(860,425,150,20);
    lbbacklogs.setBounds(100,475,200,20);
    tfbacklogs.setBounds(310,475,150,20);
    butadd.setBounds(300,625,200,25);
    butsave.setBounds(550,625,200,25);
    butclose.setBounds(800,625,200,25);  
    
    tfprn.setEditable(false);
    tfsem1.setEditable(false);
    tfsem2.setEditable(false);
    tfsem3.setEditable(false);
    tfsem4.setEditable(false);
    tfsem5.setEditable(false);
    tfsem6.setEditable(false);
    tfsem7.setEditable(false);
    tfsem8.setEditable(false);
    tfbacklogs.setEditable(false);
    butsave.setEnabled(false);
   
    try
    {
      bw=new BufferedWriter(new FileWriter("academic_results.dat",true));
    }
    catch(IOException e1)
    {
       JOptionPane.showMessageDialog(this,"Problems Occured during creating/opening the file");  
    }

                                   tfprn.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfprn.getText().length()>=4)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem1.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem1.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem2.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem2.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem3.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem3.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem3.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem3.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem4.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem4.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem5.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem5.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem6.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem6.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem7.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem7.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfsem8.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfsem8.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfbacklogs.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfbacklogs.getText().length()>=4)
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
     tfprn.setEditable(true);
     tfsem1.setEditable(true);
     tfsem2.setEditable(true);
     tfsem3.setEditable(true);
     tfsem4.setEditable(true);
     tfsem5.setEditable(true);
     tfsem6.setEditable(true);
     tfsem7.setEditable(true);
     tfsem8.setEditable(true);
     tfbacklogs.setEditable(true);
     butsave.setEnabled(true);    
     butadd.setEnabled(false); 
     tfprn.requestFocus();
    }
    else if(ae.getSource()==butsave)
    {
      if(tfprn.getText().length()==0)
      {
        tfprn.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Student's Registration Number, Please Enter");
      }
     else if(tfsem1.getText().length()==0)
      {
        tfsem1.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 1 CGPA is empty, Please Enter the Marks");
      }
     else if(tfsem2.getText().length()==0)
      {
        tfsem2.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 2 CGPA is empty, Please Enter the Marks");
      }
     else if(tfsem3.getText().length()==0)
      {
        tfsem3.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 3 CGPA is empty, Please Enter the Marks");
      }
     else if(tfsem4.getText().length()==0)
      {
        tfsem4.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 4 CGPA is empty, Please Enter the Marks");
      }
     else if(tfsem5.getText().length()==0)
      {
        tfsem5.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 5 CGPA is empty, Please Enter the Marks");
      }
     else if(tfsem6.getText().length()==0)
      {
        tfsem6.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 6 CGPA is empty, Please Enter the Marks");
      }
     else if(tfsem7.getText().length()==0)
      {
        tfsem7.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 7 CGPA is empty, Please Enter the Marks");
      }
     else if(tfsem8.getText().length()==0)
      {
        tfsem8.requestFocus();
        JOptionPane.showMessageDialog(this,"Sem 8 CGPA is empty, Please Enter the Marks");
      }
     else if(tfbacklogs.getText().length()==0)
      {
        tfbacklogs.requestFocus();
        JOptionPane.showMessageDialog(this,"No of Backlogs are Empty, Please Enter, If no backlogs type 0 or -");
      }
     else
     {
       String data=tfprn.getText()+"$"+tfsem1.getText()+"$"+tfsem2.getText()+"$"+tfsem3.getText()+"$"+tfsem4.getText()+"$"+tfsem5.getText()+"$"+tfsem6.getText()+"$"+tfsem7.getText()+"$"+tfsem8.getText()+"$"+tfbacklogs.getText();
       try
      {
        bw.write(data);
        bw.newLine();
        bw.flush();
        JOptionPane.showMessageDialog(this,"Student's Academic Results Data is saved successfully");    
     
    tfprn.setText("");
    tfsem1.setText("");
    tfsem2.setText("");
    tfsem3.setText("");
    tfsem4.setText("");
    tfsem5.setText("");
    tfsem6.setText("");
    tfsem7.setText("");
    tfsem8.setText("");
    tfbacklogs.setText("");
    
    tfprn.setEditable(false);
    tfsem1.setEditable(false);
    tfsem2.setEditable(false);
    tfsem3.setEditable(false);
    tfsem4.setEditable(false);
    tfsem5.setEditable(false);
    tfsem6.setEditable(false);
    tfsem7.setEditable(false);
    tfsem8.setEditable(false);
    tfbacklogs.setEditable(false);
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
   Academic_Results_Form obj=new Academic_Results_Form();
  } 
}