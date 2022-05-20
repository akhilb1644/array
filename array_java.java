package variables;

class array_java {
	public static void main(String[] args) {
		String[][] bjelbos = {
				{"Birger Jarl","Regent","Sweden"},
				{"Valdemar I","King","Sweden"},
				{"Magnus III","King","Sweden"},
				{"Birger","King","Sweden"},
				{"Magnus IV","King","Sweden"},
				{"Eric XII","Co-King","Sweden"},
				{"Magnus VII","King","Norway"},
				{"Haakon VI","King","Norway"},
				{"Olaf II","King","Denmark"},
				{"Olaf IV","King","Norway"}
		};
		
		String[][] estridsens = {
				{"Sweyn II","King","Denmark"},
				{"Harald III","King","Denmark"},
				{"Canute IV","King","Denmark"},
				{"Olaf I","King","Denmark"},
				{"Eric I","King","Denmark"},
				{"Niels","King","Denmark"},
				{"Magnus I","King","Sweden"},
				{"Eric II","King","Denmark"},
				{"Eric III","King","Denmark"},
				{"Sweyn III","Co-King","Denmark"},
				{"Canute V","Co-King","Denmark"},
				{"Valdemar I","King","Denmark"},
				{"Canute VI","King","Denmark"},
				{"Valdemar II","KIng","Denmark"},
				{"Eric IV","King","Denmark"},
				{"Abel","King","Denmark"},
				{"Christopher I","King","Denmark"},
				{"Eric V","King","Denmark"},
				{"Eric VI","King","Denmark"},
				{"Christopher II","King","Denmark"},
				{"Valdemar IV","King","Denmark"},
				{"Margaret I","Queen","Denmark"},
				{"Margaret I","Queen","Norway"},
				{"Margaret I","Queen","Sweden"}
		};
		
		System.out.print(estridsens[12][0] + " of ");
		System.out.print(estridsens[12][2] + " campaigned against the Wends.");
	}
}
