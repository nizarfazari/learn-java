package module03_variable_assigment_declaration;

public class type_data {
    public static void main(String[] args) {
        // Tipe data Primitive

        /*
         *   integer ( bil bulat )
         *   4 bytes
         *   32 bit
         *   2^32 - 1
         * */

        int i = 2147483647;
        System.out.println(i);
        System.out.println("Nilai integer = " + (i + 1));
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);

        /*
         *   Byte ( Satuan )
         *   1 bytes
         *   8 bit
         *   2^8 - 1
         *   max = 127 min = -128 total 255
         * */
        byte b = 10;
        System.out.println("========BYTE=========");
        System.out.println("nilai byte b = " + b);
        System.out.println("Nilai max = " + Byte.MAX_VALUE);
        System.out.println("Nilai max = " + Byte.MIN_VALUE);
        System.out.println("Nilai max = " + Byte.BYTES + " bytes");
        System.out.println("Nilai max = " + Byte.SIZE + " bit");

        /*
         *   Short
         *   2 bytes
         *   16 bit
         *   2^16 - 1
         *   nilai max = 32767
         *   nilai min = -32768
         * */

        short c = 10;
        System.out.println("========SHORT=========");
        System.out.println("nilai short c = " + c);
        System.out.println("Nilai max = " + Short.MAX_VALUE);
        System.out.println("Nilai max = " + Short.MIN_VALUE);
        System.out.println("Nilai max = " + Short.BYTES + " bytes");
        System.out.println("Nilai max = " + Short.SIZE + " bit");

        /*
         *   Long
         *   8 bytes
         *   64 bit
         *   2^64 - 1
         * */

        long d = 10L;
        System.out.println("========Long=========");
        System.out.println("nilai long d = " + d);
        System.out.println("Nilai max = " + Long.MAX_VALUE);
        System.out.println("Nilai max = " + Long.MIN_VALUE);
        System.out.println("Nilai max = " + Long.BYTES + " bytes");
        System.out.println("Nilai max = " + Long.SIZE + " bit");

        /*
         *   Double ( Bilangan Real atau koma )
         *   8 bytes
         *   64 bit
         *   2^64 - 1
         * */

        double e = 10.4d;
        System.out.println("========DOUBLE=========");
        System.out.println("nilai double e = " + e);
        System.out.println("Nilai max = " + Double.MAX_VALUE);
        System.out.println("Nilai max = " + Double.MIN_VALUE);
        System.out.println("Nilai max = " + Double.BYTES + " bytes");
        System.out.println("Nilai max = " + Double.SIZE + " bit");


        /*
         *   Float
         *   4 bytes
         *   32 bit
         *   2^32 - 1
         * */

        float f = 10.4F;
        System.out.println("========Long=========");
        System.out.println("nilai float f = " + f);
        System.out.println("Nilai max = " + Float.MAX_VALUE);
        System.out.println("Nilai max = " + Float.MIN_VALUE);
        System.out.println("Nilai max = " + Float.BYTES + " bytes");
        System.out.println("Nilai max = " + Float.SIZE + " bit");

        /*
         *   Char ( berdasarkan ASCII )
         *   2 bytes
         *   16 bit
         * */

        char g = 's';
        System.out.println("========Long=========");
        System.out.println("nilai char g = " + g);
        System.out.println("Nilai max = " + Character.MAX_VALUE);
        System.out.println("Nilai max = " + Character.MIN_VALUE);
        System.out.println("Nilai max = " + Character.BYTES + " bytes");
        System.out.println("Nilai max = " + Character.SIZE + " bit");

        /*
         *   Boolean ( cuman ada TRUE and FALSE )
         *   2 bytes
         *   16 bit
         * */

        boolean val = false;
        System.out.println("=======BOOLEAN=====");
        System.out.println("nilai boolean val = " + val);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);

    }
}
