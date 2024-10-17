package kr.co.yangdoll.calcu;

public class MainCaller {
	public static void main(String[] args) {
		NumInput numInput = new NumInput(); //일을 시키기위한 준비 작업
		int data1 = numInput.dataInput();
		int data2 = numInput.dataInput();
		
		Compute compute = new Compute();
		int addResult = compute.add(data1, data2);
		
		ResultPrint resultPrint = new ResultPrint();
		resultPrint.dataPrint(addResult);
	}
}
