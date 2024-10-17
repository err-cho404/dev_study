package objlec.three;

public class UseMain {
	public static void main(String[] args) {
		AreaCalcu calcu = new TriAreaCalcu();
		System.out.println("== 삼각형의 면적 ==" );
		calcu.areaCalculate(50, 70);
		calcu.printArea();
		
		System.out.println("== 사각형의 면적 ==" );
		calcu = new RectAreaCalcu();
		calcu.areaCalculate(500, 75);
		calcu.printArea();
		
		System.out.println("== 원의 면적 ==");
		calcu = new CircAreaCalcu();
		calcu.areaCalculate(50, 50);
		calcu.printArea();
	}

}
