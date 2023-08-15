public class ArrayDemo {
    public static void main(String[] args) {
        String [] isimler = {"Serdal AKYOL", "Merve DUYGU", "Resul Eren Emmez", "Malik Öztürk"} ; // Bu Kodlamada sayı işlemi sırası 1 den değil sıfırdan başlar !!

        int [] dogumYili = {2003,2001,2003,2003} ;
        long [] tcKimlikNo = {622,345,103,782};

        System.out.println("İsim Soyisim :  " +isimler[0]);
        System.out.println("Doğum Yılı: "+dogumYili[0]);
        System.out.println("TC SON 3 HANESİ : "+tcKimlikNo[0]);

        System.out.println("İsim Soyisim :  " +isimler[1]);
        System.out.println("Doğum Yılı: "+dogumYili[1]);
        System.out.println("TC SON 3 HANESİ : "+tcKimlikNo[1]);

        System.out.println("İsim Soyisim :  " +isimler[2]);
        System.out.println("Doğum Yılı: "+dogumYili[2]);
        System.out.println("TC SON 3 HANESİ : "+tcKimlikNo[2]);

        System.out.println("İsim Soyisim :  " +isimler[3]);
        System.out.println("Doğum Yılı: "+dogumYili[3]);
        System.out.println("TC SON 3 HANESİ : "+tcKimlikNo[3]);


        //String Tanım Değiştirme  //
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("İsim Soyisim :  " +isimler[1]);
        System.out.println(dogumYili[1]);
        dogumYili[1] = 2002;
        System.out.println("Doğum Tarihi Hatası !!!");
        System.out.println(dogumYili[1]);
    }


}
