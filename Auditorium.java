public class Auditorium extends Room {
    int kapasitas;

    public Auditorium() {
        this.room_id = "AUDITORIUM";
    }

    @Override
    void tampilkanRoom() {
        System.out.println("Jenis      : AUDITORIUM");
        System.out.println("Kapasitas  : " + kapasitas);
    }
}