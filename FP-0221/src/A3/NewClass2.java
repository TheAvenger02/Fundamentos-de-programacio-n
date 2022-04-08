package A3;
public class NewClass2 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            // (Math.random() * ((max - min) + 1) + min
            // 50 - 90
            // (0 - 40) + 50
        // System.err.println( (int) (Math.random() * 2) );
            System.err.println( (int) (Math.random() * (90-50) + 50));
        }
    }
}