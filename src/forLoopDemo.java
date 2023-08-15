public class forLoopDemo {
    public static void main(String[] args) {
        for (double  i = 0; i<=10; i+=0.25){
            System.out.println(i);    // for döngüdür for içine int eklenir ve bir integer tanımlanır ardından i sayısının kaça kadar loop a devam edileceği tanımlanır ve sistemem yazdılırılır
        }

        System.out.println("-----------------------------------------------");

        int sayfa= 5;
        for (int i = 0; i < sayfa; i++){
            System.out.println("Sayfa Sayısı "+i);
            if (i == 3){
                System.out.println("Koşul Sağlandı: "+ i);
                break;  // koşul sağlandıysa ve loop sonlandırılması gerekiyorsa break komutu sona eklenir.
            }
            System.out.println("-----------------------------------------------");

            String[] isimler = {"Serdal","Merve","Eren","Malik"};

            for (int i1 =0; i<isimler.length; i++){
                System.out.println("Listedeki İsimler: "+isimler[i]);

            }
            System.out.println("-----------------------------------------------");

            for (String isim:isimler){
                System.out.println("Gelişmiş Döngü İle İsimler:  " + isim);
            } // gelişmiş döngü sistemi


        }
    }
}
