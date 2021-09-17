public class Book extends Item{
    private int count_page;

    Book(String name, String author, int count_page) {
        super(name, author);
        this.count_page=count_page;
        this.type="Book";
    }

    void print_info(){
        super.print_info();
        System.out.println("Count_page: "+count_page);
    }
}
