package poo.polimorfismo;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class TelaSimulacao extends Canvas {
	private Animal[] animais;

	public TelaSimulacao(Animal[] animais) {
		this.animais = animais;
	}

	public void inicializar() {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
	    Graphics2D g2;
	     g2 = (Graphics2D) g;
	     for (Animal animal : animais){
	        g2.drawString(
	                        animal .getClass().getSimpleName(),
	                        (int)animal .getX()*10,
	                        (int)animal .getY()*10 + 25);
	        g2.drawRect(
	                        (int)animal.getX( )*10,
	                         (int) animal.getY()*10,
	                         10,
	                         10);
	     }
	}

}
