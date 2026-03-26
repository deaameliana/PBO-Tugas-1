public class Schedule {
    static int counter = 1;
    String id;
    Mahasiswa mahasiswa;
    Room room;
    String tanggal;
    String jam_mulai;
    String jam_selesai;

    public Schedule(Mahasiswa mahasiswa, Room room) {
        this.id = "S" + String.format("%02d", counter++);
        this.mahasiswa = mahasiswa;
        this.room = room;
    }

    void tampilkan() {
        System.out.println("ID Schedule : " + id);
        System.out.println("NIM         : " + mahasiswa.nim);
        System.out.println("Nama        : " + mahasiswa.nama);
        room.tampilkanRoom();
        System.out.println("Tanggal     : " + tanggal);
        System.out.println("Mulai       : " + jam_mulai);
        System.out.println("Selesai     : " + jam_selesai);
    }
}