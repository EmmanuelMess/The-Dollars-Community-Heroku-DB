package thedollarscommunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

	private MessageRepository repository;

	@Autowired
	public MessageController(MessageRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Message> get(@PathVariable("id") Long id) {
		Message message = repository.findOne(id);
		if (message == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ResponseEntity<Message> update(@RequestBody Message message) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd'T'HH:mm:ss'.0+00:00'");
		message.setTime(sdf.format(new Timestamp(System.currentTimeMillis())));
		repository.save(message);
		return get(message.getId());
	}

	@RequestMapping
	public List<Message> all() {
		return repository.findAll();
	}
}
