import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {
             /*
    int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
    Verilen arrayi kullanarak asagidaki gibi bir list return eden bir method olusturun
    [arr'nin ilk elemani, arr'nin 2. ve 3. elemanlari toplami,
    arr'nin 4. 5. ve 6. elemanlari toplami, arr'nin 7. 8. 9. ve 10. elemanlari toplami ... ]
   */
        int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        add(arr);

    }
    public static void add(int arr[]){

        List<Integer> list = new ArrayList<Integer>();

        int i = 0;

        while (i<arr.length){

            int bas = i*(i+1)/2;
            int bit = (i+1)*(i+2)/2;

            if(bit>arr.length){
                break;
            }
            int sum= 0;
            for(; bas<bit; bas++){
                sum = sum + arr[bas];
            }
            list.add(sum);
            i++;
        }
        System.out.println(list);
    }

}
