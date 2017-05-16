package app;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EchoForm implements Serializable{

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private String text;
	
	
}
