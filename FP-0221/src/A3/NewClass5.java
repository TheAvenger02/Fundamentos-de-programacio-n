package A3;
public class NewClass5 {
    public static void main(String[] args) {
        // for(;;){
            for(int i=0;i<500;i++){
                if(i%5==0){
                    continue;
                }
                System.err.println(i);
            }
            /* sw tab
            switch (var) {
            case val:
                
                break;
            default:
                throw new AssertionError();
        } */
    }
}