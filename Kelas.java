public class Kelas extends Room {
    int kapasitas;

    public Kelas() {
        this.room_id = "KELAS";
    }

    @Override
    void tampilkanRoom() {
        System.out.println("Jenis      : KELAS");
        System.out.println("Nama Kelas : " + room_name);
        System.out.println("Kapasitas  : " + kapasitas);
    }
}