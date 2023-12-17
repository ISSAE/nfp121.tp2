package question2;


/**
 * Classe FahrenheitCelsius.
 * 
 * @author Ali.z
 * @version 17/12/2023
 */
public class FahrenheitCelsius{

     /**
     * Le point d'entree de cette application qui convertit les degres Fahrenheit en degres Celsius.
     * Prend les valeurs en degres Fahrenheit en tant qu'arguments de la ligne de commande.
     * Affiche les conversions correspondantes en degres Celsius.
     *
     * @param args un tableau de chaines (String) contenant les degres Fahrenheit à convertir
     */
     public static void main(String[] args){
       // Verifie s'il y a au moins un argument passe en ligne de commande
        if (args.length > 0) {
            for (String arg : args) {
                try {
                    int fahrenheit = Integer.parseInt(arg); // Convertit l'argument en entier
                    float celsius = fahrenheitEnCelsius(fahrenheit); // Appelle la methode de conversion
                    // Affiche la conversion
                    System.out.println(fahrenheit + "\u00B0F -> " + String.format("%.1f", celsius) + "\u00B0C");
                } catch (NumberFormatException nfe) {
                    System.out.println("error : Entrée non valide - " + nfe.getMessage());
                }
            }
        } else {
            System.out.println("Aucune valeur en degres Fahrenheit specifiee en ligne de commande.");
        }  
       
     }
     
    /**
     * Convertit les degres Fahrenheit en degrés Celsius.
     * 
     * @param f la valeur en degres Fahrenheit
     * @return la conversion en degres Celsius
     */
     public static float fahrenheitEnCelsius( int f){
        return ((float) 5 / 9) * (f - 32);
     }

}
