package ex.spring.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b")
public class B_ServiceImpl implements B_Service {

	// DI対象に@Autowiredをつける
	// セッターもコンストラクタも不要（フィールドインジェクション）
	@Autowired
	private C_Repository c;

	@Override
	public long adjustment(String lessonName, int number) {
		System.out.println("研修名：" + lessonName + " 人数：" + number);
		long price = c.checkPrice(lessonName);

		return price * number;
	}

}
