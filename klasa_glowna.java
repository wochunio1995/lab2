package laboratorium2;

public class klasa_glowna {

public static void main (String[] args){	
	
	walec walec1 = new walec(5,2);
	walec walec2 = new walec(1,4);
	kula kula1 = new kula(2,4);
	kula kula2 = new kula(5,1);
	pret pret1 = new pret(4,12);
	pret pret2 = new pret(2,2);
	
	System.out.println(walec1);
	System.out.println(kula1);
	System.out.println(pret1);
	System.out.println();
	punkt[] tablica= new punkt[6];
	tablica[0]=walec1;
	tablica[1]=walec2;
	tablica[2]=kula1;
	tablica[3]=kula2;
	tablica[4]=pret1;
	tablica[5]=pret2;

for (int i =0; i<tablica.length; i++){
	System.out.println(tablica[i]);
}
	System.out.println();
	
for (int i =0; i<tablica.length; i++){
	System.out.println("Moment bezw³adnoœci wzgledem nowej osi wynosi: "+ tablica[i].obliczMomentPrzesuniety(5));
}

}
}
