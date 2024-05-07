import javax.swing.*;
import javax.swing.table.*;

public class MusicSystem extends JFrame{
	JTable table;
	DefaultTableModel model;
	
	public MusicSystem() {
		String[] col= {"노래명","앨범명","가수명"};
		Object[][] row= new Object[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		add("Center", js);
		setSize(700, 600);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new MusicSystem();
	}

}
