package com.sist.music;

import java.io.FileReader;

public class MelonMusic extends MusicSystem{

	@Override
	public void init() {
		try {
        FileReader fr = new FileReader("C:\\javaDev\\melon.txt");
        StringBuffer sb = new StringBuffer();
        int i = 0;
        
        while ((i = fr.read()) != -1) { // EOF
           sb.append((char) i);
        }
        fr.close();
        // buffer => 임시 기억 장소 => 누적
        String data = sb.toString();
        // String 은 문자에 제한이 없다.
        String[] mdata = data.split("\n");
        i = 0;
        for (String s : mdata) {
//           System.out.println(s);
           if (i > 50) break;
           musics[i] = new Music();
           String[] temp = s.split("\\|");
           /*
            * | 가 나올 때 마다 잘라준다. => |는 이미 사용 중에 있기 때문에 \\를 두 개 씩 주어야 한다
            * => 정규식 ==> ^, $, ., ?, |, +, * ===> 기호 자체를 가지고 올 때
            */
           musics[i].setMno(temp[0]);
           musics[i].setMno(temp[1]);
           musics[i].setMno(temp[2]);
           musics[i].setMno(temp[3]);
           musics[i].setMno(temp[4]);
           i++;
        }
     } catch (Exception e) {}
	}

}
