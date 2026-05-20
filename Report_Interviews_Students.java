import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;
public class Report_Interviews_Students
{
  Report_Interviews_Students(String startdate,String enddate)
  {
    try
    {
      BufferedWriter bw=new BufferedWriter(new FileWriter("Interviews_Students.html"));
      bw.write("<html>");
      bw.write("<head>");
      bw.write("<title>"+"Creating Scheduled Interviews Report"+"</title>");
      bw.write("</head>");
      bw.write("<body>");
      bw.write("<center>");
      bw.write("<h1>"+"Interview Wise Appeared Students Transaction Report"+"</h1>"+"<br>"+"<br>");
      bw.write("Report period, starting date "+startdate+"<br>");
      bw.write("Report period, ending date "+enddate+"<br>");
      bw.write("<table cellspacing=0 cellpadding=0 border=1>");
      bw.write("<tr>");
      bw.write("<th>"+"Interview ID. No"+"</th>");
      bw.write("<th>"+"Interview Date"+"</th>");
      bw.write("<th>"+"Company ID No"+"</th>");
      bw.write("<th>"+"Company Name"+"</th>");
      bw.write("<th>"+"Company Address"+"</th>");
      bw.write("<th>"+"No. of Students Appeared"+"</th>");
      bw.write("<th>"+"Appeared Students PRN"+"</th>");
      bw.write("</tr>");
      int chk=0;
      BufferedReader br=new BufferedReader(new FileReader("appeared_students.dat"));
      String data;
      String sd[]; //Dynamic Array of Java
      while((data=br.readLine()) != null)
      {
        sd=data.split("\\$");
        Date schdate=null,date1=null,date2=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try
        {   
           schdate=sdf.parse(sd[1]);
           date1=sdf.parse(startdate);
           date2=sdf.parse(enddate);
        }
        catch(ParseException pe) { }
        if((schdate.after(date1) || schdate.equals(date1)) && (schdate.before(date2) || schdate.equals(date2)))
        {   
        bw.write("<tr>");        
        bw.write("<td>"+sd[0]+"</td>");        
        bw.write("<td>"+sd[1]+"</td>");        
        bw.write("<td>"+sd[2]+"</td>");
        BufferedReader br2 = new BufferedReader(new FileReader("Job_Companies.dat"));
        String data2 = "",cname = "" ,caddress = "";
        String sd2[];
        chk=0; 
        while((data2 = br2.readLine()) != null)
        {
          sd2 = data2.split("\\$");
          if(Integer.parseInt(sd2[0]) == Integer.parseInt(sd[2]))
         {
           chk=1;
           cname = sd2[1];
           caddress = sd2[2];
           break;
         }
}
        br2.close();
      if(chk==1)
      {
        bw.write("<td>"+cname+"</td>");        
        bw.write("<td>"+caddress+"</td>");        
      }
      else
      {
          bw.write("<td>"+"XXX"+"</td>");              
          bw.write("<td>"+"YYY"+"</td>");              
      }        
        bw.write("<td>"+sd[3]+"</td>");        
        bw.write("<td>"+sd[4]+"</td>");
        bw.write("</tr>");        
      }
}
      br.close();
      bw.write("</table>");
      bw.write("</center>");
      bw.write("</body>");
      bw.write("</html>");
      bw.close();
      Runtime RT=Runtime.getRuntime();
      RT.exec("Explorer Interviews_Students.html"); 
 }
    catch(IOException E)
    {
      System.out.println("Problems occured during producing Scheduled Interviews Report");
    }
  }
}