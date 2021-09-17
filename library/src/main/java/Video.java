public class Video extends Item{
    private int duration;

    Video(String name, String author, int duration) {
        super(name, author);
        this.duration=duration;
        this.type="Video";
    }

    void print_info(){
        super.print_info();
        System.out.println("Duration: "+duration);
    }
}

