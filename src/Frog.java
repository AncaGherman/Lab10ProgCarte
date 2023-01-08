class Amphibian {
    String name = "Frogy";
    public String toString() {
        return "I am an amhibian si ma numesc "+name;
    }
}

public class Frog extends Amphibian {
//    public Frog() {
//        this.name = "Broscuta";
//    }

    public static void main(String[] args) {
    Frog fr = new Frog();
    System.out.println(fr);
    }
}