import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[]args) {
        HashSet<String> giochi = creaHashSet();
        System.out.println(giochi);
        String gioco = "Elden Ring";
        Iterator<String> it = giochi.iterator();
        while (it.hasNext()) {
            String i = it.next();
            if (i.equals(gioco)) {
                it.remove();
            }
        }
        System.out.println(giochi);
    }


    public static HashSet<String> giochi;
    public static HashSet<String> creaHashSet(){
        HashSet<String> giochi = new HashSet<>();
        giochi.add("Dark Souls");
        giochi.add("Elden Ring");
        giochi.add("Bloodborne");
        giochi.add("Lies Of P");
        giochi.add("Sekiro");
        return giochi;
    }
}
