package com.sist.main2;
/*
 *   Movi => CGV / Megabox / 롯데시네마
 *   
 *   Music => Genie / Melon
 *   ----- 뮤직을 만들때 상속
 */
public abstract class MusicSystem {
	public static Music[] musics=new Music[50];
	public abstract void init();
	public abstract void find(String tile);
	public abstract void list();
	public abstract void detail(int mno); 
}
