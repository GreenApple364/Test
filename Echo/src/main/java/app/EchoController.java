package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EchoController {

	@RequestMapping(value = "/")
	public String home(){
		return "echo";
	}
}
