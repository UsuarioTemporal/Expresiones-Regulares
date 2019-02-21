/**
 * Regex_2
 */
public class Regex_2 {

    public static void main(String[] args) {
        // Validar si es un número entero
        System.out.println(validarNumeroEntero("asdasd"));
        System.out.println(validarNumeroEntero("12as"));
        System.out.println(validarNumeroEntero("-asd"));
        System.out.println(validarNumeroEntero("-5"));
        System.out.println(validarNumeroEntero("54"));

        // validar si es un número entero negativo

        System.out.println(validarNumeroEnteroNegativo("texto"));
        System.out.println(validarNumeroEnteroNegativo("45"));
        System.out.println(validarNumeroEnteroNegativo("-1"));

        // validar si es un número entero positivo
        System.out.println(validarNumeroEnteroPositivo("texto"));
        System.out.println(validarNumeroEnteroPositivo("-156"));
        System.out.println(validarNumeroEnteroPositivo("452"));

        // validar si es un número real
        System.out.println(validarNumeroReal("155"));
        System.out.println(validarNumeroReal("-155"));
        System.out.println(validarNumeroReal(".155"));
        System.out.println(validarNumeroReal("-.155"));
        System.out.println(validarNumeroReal("-1."));
        System.out.println(validarNumeroReal("-1,"));
        System.out.println(validarNumeroReal("-1,sad"));
        System.out.println(validarNumeroReal("-1,24"));
        System.out.println(validarNumeroReal("1.24"));


        // validar si es un número real positivo

        System.out.println(validarNumeroRealPositivo("546"));
        System.out.println(validarNumeroRealPositivo(".546"));
        System.out.println(validarNumeroRealPositivo("-4.546"));
        System.out.println(validarNumeroRealPositivo("4.546"));
        System.out.println(validarNumeroRealPositivo("4.546"));

    
    }
    static boolean validarNumeroEntero(String texto){
        return texto.matches("^-?[0-9]+$");
    }
    static boolean validarNumeroEnteroPositivo(String texto){
        return texto.matches("^[0-9]+$");
    }
    static boolean validarNumeroEnteroNegativo(String texto){
        return texto.matches("^-[0-9]+$");
    }
    static boolean validarNumeroReal(String texto){
        return texto.matches("^-?([0-9])*[\\.,]?[0-9]+$");
    }
    static boolean validarNumeroRealPositivo(String texto){
        return texto.matches("^([0-9])*[\\.,]?[0-9]+$");
    }
    static boolean validarNumeroRealNegativo(String texto){
        return texto.matches("^-([0-9])*[\\.,]?[0-9]+$");
    }

    static boolean validarDoublePositivo(String texto){
        return texto.matches("^[0-9]*[\\.,][0-9]+$");
    }
    static boolean validarDoubleNegativo(String texto){
        return texto.matches("^-[0-9]*[\\.,][0-9]+$");
    }
    static boolean validarNombreComplejo(String texto){
        return texto.matches("^([A-Z]{1}[a-z]{2,}[ ]?){1,2}$");
    }
}