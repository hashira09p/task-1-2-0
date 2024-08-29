/**
 * task120
 */
public class task120 {

    public static void main(String[] args) {
        /*int[] arr= {4,5,6};*/
        total(4,5,10);
    }

    public static void total(int... numbers){
        int totalNumberInArr = 0;
        for (int number : numbers) {
            totalNumberInArr += number;
            int totalInEachParameter =0;
            for(int i=1; i<=number; i++){
                totalInEachParameter += i;
            }
            System.out.println("Total sum for"+" "+number + ":" + " " +totalInEachParameter);
        }
        System.out.println("Total sum for all in the array parameter" + ":" + " " +totalNumberInArr);
    }
}
