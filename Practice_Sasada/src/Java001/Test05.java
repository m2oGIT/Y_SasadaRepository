/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * @author ���c�@�T�� <br />
 *         �N���������̕�����\�� <br />
 *         �����ŗ^�����C�ӂ̕������\�� <br />
 *         �X�V���� 2015/12/06�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test05 {

  /**
   * ���C�����\�b�h <br />
   * �N����������\�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // args[0] = "���̐퓬�͂�"
    // args[1] = "53"
    // args[2] = "10000"
    // args[3] = "�ł�"
    double a = Double.parseDouble( args[1] );
    double b = Double.parseDouble( args[2] );
    System.out.println( args[0] );
    System.out.print( a * b );
    System.out.println( args[3] );
  }

}
