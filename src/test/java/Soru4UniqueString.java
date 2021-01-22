import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Soru4UniqueString {
    public static void main(String[] args) {
        //String'den benzersiz deger nasil yazdirilir?

        String  str = "tteetccehchppteerrocopt";

        String tekrarsiz = "";
        for (int i=0; i<str.length(); i++){
            if(!tekrarsiz.contains(str.charAt(i)+"")){
                tekrarsiz=tekrarsiz+str.charAt(i);
            }
        }
        System.out.println(tekrarsiz);

        System.out.println("==========================");

        //2:Yol
        String noTekrar="";

        String arr[] = str.split("");

        for (String w:arr
             ) {
            if (!noTekrar.contains(w)){
                noTekrar=noTekrar+w;
            }

        }
        System.out.println(noTekrar);

        System.out.println("==========================");

        //3.Yol
        String keinTekrar="";

        Set<Character> setA = new HashSet<>();

        for (int k=0; k<str.length(); k++){
            setA.add(str.charAt(k));
            }
        System.out.println(setA);

        for (Character w:setA
             ) {
            keinTekrar=keinTekrar+w;
        }
        System.out.println(keinTekrar);

        System.out.println("==========================");

        //4.Yol
        String keinTekrar2="";

        LinkedHashSet<Character> lhset = new LinkedHashSet<>();

        for (int k=0; k<str.length(); k++){
            lhset.add(str.charAt(k));
        }
        System.out.println(lhset);

        for (Character w:lhset
        ) {
            keinTekrar2=keinTekrar2+w;
        }


        System.out.println(keinTekrar2);


        //4.Yol
        String keinTekrar2="";

        LinkedHashSet<Character> lhset = new LinkedHashSet<>();

        for (int k=0; k<str.length(); k++){
            lhset.add(str.charAt(k));
        }
        System.out.println(lhset);

        for (Character w:lhset
        ) {
            keinTekrar2=keinTekrar2+w;
        }


        System.out.println(keinTekrar2);

    }

}
