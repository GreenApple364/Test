package app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EchoController {

	@RequestMapping(value = "/")
	public String home(){
		return "echo";
	}
	
	@RequestMapping(value="/add")
	public String add(EchoForm echoForm,Model model){
		
		model.addAttribute("text", echoForm.getText());
		
		return "echo";
	}
}
