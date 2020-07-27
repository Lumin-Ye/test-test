import  java.awt.*;
import  java.applet.*;
public  class  JavaCoding13_1 extends Applet
{
  String[] advs;//保存文本序列的字符串数组
  int currentString;//当前时刻应该显示的文本的序号
  public  void init()
  {
    //创建字符串数组，并给数组元素赋值
    advs=new String[5];
    advs[0]="诚信第一";
    advs[1]="效率第一";
    advs[2]="客户至上";
    advs[3]="服务至上";
    advs[4]="为您的货物保驾护航";
  }
  public  void  start()
  {
     currentString=0;//从第一条文本开始显示
  }

  public   void  paint(Graphics g)
  {
     g.setFont(new Font("黑体",Font.BOLD,36));//设置字体
     g.setColor(Color.blue);//设置颜色
     g.drawString(advs[currentString],30,50);//显示当前序号的文本
	 //计算下一条要显示的文本的序号,并显示
	//停留2秒后，擦除，显示下一条文本，如此循环往复
	 //请将以下的语句补充完整



   }
}
