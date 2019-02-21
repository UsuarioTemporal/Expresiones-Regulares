/**
 * Regex_1
 */
public class Regex_1 {

    public static void main(String[] args) {
        System.out.println(validarDNI("134"));
        System.out.println(validarDNI("asdasdasd"));
        System.out.println(validarDNI("12345678"));
    }
    static boolean validarDNI(String dni){
        return dni.matches("[0-9]{8}");
    }
}