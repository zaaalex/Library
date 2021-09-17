public class Main {
    public static void main(String[] args){
        Library library = new Library();
        Book b = new Book ("B1","Au1", 150);
        Video v = new Video ("V1","Au2", 150);
        Newspaper n = new Newspaper ("N1","Au1", 150);
        library.add(b);  library.add(v);  library.add(n);
        library.give("Au1");
    }
}
