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
	@NotEmpty
	private Long time;
	@NotEmpty
	private Boolean isimage;

	private String msg;
	private ByteArray img;

	public Long getId() {
		return id;
	}

	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}

	public boolean getIsImage() {
		return isimage;
	}
	public void setIsImage(boolean isimage) {
		this.isimage = isimage;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ByteArray getImg() {
		return img;
	}
	public void setImg(ByteArray img) {
		this.img = img;
	}

}
