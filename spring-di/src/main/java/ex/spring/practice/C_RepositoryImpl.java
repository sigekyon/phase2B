package ex.spring.practice;

public class C_RepositoryImpl implements C_Repository {
	
	// 単価を表すフィールドを初期値
	private long price;
	
	// price用のセッター（値設定用のメソッド）
	// SpringがDIする際に利用
	public void setPrice(long price) {
		this.price = price;
	}
	
	@Override
	public long checkPrice(String lessonName) {
		return price;
	}
}
