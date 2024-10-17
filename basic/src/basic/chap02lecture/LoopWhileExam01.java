package baisc.chap02lecture;

public class LoopWhileExam01 {
	public static void main(String[] args) {
//	int i=0;
//	while(true) {
//		i=i+1;
//		System.out.println("영구없다");
//		if(i==10)break;
//	}
	
	int i =0;
	for(;true;){
	   	i=i+1;
	   	System.out.println("출력내용");
	   	if(i==2) break;
	   }	
	
	System.out.println("==다른 방법==");
	
//	int j=0;
//	while(j!=2) {   // => (j<2)
//		j=j+1;
//		System.out.println("영구없다");
//	}
	
	int j=0;
	for(;j<2;) {
		j=j+1;
		System.out.println("hi!!");
	}
	
}
}
