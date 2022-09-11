package P1;

public class TwoDim{
	private double x,y;
	public TwoDim(double x, double y){
		this.x = x;
		this.y = y;
	}
	public TwoDim(){
		x = 0.0;
		y = 0.0;
	}
	@Override
	public String toString(){
		return "cordinates : x " + x + "; y " + y + ";";
	}
}
