/**
 * Regex_4
 */
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_4 {
    public static void main(String[] args) {
        LinkedList<Persona> list = new LinkedList<>();
        list.add(new Persona("Thom"));
        list.add(new Persona("Roberto"));
        list.add(new Persona("Carlos"));
        list.add(new Persona("Juan"));
        list.add(new Persona("Thomas"));
        list.add(new Persona("Juana"));
        list.add(new Persona("Cantinflas"));
        list.add(new Persona("Anibal"));
        list.add(new Persona("Abel"));
        list.add(new Persona("Ana"));

        String search_1 ="%J%";
        search_1=search_1.toLowerCase();
        Pattern pr;
        // usando lógica de base de datos
        if(search_1.substring(search_1.length()-1).equals("%")
            && search_1.substring(0,1).equals("%")){
            search_1 = search_1.substring(1, search_1.length()-1);
            System.out.println(search_1);
            pr=Pattern.compile("[a-zA-Z]*("+search_1+")[a-z]*");
        }else if(search_1.substring(0,1).equals("%")){
            search_1 = search_1.substring(1, search_1.length()-1);
            pr = Pattern.compile("[a-zA-Z]*("+search_1+")$");
        }else{
            search_1 = search_1.substring(0,search_1.length()-1);
            pr = Pattern.compile("^("+search_1+")[a-z]*");
        }
        list.forEach(p->{
            Matcher mt = pr.matcher(p.getNombre().toLowerCase());
            if (mt.find()){
                System.out.println(p.getNombre());
            }
        });
    }
    
}
class Persona{
    private String nombre;
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
}