/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author ���c�@�T�� <br />
 *         �ʃN���X���\�b�h�̌ďo�i���[�v���ɂ����Z(������)�j <br />
 *         �Q�̎��s�������̊Ԃ̐����̑��a�����߂郁�\�b�h���Ăяo���ĕ\������ <br />
 *         �X�V���� 2015/12/13�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test10 {

  /**
   * ���C�����\�b�h <br />
   * �����Ԃ̒l�̑��a�����߂郁�\�b�h���Ăяo�� <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    // a�F���s�������𐮐��^�Ƃ��Ċi�[����
    int a = Integer.parseInt( args[0] );
    // b�F���s�������𐮐��^�Ƃ��Ċi�[����
    int b = Integer.parseInt( args[1] );

    // add���\�b�h�Ōv�Z�������s�������Ԃ̐����̑��a��\������
    System.out.print( args[0] + " �� " + args[1] + " �̊Ԃ̐����̑��a�� " + Test07.getSum( a, b ) + " �ł�" );

  }

}
