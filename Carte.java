import java.util.ArrayList;
import java.util.Scanner;
class Carte{
    private String titlu;
    private String autor;

    //CONSTRUCTOR
    public Carte(String titlu, String autor){
        this.titlu=titlu;
        this.autor=autor;
    }

    //METODA pentru afisarea informatiilor despre carte
    public void afisareDetaliiCarte(){
        System.out.println("Titlu: "+titlu);
        System.out.println("Autor: "+autor);
    }

    //METODA pentrue a verifica daca titlul cartii contine un anumit sir de caractere
    public boolean contineTitlu(String textCautat){
        return titlu.contains(textCautat);
    }
}
