public class App {
    public static void main(String[] args) throws Exception {

        Student student = new Student("Lia", "Ximenes", "123.456.789-10", "lia@gmail.com" );
        student.subject.setUniversity("UNIRIO");
        
        System.out.println(student.subject.getUniversity());
        System.out.println(student.getFirstName());
    }
}
