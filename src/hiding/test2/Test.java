package hiding.test2;

import hiding.test1.A;

public class Test {

	public static void main(String[] args) {

		A a = new A();		// public 으로 구성되어있는 A는 외부 패키지에서 사용할 수 있다.
		
//		B b = new B();		// 외부 패키지에서 사용 불가
		
	}

}

