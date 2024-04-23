/*
 * 
 */
import javax.swing.*;
public class 문자열_4 extends JFrame{
	JTextField tf=new JTextField();
	public 문자열_4()
	{
		add("North",tf);
		tf.setText(String.valueOf("하이"));  //String.valueOf  외워두기
		setSize(350,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 문자열_4();
	}
}
