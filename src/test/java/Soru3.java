import java.awt.*;
import java.util.*;

public class Soru3 {
    public static void main(String[] args) {
        //String'den benzersiz deger nasil yazdirilir?

        String  str = "tteetccehchppteerrocopt";


        String unique = "";
        for(int i=0; i<str.length(); i++){
            if(!unique.contains(str.charAt(i)+"")){
                unique= unique + str.charAt(i);
            }
        }
        System.out.println(unique);


        System.out.println("===============================");

        String  arr[] = str.split("");

        String tekrarsiz= "";
        for (String w: arr
             ) {
            if(!tekrarsiz.contains(w)){
                tekrarsiz= tekrarsiz + w;
            }
        }
        System.out.println(tekrarsiz);

        System.out.println("=========================");

        Set<Character> setC = new HashSet<>();

        for (int k=0; k<str.length(); k++){
            setC.add(str.charAt(k));
        }
        System.out.println(setC);


        System.out.println("=========================");

        LinkedHashSet<Character> lhset = new LinkedHashSet<>();
        for (int k=0; k<str.length(); k++){
            lhset.add(str.charAt(k));
        }
        System.out.println(lhset);

        String noTekrar="";

        for (Character w: lhset
             ) {
            noTekrar=noTekrar+w;
        }
        System.out.println(noTekrar);
  }
}