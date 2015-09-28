package ex.spring.practice;

public class B_ServiceImpl implements B_Service {

	// DI対象
	private C_Repository c;

	// SpringがIDするのに必要なセッターを作成する
	public void setC(C_Repository c) {
		this.c = c;
	}

	@Override
	public long adjustment(String lessonName, int number) {
		System.out.println("研修名：" + lessonName + " 人数：" + number);
		long price = c.checkPrice(lessonName);
		
		return price * number;
	}

}
