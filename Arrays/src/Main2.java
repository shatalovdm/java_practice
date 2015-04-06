/**
 * Created by Дмитрий Шаталов on 3/22/2015.
 */
public class Main2 {
    public static void main(String[] args) {
        String[][] str = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6; k++) {
                if (i == k){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
