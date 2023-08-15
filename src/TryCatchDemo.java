public class TryCatchDemo {
    public static void main(String[] args) {

        int [] sayılar = {1,34,28,345,12,};

        try {
            System.out.println(sayılar[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Hata Sonrası Konsala Yazdır");
    }
}
