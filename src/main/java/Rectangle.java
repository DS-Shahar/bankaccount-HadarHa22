
public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int l,int w) {
		this.length = l;
		this.width = w;
	}
	
	public void draw() {
		for (int i=0; i<this.length; i++) {
			for (int j=0; j<this.width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int calcArea() {
		return (width * length);
	}
	
	public int calcPer() {
		return (width*2 + length*2);
	}
	
	public void scale(int factor) {
		this.width = this.width*factor;
		this.length = this.length*factor;
	}
	
	public String toString() {
		return "len: " + length + " width: " + width;
	}
}
