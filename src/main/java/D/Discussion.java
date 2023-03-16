package D;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@NamedQuery(name="Discussion.findAll", query="SELECT d FROM Discussion d")
public class Discussion implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int commentid;

	private String comment;

	public Discussion() {
	}

	public int getCommentId() {
		return this.commentid;
	}

	public void setCommentId(int commentid) {
		this.commentid = commentid;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
