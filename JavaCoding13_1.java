import  java.awt.*;
import  java.applet.*;
public  class  JavaCoding13_1 extends Applet
{
  String[] advs;//�����ı����е��ַ�������
  int currentString;//��ǰʱ��Ӧ����ʾ���ı������
  public  void init()
  {
    //�����ַ������飬��������Ԫ�ظ�ֵ
    advs=new String[5];
    advs[0]="���ŵ�һ";
    advs[1]="Ч�ʵ�һ";
    advs[2]="�ͻ�����";
    advs[3]="��������";
    advs[4]="Ϊ���Ļ��ﱣ�ݻ���";
  }
  public  void  start()
  {
     currentString=0;//�ӵ�һ���ı���ʼ��ʾ
  }

  public   void  paint(Graphics g)
  {
     g.setFont(new Font("����",Font.BOLD,36));//��������
     g.setColor(Color.blue);//������ɫ
     g.drawString(advs[currentString],30,50);//��ʾ��ǰ��ŵ��ı�
	 //������һ��Ҫ��ʾ���ı������,����ʾ
	//ͣ��2��󣬲�������ʾ��һ���ı������ѭ������
	 //�뽫���µ���䲹������



   }
}
