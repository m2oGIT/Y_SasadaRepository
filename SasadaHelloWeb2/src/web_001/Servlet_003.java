
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
    // �͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
    request.setCharacterEncoding( "Windows-31J" );
    // ContentType���w��
    response.setContentType( "text/html; charset=Windows-31J" );
    PrintWriter pw = response.getWriter();
    // pw.println("Hello Servlet_003");
    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>Servlet_003</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    pw.println( "<h1><font color=\"red\"></font></h1>" );
    // h1�̓w�b�_�[�P�F����
    /**
     * <p>
     * ���͂̔����\������
     * </p>
     * <p>
     * �����l�̐g����ǂݍ��݁A�W���̏d��\������B
     * </p>
     * <p>
     * �W���̏d���i�g��-100�j�~0.9
     * </p>
     * 
     * @author EIS ���c�T��<br/>
     *         �X�V����<br>
     *         2017/01/14�FEIS ���c�T��F�X�V<br/>
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
      // ���o�̓G���[���̏���
      pw.println( "�s���Ȓl�����͂���܂����B" );
    } catch ( ArithmeticException e ) {
      pw.println( "0���Z�G���[�ł��B" );
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
