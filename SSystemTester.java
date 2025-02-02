public class Details{
    public static void main(String[] args){
        Student s = new Student();
        s.set_std_id(12345678);
        s.set_std_name("Jayden Thompson");
        s.set_std_address("123 Main St, Cityville");

        System.out.println("The students name is: " + s.get_std_name());
        System.out.println("The students id is: " +  s.get_std_id());
        System.out.println("The students address is: " +  s.get_std_address());
    }
}
