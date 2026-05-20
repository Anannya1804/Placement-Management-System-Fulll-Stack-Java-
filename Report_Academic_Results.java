import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
public class Report_Academic_Results
{
   Report_Academic_Results()
   { 
     Date cd=new Date();
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     String repdate=sdf.format(cd);
     try
      {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Academic_Results.html"));
         bw.write("<html>");
         bw.write("<head>");
         bw.write("<title>");
         bw.write("Academic Results Information Report");
         bw.write("</title>");
         bw.write("</head>");
         bw.write("<body>");
         bw.write("<center>"+"<h1>"+"Registered Students Academic Results Information Report"+"</h1>");
         bw.write("<br>"); 
         bw.write("Report Date: "+repdate);    
         bw.write("<table cellspacing=0 cellpadding=0 border=1>");     
         bw.write("<tr>");     
         bw.write("<th>"+"Reg.No."+"</th>");     
         bw.write("<th>"+"Sem 1 CGPA"+"</th>");     
         bw.write("<th>"+"Sem 2 CGPA"+"</th>");     
         bw.write("<th>"+"Sem 3 CGPA"+"</th>");     
         bw.write("<th>"+"Sem 4 CGPA"+"</th>");     
         bw.write("<th>"+"Sem 5 CGPA"+"</th>");     
         bw.write("<th>"+"Sem 6 CGPA"+"</th>");     
         bw.write("<th>"+"Sem 7 CGPA"+"</th>");     
         bw.write("<th>"+"Sem 8 CGPA"+"</th>");     
         bw.write("<th>"+"No of Backlogs"+"</th>");     
         bw.write("</tr>"); 
         
         BufferedReader br=new BufferedReader(new FileReader("academic_results.dat"));
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
            bw.write("</tr>");  
         }  
     
         bw.write("</table>");      
         bw.write("</center>");
         bw.write("</body>");
         bw.write("</html>");
         bw.close();
         Runtime RT=Runtime.getRuntime();
         RT.exec("Explorer Academic_Results.html");
       }
      catch(IOException e){}    
   }
  public static void main(String args[])
  {
     Report_Academic_Results obj=new Report_Academic_Results();
   }
}