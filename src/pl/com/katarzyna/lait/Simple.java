/**
 * 
 */
package pl.com.katarzyna.lait;

/**
 * @author KJ1  
 *
 */
public class Simple {

	/**
	 * @param args
	 */
	static int wiek = 33;
	static String imie = "Kasia";
	
	static int a = 3;
	static int b = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("To jest nasz nowy program");
        System.out.print("Nazywam si�: ");
        System.out.println(imie);
        System.out.println("D�ugo�� zmiennej; " + imie.length());
        System.out.print("Mam lat: ");
        System.out.println(wiek);
        
        //min�� rok
        wiek = wiek + 1;
        System.out.println("A po roku mam lat: " +wiek);
        
        System.out.println("A po roku mam: " +wiek + " lat");
        
        wiek++; // wiek= wiek+1
        
        System.out.println("A po roku mam: " +wiek + " lat");
        
        wiek--; // wiek=wiek-1
        
        System.out.println("A po roku mam: " +wiek + " lat");
        
        wiek+=1; 
        
        System.out.println("A po roku mam: " +wiek + " lat");
        
        wiek+=20; 
        
        log("A po roku mam: " +wiek + " lat");
        log("gruba kreska -----------------------------------------------------------------");
        
        log("Obliczona warto�� to: " + dodawanie(1,3));
        log(Integer.toString(dodawanie(3,6)));
        int abc = dodawanie(2,9);
        log(Integer.toString(abc));
        log(Integer.toString(odejmowanie(5,1)));
        
           if(czyRowne(10,10)){
        	   log("wewn�trz ifa - tak r�wne");
           }
           int q = 5;
           int r = 12;
           if(q==r)
           {
        	   log("rowne");
           }else
           {
        	   log("rozne");
           }
	}
         public static boolean czyRowne(int c, int d) {
	     if(c==d) 
	     {
	    	 log("a jednak r�wne");
	    	 return true;
	     }
	         else
	     {
	    	 log("niestety, nie");
	         return false;
	     }
}
	
	public static int dodawanie (int c, int d){
		
		//nieu�ywane zmienne:
		int wynik = a+b; //zmienne globalne zadeklarowane na samej g�rze 
		int wynik2 = c+d; //zmienne lokalne - przekazane w parametrach metody
        //System.out.print("wynik a+b: " + wynik);
        //System.out.println(" | wynik c+d: " + wynik2);
        //log("jakis tekst");
        // metoda jest typu INT - zwraca wynik oblicze� jako return wynik2
        // w zmiennej wynik2 zprzechowujemy wynik dzia�ania c+d
        
        //return wynik2; 
		//zamiast zwraca� zmienn� obliczamy wynik od razu
        return c+d;
        
	}
	
	public static int odejmowanie(int c, int d) {
		return c-d;
	}
		
	
	/**
	 * nasz ma�y logger - wy�wietli troch� lepiej ni� System.otu.println();
	 * @param txt - tekst do wy�wietlenia
	 */
	
	public static void log(String txt){
		System.out.print("---- log: ");
		System.out.print(txt);
		System.out.println(" ---- ");
	}
}
