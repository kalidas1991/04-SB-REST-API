package in.com.app.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Passenger {

	private String name;
	private String email;
	private String from;
	private String to;
	private Long trainNumber;

}
