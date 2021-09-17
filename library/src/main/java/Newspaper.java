public class Newspaper extends Item{
    private int count_article;

    Newspaper(String name, String author, int count_article) {
        super(name, author);
        this.count_article=count_article;
        this.type="Newspaper";
    }

    void print_info(){
        super.print_info();
        System.out.println("Count article: "+count_article);
    }
}

