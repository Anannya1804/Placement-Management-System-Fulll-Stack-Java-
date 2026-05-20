import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
public class Report_Certified_Courses
{
   Report_Certified_Courses()
   { 
     Date cd=new Date();
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
     String repdate=sdf.format(cd);
     try
      {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Certified_Courses.html"));
         bw.write("<html>");
         bw.write("<head>");
         bw.write("<title>");
         bw.write(" Certified Courses Information Report");
         bw.write("</title>");
         bw.write("</head>");
         bw.write("<body>");
         bw.write("<center>"+"<h1>"+"Registered Students Certified Courses Information Report"+"</h1>");
         bw.write("<br>"); 
         bw.write("Report Date: "+repdate);    
         bw.write("<table cellspacing=0 cellpadding=0 border=1>");     
         bw.write("<tr>");     
         bw.write("<th>"+"Student's PRN"+"</th>");     
         bw.write("<th>"+"Certified Course Title"+"</th>");     
         bw.write("<th>"+"Course Duration"+"</th>");     
         bw.write("<th>"+"Key Contents"+"</th>");     
         bw.write("<th>"+"Result in %"+"</th>");     
         bw.write("</tr>"); 
         
         BufferedReader br=new BufferedReader(new FileReader("certified_courses.dat"));
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
            bw.write("</tr>");  
         }  
     
         bw.write("</table>");      
         bw.write("</center>");
         bw.write("</body>");
         bw.write("</html>");
         bw.close();
         Runtime RT=Runtime.getRuntime();
         RT.exec("Explorer Certified_Courses.html");
       }
      catch(IOException e){}    
   }
  public static void main(String args[])
  {
     Report_Certified_Courses obj=new Report_Certified_Courses();
   }
}