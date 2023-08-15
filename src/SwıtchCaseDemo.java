public class SwıtchCaseDemo {
    public static void main(String[] args) {
        int sayi=1;
        switch (sayi){
            case 1:
                System.out.println("Verilen Sayı 1 e Eşittir");
                break;
            case 2:
                System.out.println("Verilen Sayı 2 ye Eşittir");
                break;
            default:
                System.out.println("Sayı 1 veua 2 ye Eşit Değildir");
        }

        int bulundugumuzAy=10;
        switch (bulundugumuzAy){
            case 1:
                System.out.println("Bulunduğumuz Ay Ocaktır");
                break;
            case 2:
                System.out.println("Bulunduğumuz Ay Şubattır");
                break;
            case 3:
                System.out.println("Bulunduğumuz Ay Marttır");
                break;
            case 4:
                System.out.println("Bulunduğumuz Ay Nisandır");
                break;
            case 5:
                System.out.println("Bulunduğumuz Ay Mayıs");
                break;
            case 6:
                System.out.println("Bulunduğumuz Ay Haziran");
                break;
            case 7:
                System.out.println("Bulunduğumuz Ay Temmuz");
                break;
            case 8:
                System.out.println("Bulunduğumuz Ay Ağustos");
                break;
            case 9:
                System.out.println("Bulunduğumuz Ay Eylül");
                break;
            case 10:
                System.out.println("Bulunduğumuz Ay Ekim");
                break;
            case 11:
                System.out.println("Bulunduğumuz Ay Kasım");
            break;
            case 12:
                System.out.println("Bulunduğumuz Ay Aralıktır");
            default:
                System.out.println("Yanlış Tuşlama Yaptınız");

                String browser = "Chrome";
                switch (browser){
                    case "Chrome":
                        System.out.println("Chrome Browserını Başlat");
                        //webdriver.startDriver.start.Chrome
                        break;
                    case "Firefox":
                        System.out.println("Firefox Browserını Başlat");
                        //webdriver.startDriver.start.Firefox
                        break;
                    default:
                        System.out.println("Tanımsız Bir Browser");
                }




        }

    }
}







//        int sayi = 2;
//
//        if (sayi == 1){
//            System.out.println("Verilen Sayı 1 e Eşittir");
//        } else if (sayi==2) {
//            System.out.println("Verilen Sayı 2 ye Eşittir");
//        }else {
//            System.out.println("Sayı 1 e veya 2 ye Eşit Değildir");
//        }