package D;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DiscussionService {
	@Autowired
	private DiscussionRepository repository;
	
	public void addcomment(int commentid, String comment){
		Discussion c = new Discussion();
		c.setCommentId(commentid);
		c.setComment(comment);
		repository.save(c);
	}
}
