package �ֳz�}���{��;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.junit.Test;
public class FrameDisign extends JFrame implements WindowListener,ActionListener{
	
	public FrameDisign() {
		//�����إ�
		this.setLocation(5,00);
		this.setSize(600,300);//�����j�p
		this.setTitle("�ֳz�}�����X");
		this.setLayout(null);
		this.setBackground(Color.yellow);
		this.addWindowListener(this);
		
		//Start���s
		JButton Start = new JButton("Start");
		Start.setBounds(120,190,150,60);
		this.add(Start);
		Start.addActionListener(this);
		
		//Close���s
		JButton Clean = new JButton("Clean");
		Clean.setBounds(320,190,150,60);
		this.add(Clean);
		Clean.addActionListener(this);
	} 
	
	static FrameDisign frm;
	
	static JLabel bifttf01= new JLabel();//�j�ƧǮ�1
	static TextField bifttf= new TextField();//�j��ܮ�1
	
	static JLabel ttf01= new JLabel();//�ƧǮ�1
	static TextField ttf1= new TextField();//��ܮ�1
	
	static JLabel ttf02= new JLabel();//�ƧǮ�2
	static TextField ttf2= new TextField();//��ܮ�2
	
	static JLabel ttf03= new JLabel();//�ƧǮ�3
	static TextField ttf3= new TextField();//��ܮ�3
	
	static JLabel ttf04= new JLabel();//�ƧǮ�4
	static TextField ttf4= new TextField();//��ܮ�4
	
	static JLabel ttf05= new JLabel();//�ƧǮ�5
	static TextField ttf5= new TextField();//��ܮ�5
	
	static JLabel ttf06= new JLabel();//�ƧǮ�6
	static TextField ttf6= new TextField();//��ܮ�6
	
	static JLabel ttf07= new JLabel();//�ƧǮ�7
	static TextField ttf7= new TextField();//��ܮ�7
	
	public static void main(String[] args) {
		
		frm= new FrameDisign();
		frm.setVisible(true);		
		
		//�j��ܮس]�w
		//bifttf01= new JLabel();
		bifttf01.setLocation(100,15);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		bifttf01.setSize(100,30);//�خؤj�pwidth,height
		bifttf01.setText("�Ѥp��j�Ƨ�");
		bifttf01.setFont(new java.awt.Font("�s�ө���", 0, 15));
		
		//bifttf = new TextField();
		bifttf.setBounds(100,40,400,40);//��ܮءGx,y,width,height
		bifttf.setFont(new java.awt.Font("�s�ө���", 0, 27));
		
		//�p��ܮ�1
		ttf01.setLocation(115,85);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ttf01.setSize(30,50);//�خؤj�pwidth,height
		ttf01.setText("1.");
		
		ttf1.setBounds(100,120,40,40);//��ܮءGx,y,width,height
		ttf1.setFont(new java.awt.Font("�s�ө���", 0, 30));
		
		//�p��ܮ�2
		ttf02.setLocation(175,85);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ttf02.setSize(30,50);//�خؤj�pwidth,height
		ttf02.setText("2.");
		
		ttf2.setBounds(160,120,40,40);//��ܮءGx,y,width,height
		ttf2.setFont(new java.awt.Font("�s�ө���", 0, 30));
		
		//�p��ܮ�3
		ttf03.setLocation(235,85);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ttf03.setSize(30,50);//�خؤj�pwidth,height
		ttf03.setText("3.");
		
		ttf3.setBounds(220,120,40,40);//��ܮءGx,y,width,height
		ttf3.setFont(new java.awt.Font("�s�ө���", 0, 30));
		
		//�p��ܮ�4
		ttf04.setLocation(295,85);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ttf04.setSize(30,50);//�خؤj�pwidth,height
		ttf04.setText("4.");
		
		ttf4.setBounds(280,120,40,40);//��ܮءGx,y,width,height
		ttf4.setFont(new java.awt.Font("�s�ө���", 0, 30));
		
		//�p��ܮ�5
		ttf05.setLocation(355,85);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ttf05.setSize(30,50);//�خؤj�pwidth,height
		ttf05.setText("5.");
		
		ttf5.setBounds(340,120,40,40);//��ܮءGx,y,width,height
		ttf5.setFont(new java.awt.Font("�s�ө���", 0, 30));
		
		//�p��ܮ�6
		ttf06.setLocation(415,85);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ttf06.setSize(30,50);//�خؤj�pwidth,height
		ttf06.setText("6.");
		
		ttf6.setBounds(400,120,40,40);//��ܮءGx,y,width,height
		ttf6.setFont(new java.awt.Font("�s�ө���", 0, 30));
		
		//�p��ܮ�7
		ttf07.setLocation(460,85);//x,y�y�СA�]�wlabel�b�������P��ت��Z��
		ttf07.setSize(40,50);//�خؤj�pwidth,height
		ttf07.setText("7.�S�O");
		
		ttf7.setBounds(460,120,40,40);//��ܮءGx,y,width,height
		ttf7.setFont(new java.awt.Font("�s�ө���", 0, 30));
		ttf7.setBackground(Color.red);
		
		frm.add(bifttf);
		frm.add(bifttf01);
		frm.add(ttf1);
		frm.add(ttf01);
		frm.add(ttf2);
		frm.add(ttf02);
		frm.add(ttf3);
		frm.add(ttf03);
		frm.add(ttf4);
		frm.add(ttf04);
		frm.add(ttf5);
		frm.add(ttf05);
		frm.add(ttf6);
		frm.add(ttf06);
		frm.add(ttf7);
		frm.add(ttf07);
	}
	
		static String a1;
		static String a2;
		static String a3;
		static String a4;
		static String a5;
		static String a6;
		static String a7;
		static String tal;
	
	public void actionPerformed(ActionEvent e) {
		CreateRandomNumber crn = new CreateRandomNumber();
		/*�I��Start���H�����ͼƦr*/
		if(e.getActionCommand().equals("Start")) {
			int[] b = crn.CreateNumber();
			ttf1.setText(a1= Integer.toString(b[0]));//��r��
			ttf2.setText(a2= Integer.toString(b[1]));
			ttf3.setText(a3= Integer.toString(b[2]));
			ttf4.setText(a4= Integer.toString(b[3]));
			ttf5.setText(a5= Integer.toString(b[4]));//new Font("Serif",Font.PLAIN,14)
			ttf6.setText(a6= Integer.toString(b[5]));
			ttf7.setText(a7= Integer.toString(b[6]));
			
			
			//����H����
			for(int z:b) {
				System.out.print(z+",");
			}
			
			//�Ѥp��j�Ƨ�
			Arrays.sort(b);//�Nb�}�C�̪��Ʀr�Ѥp��j�Ƨ�
			
			tal = Arrays.toString(b);//�Nb�}�C�ন�r��
			System.out.print(tal);
			bifttf.setText(tal);
			
			//�I��Clean��|�M���Ҧ��Ʀr
		}else if(e.getActionCommand().equals("Clean")) {
			ttf1.setText(a1=null);
			ttf2.setText(a2=null);
			ttf3.setText(a3=null);
			ttf4.setText(a4=null);
			ttf5.setText(a5=null);
			ttf6.setText(a6=null);
			ttf7.setText(a7=null);
			bifttf.setText(tal=null);
		}
	}
	
	
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}