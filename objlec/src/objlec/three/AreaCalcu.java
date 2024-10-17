package objlec.three;

public abstract class AreaCalcu {
	public double area;
	
	public void printArea() {
		System.out.println("요청한 도형의 면적 : " + area);
	}
	
	abstract public void areaCalculate(int num1, int num2);
}
