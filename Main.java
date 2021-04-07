//testare operatii
public class Main {

	public static void main(String[] args) {
	
			Polynom p1 = new Polynom();
			Polynom p2 = new Polynom();
			
			Monom m1 = new Monom (3, 2);
			Monom m2 = new Monom (2, 1);
			Monom m3 = new Monom (-1, 0);
			
			p1.addTerm(m1);
			p1.addTerm(m2);
			p1.addTerm(m3);
			
			Monom m4 = new Monom(5, 1);
			Monom m5 = new Monom(2, 0);
			
			p2.addTerm(m4);
			p2.addTerm(m5);
			
			
			
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			Operation s1=new Operation();
			Operation s2=new Operation();
			Operation s3=new Operation();
		//	System.out.println(s1.addOperation(p1, p2));
		//	System.out.println(s2.subtractOperation(p1, p2));
			//System.out.println(s3.mulOperation(p1, p2));
		//	System.out.println(s2.derivarePol(p1));
		//	System.out.println(s2.integrarePol(p2));
			
			

	}

}
