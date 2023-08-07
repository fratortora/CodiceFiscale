
public class Citta {
		private char z;
		public String codNomen="";
		public void analizza(String nome) {
			nome=nome.toLowerCase();
			char z=nome.charAt(0);
			if (z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
				codNomen=codNomen+z;
				}else {
					z=nome.charAt(1);
					if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
						codNomen=codNomen+z;
					}
				}
			z=nome.charAt(2);
			if (z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
				codNomen=codNomen+z;
				}else {
					z=nome.charAt(1);
					if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
						codNomen=codNomen+z;
					}
				}
			z=nome.charAt(3);
			if (z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
				codNomen=codNomen+z;
				}else {
					z=nome.charAt(4);
					if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
						codNomen=codNomen+z;
					}else {
						z=nome.charAt(5);
						if(z!='a'&& z!='e'&& z!='i'&& z!='o'&& z!='u') {
							codNomen=codNomen+z;
						}
						
					}
				}
				

			
		}
		
		
		

	}




