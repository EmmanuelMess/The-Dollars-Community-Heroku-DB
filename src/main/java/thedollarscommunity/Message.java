package thedollarscommunity;

import javassist.bytecode.ByteArray;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	private String nick;
	private Long time;
	private Boolean isimage;
	private String msg;
	private ByteArray img;

	public Long getId() {
		return id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String isbn) {
		this.nick = isbn;
	}

	public String getTime() {
		return nick;
	}

	public void setTime(String isbn) {
		this.nick = isbn;
	}

	public String getIsImage() {
		return nick;
	}

	public void setIsImage(String isbn) {
		this.nick = isbn;
	}

	public String getMsg() {
		return nick;
	}

	public void setMsg(String isbn) {
		this.nick = isbn;
	}

	public String getImg() {
		return nick;
	}

	public void setImg(String isbn) {
		this.nick = isbn;
	}

}
