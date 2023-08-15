import java.util.Locale;

public class FırstStrıngDemo {
    public static void main(String[] args) {
        String ilkMetin = "Test Otomasyonu";
        System.out.println(ilkMetin);
        String isimSoyisim = "İsim:Serdal  Soyisim:Akyol ";
        System.out.println(isimSoyisim);

        int metinUzunlugu = ilkMetin.length(); //Toplam Karakter Sayısını Gösterir //

        System.out.println(isimSoyisim + " /Toplam Karakter Sayısı=" + metinUzunlugu);

        String kucukHarf = ilkMetin.toLowerCase(); //Tüm Metni Küçük Harf Yazar //
        System.out.println(kucukHarf);

            String buyukHarf = ilkMetin.toUpperCase(); //Tüm Metni Büyük Harf Yazar //
        System.out.println(buyukHarf);

        System.out.println(kucukHarf + "    /   " +buyukHarf);
        System.out.println(kucukHarf+"  /   "+buyukHarf+"   /   "+metinUzunlugu);

        String newString = "Yılın En Çok Satın Alınan \"Arabası\" Mercedes Benz"; //    Bir Metinin İçersine Tırnak İşareti Konmak İsteniyorsa altgr soru işareti tuşuna basılarak ters slash eklenir //
        System.out.println(newString);
        String newString2 = "Yılın En Çok Satın Alınan \n\"Arabası\" Mercedes Benz"; // Ters slash önüne ters slash n yazılırsa tırnak içine alınan kısım bir alt kısıma geçerek yer bir satır oluşturur //
        System.out.println(newString2);

    }
}
