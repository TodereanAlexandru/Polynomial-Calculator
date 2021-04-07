//creare polinom
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


public class Polynom {

	public List<Monom> terms;

	public Polynom() {
		super();
		this.terms = new ArrayList<Monom>();  //creare polinom
	
	}

	public void addTerm(Monom nM) {
		boolean ok = false;
		for (Monom m : terms) {
			if (m.putere == nM.putere) {      //adaugare monoame in polinom
				m.coeficient += nM.coeficient;
				ok = true;
				break;
			}
		}
		if (ok == false) {
			terms.add(nM);
		}

	}

	
	public String toString() {
		String s = "";
		for(Monom m : terms) {
			s += m.toString(); 
		}
		return s;
	}
	
	public Polynom copy (){
		Polynom p = new Polynom();
		for(Monom m: terms)
			p.addTerm(new Monom(m.coeficient, m.putere));
		return p;
	}
	
	public List<Monom> sortare()                      
	{
	 // Collection.sort(terms);
		return terms;
	}

	
		
	}
	
