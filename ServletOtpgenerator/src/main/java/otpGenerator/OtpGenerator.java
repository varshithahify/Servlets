package otpGenerator;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/otp")
public class OtpGenerator implements Servlet {
	public OtpGenerator() {
		System.out.println("Object got created");
	}
	static {
		System.out.println("Class got loaded");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service got invoked");
		int num=new Random().nextInt(100000,1000000);
		arg1.getWriter().println("The Otp is "+num);
		
	}
	
	


}
