package PrakPemdas.Pertemuan;

public class DigitFormat {

    public static int JumlahDigit(int bil) {
        int hasil = 0;
        while (bil > 0) {
            hasil += bil % 10;
            bil /= 10;
        }

        return hasil;
    }
}
