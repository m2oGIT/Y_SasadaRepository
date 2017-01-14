package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_002
 */
@WebServlet("/Servlet_002")
public class Servlet_002 extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_002() {
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
    //pw.println("Hello Servlet_002");
    pw.println("<html>");
    pw.println("<head>");
    pw.println("<title>Servlet_002</title>");
    pw.println("</head>");
    pw.println("<body>");
    pw.println("<h1><font color=\"red\"></font></h1>");
    //h1はヘッダー１：太字
    /**
    * <p>入力文字列の反復表示処理</p>
    * <p>複数人の身長を読み込み、標準体重を表示する。</p>
    * <p>標準体重＝（身長-100）×0.9</p>
    *    
    * @author EIS 笹田裕介<br/>
    * 更新履歴<br>
    * 2017/01/14：EIS 笹田裕介：更新<br/>
    */
    String param = request.getParameter("param");
    String[] sintyo = param.split(",", 0);
    int sintyo2;
    double taiju;
    for ( int i = 0; i < sintyo.length; i++ ) {
      sintyo2 = Integer.parseInt(sintyo[i]);
      taiju = (sintyo2 - 100) * 0.9;
      pw.println(taiju+"<br>");
      System.out.println(sintyo2);
      System.out.println(taiju);
      }
    
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
