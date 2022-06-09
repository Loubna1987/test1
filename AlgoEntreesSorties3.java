import java.lang.*;
import java.util.Scanner; //import de la classe Scanner que l'on va utiliser après.
​
​
class AlgoEntreesSortiess{
​
​
	public static void main(String[] args) {
	
​
	// Exemple de réalisation de LIRE en Java
	
	Scanner clavier = new Scanner(System.in);
	
	System.out.println("Entrez votre Prénom :");
	String prenom;
	prenom = clavier.nextLine();//récupérer une chaine de caractères
	System.out.println ("Bonjour " + prenom );
​
	int numero ;
	System.out.println("Lequel ?");
	
	numero = clavier.nextInt(); 
	clavier.nextLine();
	System.out.println ("Bonjour " + prenom + " numéro " + numero);
​
	System.out.println("Entrez\n votre Prénom :");
	prenom = clavier.nextLine();//récupérer une chaine de caractères
	System.out.println ("Bonjour " + prenom );
​
	}
	
}