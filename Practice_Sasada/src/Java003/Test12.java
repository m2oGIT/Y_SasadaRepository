/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ���c�@�T�� <br />
 *         ���s�����̕\�� <br />
 *         ���s������yyyy/MM/dd HH:mm:ss�̌`���ŕ\������ <br />
 *         �X�V���� 2016/2/20�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class Test12 {

  /**
   * ���C�����\�b�h <br />
   * ���s�������擾���ĕ\������ <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���ݓ������擾
    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat( "���s������yyyy/MM/dd HH:mm:ss�ł��B" );
    String formatedDate = sdf.format( date );

    // �w��t�H�[�}�b�g�ŕ\������B
    System.out.println( formatedDate );
  }

}
