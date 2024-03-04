import java.util.HashMap;
public class EjemploHasmap1 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Rosa Mauricia");
    m.put(921, "Amalla Talis");
    m.put(700, "Alan Brito");
    m.put(219, "Cesar vazquez");
    m.put(537, "Susana Marquez");
    m.put(605, "Esteban Quito");
    m.put(111, "Cindy Nero");

    System.out.println("Los elementos de m utilizando entryset son: \n"+ m.entrySet());

    for (int s: m.keySet()) {
      System.out.println(s+" = "+m.get(s));
    }
  }
}
