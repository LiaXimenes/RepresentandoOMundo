import java.util.UUID;

public class Student {
    private String firstName;
    private String lastName;
    private String cpf;
    private String email;
    private String id;
    Subject subject = new Subject();

    public Student(String firstName, String lastName, String cpf, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.email = email;
        this.id = UUID.randomUUID().toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

}
