package PrakPemdas.Pertemuan;

public class StringConvert {
    public static int[] toIntArr(String s) {
        String[] pisah = s.split(" ");
        int[] bilHasil = new int[pisah.length];
        for (int i = 0; i < bilHasil.length; i++) {
            bilHasil[i] = Integer.parseInt(pisah[i]);
        }

        return bilHasil;
    }
}
