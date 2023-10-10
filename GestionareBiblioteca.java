import java.util.ArrayList;
import java.util.Scanner;
//CLASA principala a aplicatiei
public class GestionareBiblioteca{
    public static void main(String[] args){
        ArrayList<Carte> listaCarti=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        int optiune;
    do{
        //Afisam meniul
        System.out.println("\n- - - - MENIU - - - -");
        System.out.println("1. Adaugare carte");
        System.out.println("2. Listare carti");
		System.out.println("3. Afisare numar total carti");
        System.out.println("4. Cautare carte dupa titlu");
        System.out.println("5. Iesire");
        System.out.println("- - - - - - - - - - -");
        System.out.print("Selectati optiunea: ");
        optiune=s.nextInt();
        s.nextLine(); //consumam newline

        switch(optiune){
            case 1:
            //adaugare carte noua
                System.out.println("\nIntroduceti titlul cartii: ");
                String titluCarte = s.nextLine();
                System.out.println("\nIntroduceti autorul cartii: ");
                String autorCarte=s.nextLine();
                Carte carte=new Carte(titluCarte, autorCarte);
                listaCarti.add(carte);
                System.out.println("\nCarte adaugata cu succes!");
                break;
            case 2:
            //listat toate cartile
                if(listaCarti.isEmpty()){
                    System.out.println("\nNu exista carti in lista!");
                }else{
                System.out.println("\n- - - - Lista de carti - - - -");
                for(Carte c: listaCarti){
                    c.afisareDetaliiCarte();
                    System.out.println("- - - - - - - - - - - - - - -");
                }
            }
                break;
			case 3:
			//afisare nr total de carti din lista 
			if(listaCarti.isEmpty()){
                    System.out.println("\nNu exista carti in lista!");
                }else{
					int nrTotal=listaCarti.size();
					System.out.println("\nNumarul total de carti este: "+nrTotal);
				}
				break;
            case 4:
            //cauta carte dupa titlu
                System.out.println("\nIntroduceti titlul cartii cautate: ");
                String titluCautat=s.nextLine();
                System.out.println("\n- - - - Rezultate cautare - - - -");
                boolean gasit=false;
                for(Carte c:listaCarti){
                    if(c.contineTitlu(titluCautat)){
                        c.afisareDetaliiCarte();
                        gasit=true;
                        System.out.println("- - - - - - - - - - - - - - - -");
                    }
                }
                if(!gasit){
                    System.out.println("Nu s-a gasit nici o carte cu titlul specificat!");
                    System.out.println("- - - - - - - - - - - - - - - - - -");
                }
                break;
            case 5:
            //iesire din aplicatie
                System.out.println("\nLA REVEDERE!");
                break;
            default:
                System.out.println("Optiune invalida! Incercati din nou.");
                break;
        }
    }while(optiune!=5);
}
}