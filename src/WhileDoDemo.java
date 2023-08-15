public class WhileDoDemo {
    public static void main(String[] args) {
        // i 1-5 kadar değer alabilir
        //  i değerlierini konsola yazdır

            for (int i=1;i<5;i++){
                System.out.println("For Loop ile : "+i);
            }
        System.out.println("--------------------------------------------");
                int j=6;

            while (j<=5){
                System.out.println("While Döngüsü ile : "+j );
                j++;

            }
        System.out.println("--------------------------------------------");
            int j1=1;
            while (true){
                if (j1>7){
                    break;
                }
                System.out.println("While Döngüsü ile 2 Yöntem : "+j1);
                j1++;
            }
        System.out.println("--------------------------------------------");

            do {
                if (j>5){
                    break;
                }
                System.out.println("Do While Döngüsü ile: " +j);
                j++;
            }while (true);
        System.out.println("--------------------------------------------");
                do {
                    System.out.println("Do While Döngüsü 2. Yöntem ile: " +j);
                    j++;
                }while (j<=5);
    }


}
