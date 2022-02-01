import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Ross", "Apple");
        favouriteFruits.put("Adam", "Mango");
        favouriteFruits.put("Maike", "Passion Fruit");

//        System.out.println(favouriteFruits.get("Adam"));

        HashMap<String, Integer> populations = new HashMap();
        populations.put("UK", 64100000);
        populations.put("Germany", 80620000);
        populations.put("France", 66030000);
        populations.put("Japan", 127300000);

        System.out.println(populations.get("Japan"));
        System.out.println(populations.keySet());
        System.out.println(populations.values());
    }
}
