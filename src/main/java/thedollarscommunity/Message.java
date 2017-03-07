package thedollarscommunity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "globalchat")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String nick;
	@NotNull
	private Timestamp time;
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

	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
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
