package instruments;
//public enum Note {
//    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
//}
public class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()" + n);
    }
    String what() { return "Instrument"; }
    void adjust() {
        System.out.println("Adjusting Instrument"); }
}
