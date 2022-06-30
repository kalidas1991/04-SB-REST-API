package in.com.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.com.app.binding.Passenger;
import in.com.app.binding.Ticket;

@RestController
public class TicketRestController {

	@PostMapping(value = "/ticket", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passenger.getName());
		ticket.setFrom(passenger.getFrom());
		ticket.setTo(passenger.getTo());
		ticket.setTicketNumber((long) 1260);
		ticket.setTrainClass("Economy");
		ticket.setTrainNumber((long) 989898);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}

}
