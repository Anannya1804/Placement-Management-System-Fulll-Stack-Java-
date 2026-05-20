import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
public class Report_Job_Companies
{
   Report_Job_Companies()
   { 
     Date cd=new Date();
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     String repdate=sdf.format(cd);
     try
      {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Job_Companies.html"));
         bw.write("<html>");
         bw.write("<head>");
         bw.write("<title>");
         bw.write("Companies Information Report");
         bw.write("</title>");
         bw.write("</head>");
         bw.write("<body>");
         bw.write("<center>"+"<h1>"+"Associated Job Companies Information Report"+"</h1>");
         bw.write("<br>"); 
         bw.write("Report Date: "+repdate);    
         bw.write("<table cellspacing=0 cellpadding=0 border=1>");     
         bw.write("<tr>");     
         bw.write("<th>"+"Company ID No."+"</th>");     
         bw.write("<th>"+"Company Name"+"</th>");     
         bw.write("<th>"+"Address of Company"+"</th>");     
         bw.write("<th>"+"Contact Person-1 Name"+"</th>");     
         bw.write("<th>"+"Person-1 Designation"+"</th>");     
         bw.write("<th>"+"Person-1 Email ID"+"</th>");     
         bw.write("<th>"+"Person-1 Mobile No."+"</th>");     
         bw.write("<th>"+"Contact Person-2 Name"+"</th>");     
         bw.write("<th>"+"Person-2 Designation"+"</th>");     
         bw.write("<th>"+"Person-2 Email ID"+"</th>");     
         bw.write("<th>"+"Person-2 Mobile No."+"</th>");     
         bw.write("</tr>"); 
         
         BufferedReader br=new BufferedReader(new FileReader("job_companies.dat"));
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
         RT.exec("Explorer Job_Companies.html");
       }
      catch(IOException e){}    
   }
  public static void main(String args[])
  {
     Report_Job_Companies obj=new Report_Job_Companies();
   }
}