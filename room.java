public class Room {
    String room_id;
    String room_name;

    void tampilkanRoom() {
        System.out.println("Room ID   : " + room_id);
        if (room_name != null) {
            System.out.println("Nama      : " + room_name);
        }
    }
}