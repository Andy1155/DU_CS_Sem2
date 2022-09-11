package P;
import P2.ThreeDim;
import P1.TwoDim;

public class Main{
	public static void main(String[] args){
		TwoDim twodim = new TwoDim();
		System.out.println(twodim.toString());
		twodim = new TwoDim(1.2, 2.3);
		System.out.println(twodim.toString());
		ThreeDim threedim = new ThreeDim();
		System.out.println(threedim.toString());
		threedim = new ThreeDim(1.2, 2.3, 5.5);
		System.out.println(threedim.toString());
	}
}
