import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("inputkan jarak :");
        double jarak=input.nextDouble();

        System.out.print("inputkan kecepatan :");
        double kecepatan=input.nextDouble();

        System.out.print("inputkan jumlah bahan bakar anda :");
        double bensin=input.nextDouble();

        System.out.print("inputkan harga bensi :" );
        double harga=input.nextDouble();

        double waktu=jarak/kecepatan;
        double konsumsi=jarak /bensin;
        double biayabensin=harga*jarak;

        System.out.println("waktu temmp uh selama perjalanan adalah :" +waktu);
        System.out.println("konsumsi bensi nya adalah :" +konsumsi + "liter");
        System.out.println("harga nya adalah :" + biayabensin);
        input.close();
    }
}
