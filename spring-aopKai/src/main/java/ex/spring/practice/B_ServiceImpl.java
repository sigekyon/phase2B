package ex.spring.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("b")
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

	@Override
	public void errortest() throws IllegalArgumentException {
		throw new IllegalArgumentException("テスト引数不正例外");
	}

}
