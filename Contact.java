class Contact{
    
    
    private String name;
    private String phonenumber;
    private String cat;

public Contact(String name , String phonenumber ,String cat){
    
    this.name=name;
    this.phonenumber=phonenumber;
    this.cat=cat;
    
}
public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phonenumber;
    }

    public String getCat() {
        return cat;
    }

    public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}