import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("TR", "Türkiye");
        countries.put("GR", "Germany");
        countries.put("US", "United States");
        countries.put("CA", "Canada");
        countries.put("CH", "China");

        System.out.println(countries);
        System.out.println("-----------------");


//        get() metodu keyii alır value'yi döner
        System.out.println(countries.get("TR"));
        System.out.println("-----------------");


        // remove() hem key hem de key+ value alabilir verilen değeri siler
        countries.remove("CA");
        System.out.println(countries);
        System.out.println("-----------------");

        // size() metodu HashMap'in boyutunu verir
        System.out.println(countries.size());
        System.out.println("-----------------");


        for (String country : countries.keySet()) {
            System.out.println(country);
        }
        System.out.println("-----------------");
        for (String country : countries.values()) {
            System.out.println(country);
        }
        System.out.println("-----------------");

        // replace() metodu verilen key'in value'sunu değiştirir
        countries.replace("US", "United States 2");
        System.out.println(countries);
        System.out.println("-----------------");

        // clear() metodu map^i temizler
        countries.clear();
        System.out.println(countries);
    }
}
