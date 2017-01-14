
package web_001;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_003
 */
@WebServlet("/Servlet_003")
public class Servlet_003 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Servlet_003() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // はじめにリクエストのエンコードを実施
    request.setCharacterEncoding( "Windows-31J" );
    // ContentTypeを指定
    response.setContentType( "text/html; charset=Windows-31J" );
    PrintWriter pw = response.getWriter();
    // pw.println("Hello Servlet_003");
    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>Servlet_003</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    pw.println( "<h1><font color=\"red\"></font></h1>" );
    // h1はヘッダー１：太字
    /**
     * <p>
     * 入力の反復表示処理
     * </p>
     * <p>
     * 複数人の身長を読み込み、標準体重を表示する。
     * </p>
     * <p>
     * 標準体重＝（身長-100）×0.9
     * </p>
     * 
     * @author EIS 笹田裕介<br/>
     *         更新履歴<br>
     *         2017/01/14：EIS 笹田裕介：更新<br/>
     */
    try {
      String left = request.getParameter( "left" );
      String right = request.getParameter( "right" );
      String calculation = request.getParameter( "calculation" );
      double sakou;
      double ukou;
      sakou = Double.parseDouble( left );
      ukou = Double.parseDouble( right );
      double enzan = 0;
      switch ( calculation ) {
        case "+":
          enzan = sakou + ukou;
          break;
        case "-":
          enzan = sakou - ukou;
          break;
        case "*":
          enzan = sakou * ukou;
          break;
        case "/":
          enzan = sakou / ukou;
          break;
        default:
          throw new IllegalArgumentException();
      }
      BigDecimal kekka = new BigDecimal( enzan );
      kekka = kekka.setScale( 5, BigDecimal.ROUND_HALF_UP );
      pw.println( sakou );
      pw.println( calculation );
      pw.println( ukou );
      pw.println( "=" );
      pw.println( kekka );
      System.out.println( sakou );
      System.out.println( calculation );
      System.out.println( ukou );
      System.out.println( enzan );
    } catch ( IllegalArgumentException e ) {
      // 入出力エラー時の処理
      pw.println( "不正な値が入力されました。" );
    } catch ( ArithmeticException e ) {
      pw.println( "0除算エラーです。" );
    }
    pw.println( "</body>" );
    pw.println( "</html>" );
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    this.doGet( request, response );

  }

}
