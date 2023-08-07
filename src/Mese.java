import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Mese{
	InputStreamReader input=new InputStreamReader(System.in);
	BufferedReader tastiera= new BufferedReader(input);
	Declaration dec=new Declaration();
	private String lettere="abcdefghilmn";
	char codNum;
	
	public void confronta() {
		System.out.println("\nInserisci numero del mese (ex.5,12...:");
		dec.inputInt(tastiera);
		codNum=lettere.charAt(dec.num-1);
	}

}
