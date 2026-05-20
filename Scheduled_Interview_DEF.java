import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Scheduled_Interview_DEF extends JFrame implements ActionListener{
	JLabel lbtitle,lbinterview_idno,lbinterview_date, lbcompany_idno, lbcompany_name, lbcompany_address, lbinterview_type, lbbranches, lbappl_criteria, lboffered_desig, lboffered_package,lbvaccancies;
   	JTextField  tfinterview_idno,tfinterview_date, tfcompany_idno, tfcompany_name, tfcompany_address, tfappl_criteria, tfoffered_desig, tfoffered_package, tfvaccancies;
   	JButton butadd,butsave,butclose,butvalidate;
   	JList jlbranch;
   	ButtonGroup bgdrivetype;
   	JRadioButton rboncampus,rboffcampus,rbonline;
	int chk;
   	Scheduled_Interview_DEF()
  	{
		setSize(1275,675);
    		setVisible(true);
    		setLayout(null);
    		getContentPane().setBackground(Color.PINK);  
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		Font f1=new Font("Arial Black",Font.PLAIN,30);
    		Font f2=new Font("Arial",Font.BOLD,20);
    		Font f3=new Font("Times New Roman",Font.BOLD,16);
    
    		lbtitle=new JLabel("Scheduled Campus Interview's Data Entry Form");
    		lbinterview_idno=new JLabel("Scheduled Interview ID No.");
    		lbinterview_date=new JLabel("Scheduled Interview Date");
    		lbcompany_idno=new JLabel("Company's ID No.");
    		lbcompany_name=new JLabel("Company's Name");
    		lbcompany_address=new JLabel("Office Address");
    		lbinterview_type=new JLabel("Interview Type");
    		lbbranches=new JLabel("Eligible Branches");
    		lbappl_criteria=new JLabel("Applicable Criteria");
    		lboffered_desig=new JLabel("Offered Designation");
    		lboffered_package=new JLabel("Offered Package in LPA");
    		lbvaccancies=new JLabel("No. of Vaccancies");
    	
    		tfinterview_idno=new JTextField();
    		tfinterview_date=new JTextField();
    		tfcompany_idno=new JTextField();
    		tfcompany_name=new JTextField();
    		tfcompany_address=new JTextField();
    		tfappl_criteria=new JTextField();
    		tfoffered_desig=new JTextField();
    		tfoffered_package=new JTextField();
    		tfvaccancies=new JTextField();
    		String x[]={"Computer","IT","AIDS","ETC","ECE","Instrumentation","Mechanical","Civil","Electrical","Chemical","Robotics"};     
    		jlbranch=new JList(x);
    		jlbranch.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    		JScrollPane jsp_branch=new JScrollPane(jlbranch);
	
    		bgdrivetype=new ButtonGroup();
    		rboncampus=new JRadioButton("OnCampus"); 
    		rboffcampus=new JRadioButton("OffCampus"); 
    		rbonline=new JRadioButton("Online"); 
    		bgdrivetype.add(rboncampus);
    		bgdrivetype.add(rboffcampus);
    		bgdrivetype.add(rbonline);
    
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
   		lbinterview_type.setFont(f2);
   		lbbranches.setFont(f2);
    		lbappl_criteria.setFont(f2);
    		lboffered_desig.setFont(f2);
    		lboffered_package.setFont(f2);
    		lbvaccancies.setFont(f2);
    
    		tfinterview_idno.setFont(f3);
    		tfinterview_date.setFont(f3);
    		tfcompany_idno.setFont(f3);
    		tfcompany_name.setFont(f3);
    		tfcompany_address.setFont(f3);
    		tfappl_criteria.setFont(f3);
    		tfoffered_desig.setFont(f3);
    		tfoffered_package.setFont(f3);
    		tfvaccancies.setFont(f3);
    	
    		jlbranch.setFont(f3);
    		rboncampus.setFont(f3); 
    		rboffcampus.setFont(f3); 
    		rbonline.setFont(f3); 
    	
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
    		add(lbinterview_type);
    		add(rboncampus);
    		add(rboffcampus);
    		add(rbonline);
    		add(lbbranches);
    		add(jsp_branch);
    		add(lbappl_criteria);
    		add(tfappl_criteria);
    		add(lboffered_desig);
    		add(tfoffered_desig);
    		add(lboffered_package);
    		add(tfoffered_package);
    		add(lbvaccancies);
    		add(tfvaccancies);
    		add(butadd);
    		add(butsave);
    		add(butclose);
    		add(butvalidate);
    
    		lbtitle.setBounds(250,50,800,35);
    		lbinterview_idno.setBounds(20,150,280,20);
    		tfinterview_idno.setBounds(310,150,150,20);
    		lbinterview_date.setBounds(600,150,250,20);
    		tfinterview_date.setBounds(860,150,150,20);
    		lbcompany_idno.setBounds(100,225,200,20);
    		tfcompany_idno.setBounds(310,225,150,20);
    		lbcompany_name.setBounds(100,250,200,20);
    		tfcompany_name.setBounds(310,250,600,20);
    		lbcompany_address.setBounds(100,275,200,20);
    		tfcompany_address.setBounds(310,275,900,20);
    		lbinterview_type.setBounds(100,350,200,20);
    		rboncampus.setBounds(310,350,120,20);    
    		rboffcampus.setBounds(450,350,120,20);    
    		rbonline.setBounds(590,350,120,20);
    		lbbranches.setBounds(100,400,200,20);
    		jsp_branch.setBounds(310,400,200,20);
    		lbappl_criteria.setBounds(650,400,200,20);
    		tfappl_criteria.setBounds(860,400,350,20);
    		lboffered_desig.setBounds(100,450,200,20);
    		tfoffered_desig.setBounds(310,450,200,20);
    		lboffered_package.setBounds(600,450,250,20);
    		tfoffered_package.setBounds(860,450,200,20);
    		lbvaccancies.setBounds(100,500,200,20); 
    		tfvaccancies.setBounds(310,500,150,20);
    		butadd.setBounds(300,600,200,25);
    		butsave.setBounds(550,600,200,25);
    		butclose.setBounds(800,600,200,25);  
    		butvalidate.setBounds(480,225,200,20);  
    		

		tfinterview_idno.setEditable(false);
		tfinterview_date.setEditable(false);
		tfcompany_idno.setEditable(false);
		tfcompany_name.setEnabled(false);
		tfcompany_address.setEnabled(false);
		rboncampus.setEnabled(false);
		rboffcampus.setEnabled(false);
		rbonline.setEnabled(false);
		jlbranch.setEnabled(false);
		tfappl_criteria.setEditable(false); 
		tfoffered_desig.setEditable(false); 
		tfoffered_package.setEditable(false); 
		tfvaccancies.setEditable(false);
    		butsave.setEnabled(false);
		butvalidate.setEnabled(false);

                                   tfinterview_idno.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfinterview_idno.getText().length()>=4)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfcompany_idno.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfcompany_idno.getText().length()>=3)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);  
                                   tfappl_criteria.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfappl_criteria.getText().length()>=25)
		           ke.consume();
		    }
		}
);  
                                   tfoffered_desig.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfoffered_desig.getText().length()>=15)
		           ke.consume();
		    }
		}
);  
                                   tfoffered_package.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfoffered_package.getText().length()>=5)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9' || ke.getKeyChar()=='.')
		         return;
		      else
		          ke.consume();
		    }
		}
);
                                   tfvaccancies.addKeyListener(
		new KeyAdapter()
		{
		   public void keyTyped(KeyEvent ke)
		   {
		      if(tfvaccancies.getText().length()>=3)
		           ke.consume();
		      if(ke.getKeyChar()>='0' && ke.getKeyChar()<='9')
		         return;
		      else
		          ke.consume();
		    }
		}
);
  
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == butadd){
			tfinterview_idno.setEditable(true);
			tfinterview_date.setEditable(true);
			tfcompany_idno.setEditable(true);
			tfcompany_name.setEnabled(true);
			tfcompany_address.setEnabled(true);
			rboncampus.setEnabled(true);
			rboffcampus.setEnabled(true);
			rbonline.setEnabled(true);
			jlbranch.setEnabled(true);
			tfappl_criteria.setEditable(true); 
			tfoffered_desig.setEditable(true); 
			tfoffered_package.setEditable(true); 
			tfvaccancies.setEditable(true);
    			butsave.setEnabled(true);
			butvalidate.setEnabled(true);
			butadd.setEnabled(false);
			Date cd=new Date();
     			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     			String current_date=sdf.format(cd);     
			tfinterview_date.setText(current_date);
			tfinterview_idno.requestFocus();
		}
		else if(ae.getSource() == butsave){
			if(tfinterview_idno.getText().length() == 0){
				tfinterview_idno.requestFocus();
				JOptionPane.showMessageDialog(this,"You did not enter Interview ID Number, Plase Enter");
                        }
			else if(tfinterview_date.getText().length() == 0){
				tfinterview_date.requestFocus();
				JOptionPane.showMessageDialog(this,"You did not Enter a Interview Date , Plase Enter");
                        }
			else if(tfcompany_idno.getText().length() == 0){
				tfcompany_idno.requestFocus();
				JOptionPane.showMessageDialog(this,"Company ID No is Blank, Plase Enter");
                        }
			else if(rboncampus.isSelected() == false && rboffcampus.isSelected() == false && rbonline.isSelected() == false){
				rboncampus.requestFocus();
				JOptionPane.showMessageDialog(this,"You did not Selected interview type, Plase Selected");
                        }
			else{
				Object br[] = jlbranch.getSelectedValues();
				if(br.length == 0){
					JOptionPane.showMessageDialog(this,"You did not Select Branch name ,please Selected");
				}
				else if(tfappl_criteria.getText().length() == 0){
					tfappl_criteria.requestFocus();
					JOptionPane.showMessageDialog(this,"You did not enter Applicable Criteria, Plase Enter");
                        	}
				else if(tfoffered_desig.getText().length() == 0){
					tfoffered_desig.requestFocus();
					JOptionPane.showMessageDialog(this,"You did not Enter a Offered Designation, Plase Enter");
                        	}
				else if(tfoffered_package.getText().length() == 0){
					tfoffered_package.requestFocus();
					JOptionPane.showMessageDialog(this,"You did not Enter a Offered Package, Plase Enter");
                        	}
				else if(tfvaccancies.getText().length() == 0){
					tfvaccancies.requestFocus();
					JOptionPane.showMessageDialog(this,"You did not Enter a vaccancies, Plase Enter");
                        	}
				else if(chk == 0){
					JOptionPane.showMessageDialog(this,"You did not validate Company ID no. , Please click on validate button");
				}
				else{
					try{
						BufferedWriter bw = new BufferedWriter(new FileWriter("sch_interviews.dat",true));
						String mydata = tfinterview_idno.getText()+"$"+tfinterview_date.getText()+"$"+tfcompany_idno.getText()+"$";
						if(rboncampus.isSelected())
							mydata = mydata+"oncampus";
						else if(rboffcampus.isSelected())
							mydata = mydata + "offcampus";
						else if(rbonline.isSelected())
							mydata = mydata +"Online";
						mydata = mydata + "$";
						Object x[] = jlbranch.getSelectedValues();
						String y = "";
						for(int i = 0 ; i < x.length ; i++){
							y = y + (String)x[i] ;
							
							if (i < x.length-1)
								y = y + ","; 
						}
						mydata = mydata + y;
						mydata = mydata + "$" ;
						mydata = mydata + tfappl_criteria.getText() + "$" + tfoffered_desig.getText() + "$" + tfoffered_package.getText() + "$" + tfvaccancies.getText();
						bw.write(mydata);
						bw.newLine();
						bw.flush();

						JOptionPane.showMessageDialog(this,"Scheduled interviews record is saved successfully");
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
						tfappl_criteria.setText("");
						tfoffered_desig.setText(null);
						tfoffered_package.setText(null);
						tfvaccancies.setText("");

						tfinterview_idno.setEditable(false);
						tfinterview_date.setEditable(false);
						tfcompany_idno.setEditable(false);
						rboncampus.setEnabled(false);
						rboffcampus.setEnabled(false);
						rbonline.setEnabled(false);
						jlbranch.setEnabled(false);
						tfappl_criteria.setEditable(false); 
						tfoffered_desig.setEditable(false); 
						tfoffered_package.setEditable(false); 
						tfvaccancies.setEditable(false);
    						butsave.setEnabled(false);
						butvalidate.setEnabled(false);

						butadd.setEnabled(true);

								
					}catch(IOException e2){
						JOptionPane.showMessageDialog(this,"Problem occured when saving the record ,please check the input data");

					}
				}

			}
			
		}


		else if(ae.getSource() == butvalidate){
			if(tfcompany_idno.getText().length() > 0){
				try{
					BufferedReader br = new BufferedReader(new FileReader("Job_Companies.dat"));
					String data = "",cname = "" ,caddress = "";
					String sd[];
					chk = 0;
					while((data = br.readLine()) != null){
						sd = data.split("\\$");
						if(Integer.parseInt(sd[0]) == Integer.parseInt(tfcompany_idno.getText())){
							chk=1;
							cname = sd[1];
							caddress = sd[2];
							break;
						}
					}
					br.close();
					if(chk==0){
						tfcompany_idno.requestFocus();
						JOptionPane.showMessageDialog(this,"Entered Company ID Number is invalid, please enter a correct id");
					}
					else{
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
		else if(ae.getSource() == butclose){
			
                                                   dispose();
		}
		 
	}

	public static void main(String args[]){

   		Scheduled_Interview_DEF obj=new Scheduled_Interview_DEF();
  	} 
}