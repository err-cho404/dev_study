package objlec.two;

import org.junit.Test;

public class ExtTest{
	@Test
	public void extendsTest() {
//		Object obj = new Aaaa();
			Aaaa obj ; //->obj에 들어올 수 있는 객체 new Aaaa(), new Bbbb(), new Cccc(); ->다용성
			obj = new Cccc();
			obj.message();
			polyMeth(new Dddd());
	}
	
	public void polyMeth(Aaaa obj) {
		obj.message();
	}
		
		
	
}
