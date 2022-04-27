public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("MEHMETHAN",80,100,20,60);
        Fighter f2 = new Fighter("IBRAHIM", 80,110,15,50);

        Match match1 = new Match(f1, f2);
        match1.run();
    }
}
