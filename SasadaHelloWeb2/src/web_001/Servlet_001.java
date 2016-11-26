package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_001
 */
@WebServlet("/Servlet_001")
public class Servlet_001 extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_001() {
        super();
        // TODO Auto-generated constructor stub
    }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // はじめにリクエストのエンコードを実施
    request.setCharacterEncoding( "Windows-31J" );
    // ContentTypeを指定
    response.setContentType("text/html; charset=Windows-31J");
    PrintWriter pw = response.getWriter();
    //pw.println("Hello Servlet_001");
    pw.println("<html>");
    pw.println("<head>");
    pw.println("<title>Servlet_001</title>");
    pw.println("</head>");
    pw.println("<body>");
    pw.println("<h1><font color=\"red\"></font></h1>");
    //h1はヘッダー１：太字
    String param = request.getParameter("param");
    String number = request.getParameter("number");
    int kaisu;
    kaisu = Integer.parseInt(number);
    System.out.println(number);
    System.out.println(kaisu);
    for ( int i = 1; i <= kaisu; i++ ) {
      pw.print(param);
      }
    
    // 入力値を標準出力する
    System.out.println(param);
    
    pw.println("</body>");
    pw.println("</html>");
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doGet(request, response);
    
    
    
  }

}
