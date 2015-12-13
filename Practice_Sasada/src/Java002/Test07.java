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
   * add���\�b�h <br />
   * �����Ԃ̑��a�����߂� <br />
   */

  private static int num1 = 0;
  private static int num2 = 0;
  private static int sum2 = 0;

  /**
   * num�̐ݒ�<br />
   * num�̒l��ݒ肷��B <br />
   *
   * @param args1 �ݒ肷��l1
   * @param args2 �ݒ肷��l2
   */

  public static void setNum( int args1, int args2 ) {

    // �n���ꂽ������ݒ肷��
    num1 = args1;
    num2 = args2;

  }

  /**
   * sum�̕ԋp <br />
   * sum�̒l��ԋp����B <br />
   *
   * @return sum �n���ꂽ�����Ԃ̐����̑��a
   */

  public static int getSum() {

    // ���s�������̑召������s���A�����Ԃ̐����̑��a�����߂�
    if ( num1 < num2 ) {
      for ( int i = num1 + 1; i < num2; i++ ) {
        sum2 = sum2 + i;
      }
    } else if ( num2 < num1 ) {
      for ( int i = num2 + 1; i < num1; i++ ) {
        sum2 = sum2 + i;
      }
    }

    // �����Ԃ̐����̑��a��Ԃ�
    return sum2;

  }
}
