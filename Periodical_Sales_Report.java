import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Periodical_Sales_Report {
  Periodical_Sales_Report(String startdate, String enddate) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("Items_Report1.html"));
      bw.write("<html>");
      bw.write("<head>");
      bw.write("<title>" + "Creating Simple Report" + "</title>");
      bw.write("</head>");
      bw.write("<body>");
      bw.write("<center>");
      bw.write("<h1>" + "Grocery Items Periodical Sales Information Report" + "</h1>" + "<br>" + "<br>");
      bw.write("Report period, starting date " + startdate + "<br>");
      bw.write("Report period, ending date " + enddate + "<br>");
      bw.write("<table cellspacing=0 cellpadding=0 border=1>");
      bw.write("<tr>");
      bw.write("<th>" + "Sales Bill No" + "</th>");
      bw.write("<th>" + "Sales Date" + "</th>");
      bw.write("<th>" + "Customer Name" + "</th>");
      bw.write("<th>" + "Email ID" + "</th>");
      bw.write("<th>" + "Mobile No" + "</th>");
      bw.write("<th>" + "Items ID No" + "</th>");
      bw.write("<th>" + "Grocery Item Name" + "</th>");
      bw.write("<th>" + "Item Type" + "</th>");
      bw.write("<th>" + "Sales Quantity" + "</th>");
      bw.write("<th>" + "Rate Per Quantity" + "</th>");
      bw.write("<th>" + "Sales Amount" + "</th>");
      bw.write("<th>" + "GST" + "</th>");
      bw.write("<th>" + "Total Amount" + "</th>");
      bw.write("<th>" + "Discount" + "</th>");
      bw.write("<th>" + "Net Bill Amount" + "</th>");
      bw.write("</tr>");

      BufferedReader br = new BufferedReader(new FileReader("Items_Sales.dat"));
      String data;
      String sd[];
      double sa, gst, ta, dis, nba;
      double sum = 0;

      while ((data = br.readLine()) != null) {
        sd = data.split("\\$");

        // Fix: avoid array error
        if (sd.length < 10)
          continue;

        Date saldate = null, date1 = null, date2 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
          saldate = sdf.parse(sd[1]);
          date1 = sdf.parse(startdate);
          date2 = sdf.parse(enddate);
        } catch (ParseException pe) {
          System.out.println("Date parsing error: " + pe.getMessage());
        }

        // Fix: null check
        if (saldate != null && date1 != null && date2 != null &&
            (saldate.after(date1) || saldate.equals(date1)) &&
            (saldate.before(date2) || saldate.equals(date2))) {
          try {
            sa = Double.parseDouble(sd[8]) * Double.parseDouble(sd[9]);

            if (sd[7].equals("Imported"))
              gst = 15 * sa / 100;
            else if (sd[7].equals("Branded"))
              gst = 12 * sa / 100;
            else if (sd[7].equals("Local"))
              gst = 8 * sa / 100;
            else
              gst = 0;

            ta = sa + gst;

            if (ta < 2000)
              dis = 50;
            else if (ta >= 2000 && ta <= 5000)
              dis = 100;
            else if (ta > 5000 && ta <= 12000)
              dis = 200;
            else
              dis = 325;

            nba = ta - dis;
            sum = sum + nba;

            bw.write("<tr>");
            bw.write("<td>" + sd[0] + "</td>");
            bw.write("<td>" + sd[1] + "</td>");
            bw.write("<td>" + sd[2] + "</td>");
            bw.write("<td>" + sd[3] + "</td>");
            bw.write("<td>" + sd[4] + "</td>");
            bw.write("<td>" + sd[5] + "</td>");
            bw.write("<td>" + sd[6] + "</td>");
            bw.write("<td>" + sd[7] + "</td>");
            bw.write("<td>" + sd[8] + "</td>");
            bw.write("<td>" + sd[9] + "</td>");
            bw.write("<td>" + sa + "</td>");
            bw.write("<td>" + gst + "</td>");
            bw.write("<td>" + ta + "</td>");
            bw.write("<td>" + dis + "</td>");
            bw.write("<td>" + nba + "</td>");
            bw.write("</tr>");
          } catch (NumberFormatException ne) {
            System.out.println("Number format error: " + ne.getMessage());
          }
        }
      }

      br.close();

      bw.write("<tr>");
      bw.write("<td></td><td></td><td></td><td></td><td></td>");
      bw.write("<td></td><td></td><td></td><td></td><td></td>");
      bw.write("<td></td><td></td><td></td>");
      bw.write("<td>" + "Grand Total:" + "</td>");
      bw.write("<td>" + sum + "</td>");
      bw.write("</tr>");

      bw.write("</table>");
      bw.write("</center>");
      bw.write("</body>");
      bw.write("</html>");
      bw.close();

      // kept same as your original
      Runtime RT = Runtime.getRuntime();
      RT.exec("Explorer Items_Report1.html");
    } catch (IOException E) {
      System.out.println("Problems occured during producing Grocery Items Simple Report");
    }
  }

  // ✅ Added main method (only addition)
  public static void main(String[] args) {
    new Periodical_Sales_Report("01/01/2024", "31/12/2024");
  }
}