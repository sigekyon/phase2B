package ex.spring.practice.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lesson implements Serializable {
	private final static long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	private String name;
	
	// 1対多の場合は参照先の属性名をmappedByで指定する
	// 今はトランザクションを設定していないのでfetch = FetchType.EAGERを設定しておく
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "lesson", fetch = FetchType.EAGER)
	private List<Member> members = new ArrayList<Member>();

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

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

}
