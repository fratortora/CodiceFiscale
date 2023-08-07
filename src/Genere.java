
public class Genere {
	private boolean f=false;
	public String codGen="";
	public void MaschioFemmina(String scelta) {
		do {
		String s=scelta.toLowerCase();
		char t=s.charAt(0);
		if(t=='m') {
			codGen=codGen+"m";
			f=true;
		}if (t=='f'){
			codGen=codGen+"f";
			f=true;
		}if(t!='m'&& t!='f') {
			System.out.println("valore non valido reinserisci (m/f):");
			f=false;
		}
	}while(f=false);
	}

}
