class MeetingRoom{
    private int roomNo;
    private String location;
    
    public MeetingRoom(int roomNo, String location){
        this.roomNo=roomNo;
        this.location=location;
    }
    
    public void display(){
        System.out.print("This is room number: "+roomNo+", and location: "+location+"\n");
    }
}