/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author ���c�@�T�� <br />
 *         ���[�v���ɂ����Z(����) <br />
 *         �C�ӂ̒l������s�������܂ł̑��a��\������ <br />
 *         �X�V���� 2015/12/13�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test09 {

  /**
   * ���C�����\�b�h <br />
   * ���s�������܂ł̑��a��\������ <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    int sum = 0;
    // a�F���s�������𐮐��^�Ƃ��Ċi�[����
    int a = Integer.parseInt( args[0] );

    // 1~���s�������܂ł̑��a�����߂�
    for ( int i = 1; i <= a; i++ ) {
      sum = sum + i;
    }

    // 1~���s�������܂ł̑��a��\������
    System.out.println( "1~" + args[0] + "�܂ł̑��a�� " + sum + " �ł�" );

  }

}
