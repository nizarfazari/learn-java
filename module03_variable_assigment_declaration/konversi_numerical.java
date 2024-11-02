package module03_variable_assigment_declaration;

public class konversi_numerical {
    public static void main(String[] args) {

        /*
         * Mekanisme Konversi Data
         * */

        int nilaiInt = 450; // 32 bit
        System.out.println("Nilai Int adalah " + nilaiInt);

        // Memperluas data ke tempat yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai Long adalah " + nilaiLong);

        // Memperkeil data ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte" + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        /*
         * casting pembagian
         * 1. mengubah salah satu tipe menjadi float
         * 2. konversikan dengan casting
         * */

        // cara 1
        int a = 10;
        float b = 4;

        float c = a / b;
        System.out.println(c);

        // cara ke 2
        int x = 10;
        int y = 4;

        float xy = (float) x / y;
        System.out.println(xy);

    }
}
