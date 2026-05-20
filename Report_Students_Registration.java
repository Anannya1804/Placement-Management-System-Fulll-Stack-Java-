import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
public class Report_Students_Registration
{
   Report_Students_Registration()
   { 
     Date cd=new Date();
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     String repdate=sdf.format(cd);
     try
      {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Report_Stud_Reg.html"));
         bw.write("<html>");
         bw.write("<head>");
         bw.write("<title>");
         bw.write("Stud Reg Rep");
         bw.write("</title>");
         bw.write("</head>");
         bw.write("<body>");
         bw.write("<center>"+"<h1>"+"Registered Students Online Information Report"+"</h1>");
         bw.write("<h2>"+"(Student's Registration Report)"+"</h2>");
         bw.write("<br>"); 
         bw.write("<br>"); 
         bw.write("Report Date: "+repdate);    
         bw.write("<table cellspacing=0 cellpadding=0 border=1>");     
         bw.write("<tr>");     
         bw.write("<th>"+"Reg.No."+"</th>");     
         bw.write("<th>"+"Reg.Date"+"</th>");     
         bw.write("<th>"+"Student Name"+"</th>");     
         bw.write("<th>"+"Email ID"+"</th>");     
         bw.write("<th>"+"Mobile No."+"</th>");     
         bw.write("<th>"+"Gender"+"</th>");     
         bw.write("<th>"+"Birth Date"+"</th>");     
         bw.write("<th>"+"Branch"+"</th>");     
         bw.write("<th>"+"Year"+"</th>");     
         bw.write("<th>"+"Expertise Area"+"</th>");     
         bw.write("<th>"+"Competitive Awards"+"</th>");     
         bw.write("</tr>"); 
         
         BufferedReader br=new BufferedReader(new FileReader("Students_Registration.dat"));
         String data;
         String fd[];
         while((data=br.readLine())!=null)
         {
            fd=data.split("\\$");
            bw.write("<tr>");  
            bw.write("<td>"+fd[0]+"</td>");  
            bw.write("<td>"+fd[1]+"</td>");  
            bw.write("<td>"+fd[2]+"</td>");  
            bw.write("<td>"+fd[3]+"</td>");  
            bw.write("<td>"+fd[4]+"</td>");  
            bw.write("<td>"+fd[5]+"</td>");  
            bw.write("<td>"+fd[6]+"</td>");  
            bw.write("<td>"+fd[7]+"</td>");  
            bw.write("<td>"+fd[8]+"</td>");  
            bw.write("<td>"+fd[9]+"</td>");  
            bw.write("<td>"+fd[10]+"</td>");  
            bw.write("</tr>");  
         }  
     
         bw.write("</table>");      
         bw.write("</center>");
         bw.write("</body>");
         bw.write("</html>");
         bw.close();
         Runtime RT=Runtime.getRuntime();
         RT.exec("Explorer Report_Stud_Reg.html");
       }
      catch(IOException e){}    
   }
  public static void main(String args[])
  {
     Report_Students_Registration obj=new Report_Students_Registration();
   }
}