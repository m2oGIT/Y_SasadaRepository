/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author ���c�@�T�� <br />
 *         ���[�v���ɂ����Z(�����) <br />
 *         �C�ӂ̒l�̊�݂̂̑��a��\������ <br />
 *         �X�V���� 2015/12/13�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test08 {

  /**
   * ���C�����\�b�h <br />
   * ��̒l�����Z���Č��ʂ�\������ <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    int sum = 0;

    // 1~100�܂ł̊�̑��a�����߂�
    for ( int i = 1; i <= 100; i++ ) {
      if ( i % 2 != 0 ) {
        sum = sum + i;
      }
    }

    // 1~100�܂ł̊�̑��a��\������
    System.out.println( "1~100�܂ł̊�̑��a�� " + sum + " �ł�" );

  }

}
