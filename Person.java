public class Person {

    public String name;
    public String surname;
    public String email;

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }


    //Get name as String
    public String getName() {
        return name;
    }

    // Set name as String
    public void setName(String name) {
        this.name = name;
    }

    // Get Surname as String
    public String getSurname() {
        return surname;
    }

    // Set Surname as String
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Get Email as String
    public String getEmail() {
        return email;
    }

    // Set Email as String
    public void setEmail(String email) {
        this.email = email;
    }

}