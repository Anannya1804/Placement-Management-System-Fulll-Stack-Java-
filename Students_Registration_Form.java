import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Students_Registration_Form extends JFrame implements ActionListener
{
  JLabel lbtitle,lbreg_no,lbreg_date,lbstud_name,lbemail_id,lbmobile_no,lbgender,lbbirth_date,lbbranch,lbyear_no,lbexpertise_area,lbawards;
 JTextField tfreg_no,tfreg_date,tfstud_name,tfemail_id,tfmobile_no,tfbirth_date,tfexpertise_area,tfawards;
JButton butadd,butsave,butclose;
    JComboBox jcbbranch;
   ButtonGroup bggender;
   JRadioButton rbmale,rbfemale;
   ButtonGroup bgyear_no;
   JRadioButton rbte,rbbe;
   BufferedWriter bw;
  Students_Registration_Form()
  {
    setSize(1275,750);
    setVisible(true);
    setLayout(null);
    getContentPane().setBackground(Color.PINK);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font f1=new Font("Arial Black",Font.PLAIN,30);
    Font f2=new Font("Arial",Font.BOLD,20);
    Font f3=new Font("Times New Roman",Font.BOLD,16);
    
    lbtitle=new JLabel("Students Registration for Campus Placement");
    lbreg_no=new JLabel("Registration No.");
    lbreg_date=new JLabel("Registration Date");
    lbstud_name=new JLabel("Student Name");
    lbemail_id=new JLabel("Email ID");
    lbmobile_no=new JLabel("Mobile No.");
    lbgender=new JLabel("Gender");
    lbbirth_date=new JLabel("Birth Date");
    lbbranch=new JLabel("Branch");
    lbyear_no=new JLabel("Select the Year ");
    lbexpertise_area=new JLabel("Expertise Area");
    lbawards=new JLabel("Competitive Awards");
    
    tfreg_no=new JTextField();
    tfreg_date=new JTextField();
    tfstud_name=new JTextField();
    tfemail_id=new JTextField();
    tfmobile_no=new JTextField();
    tfbirth_date=new JTextField();
    tfexpertise_area=new JTextField();
    tfawards=new JTextField();
    
    jcbbranch=new JComboBox();
    jcbbranch.addItem("Computer");
    jcbbranch.addItem("IT");
    jcbbranch.addItem("AIDS");
    jcbbranch.addItem("ETC");
    jcbbranch.addItem("ECE");
    jcbbranch.addItem("Instrumentation");
    jcbbranch.addItem("Mechanical");
    jcbbranch.addItem("Civil");
    jcbbranch.addItem("Electrical");
    jcbbranch.addItem("Chemical");
    jcbbranch.addItem("Robotics");
    jcbbranch.setSelectedIndex(-1);   
 
    bggender=new ButtonGroup();
    rbmale=new JRadioButton("Male"); 
    rbfemale=new JRadioButton("Female"); 
    bggender.add(rbmale);
    bggender.add(rbfemale);

    bgyear_no=new ButtonGroup();
    rbte=new JRadioButton("Third Year"); 
    rbbe=new JRadioButton("Last Year"); 
    bgyear_no.add(rbte);
    bgyear_no.add(rbbe);
   
    butadd=new JButton("Add New Student");
    butsave=new JButton("Save Registration Data");
    butclose=new JButton("Back to Menu");
    butadd.addActionListener(this);
    butsave.addActionListener(this);
    butclose.addActionListener(this);
  
    lbtitle.setFont(f1);
    lbreg_no.setFont(f2);
    lbreg_date.setFont(f2);
    lbstud_name.setFont(f2);
    lbemail_id.setFont(f2);
    lbmobile_no.setFont(f2);
    lbgender.setFont(f2);
    lbbirth_date.setFont(f2);
    lbbranch.setFont(f2);
    lbyear_no.setFont(f2);
    lbexpertise_area.setFont(f2);
    lbawards.setFont(f2);
    
    tfreg_no.setFont(f3);
    tfreg_date.setFont(f3);
    tfstud_name.setFont(f3);
    tfemail_id.setFont(f3);
    tfmobile_no.setFont(f3);
    tfbirth_date.setFont(f3);
    tfexpertise_area.setFont(f3);
    tfawards.setFont(f3);
    jcbbranch.setFont(f3);
    rbmale.setFont(f3); 
    rbfemale.setFont(f3); 
    rbte.setFont(f3); 
    rbbe.setFont(f3); 

    butadd.setFont(f3);
    butsave.setFont(f3);
    butclose.setFont(f3);
    
    add(lbtitle);
    add(lbreg_no);
    add(tfreg_no);
    add(lbreg_date);
    add(tfreg_date);
    add(lbstud_name);
    add(tfstud_name);
    add(lbemail_id);
    add(tfemail_id);
    add(lbmobile_no);
    add(tfmobile_no);
    add(lbgender);
    add(rbmale);
    add(rbfemale);
    add(lbbirth_date);
    add(tfbirth_date);
    add(lbbranch);
    add(jcbbranch);
    add(lbyear_no);
    add(rbte);
    add(rbbe);
    add(lbexpertise_area);
    add(tfexpertise_area);
    add(lbawards);
    add(tfawards);
    add(butadd);
    add(butsave);
    add(butclose);
    
    lbtitle.setBounds(250,50,800,35);
    lbreg_no.setBounds(100,175,200,20);
    tfreg_no.setBounds(310,175,150,20);
    lbreg_date.setBounds(650,175,200,20);
    tfreg_date.setBounds(860,175,150,20);
    lbstud_name.setBounds(100,225,200,20);
    tfstud_name.setBounds(310,225,600,20);
    lbemail_id.setBounds(100,275,200,20);
    tfemail_id.setBounds(310,275,300,20);
    lbmobile_no.setBounds(650,275,200,20);
    tfmobile_no.setBounds(860,275,300,20);
    lbgender.setBounds(100,325,200,20);
    rbmale.setBounds(310,325,100,20);
    rbfemale.setBounds(420,325,100,20);    
    lbbirth_date.setBounds(650,325,200,20);
    tfbirth_date.setBounds(860,325,150,20);
    lbbranch.setBounds(100,425,200,20);
    jcbbranch.setBounds(310,425,200,20);
    lbyear_no.setBounds(650,425,200,20);
    rbte.setBounds(860,425,150,20);
    rbbe.setBounds(1020,425,150,20);
    lbexpertise_area.setBounds(100,475,200,20);
    tfexpertise_area.setBounds(310,475,600,20);
    lbawards.setBounds(100,525,200,20); 
    tfawards.setBounds(310,525,600,20);
    butadd.setBounds(300,650,200,25);
    butsave.setBounds(550,650,200,25);
    butclose.setBounds(800,650,200,25);  
    
    tfreg_no.setEditable(false);
    tfreg_date.setEditable(false);
    tfstud_name.setEditable(false);
    tfemail_id.setEditable(false);
    tfmobile_no.setEditable(false);
    tfbirth_date.setEditable(false);
    tfexpertise_area.setEditable(false);
    tfawards.setEditable(false);
    jcbbranch.setEnabled(false);
    rbmale.setEnabled(false);
    rbfemale.setEnabled(false);
    rbte.setEnabled(false);
    rbbe.setEnabled(false);
    butsave.setEnabled(false);
   
    try
    {
      bw=new BufferedWriter(new FileWriter("students_registration.dat",true));
    }
    catch(IOException e1)
    {
       JOptionPane.showMessageDialog(this,"Problems Occured during creating/opening the file");  
    }

                                   tfreg_no.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfreg_no.getText().length()>=10)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfstud_name.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfstud_name.getText().length()>=30)
		           ke.consume();
		   }
		}
);
                                   tfemail_id.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfemail_id.getText().length()>=20)
		           ke.consume();
		   }
		}
);
                                   tfmobile_no.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfmobile_no.getText().length()>=10)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfexpertise_area.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfexpertise_area.getText().length()>=20)
		           ke.consume();
		    }
		}
);
                                   tfawards.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfawards.getText().length()>=30)
		           ke.consume();
		   }
		}
);

}
public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==butadd)
    {
     tfreg_no.setEditable(true);
    tfreg_date.setEditable(true);
    tfstud_name.setEditable(true);
    tfemail_id.setEditable(true);
    tfmobile_no.setEditable(true);
    tfbirth_date.setEditable(true);
    tfexpertise_area.setEditable(true);
    tfawards.setEditable(true);
    jcbbranch.setEnabled(true);
    rbmale.setEnabled(true);
    rbfemale.setEnabled(true);
    rbte.setEnabled(true);
    rbbe.setEnabled(true);
    butsave.setEnabled(true);
    Date cd=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    String current_date=sdf.format(cd); 
    tfreg_date.setText(current_date);
    tfreg_no.requestFocus();
    butadd.setEnabled(false); 
    }
    else if(ae.getSource()==butsave)
    {
      if(tfreg_no.getText().length()==0)
      {
        tfreg_no.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not enter Student's Registration Number, Please Enter");
      }
     else if(tfreg_date.getText().length()==0)
      {
        tfreg_date.requestFocus();
        JOptionPane.showMessageDialog(this,"Student's Registration Date is empty, Please Enter");
      }
     else if(tfstud_name.getText().length()==0)
      {
        tfstud_name.requestFocus();
        JOptionPane.showMessageDialog(this,"Student's Name is empty, Please Enter");
      }
     else if(tfemail_id.getText().length()==0)
      {
        tfemail_id.requestFocus();
        JOptionPane.showMessageDialog(this,"Student's Email ID is empty, Please Enter");
      }
     else if(tfmobile_no.getText().length()==0)
      {
        tfmobile_no.requestFocus();
        JOptionPane.showMessageDialog(this,"Student's Mobile Number is empty, Please Enter");
      }
     else if(jcbbranch.getSelectedIndex()==-1)
      {
        jcbbranch.requestFocus();
        JOptionPane.showMessageDialog(this,"Kindly select any one branch for the student");
      }
    else if(rbmale.isSelected()==false && rbfemale.isSelected()==false)
      {
        rbmale.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not select Student's Gender, Please Select either Male or Female");
      }
     else if(tfbirth_date.getText().length()==0)
      {
        tfbirth_date.requestFocus();
        JOptionPane.showMessageDialog(this,"Student's Birth Date is empty, Please Enter");
      }
     else if(rbte.isSelected()==false && rbbe.isSelected()==false)
      {
        rbte.requestFocus();
        JOptionPane.showMessageDialog(this,"You did not select the Year, Please Select either Third Year or Last Year");
      }
     else if(tfexpertise_area.getText().length()==0)
      {
        tfexpertise_area.requestFocus();
        JOptionPane.showMessageDialog(this,"Expertise Area Field is Empty, Please Enter Proper Data or -");
      }
     else if(tfawards.getText().length()==0)
      {
        tfawards.requestFocus();
        JOptionPane.showMessageDialog(this,"Competitive Awards Field is Empty, Please Enter Suitable Value or Type -");
      }
     else
     {
       String data=tfreg_no.getText()+"$"+tfreg_date.getText()+"$"+tfstud_name.getText()+"$"+tfemail_id.getText()+"$"+tfmobile_no.getText()+"$";
        if(rbmale.isSelected()==true)
           data=data+"Male";
        else
            data=data+"Female";
        data=data+"$"+tfbirth_date.getText()+"$"+jcbbranch.getSelectedItem()+"$";
        if(rbte.isSelected()==true)
           data=data+"TE";
       else
           data=data+"BE";
        data=data+"$"+tfexpertise_area.getText()+"$"+tfawards.getText();
       try
      {
        bw.write(data);
        bw.newLine();
        bw.flush();
        JOptionPane.showMessageDialog(this,"Student's Registration Data is saved successfully");    
     
    tfreg_no.setText("");
    tfreg_date.setText("");
    tfstud_name.setText("");
    tfemail_id.setText("");
    tfmobile_no.setText("");
    tfbirth_date.setText("");
    tfexpertise_area.setText("");
    tfawards.setText("");
    jcbbranch.setSelectedIndex(-1);
    rbmale.setSelected(false);
    rbfemale.setSelected(false);
    rbte.setSelected(false);
    rbbe.setSelected(false);
    
    tfreg_no.setEditable(false);
    tfreg_date.setEditable(false);
    tfstud_name.setEditable(false);
    tfemail_id.setEditable(false);
    tfmobile_no.setEditable(false);
    tfbirth_date.setEditable(false);
    tfexpertise_area.setEditable(false);
    tfawards.setEditable(false);
    jcbbranch.setEnabled(false);
    rbmale.setEnabled(false);
    rbfemale.setEnabled(false);
    rbte.setEnabled(false);
    rbbe.setEnabled(false);
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
   Students_Registration_Form obj=new Students_Registration_Form();
  } 
}