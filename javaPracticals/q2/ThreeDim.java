package P2;
import P1.TwoDim;

public class ThreeDim extends TwoDim{
	private double z;
	
	public ThreeDim(){
		super();
		z = 0.0;
	}
	public ThreeDim(double x, double y, double z){
		super(x,y);
		this.z = z;
	}
	@Override
	public String toString(){
		return super.toString() + " z " + z;
	}
}
