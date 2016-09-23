/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ���c�@�T�� <br />
 *         �R���\�[�����͒l����ő�l��\�� <br />
 *         �������T����͂��āA�ő�l��\������ <br />
 *         �X�V���� 2016/2/20�i�X�V�ҁj�F���c�@�T��F�V�K�쐬 <br />
 */
public class ArrayTest {

  /**
   * ���C�����\�b�h <br />
   * �R���\�[���ɒl���T����͂��A�ő�l��\������ <br />
   * 
   * @param args ���s������
   */
  public static void main( String[] args ) {
    int i = 0;
    // �ő�l���i�[
    int b = 0;
    // ���v�l���i�[
    int c = 0;
    // ���ϒl���i�[
    double d = 0;
    System.out.print( "�������T����͂��Ă��������B>" );

    // ���̓X�g���[���̃C���X�^���X�����Ő����B
    BufferedReader input = null;

    try {
      while ( true ) {
        // �R���\�[���ɓ��͂���
        input = new BufferedReader( new InputStreamReader( System.in ) );

        // ���͂����������l�ɕϊ�
        String str = input.readLine();
        int a = Integer.parseInt( str );

        // ���͒l�̑召��r
        c = c + a;
        if ( a > b ) {
          b = a;
        }

        // �T����͂���܂ŌJ��Ԃ�
        i++;

        // �T����͂�����I��
        if ( i == 5 ) {
          break;
        }
      }
      System.out.println( "�ő�l��" + b );
      System.out.println( "���v�l��" + c );

      d = c;
      // ���v�l����͉񐔂̂T�Ŋ���A���ϒl��\������
      System.out.println( "���ϒl��" + d / 5 );

    } catch ( IOException e ) {

      // ���o�̓G���[���̏���
      System.out.println( "���o�̓G���[�ł��B" );

    } catch ( NumberFormatException e ) {

      // �����l�ȊO�̓��͎��̏���
      System.out.println( "�����ł͂���܂���B�������I�����܂��B" );

    } finally {

      // Stream�͎g�p��ɃN���[�Y����B
      try {
        input.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }
    }

  }
}
