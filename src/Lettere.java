public class Lettere {
	private char z;
	public String codNome="";
	public void analizza(String nome) {
		nome=nome.toLowerCase();
		char z=nome.charAt(0);
		if (z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
			codNome=codNome+z;
			}else {
				z=nome.charAt(1);
				if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
					codNome=codNome+z;
				}
			}
		z=nome.charAt(2);
		if (z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
			codNome=codNome+z;
			}else {
				z=nome.charAt(1);
				if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
					codNome=codNome+z;
				}
			}
		z=nome.charAt(3);
		if (z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
			codNome=codNome+z;
			}else {
				z=nome.charAt(4);
				if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
					codNome=codNome+z;
				}else {
					z=nome.charAt(5);
					if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
						codNome=codNome+z;
					}
					
				}
			}
			

		
	}
	
	
	

}


 