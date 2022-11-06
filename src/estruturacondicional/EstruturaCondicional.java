package estruturacondicional;

public class EstruturaCondicional {
	public static void main(String[] args) {
		
		int hora = 19;
		
		if(hora <= 12) {
			System.out.println("Bom dia");
		}
		else {
			if(hora < 18 && hora > 12)
			System.out.println("Boa tarde");
			else {
				System.out.println("Boa noite");
			}
		}
	}
}
