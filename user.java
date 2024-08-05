public class user {
    public static void main(String []args){
        employee e=new employee("aman", 10,500.5f, 1234);
        System.out.println(e.getString());
        System.out.println(e.geteid());
        System.out.println(e.getsal());
        System.out.println(e.getpwd());
        System.out.println("Update name is:");
        e.setString("rohit");
        System.out.println("Update sal is:");
        e.setsal(200.2f);
    }
    
}
