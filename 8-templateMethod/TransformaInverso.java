
public class TransformaInverso extends TransformaTemplate {

	public String transforma(String texto) {
		return "Texto inverso: " + this.reverse(texto);
	}

	private String reverse(String o) {
	    String temporaria = "";
	    for (int i = o.length() - 1; i >= 0; i--)
	    	temporaria += o.charAt(i);
	    return temporaria;
  	}

}