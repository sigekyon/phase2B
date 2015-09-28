package ex.spring.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * エンティティクラスであることを宣言するため
 * @Entityをクラスに対して付与する
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Member.testSelect", query = "SELECT m FROM Member m WHERE m.id = :id")
})
public class Member {

	@Id // 主キーとなるフィールドを表す
	@GeneratedValue(
			strategy = GenerationType.IDENTITY) // 自動採番列による主キー生成
	private long id;

	// エンティティクラス内のフィールドは基本的に１対１でDBカラムと対応する
	private String name;
	private String mail;

	@Transient // DB対象外のフィールドには@Transientを付与する
	private String memo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
