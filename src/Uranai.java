import java.util.Random;
import java.util.Scanner;

public class Uranai {

  int point;
  int total;
  static Scanner sc;
  static Random rand;

  public static void main(String[] args) {
    sc = new Scanner( System.in );
    rand = new Random();


  }

  /*
   * �y�F����ɂ��肢���������Ɓz
   *  �����̏��ʁi�P�`�P�Q�ʁj�ɉ����Đ肢���ʁi�����j��\������.
   *
   *  ���e�Ɋւ��ẮA�D���ɂ��Ă��������B
   *  ������ɏ悹�Ă����܂��B
   *  �R�s�[����Ȃ肵�Ċ撣���Ă��������B
   *  ���e�Ɋւ��āA���������͂߂��܂��e���r�̐肢�ł��Q�l�ɂ��Ă��������B
   */

  public void Aries( int num ){
    String seiza = "���r��";
    switch( num ){

      // case 1 = ��ʂ̎��̃��b�Z�[�W
      case 1:
        System.out.println( num + "��" + seiza);
        System.out.println("�̈ӂ̃r�b�O�`�����X�����Ń��e���e�I");
        System.out.println("�C�ɂȂ�l�ɂ͐ϋɓI�ȃA�s�[�����I");
        System.out.println("���b�L�[�|�C���g�F�w�C���e���A�G�݃V���b�v�x");
        System.out.println("");
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
      case 7:
        break;
      case 8:
        break;
      case 9:
        break;
      case 10:
        break;
      case 11:
        break;
      case 12:
    }
    return;
  }
  public void Taurus( int num ){
  }
  public void Gemini( int num ){
  }
  public void Cancer( int num ){
  }
  public void Leo( int num ){
  }
  public void Virgo( int num ){
  }
  public void Libra( int num ){
  }
  public void Scorpio( int num ){
  }
  public void Sagittarius( int num ){
  }
  public void Capricorn( int num ){
  }
  public void Aquarius( int num ){
  	String seiza = "���r��";
	System.out.println( num + "��" + seiza);
    switch( num ){
      // case 1 = ��ʂ̎��̃��b�Z�[�W
      case 1:
        System.out.println("�̈ӂ̃r�b�O�`�����X�����Ń��e���e�I");
        System.out.println("");
        break;
      case 2:
        System.out.println("��");
        System.out.println("");
        break;
      case 3:
        System.out.println("��");
        System.out.println("");
        break;
      case 4:
	  System.out.println("��");
        System.out.println("");
        break;
      case 5:
	  System.out.println("��");
        System.out.println("");
        break;
      case 6:
	  System.out.println("��");
        System.out.println("");
        break;
      case 7:
	  System.out.println("��");
        System.out.println("");
        break;
      case 8:
	  System.out.println("��");
        System.out.println("");
        break;
      case 9:
	  System.out.println("��");
        System.out.println("");
        break;
      case 10:
	  System.out.println("��");
        System.out.println("");
        break;
      case 11:
	  System.out.println("��");
        System.out.println("");
        break;
      case 12:
	  System.out.println("��");
        System.out.println("");
    }
    return;
  }
  public void Pisces( int num ){
  }
}