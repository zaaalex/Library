public class Item {
    protected String name, author, type;

    Item (String name, String author){
        this.type="Empty";
        this.name=name;
        this.author=author;
    }

     void print_info(){
        System.out.println("Type: "+type+"\nName: "+name+"\nAuthor: "+author);
    }

}
