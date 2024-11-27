import java.util.HashMap;
import java.util.Scanner;
public class MyHashMap {
    public static void main(String[] args){

        /*HashMap<Integer, String> hash = new HashMap<>();

        hash.put(1000, "Santi");
        hash.put(5000,"Que pasa");
        System.out.println(hash);
        System.out.println(hash.get(1000));
        System.out.println(hash.remove(5000));
        System.out.println(hash.containsKey(1000));
        System.out.println(hash.containsValue("Santi"));*/

        HashMap< String, Integer  > hash = new HashMap<>();
        Scanner in = new Scanner(System.in);
        
        String mas ="";
        String n_producto = "";
        int p_producto = 0, c_producto = 0;



        System.out.print("Quieres ingresar producto(s/n):");
        mas=in.nextLine();
        
        while(mas.equalsIgnoreCase("s")){
            System.out.print("Ingresa nombre producto:");
            n_producto=in.nextLine();
            System.out.print("Ingresa precio producto:");
            p_producto=in.nextInt();
            in.nextLine();
            
            hash.put(n_producto, p_producto);
            System.out.println(hash);
            System.out.print("Quieres ingresar producto(s/n):");
            mas = in.nextLine();
        }
            


    }
}

