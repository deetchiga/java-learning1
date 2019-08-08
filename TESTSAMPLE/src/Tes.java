import java.security.PrivateKey;
import java.util.*;

public class Tes {
    Integer a;
    String s;

    public Tes(Integer a,String s) {
        this.a = a;
        this.s = s;
    }

    public Integer getI() {
        return a;
    }

    public String gets() {
        return s;
    }

    public static void main(String args[]) {
        List<Tes> list = new ArrayList<Tes>();

        list.add(new Tes (1,"ss"));
        list.add(new Tes(2,"qq"));
        list.add(new Tes(3,"ww"));
        list.add(new Tes (4,"ll"));
        list.add(new Tes (5,"hh"));

        Map<Integer, String> map = new HashMap<>();

        for (Tes q : list) {
            map.put(q.getI(), q.gets());
        }

        System.out.println("Map  : " + map);
        //
        //Iterator iterator = list.iterator();

        //System.out.println("List elements : ");

        //while (iterator.hasNext())
        //    System.out.print(iterator.next() + " ");

        //System.out.println();
    }

}