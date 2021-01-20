public class MentoringSoru {
    public static void main(String[] args) {

        //String'den benzersiz deger nasil yazdirilir?

        String  str = "tteetccehchppteerrocopt";

        String tekrarsiz ="";

        for (int i=0; i<str.length(); i++){
            if (!tekrarsiz.contains(str.charAt(i)+"")){
                tekrarsiz=tekrarsiz+str.charAt(i);
            }
        }
        System.out.println(tekrarsiz);
        System.out.println("====================");
        //2_Yol
        String noTekrar="";

        String arr[] = str.split("");

        for (String w:arr
             ) {
            if (!noTekrar.contains(w)) {
                noTekrar=noTekrar+w;
            }
        }
        System.out.println(noTekrar);


    }
}
