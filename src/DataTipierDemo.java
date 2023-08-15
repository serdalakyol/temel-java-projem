public class DataTipierDemo {
    public static void main(String[] args) {
        byte myByte= 24;
        short myShort= 12345;
        int myInt=224530000; //En Sık Kullanılan
        long myLong= 2455892340L;
        float myFloat= 2.35f;
        double myDouble=82.34; //En Sık Kullanılan
        char myChar= 'S';
        boolean myBooleanT= true;
        boolean myBooleanF= false; //En Sık Kullanılan


            int DataWidening = myByte;
        System.out.println(DataWidening);

            int DataNarrowing = (int) myDouble; //Veri Daraltma biçiminde veri genişletme gibi kod kullanılır yalnız dönüştürümek istenen veri tipinin önüne parantez açılarak yazılır.
        System.out.println(DataNarrowing);
    }
}
