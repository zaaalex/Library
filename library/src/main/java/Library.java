import java.util.ArrayList;

public class Library {
    public void add (Item i){
        list.add(i);
        System.out.println("[INFO] "+i.type +" add");
    }
    public void give(String author){
        System.out.println("[INFO] Search object with author " + author + " is started");
        boolean is_find=false;
        for (Item el:list){
            if (el.author==author) {
                is_find=true;
                System.out.println("[INFO] Object with author " + author + " find!");
                el.print_info();
            }
        }
        if (!is_find) System.out.println("The library doesn't have materials from author "+author);
        System.out.println("[INFO] Search object with author " + author + " is completed");
    }

    private ArrayList<Item> list = new ArrayList<Item>();
}
