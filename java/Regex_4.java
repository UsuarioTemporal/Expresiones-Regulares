/**
 * Regex_4
 */
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.scene.shape.PathElement;

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

        String search_1 ="as%";
        Pattern pr;
        // usando lógica de base de datos
        if(search_1.substring(search_1.length()-1).equals("%")
            && search_1.substring(0).equals("%")){
            pr = Pattern.compile("");
        }else if(search_1.substring(0).equals("%")){
            pr = Pattern.compile("^("+search_1.substring(0,search_1.length()-1)+")[a-z]*");
        }else{
            pr = Pattern.compile("[a-z]*("+search_1.substring(0,search_1.length()-1)+")$");
        }
        list.forEach(p->{
            Matcher mt = pr.matcher(p.getNombre());
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