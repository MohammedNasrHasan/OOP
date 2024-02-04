import java.util.*;

public class MeetingRoom {
    private int roomNo;
    private String location;

    public MeetingRoom(int roomNo, String location) {
        this.roomNo = roomNo;
        this.location = location;
    }

    public String display() {
        return "This room no: " + roomNo + " and the location is: " + location;
    }

    public static class VideoConfrenceRoom extends MeetingRoom {
        private String systemName;

        public VideoConfrenceRoom(int roomNo, String location, String systemName) {
            super(roomNo, location);
            this.systemName = systemName;
        }

        public String display() {
            return super.display() + " and the system name is " + systemName;
        }
    }

    public static void main(String[] args) {
        int choose;

        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.print("Hello Gharam, what do you want? Enter 1 or 2: ");
        choose = s.nextInt();
        s.nextLine(); // Consume the newline character

        if (choose == 1) {
            int no = 0;
            String l = "unknown";
            System.out.println("Enter roomNo:");
            no = s.nextInt();
            s.nextLine(); // Consume the newline character
            System.out.println("Enter location:");
            l = s.nextLine();
            MeetingRoom g = new MeetingRoom(no, l);
            System.out.println(g.display());
        } else if (choose == 2) {
            int num = 0;
            String lo = "unknown";
            String xe;
            System.out.println("Enter roomNo :");
            num = s.nextInt();
            s.nextLine(); // Consume the newline character
            System.out.println("Enter location :");
            lo = s.nextLine();
            System.out.println("Enter Systemline :");
            xe = s.nextLine();
            VideoConfrenceRoom gh = new VideoConfrenceRoom(num, lo, xe);
            System.out.println(gh.display());
            System.out.println("The system name is " + xe);
        } else {
            System.out.println("Gharam add the import.");
        }
    }
}
