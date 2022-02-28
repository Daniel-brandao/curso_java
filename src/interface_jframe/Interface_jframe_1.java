package interface_jframe;

import java.awt.Panel;

import javax.swing.JFrame;

public class Interface_jframe_1 {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Usuário");
		 Panel panel = new Panel();
		 frame.add(panel);
		 frame.setVisible(true);
		 frame.setSize(400, 400);

	}
	

}
