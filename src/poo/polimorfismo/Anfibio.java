package poo.polimorfismo;

public class Anfibio extends Animal{

	public Anfibio(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		this.x = this.x + 1.5;

		
	}

}
