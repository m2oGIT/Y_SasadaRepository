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
    // �͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
    request.setCharacterEncoding( "Windows-31J" );
    // ContentType���w��
    response.setContentType("text/html; charset=Windows-31J");
    PrintWriter pw = response.getWriter();
    //pw.println("Hello Servlet_002");
    pw.println("<html>");
    pw.println("<head>");
    pw.println("<title>Servlet_002</title>");
    pw.println("</head>");
    pw.println("<body>");
    pw.println("<h1><font color=\"red\"></font></h1>");
    //h1�̓w�b�_�[�P�F����
    /**
    * <p>���͕�����̔����\������</p>
    * <p>�����l�̐g����ǂݍ��݁A�W���̏d��\������B</p>
    * <p>�W���̏d���i�g��-100�j�~0.9</p>
    *    
    * @author EIS ���c�T��<br/>
    * �X�V����<br>
    * 2017/01/14�FEIS ���c�T��F�X�V<br/>
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
