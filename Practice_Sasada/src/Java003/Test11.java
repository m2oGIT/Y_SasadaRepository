/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author ���c�@�T�� <br />
 *         0.1��10�񑫂���10�{�����l�̕\�� <br />
 *         0.1��10�񑫂������ƁA10�{�����l��\������ <br />
 *         �X�V���� 2016/1/18�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test11 {

  /**
   * ���C�����\�b�h <br />
   * 0.1��10�񑫂������ƁA10�{�����l��\������ <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    BigDecimal bd1 = new BigDecimal( "0.1" );
    BigDecimal bd2 = new BigDecimal( "10" );
    BigDecimal sum = new BigDecimal( "0" );

    // 0.1��10�񑫂�
    for ( int i = 1; i <= 10; i++ ) {
      sum = sum.add( bd1 );
    }
    // 1.0��10�{����
    BigDecimal sum2 = sum.multiply( bd2 );

    // 1.0 * 10 �̌��ʂ�\������
    System.out.println( sum2 );
  }

}
