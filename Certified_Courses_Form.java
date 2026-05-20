import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Certified_Courses_Form extends JFrame implements ActionListener
{
  JLabel lbtitle,lbprn,lbcourse_title,lbduration,lbkey_contents,lbresult; 
  JTextField tfprn,tfcourse_title,tfduration,tfkey_contents,tfresult;  
  Button butadd,butsave,butclose;
  BufferedWriter bw;
  Certified_Courses_Form()
  {
    setSize(1275,750);
    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    getContentPane().setBackground(Color.PINK);  
    
    Font f1=new Font("Arial Black",Font.PLAIN,30);
    Font f2=new Font("Arial",Font.BOLD,20);
    Font f3=new Font("Times New Roman",Font.BOLD,16);
    
    lbtitle=new JLabel("Registered Student's: Additional Courses Done and Projects Completed");
    lbprn=new JLabel("Student's PRN");
    lbcourse_title=new JLabel("Course Title");
    lbduration=new JLabel("Course Duration");
    lbkey_contents=new JLabel("Highlighted Key Contents");
    lbresult=new JLabel("Result in %");
    
    tfprn=new JTextField();
    tfcourse_title=new JTextField();
    tfduration=new JTextField();
    tfkey_contents=new JTextField();
    tfresult=new JTextField();
    
    butadd=new Button("Add New Record");
    butsave=new Button("Save Course Data");
    butclose=new Button("Back to Menu");
    butadd.addActionListener(this);
    butsave.addActionListener(this);
    butclose.addActionListener(this);
  
    lbtitle.setFont(f1);
    lbprn.setFont(f2);
    lbcourse_title.setFont(f2);
    lbduration.setFont(f2);
    lbkey_contents.setFont(f2);
    lbresult.setFont(f2);
    
    tfprn.setFont(f3);
    tfcourse_title.setFont(f3);
    tfduration.setFont(f3);
    tfkey_contents.setFont(f3);
    tfresult.setFont(f3);
    
    butadd.setFont(f3);
    butsave.setFont(f3);
    butclose.setFont(f3);
    
    add(lbtitle);
    add(lbprn);
    add(tfprn);
    add(lbcourse_title);
    add(tfcourse_title);
    add(lbduration);
    add(tfduration);
    add(lbkey_contents);
    add(tfkey_contents);
    add(lbresult);
    add(tfresult);
    add(butadd);
    add(butsave);
    add(butclose);
    
    lbtitle.setBounds(50,75,1175,35);
    lbprn.setBounds(100,230,250,20);
    tfprn.setBounds(400,230,150,20);
    lbcourse_title.setBounds(100,290,250,20);
    tfcourse_title.setBounds(400,290,600,20);
    lbduration.setBounds(100,350,250,20);
    tfduration.setBounds(400,350,300,20);
    lbkey_contents.setBounds(100,410,250,20);
    tfkey_contents.setBounds(400,410,600,20);
    lbresult.setBounds(100,470,250,20);
    tfresult.setBounds(400,470,150,20);
    butadd.setBounds(300,625,200,25);
    butsave.setBounds(550,625,200,25);
    butclose.setBounds(800,625,200,25);  
       
    tfprn.setEditable(false);
    tfcourse_title.setEditable(false);
    tfduration.setEditable(false);
    tfkey_contents.setEditable(false);
    tfresult.setEditable(false);
    butsave.setEnabled(false);
   
    try
    {
      bw=new BufferedWriter(new FileWriter("certified_courses.dat",true));
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
                                   tfcourse_title.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcourse_title.getText().length()>=30)
		           ke.consume();
		    }
		}
);
                                   tfduration.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfduration.getText().length()>=15)
		           ke.consume();
		      }
		}
);
                                   tfkey_contents.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfkey_contents.getText().length()>=30)
		           ke.consume();
		      }
		}
);
                                   tfresult.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfresult.getText().length()>=15)
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
     tfcourse_title.setEditable(true);
     tfduration.setEditable(true);
     tfkey_contents.setEditable(true);
     tfresult.setEditable(true);
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
     else if(tfcourse_title.getText().length()==0)
      {
        tfcourse_title.requestFocus();
        JOptionPane.showMessageDialog(this," Course Title is empty, Please Enter");
      }
     else if(tfduration.getText().length()==0)
      {
        tfduration.requestFocus();
        JOptionPane.showMessageDialog(this,"Course Duration is empty, Please Enter");
      }
     else if(tfkey_contents.getText().length()==0)
      {
        tfkey_contents.requestFocus();
        JOptionPane.showMessageDialog(this,"Highlighted Key Contents are empty, Please Enter");
      }
     else if(tfresult.getText().length()==0)
      {
        tfresult.requestFocus();
        JOptionPane.showMessageDialog(this,"Result in CGPA is empty, Please Enter the Marks");
      }
     
     else
     {
       String data=tfprn.getText()+"$"+tfcourse_title.getText()+"$"+tfduration.getText()+"$"+tfkey_contents.getText()+"$"+tfresult.getText();
       try
      {
        bw.write(data);
        bw.newLine();
        bw.flush();
        JOptionPane.showMessageDialog(this,"Student's Additional Courses Data is saved successfully");    
     
    tfprn.setText("");
    tfcourse_title.setText("");
    tfduration.setText("");
    tfkey_contents.setText("");
    tfresult.setText("");
    
    tfprn.setEditable(false);
    tfcourse_title.setEditable(false);
    tfduration.setEditable(false);
    tfkey_contents.setEditable(false);
    tfresult.setEditable(false);
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
   Certified_Courses_Form obj=new Certified_Courses_Form();
  } 
}