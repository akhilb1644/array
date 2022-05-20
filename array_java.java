package variables;

class array_java {
	public static void main(String[] args) {
		String[][] bjelbos = { /* House of Bjelbo. Birger Jarl was the man who expanded the expanded the settlment of Stockholm,
		                          which eventually led it to become the Swedish capital.*/
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
		
		String[][] estridsens = { /* The House of Estridsen was a Danish dynasty that gave Denmark many kings for a long time(from 11th century to 14th century.
		                             The House of Estridsen started with Sweyn II and ended with Queen Margaret I(you could argue Eric VII due to his adoption
					     by Margaret, which is not included in the array). Margaret united the Scandinavian Kingdoms into the Kalmar Union. For a
					     time, it was one of the European Great Powers of the Late Middle Ages, but Sweden left the Union a couple of times,, and
					     permanently left the Union in 1521 and was left under the leadership of Gustav Vasa.*/
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
		System.out.print(estridsens[12][2] + " campaigned against the Wends."); // Should print "Canute VI of Denmark campaigned against the Wends."
	}
}
