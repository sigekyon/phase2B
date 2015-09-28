package ex.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A_Client {
	public static void main(String[] args) {

		// Bean設定ファイルを指定してアプリケーションコンテキスト（DIコンテナへの入り口）を得る
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/application-context.xml");

		// DIコンテナより"b"という名前のBeanを取得する
		// 実装クラスではなくインタフェースのB_Serviceしか記載はない
		B_Service b = (B_Service) context.getBean("b");

		// 後は元の処理と同じ
		long total = b.adjustment("Java研修", 8);
		System.out.println("合計:￥" + total);
		
		// 例外ハンドラの確認用
		try {
			b.errortest();
		} catch (Exception e) {
			//　通常の例外時の処理
			//　e.printStackTrace();
		}
	}
}
