/**
 * Created by Дмитрий Шаталов on 7/21/2015.
 */
public class Arrays {
    public static void main(String[] args) {
        int k, j, i;
        int[] str1 = new int[5];
        int[] str2 = new int[15];
        int[] combined = new int[21];
        for (j = 0; j < 5; j++) {
            str1[j] = 50 + j;
        }
        for (k = 0; k < 15; k++) {
            str2[k] = 1 + k;
        }
        for (i = 0; i < 21; i++) {
            combined[k] = k < 6 ? str1[i] : str2[j];
        }
        System.out.println(java.util.Arrays.toString(combined));
    }
}
