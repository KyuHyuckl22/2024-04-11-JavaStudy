package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class LoginPanel extends JFrame{
	
    Image back;
    JLabel idLa,pwdLa;
    JTextField tf;
    JPasswordField pf;
    JButton loginBtn,joinBtn,cancelBtn;
    
    
    public LoginPanel()
    {
    	back=Toolkit.getDefaultToolkit().getImage("C:\\project\\projectimg.jpg");
    	
    	setContentPane(new JPanel(){
    		
    		@Override
    		protected void paintComponent(Graphics g) {
    			super.paintComponent(g);
    			g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
    		}
    	});
    	
    	idLa=new JLabel("아이디",JLabel.RIGHT);
    	idLa.setFont(new Font("맑은고딕",Font.BOLD,15));
    	pwdLa=new JLabel("비밀번호",JLabel.RIGHT);
    	pwdLa.setFont(new Font("맑은고딕",Font.BOLD,15));
    	
    	tf=new JTextField();
    	pf=new JPasswordField();
    	
    	loginBtn=new JButton("로그인");
    	joinBtn=new JButton("회원가입");
    	cancelBtn=new JButton("종료");
    	
    	
    	// 배치 
    	setLayout(null); // 사용자 정의 
    	idLa.setBounds(910, 550, 80, 30);
    	tf.setBounds(995, 550, 180, 30);
    	add(idLa);add(tf);
    	
    	pwdLa.setBounds(910, 585, 80, 30);
    	pf.setBounds(995, 585, 180, 30);
    	add(pwdLa);add(pf);
    	
    	JPanel p=new JPanel();
    	p.add(loginBtn);
    	p.add(joinBtn);
    	p.add(cancelBtn);
    	p.setOpaque(false);
    	p.setBounds(950, 615, 265, 35);
    	add(p);
    	
    	
    	setSize(1280, 720);
    	setVisible(true);
        setLocationRelativeTo(null); // 프레임을 화면 중앙에 배치

    }

	


    
    // 스킨 => 이미지 배경 => 
	/*
	 * @Override protected void paintComponent(Graphics g) { g.drawImage(back, 0,
	 * 0,getWidth(),getHeight(),this); }
	 */
    
    
}