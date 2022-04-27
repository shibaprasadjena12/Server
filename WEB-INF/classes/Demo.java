import java.io.*;
import javax.servlet.*;
public class Demo extends GenericServlet
{
    public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        pw.println("<center><h2>Remote address is "+req.getRemoteAddr()+"</h2>");
        pw.println("<h2>Remote host is"+req.getRemoteHost()+"</h2>");
        pw.println("<h2>Server port"+req.getServerPort()+"</h2>");
        pw.println("<h2>Protocol is"+req.getProtocol()+"</h2></center>");
//        ServletOutputStream sos=res.getOutputStream();
//        FileInputStream fis=new FileInputStream("C:\\dulu.jpg");
//        BufferedInputStream bis=new BufferedInputStream(fis);
//        BufferedOutputStream bos=new BufferedOutputStream(sos);
//        int a=0;
//        while((a=bis.read())!=-1)
//        {
//            bos.write(a);
//        }
//        bis.close();
//        fis.close();
//        bos.close();
//        sos.close();
    }
}