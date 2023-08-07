import java.io.*;
public class Calcolo {

	public static void main(String Args[]) {
		String Codice="";
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera= new BufferedReader(input);
		Declaration dec=new Declaration();
		Lettere let=new Lettere();
		Data dat=new Data();
		Citta cit=new Citta();
		Genere gen=new Genere();
		System.out.println("Inserisci Cognome:");
		dec.inputString(tastiera);
		let.analizza(dec.nome);
		System.out.println("\nInserisci Nome:");
		dec.inputString(tastiera);
		let.analizza(dec.nome);
		System.out.println("\nInserisci anno della nascita (ex.2000,2004...):");
		dec.inputString(tastiera);
		dat.analizza(dec.nome);
		System.out.println("\nInserisci numero del giorno (ex.27,05...):");
		dec.inputString(tastiera);
		dat.analizza(dec.nome);
		System.out.println("\nInserisci Città di nascita:");
		dec.inputString(tastiera);
		cit.analizza(dec.nome);
		System.out.println("\nInserisci genere (m/f):");
		dec.inputString(tastiera);
		gen.MaschioFemmina(dec.nome);
		Codice=let.codNome +dat.codNum+ cit.codNomen+ gen.codGen;
		Codice=Codice.toUpperCase();
		System.out.print("\n"+ Codice);
		
	}

}
