/**
 * Regex_1
 */
public class Regex_1 {

    public static void main(String[] args) {
        System.out.println(validarDNI("134"));
        System.out.println(validarDNI("asdasdasd"));
        System.out.println(validarDNI("12345678A"));
    }
    static boolean validarDNI(String dni){
        return dni.matches("^[0-9]{8}[a-zA-Z]$");
    }
}