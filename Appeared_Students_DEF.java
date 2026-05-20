import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
public class Appeared_Students_DEF extends JFrame implements ActionListener
{
   JLabel lbtitle,lbinterview_idno,lbinterview_date, lbcompany_idno, lbcompany_name, lbcompany_address, lbno_of_appeared, lbstudents_prn;
   JTextField  tfinterview_idno,tfinterview_date, tfcompany_idno, tfcompany_name, tfcompany_address,tfno_of_appeared, tfstudents_prn;
   JButton butadd,butsave,butclose,butvalidate;
    int chk;
   Appeared_Students_DEF()
  {
    setSize(1275,750);
    setVisible(true);
    setLayout(null);
    getContentPane().setBackground(Color.PINK);  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font f1=new Font("Arial Black",Font.PLAIN,30);
    Font f2=new Font("Arial",Font.BOLD,20);
    Font f3=new Font("Times New Roman",Font.BOLD,16);
    
    lbtitle=new JLabel("Appeared Student's For Interviews: Data Entry Form");
    lbinterview_idno=new JLabel("Appeared Interview ID No.");
    lbinterview_date=new JLabel("Appeared Interview Date");
    lbcompany_idno=new JLabel("Company's ID No.");
    lbcompany_name=new JLabel("Company's Name");
    lbcompany_address=new JLabel("Office Address");
    lbno_of_appeared=new JLabel(" Number of Student's Appeared");
    lbstudents_prn=new JLabel("Appeared Student's PRN");
    
    tfinterview_idno=new JTextField();
    tfinterview_date=new JTextField();
    tfcompany_idno=new JTextField();
    tfcompany_name=new JTextField();
    tfcompany_address=new JTextField();
    tfno_of_appeared=new JTextField();
    tfstudents_prn=new JTextField();

    butadd=new JButton("Add New Record");
    butsave=new JButton("Save the Record");
    butclose=new JButton("Back to Menu");
    butvalidate=new JButton("Validate the Company");
    butadd.addActionListener(this);
    butsave.addActionListener(this);
    butclose.addActionListener(this);
    butvalidate.addActionListener(this);
  
    lbtitle.setFont(f1);
    lbinterview_idno.setFont(f2);
    lbinterview_date.setFont(f2);
    lbcompany_idno.setFont(f2);
    lbcompany_name.setFont(f2);
    lbcompany_address.setFont(f2);
    lbno_of_appeared.setFont(f2);
    lbstudents_prn.setFont(f2);
    
    tfinterview_idno.setFont(f3);
    tfinterview_date.setFont(f3);
    tfcompany_idno.setFont(f3);
    tfcompany_name.setFont(f3);
    tfcompany_address.setFont(f3);
    tfno_of_appeared.setFont(f3);
    tfstudents_prn.setFont(f3);
      
    butadd.setFont(f3);
    butsave.setFont(f3);
    butclose.setFont(f3);
    butvalidate.setFont(f3);
    
    add(lbtitle);
    add(lbinterview_idno);
    add(tfinterview_idno);
    add(lbinterview_date);
    add(tfinterview_date);
    add(lbcompany_idno);
    add(tfcompany_idno);
    add(lbcompany_name);
    add(tfcompany_name);
    add(lbcompany_address);
    add(tfcompany_address);
    add(lbno_of_appeared);
    add(tfno_of_appeared);
    add(lbstudents_prn);
    add(tfstudents_prn);
    add(butadd);
    add(butsave);
    add(butclose);
    add(butvalidate);
    
    lbtitle.setBounds(220,75,860,35);
    lbinterview_idno.setBounds(100,225,300,20);
    tfinterview_idno.setBounds(410,225,150,20);
    lbinterview_date.setBounds(100,275,300,20);
    tfinterview_date.setBounds(410,275,200,20);
    lbcompany_idno.setBounds(100,350,300,20);
    tfcompany_idno.setBounds(410,350,150,20);
    lbcompany_name.setBounds(100,375,300,20);
    tfcompany_name.setBounds(410,375,600,20);
    lbcompany_address.setBounds(100,400,300,20);
    tfcompany_address.setBounds(410,400,800,20);
    lbno_of_appeared.setBounds(100,475,300,20);
    tfno_of_appeared.setBounds(410,475,150,20);
    lbstudents_prn.setBounds(100,525,300,20);
    tfstudents_prn.setBounds(410,525,800,20);
    butadd.setBounds(300,650,200,25);
    butsave.setBounds(550,650,200,25);
    butclose.setBounds(800,650,200,25);  
    butvalidate.setBounds(580,350,200,20);  
    tfcompany_name.setEnabled(false);
    tfcompany_address.setEnabled(false);

   tfinterview_idno.setEditable(false);
   tfinterview_date.setEditable(false); 
   tfcompany_idno.setEditable(false);
   tfno_of_appeared.setEditable(false);
   tfstudents_prn.setEditable(false);
   butvalidate.setEnabled(false);
   butsave.setEnabled(false);
 
}
public void actionPerformed(ActionEvent ae)
  { 
     if(ae.getSource()==butadd)
     {
        tfinterview_idno.setEditable(true);
        tfinterview_date.setEditable(true); 
        tfcompany_idno.setEditable(true);
        tfno_of_appeared.setEditable(true);
        tfstudents_prn.setEditable(true);
        butvalidate.setEnabled(true);
        butsave.setEnabled(true);
        butadd.setEnabled(false);
        Date cd=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String current_date=sdf.format(cd);     
        tfinterview_date.setText(current_date);
        tfinterview_idno.requestFocus();
      }
     else if(ae.getSource()==butsave)
     {
			if(tfinterview_idno.getText().length() == 0){
				tfinterview_idno.requestFocus();
				JOptionPane.showMessageDialog(this,"You did not enter Interview ID Number, Please Enter");
                        }
			else if(tfinterview_date.getText().length() == 0){
				tfinterview_date.requestFocus();
				JOptionPane.showMessageDialog(this,"You did not Enter a Interview Date , Please Enter");
                        }
			else if(tfcompany_idno.getText().length() == 0){
				tfcompany_idno.requestFocus();
				JOptionPane.showMessageDialog(this,"Company ID No is Blank, Please Enter");
                        }
			else if(tfno_of_appeared.getText().length() == 0){
					tfno_of_appeared.requestFocus();
					JOptionPane.showMessageDialog(this,"You did not enter No of Appeared Students for Interviews, Please Enter");
                        }
			else if(tfstudents_prn.getText().length() == 0){
					tfstudents_prn.requestFocus();
					JOptionPane.showMessageDialog(this,"You did not Enter Appeared Student's PRN, Please Enter");
                        }
			else if(chk == 0){
					JOptionPane.showMessageDialog(this,"You did not validate Company ID no. , Please click on validate button");
				}
			else{
				try{
					BufferedWriter bw = new BufferedWriter(new FileWriter("appeared_students.dat",true));
					String mydata = tfinterview_idno.getText()+"$"+tfinterview_date.getText()+"$"+tfcompany_idno.getText()+"$"+tfno_of_appeared.getText()+"$"+tfstudents_prn.getText();
					bw.write(mydata);
					bw.newLine();
					bw.flush();

					JOptionPane.showMessageDialog(this,"Appeared Student's Data/Record is saved successfully");
bw.close();

						tfinterview_idno.setText("");
						tfinterview_date.setText("");
						tfcompany_idno.setText("");
						tfcompany_name.setEnabled(true);
						tfcompany_name.setText("");
						tfcompany_name.setEnabled(false);
						tfcompany_address.setEnabled(true);
						tfcompany_address.setText("");
						tfcompany_address.setEnabled(false);
						tfno_of_appeared.setText("");
						tfstudents_prn.setText(null);

						tfinterview_idno.setEditable(false);
						tfinterview_date.setEditable(false);
						tfcompany_idno.setEditable(false);
						tfno_of_appeared.setEditable(false); 
						tfstudents_prn.setEditable(false); 
    						butsave.setEnabled(false);
						butvalidate.setEnabled(false);
						butadd.setEnabled(true);

								
				}catch(IOException e2){
						JOptionPane.showMessageDialog(this,"Problem occured when saving the record ,please check the input data");

					}
				}

			}
     else if(ae.getSource()==butvalidate)
     {
			if(tfcompany_idno.getText().length() > 0)
			{
				try
				{
					BufferedReader br = new BufferedReader(new FileReader("Job_Companies.dat"));
					String data = "",cname = "" ,caddress = "";
					String sd[];
					chk = 0;
				while((data = br.readLine()) != null)
				{
						sd = data.split("\\$");
				if(Integer.parseInt(sd[0]) == Integer.parseInt(tfcompany_idno.getText()))
				{
					chk=1;
					cname = sd[1];
					caddress = sd[2];
					break;
				 }
			                 }
				br.close();
				if(chk==0)
				{ 
				   tfcompany_idno.requestFocus();
				   JOptionPane.showMessageDialog(this,"Entered Company ID Number is invalid, please enter a correct id");
				}
				else
				{
					tfcompany_name.setEnabled(true);
					tfcompany_address.setEnabled(true);
					tfcompany_name.setText(cname);
					tfcompany_address.setText(caddress);
					tfcompany_name.setEnabled(false);
					tfcompany_address.setEnabled(false);	
				}
			               }
				catch(NumberFormatException e3)
				{
				   JOptionPane.showMessageDialog(this,"Company ID Number is invalid, please enter a correct id");
				}
				catch(IOException e1){}
			}
		
		}

     else if(ae.getSource()==butclose)
     {
        dispose();
      }


}
public static void main(String args[])
 {
   Appeared_Students_DEF obj=new Appeared_Students_DEF();
  } 
}
