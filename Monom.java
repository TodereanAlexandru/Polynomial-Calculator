//creare monom
public class Monom {

	public double coeficient;
	int putere;
  
	public Monom(double coeficient, int putere) {
		super();
		this.coeficient = coeficient;
		this.putere = putere;
	}

	public Monom() {
		super();
	}
	

	public String toString() {
		if(coeficient>=0)
		return "+"  +  coeficient +  "x^"  + putere ;   
		else                                        
			return coeficient  +  "x^"  + putere;
	}
}
	
