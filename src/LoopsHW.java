public class LoopsHW {

    //Proje
    //"Hello World" Yazımı Mevcut
    //Bu Seçim İçerisinde ki o'ları 0 ile Değiştir

    public static void main(String[] args) {
        String hello=("Hello World");
        int stringUzunlugu = hello.length();
        int index=0;
        String yenıStrıng="";

        while (index<stringUzunlugu){
            char bulunanKarakter = hello.charAt(index);
            if (bulunanKarakter == 'o'){
                yenıStrıng=yenıStrıng +0;
            }else{
                yenıStrıng=yenıStrıng+bulunanKarakter;
            }
            index++;
        }
        System.out.println(yenıStrıng);
    }

}
