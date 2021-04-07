//setare butoane
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller  {

	private View view;

	public Controller(View view) {
		this.view = view;
		setupControl();
		setupControl2();
	    setupControl3();
	    setupControl4();
	    setupControl5();
	    
	}
	public void setupControl() {

		ActionListener calculSuma = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = view.getTextP1();
				String input1 = view.getTextP2();

				Pattern p = Pattern.compile( "(-?\\b\\d+)[xX]\\^(-?\\d+\\b)" );
				Matcher m = p.matcher( input );
				Matcher n = p.matcher( input1 );
				Polynom p1 = new Polynom();
				Polynom p2 = new Polynom();
				while (m.find()){
					p1.addTerm(new Monom(Double.parseDouble(m.group(1)),Integer.parseInt(m.group(2))));
				}
				while(n.find()){
					p2.addTerm(new Monom(Double.parseDouble(n.group(1)),Integer.parseInt(n.group(2))));
				}

				Polynom rez = Operation.addOperation(p1,p2);
				String result = rez.toString();
				result =  result.substring(0, result.length());
				view.updateResult(result);
			}

		};

		view.setButonSumaListener(calculSuma);
	}		
	
public void setupControl2(){
	ActionListener calculDiferenta = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String input = view.getTextP1();
			String input1 = view.getTextP2();

			Pattern p = Pattern.compile( "(-?\\b\\d+)[xX]\\^(-?\\d+\\b)" );
			Matcher m = p.matcher( input );
			Matcher n = p.matcher( input1 );
			Polynom p1 = new Polynom();
			Polynom p2 = new Polynom();
			while (m.find()){
				p1.addTerm(new Monom(Double.parseDouble(m.group(1)),Integer.parseInt(m.group(2))));
			}
			while(n.find()){
				p2.addTerm(new Monom(Double.parseDouble(n.group(1)),Integer.parseInt(n.group(2))));
			}

			Polynom rez = Operation.subtractOperation(p1,p2);
			String result = rez.toString();
		    result =  result.substring(0,result.length());
			view.updateResult(result);
	
		}

	};

 view.setButonDiferenta(calculDiferenta);
		
	
}

public void setupControl3(){
	ActionListener calculProdus = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String input = view.getTextP1();
			String input1 = view.getTextP2();

			Pattern p = Pattern.compile( "(-?\\b\\d+)[xX]\\^(-?\\d+\\b)" );
			Matcher m = p.matcher( input );
			Matcher n = p.matcher( input1 );
			Polynom p1 = new Polynom();
			Polynom p2 = new Polynom();
			while (m.find()){
				p1.addTerm(new Monom(Double.parseDouble(m.group(1)),Integer.parseInt(m.group(2))));
			}
			while(n.find()){
				p2.addTerm(new Monom(Double.parseDouble(n.group(1)),Integer.parseInt(n.group(2))));
			}

			Polynom rez = Operation.mulOperation(p1,p2);
			String result = rez.toString();
		    result =  result.substring(0,result.length());
			view.updateResult(result);
	
		}

	};

 view.setButonInmultire(calculProdus);
		
	
}

public void setupControl4(){
	ActionListener calculDerivata = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String input = view.getTextP1();
			Pattern p = Pattern.compile( "(-?\\b\\d+)[xX]\\^(-?\\d+\\b)" );
			Matcher m = p.matcher( input );
			Polynom p1 = new Polynom();
		 	while (m.find()){
		    	p1.addTerm(new Monom(Double.parseDouble(m.group(1)),Integer.parseInt(m.group(2))));
		 	}

			Polynom rez = Operation.derivarePol(p1);
			String result = rez.toString();
		    result =  result.substring(0,result.length());
			view.updateResult(result);
	
		}

	};

 view.setButonDerivare(calculDerivata);
		
	
}

public void setupControl5(){
	ActionListener calculIntegrare = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String input = view.getTextP1();
			Pattern p = Pattern.compile( "(-?\\b\\d+)[xX]\\^(-?\\d+\\b)" );
			Matcher m = p.matcher( input );
			Polynom p1 = new Polynom();
		 	while (m.find()){
		    	p1.addTerm(new Monom(Double.parseDouble(m.group(1)),Integer.parseInt(m.group(2))));
		 	}
		 	
			Polynom rez = Operation.integrarePol(p1);
			String result = rez.toString();
		    result =  result.substring(0,result.length());
			view.updateResult(result);
	
		}

	};

 view.setButonIntegrare(calculIntegrare);
		
	
}

	

	public static void main(String[] args) {
		View view = new View();
		Controller c = new Controller(view);
		
	}
}
