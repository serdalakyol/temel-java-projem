public class IfElseSwıtchDemo {
    public static void main(String[] args) {
        int saat= 1000;

        boolean ısTrue= saat < 1000;
        int saat2=1000;

        if (ısTrue){
            System.out.println("Saat Öğleden Önce ");
            if (saat == 1000);
            System.out.println("Günaydın");
        } else if (saat==1200) {
            System.out.println("Saat Öğle "); // Eğer Verilen komut eşit ise else ıf komutu kullanılır ilk olrak eşit durum ardından olumsu durum sisteme eklenir

        }else
            System.out.println("Öğleden Sonra");





        if (saat < 1200){
            System.out.println("Saat Öğleden Önce ");//Eğer Doğru Komut İse ıf Bölümü Çalışır
        }
        else {
            System.out.println("Öğleden Sonra"); // Eğer Yanlış olursa else komutu çalışır yeni bir değer tanımlanmasına gerek kalmaz !!
        }
        if(saat2 <1200){
            System.out.println("Saat Öğleden Önce ");
            if (saat==1000){
                System.out.println("Günaydın !!");
            } else if (saat2==1200) {
                System.out.println("Saat 12:00 Öğle Tatili)");

            }else {}
        }
    }



}



