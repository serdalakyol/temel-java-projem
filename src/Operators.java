public class Operators {
    public static void main(String[] args) {
        int a = 82;
        int b = 30;
        int p = 90;
        int c=(a+b+p) ;
        // Aritmatik Operatörler //

        System.out.println(c);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println("-------------------------------");

        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);


        System.out.println(--b);
        System.out.println(--b);
        System.out.println(--b);


        System.out.println("-------------------------------");

        System.out.println("Vize Notu: " +a);
        System.out.println("Final Notu: " +b);
        System.out.println("Proje Notu: "+p);
        System.out.println("Ders Notu:"+ c/3);

        System.out.println("-------------------------------");

        // ATAMA OPERATÖRLERİ

        int d = 50;
        d+=40;
        System.out.println(d);


        int e = 50;
        d-=22;
        System.out.println(e);


        //KARŞILAŞTIRMA OPERATÖRLERİ //
        //  ==,!=,>,<,>=,<=

        System.out.println(a==b); // A VE B EŞİTSE TRUE
        System.out.println(a!=b); // A VE B EŞİT DEĞİŞSE TRUE
        System.out.println(a<b); // B A'DAN BÜYÜK İSE TRUE
        System.out.println(a>b);  //A B' DEN BÜYÜK İSE TRUE
        System.out.println(a<=b); //B A'DAN BÜYÜK VEYA EŞİTSE TRUE
        System.out.println(a>=b);  //A B'DAN BÜYÜK VEYA EŞİTSE TRUE
                            // && VE demektir   VEYA OPERATORU : ||  //
        if (a>b && a<60 );{

            System.out.println("işlem tamamlandı");

        }

    }
}
