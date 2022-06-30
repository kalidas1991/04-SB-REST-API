package in.com.app.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private String passengerName;
	private String from;
	private String to;
	private Long trainNumber;
	private Long ticketNumber;
	private String trainClass;
	

}
