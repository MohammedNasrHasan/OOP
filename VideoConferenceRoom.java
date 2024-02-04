class VideoConferenceRoom extends MeetingRoom{
    private String systemName;
    
    public VideoConferenceRoom(int roomNo, String location, String systemName){
        super(roomNo, location);
        this.systemName=systemName;
    }
    
    public void display(){
        super.display();
        System.out.print(", and system Name: "+systemName);
    }
}