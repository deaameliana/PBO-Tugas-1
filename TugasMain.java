import java.util.ArrayList;
import java.util.Scanner;

public class TugasMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Mahasiswa> daftarMhs = new ArrayList<>();
        ArrayList<Schedule> daftar = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Mahasiswa");
            System.out.println("2. Buat Schedule");
            System.out.println("3. Cek Ruangan");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    daftarMhs.add(inputMahasiswa());
                    break;

                case 2:
                    Mahasiswa mhs = pilihMahasiswa(daftarMhs);
                    if (mhs != null) {
                        Room room = pilihRoom();
                        Schedule s = new Schedule(mhs, room);
                        inputWaktu(s);

                        if (isBentrok(daftar, room, s.tanggal, s.jam_mulai, s.jam_selesai)) {
                            System.out.println("\nJadwal bentrok!");
                        } else {
                            daftar.add(s);
                            System.out.println("\nSchedule berhasil dibuat!");
                        }
                    }
                    break;

                case 3:
                    cekRuanganKosong(daftar);
                    break;

                case 4:
                    tampilkanData(daftarMhs, daftar);
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);
    }

    static Mahasiswa inputMahasiswa() {
        Mahasiswa m = new Mahasiswa();
        System.out.print("NIM  : ");
        m.nim = input.nextLine();
        System.out.print("Nama : ");
        m.nama = input.nextLine();
        return m;
    }

    static Mahasiswa pilihMahasiswa(ArrayList<Mahasiswa> list) {
        if (list.size() == 0) {
            System.out.println("Belum ada mahasiswa!");
            return null;
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).nama);
        }

        System.out.print("Pilih: ");
        int pilih = input.nextInt();
        input.nextLine();

        return list.get(pilih - 1);
    }
   static Room pilihRoom() {
        System.out.println("\nPilih Ruangan:");
        System.out.println("1. Auditorium");
        System.out.println("2. Kelas");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();
        input.nextLine();

        if (pilih == 1) {
            Auditorium a = new Auditorium();
            System.out.print("Kapasitas : ");
            a.kapasitas = input.nextInt();
            input.nextLine();
            return a;
        } else {
            Kelas k = new Kelas();
            System.out.print("Nama Kelas : ");
            k.room_name = input.nextLine();
            System.out.print("Kapasitas  : ");
            k.kapasitas = input.nextInt();
            input.nextLine();
            return k;
        }
    }

    static void inputWaktu(Schedule s) {
        System.out.print("Tanggal: ");
        s.tanggal = input.nextLine();

        System.out.print("Jam Mulai: ");
        s.jam_mulai = input.nextLine();

        System.out.print("Jam Selesai : ");
        s.jam_selesai = input.nextLine();
    }

    static void tampilkanData(ArrayList<Mahasiswa> mhsList, ArrayList<Schedule> list) {
        System.out.println("\n===== DATA MAHASISWA =====");
        for (Mahasiswa m : mhsList) {
            m.tampilkan();
            System.out.println();
        }

        System.out.println("\n===== DATA SCHEDULE =====");
        for (Schedule s : list) {
            s.tampilkan();
            System.out.println();
        }
    }

    static boolean isBentrok(ArrayList<Schedule> list, Room room, String tanggal, String mulai, String selesai) {
        for (Schedule s : list) {
            if (s.room.room_id.equals(room.room_id) && s.tanggal.equals(tanggal)) {
                if (mulai.compareTo(s.jam_selesai) < 0 && selesai.compareTo(s.jam_mulai) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    static void cekRuanganKosong(ArrayList<Schedule> list) {
        System.out.print("Masukkan Tanggal (dd-mm-yyyy): ");
        String tanggal = input.nextLine();

        System.out.print("Jam Mulai   : ");
        String mulai = input.nextLine();
        System.out.print("Jam Selesai : ");
        String selesai = input.nextLine();

        boolean auditoriumDipakai = false;
        boolean kelasDipakai = false;

        for (Schedule s : list) {
            if (s.tanggal.equals(tanggal) &&
                mulai.compareTo(s.jam_selesai) < 0 &&
                selesai.compareTo(s.jam_mulai) > 0) {

                if (s.room.room_id.equals("AUDITORIUM")) {
                    auditoriumDipakai = true;
                }
                if (s.room.room_id.equals("KELAS")) {
                    kelasDipakai = true;
                }
            }
        }

        System.out.println("\n===== STATUS RUANGAN =====");
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Auditorium : " + (auditoriumDipakai ? "TERPAKAI" : "KOSONG"));
        System.out.println("Kelas      : " + (kelasDipakai ? "TERPAKAI" : "KOSONG"));
    }
}