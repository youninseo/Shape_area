package shape_area;

public class Rect implements Shape {
	private int value1;
	private int value2;
	
	@Override
	public void setData(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public double calcArea() {
		return this.value1 * this.value2;
	}

}

