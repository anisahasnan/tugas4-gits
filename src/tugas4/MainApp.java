package tugas4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    private static ArrayList<TempatMakan> listTempatMakan;

    public static void main(String[] args) {

        Menu mieGoreng = new Menu("Mie Goreng", 5000);
        Menu mieKuah = new Menu("Mie Kuah", 6000);
        Menu nasiMawut = new Menu("Nasi Mawut", 9000);

        TempatMakan puma = new Warteg("Puma");
        puma.addMenu(mieGoreng);
        puma.addMenu(mieKuah);
        puma.addMenu(nasiMawut);

        Menu spagheti = new Menu("Spagheti", 20000);
        Menu omelete = new Menu("Omelete", 15000);
        Menu steak = new Menu("Steak", 35000);

        TempatMakan kafe = new Cafe("Kafe");
        kafe.addMenu(spagheti);
        kafe.addMenu(omelete);
        kafe.addMenu(steak);

        System.out.println();

        System.out.println("Selamat Datang di FoodCourt Pelangi!\n" +
                "Berikut adalah list tempat makan yang ada di sini :\n" +
                "- Warteg " + puma.getNama() + "\n" +
                "- Cafe " + kafe.getNama());

        System.out.println("Kamu mau lihat daftar menu tempat makan yang mana? (Jawab dengan warteg/cafe)");

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine().toLowerCase();

        try {
            if (in.equals("warteg")) {
                System.out.println("Berikut daftar menu yang tersedia:");
                puma.getAllMenu();

                System.out.println("Menu apa yang ingin kamu tambah? (Jawab dengan format nama-harga)");
                Scanner scanner2 = new Scanner(System.in);

                while (scanner2.hasNextLine()){
                    String menu = scanner2.nextLine();
                    if(menu.equalsIgnoreCase("end")){
                        System.out.println("Terima kasih sudah datang di Warteg Puma!");
                        break;
                    }
                    String[] arrIn = menu.split("-");
                    String nama = arrIn[0];
                    int harga = Integer.parseInt(arrIn[1].replace(" ", ""));
                    Menu newMenu = new Menu(nama, harga);
                    puma.addMenu(newMenu);

                    System.out.println("\nBerikut daftar menu yang tersedia:");
                    puma.getAllMenu();
                    System.out.println("Menu apa yang ingin kamu tambah? (Jawab dengan format nama-harga). Atau jika sudah selesai menambah menu, tulis \"end\"");
                }
            } else if (in.equals("cafe")) {
                System.out.println("Berikut daftar menu yang tersedia:");
                kafe.getAllMenu();

                System.out.println("Menu apa yang ingin kamu tambah? (Jawab dengan format nama-harga)");
                Scanner scanner2 = new Scanner(System.in);

                while (scanner2.hasNextLine()){
                    String menu = scanner2.nextLine();
                    if(menu.equalsIgnoreCase("end")){
                        System.out.println("Terima kasih sudah datang di Cafe Kafe!");
                        break;
                    }
                    String[] arrIn = menu.split("-");
                    String nama = arrIn[0];
                    int harga = Integer.parseInt(arrIn[1].replace(" ", ""));
                    Menu newMenu = new Menu(nama, harga);
                    kafe.addMenu(newMenu);

                    System.out.println("\nBerikut daftar menu yang tersedia:");
                    kafe.getAllMenu();
                    System.out.println("Menu apa yang ingin kamu tambah? (Jawab dengan format nama-harga). Atau jika sudah selesai menambah menu, tulis \"end\"");
                }
            } else {
                System.out.println("Maaf, tempat makan yang kamu minta belum tersedia.");
            }
        }
        catch (NumberFormatException ne){
            System.out.println("Maaf, penambahan menu gagal. Mohon masukkan harga dalam bentuk angka (cth: 10000)");
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Maaf, penambahan menu gagal. Mohon masukkan menu dan harga dengan format nama-harga (cth: Ayam Bakar-30000)");
        }
    }
}
