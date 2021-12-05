package PrakPemdas.Pertemuan;

public class Rekursif {
    static long jumlahSemuaDigit(long input) {
        long jumlah = 0;

        if (input < 10 && input != 0) {
            return input;
        } else {
            while (input > 0) {
                jumlah += input % 10;
                input /= 10;
            }
            return jumlahSemuaDigit(jumlah);
        }
    }
}
