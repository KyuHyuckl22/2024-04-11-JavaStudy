package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
   CardLayout card=new CardLayout();
   //EmpListPanel ep=new EmpListPanel();
   HomePanel hp;
   GoodsDetailPanel dp;
   FindPanel fp;
   ChatPanel chatP=new ChatPanel();
   MypagePanel my;
   BoardListPanel bp;
   BoardInsertPanel bip;
   BoardDetailPanel bdp;
   BoardDeletePanel bdelp;
   BoardUpdatePanel bup;
   // 웹에서 => 화면 변경 => controller
   /*
    *   처리 : Model
    *   화면 : View
    *   화면 변경 : Controller => MVC
    *   
    *   최근 Spring MVC 가 사라졌다
    *   	----------
    */
   public ControllPanel()
   {
	   setLayout(card);
	   //add("EP",ep);
	   hp = new HomePanel(this);
	   dp = new GoodsDetailPanel(this);
	   bp = new BoardListPanel(this);
	   fp = new FindPanel(this);
	   bip = new BoardInsertPanel(this);
	   bdp = new BoardDetailPanel(this);
	   bdelp = new BoardDeletePanel(this);
	   bup = new BoardUpdatePanel(this);
	   my = new MypagePanel(this);
	   
	   add("HP",hp);
	   add("CHAT",chatP);
	   add("DP",dp);
	   add("FP",fp);
	   add("LIST",bp);
	   add("INSERT",bip);
	   add("DETAIL",bdp);
	   add("DELETE",bdelp);
	   add("UPDATE",bup);
	   add("MY",my);
   }
}



