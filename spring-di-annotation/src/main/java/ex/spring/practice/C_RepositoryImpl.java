package ex.spring.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c")
public class C_RepositoryImpl implements C_Repository {

	// 単価を表すフィールド
	// プロパティファイルの値を注入する
	@Value("${c.price}")
	private long price;

	@Override
	public long checkPrice(String lessonName) {
		return price;
	}
}
