package module03_variable_assigment_declaration;

public class operasi_aritmatika {
    public static void main(String[] args) {

        //  Operasi Aritmatika
        int variable1 = 4;
        int variable2 = 3;

        int hasil;

        // Penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // Pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n" , variable1,variable2,hasil);

        // Perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d * %d = %d \n", variable1 , variable2,hasil);

        // Pembagian
        hasil = variable1 / variable2;
        System.out.println(variable1  / variable2);
        System.out.printf("%d / %d = %d \n", variable1 , variable2, hasil);

        float a = 15;
        float b = 7;
        float hasilDecimal = a / b ;
        System.out.println(a + " / " + b + " = " + hasilDecimal);

        // Modulus
        hasil = variable1 % variable2;
        System.out.println(variable1 + " % " + variable2 + " = " + hasil);


    }
}
