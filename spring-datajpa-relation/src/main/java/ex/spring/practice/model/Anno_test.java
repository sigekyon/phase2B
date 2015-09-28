package ex.spring.practice.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Anno_test implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // 主キーとなるフィールドを表す
	@GeneratedValue(
			strategy = GenerationType.IDENTITY) // 自動採番列による主キー生成
	private long id;
	
	@Temporal(TemporalType.DATE) // 日付型として格納
	private Date date;
	
	@Temporal(TemporalType.TIME) // 時刻型として格納
	private Date time;
	
	@Temporal(TemporalType.TIMESTAMP) // 
	private Calendar timeStamp;
	
	@Lob // CLOB型として格納
	public String largeString;
	
	@Lob // BLOB型として格納
	private byte[] largeArray;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Calendar getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Calendar timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getLargeString() {
		return largeString;
	}

	public void setLargeString(String largeString) {
		this.largeString = largeString;
	}

	public byte[] getLargeArray() {
		return largeArray;
	}

	public void setLargeArray(byte[] largeArray) {
		this.largeArray = largeArray;
	}
	
	

}
