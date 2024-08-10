public class User {
    
    private String id;
    private String fname;
    private String lname;
    private String age;
    
    
    public User(String Id,String Fname,String Lname,String Age)
    {
        this.id = Id;
        this.fname = Fname;
        this.lname = Lname;
        this.age = Age;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getFname()
    {
        return fname;
    }
    
    public String getLname()
    {
        return lname;
    }
    
    public String getAge()
    {
        return age;
    }
}