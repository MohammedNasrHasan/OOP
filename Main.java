public class Main{
    public static void main(String [] args){
        MeetingRoom MR = new MeetingRoom(10,"1st floor");
        MR.display();
        
        VideoConferenceRoom VC = new VideoConferenceRoom(20,"2nd floor","DSA");
        VC.display();
    }
}
