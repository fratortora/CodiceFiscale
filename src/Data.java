
class Data extends Mese{
	private char z;
	public String codNum="";
	public void analizza(String nome){
		for(int i=nome.length()-2;i<nome.length();i++) {
			z=nome.charAt(i);
			codNum=codNum+z;
			if (codNum.length()==2) {
				super.confronta();
				codNum=codNum+super.codNum;
			}
			}
		}
	}


