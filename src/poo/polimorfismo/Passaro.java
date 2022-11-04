package poo.polimorfismo;

public class Passaro extends Animal{

	public Passaro(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		this.x = this.x + 3;
		
	}

}
