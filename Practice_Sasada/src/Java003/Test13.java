/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author ���c�@�T�� <br />
 *         ���s'*'�\�� <br />
 *         �s���Ƃ�'*'���P�����₵�Ȃ���\������ <br />
 *         �X�V���� 2016/2/20�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test13 {

  /**
   * ���C�����\�b�h <br />
   * '*'�𑝂₵�Ȃ�����s�\�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // �s���Ƃ�*���P�����₵�Ȃ���\������
    for ( int i = 1; i <= 10; i++ ) {
      for ( int j = 1; j <= i; j++ ) {
        System.out.print( '*' );
      }
      // ���s
      System.out.println();
    }
  }

}
