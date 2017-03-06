package thedollarscommunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

	private BookRepository repository;

	@Autowired
	public BookController(BookRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Message> get(@PathVariable("id") Long id) {
		Message message = repository.findOne(id);
		if (null == message) {
			return new ResponseEntity<Message>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Message>(message, HttpStatus.OK);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ResponseEntity<Message> update(@RequestBody Message message) {
		repository.save(message);
		return get(message.getId());
	}

	@RequestMapping
	public List<Message> all() {
		return repository.findAll();
	}
}
