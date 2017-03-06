package thedollarscommunity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "globalchat")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String nick;
	@Min(0)
	private long time;
	@NotNull
	private boolean isimage;

	private String msg;
	//private ByteArray img;

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

	//public ByteArray getImg() {
	//	return img;
	//}
	//public void setImg(ByteArray img) {
	//	this.img = img;
	//}

}
