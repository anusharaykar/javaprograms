package lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/lab4a")
public class lab4a extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
double price1=12;
double price2=15;
 
    public lab4a() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setIntHeader("refresh", 5);
		response.setContentType("text/html;chs=arset-UTF-8");
		PrintWriter out=response.getWriter();
		Calendar cal=new GregorianCalendar();
		String  noon;
		int hour=cal.get(Calendar.HOUR);
		int minute=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
        if(cal.get(Calendar.AM_PM)==0)
        	noon="AM";
        else
        	noon="PM";
        String ct=hour+";"+minute+";"+second+" "+noon;
		price1=price1*.43;
		price2=price2*1.33;
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Refresh</title>");
        out.println("</head>");
        out.println("<body bgcolor=red;>");
        out.println("<center><h2>Servlets</h2><hr></center>");
        out.println("<form>Stock Price 1:<h2>"+price1+"</h2><form>");
        out.println("<form>Stock Price 2:<h2>"+price2+"</h2><form>");

        
        out.print("Current date and time is  :  ");
		Date d = new Date();
		d.getDate();
		out.print(d);
        out.println("</body></html>");

	}

		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}