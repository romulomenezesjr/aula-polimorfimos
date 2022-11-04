package poo.polimorfismo;

public class Peixe extends Animal{

	public Peixe(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		this.x = this.x + 1;

		
	}

}
