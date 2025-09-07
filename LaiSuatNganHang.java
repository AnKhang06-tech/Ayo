import java.util.Scanner;

public class LaiSuatNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double TG, LN, LT, TL, T;
        int ST;

        System.out.print("Nhap so tien gui: ");
        TG = sc.nextDouble();

        System.out.print("Nhap lai suat hang nam (%): ");
        LN = sc.nextDouble();

        System.out.print("Nhap so thang gui: ");
        ST = sc.nextInt();

        System.out.printf("Tien lai sau %d thang: %.0f VND\n", ST, (TG * (LN / 12 / 100) * ST));
        System.out.printf("Tong so tien cuoi ky: %.0f VND\n", (TG + TG * (LN / 12 / 100) * ST));


        sc.close();
    }
}
