import java.io.BufferedReader;

public class Declaration {
	private String leggiNumero;
	public int num;
	public String nome;
	public void inputInt(BufferedReader tastiera) {
		try {
			leggiNumero=tastiera.readLine();
			num=Integer.valueOf(leggiNumero).intValue();
		}
		catch(Exception Menu) {
			System.out.println("Dato non valido!!");
			return;
		}
	}
	public void inputString(BufferedReader tastiera) {
		try {
			leggiNumero=tastiera.readLine();
			nome= String.valueOf(leggiNumero);
		}
		catch(Exception Menu) {
			System.out.println("Dato non valido!!");
			return;
		}
	}

}

