package poo.polimorfismo;
public abstract class Animal {
	
	public double x;
	public double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Animal(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract void mover();
	
	

}
