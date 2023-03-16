package D;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/comm")
public class DiscussionController {
	
	@Autowired
	DiscussionService service;
	
	@GetMapping("/add/{commentid}/{comment}")
	public void addcomm(@PathVariable int commentid, @PathVariable String comment) {
		service.addcomment(commentid, comment);
	}
}
