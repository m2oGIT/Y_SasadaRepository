/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author ���c�@�T�� <br />
 *         ���[�v���ɂ����Z <br />
 *         ���C�����\�b�h�F�C�ӂ̒l�����Z���ĕ\������ <br />
 *         add���\�b�h �F�n���ꂽ�����Ԃ̐����̑��a�����߂� <br />
 *         �X�V���� 2015/12/13�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test07 {

  /**
   * ���C�����\�b�h <br />
   * �l�����Z���Č��ʂ�\������ <br />
   * 
   * @param args ���s������
   */

  public static void main( String[] args ) {
    int sum = 0;

    // 1~100�܂ł̑��a�����߂�
    for ( int i = 1; i <= 100; i++ ) {
      sum = sum + i;
    }

    // 1~100�܂ł̑��a��\������
    System.out.println( "1~100�܂ő��a�� " + sum + " �ł�" );

  }

  /**
   * sum�̕ԋp <br />
   * sum�̒l��ԋp����B <br />
   * 
   * @param a ����1
   * @param b ����2
   * @return sum2 �n���ꂽ�����Ԃ̐����̑��a
   */

  public static int getSum( int a, int b ) {
    int sum2 = 0;

    // ���s�������̑召������s���A�����Ԃ̐����̑��a�����߂�
    if ( a < b ) {
      for ( int i = a + 1; i < b; i++ ) {
        sum2 = sum2 + i;
      }
    } else if ( b < a ) {
      for ( int i = b + 1; i < a; i++ ) {
        sum2 = sum2 + i;
      }
    }

    // �����Ԃ̐����̑��a��Ԃ�
    return sum2;

  }
}
