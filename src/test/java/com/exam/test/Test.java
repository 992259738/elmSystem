package com.exam.test;
/**
*@author: cl
*@version : 2018年12月7日 下午2:42:18
*
*
*/
public class Test {
	public static void main(String[] args) {
		
//		char c = 0x000A;
//		System.out.println("Hello"+c+"world");
		
		//不存在的数
//		int num = new Integer(0);
//		if(num<0&&num==Math.abs(num)) {
//			System.out.println("Hello World!");
//		}else {
//			System.out.println("loser");
//			
//		}
		
		//	模棱两可的方法重载
//		invoke("");//Object
//		invoke(null);//Arrays
//	}
//	private static void invoke(Object obj) {
//		System.out.println("Object");
//	}
//
//	private static void invoke(int[] nums) {
//		System.out.println("Arrays");
	
		//number的计算问题
//		Number num = 12345+54321;		
//		System.out.println(num.intValue());//输出66666
		
		//陷阱
//		 Parrent p = new Parrent();
//	     Parrent c = new Child();
//	  
//	     System.out.println(p.getName());//Parrent
//	     System.out.println(c.getName());//Parrents
		
//		for(int i = 0; i <= 10; i++) {
//			Integer k = new Integer(i);
//			System.out.println("java puzzlers:"+k);
//		}
		
//	    char i = '2';
//	    System.out.println("i:"+i);
//		if(i!=i+0) {
//			System.out.println("Hello World!");
//		}else {
//			System.out.println("Loser");
//		}
		
		int num = 32;
		System.out.println(num>>=32);
	}
}
class Parrent {
    public static String getName() {
        return "Parrent";
    }
}
class Child extends Parrent {
    public static String getName() {
        return "child";
    }
}

