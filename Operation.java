
public class Operation {
	
	public static Polynom addOperation (Polynom p1, Polynom p2){
		 Polynom rez = p1.copy();
		for(Monom m: p2.terms)
			rez.addTerm(m);
		return rez;
	}
	
	public static Polynom subtractOperation (Polynom p1, Polynom p2){
		Polynom rez = p2.copy();
		Polynom copyP1 = p1.copy();
		for(Monom m: copyP1.terms){
			m.coeficient *= -1;
			rez.addTerm(m);
		}	
		return rez;
	}
	
	public static Polynom mulOperation(Polynom p1,Polynom p2){
		Polynom rez= new Polynom();		
		for(Monom m: p1.terms ){
			for(Monom n: p2.terms){
				rez.addTerm(new Monom(m.coeficient*n.coeficient, m.putere+n.putere));		
			}
		}
		
		return rez;
	}
	public static Polynom derivarePol( Polynom p1)
	{
		Polynom x= new Polynom();
		for ( Monom m : p1.terms )
			if ( m.putere > 0 )
				 x.addTerm( new Monom ( m.coeficient*m.putere , m.putere-1));
		return x;
	}
	public static Polynom integrarePol( Polynom p1)
	{
		Polynom x = new Polynom();
		for ( Monom m : p1.terms )
			x.addTerm(new Monom( m.coeficient /(m.putere+1) , m.putere+1));
		return x;
	}
	
	

}
