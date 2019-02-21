/**
 * Regex_3
 */
public class Regex_3 {

    public static void main(String[] args) {
        System.out.println(validarNombre("Thom"));
        System.out.println(validarNombre("Thom Maurick"));

        System.out.println(validarEmail("thomtwd@gmail.com"));
    }
    static boolean validarEmail(String texto){
        return texto.matches("^([\\w-_.])+@[\\w]+\\.[\\w]{2,6}");
    }
    static boolean validarNombre(String texto){
        return texto.matches("^([A-Z]{1}[a-z]{2,}[\\s]?){1,2}$");
    }
}