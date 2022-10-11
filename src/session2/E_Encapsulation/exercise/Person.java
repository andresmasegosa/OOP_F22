package session2.E_Encapsulation.exercise;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name. And also an age.
 *  * Create constructors for this class.
 *  * Create the getter and setters that you think are needed here.
 *  * Write code in the main method that illustrates the use of the getters and setters.
 **/

/**
 * Example solution
 */
class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greeting(){
        String greeting = "Hello my name is "+this.firstName+" "+this.middleName+" "+this.lastName+" and I'm "+this.age+" old!";
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        Person Einstein = new Person("Albert","Einstein",25);
        Einstein.greeting();
        System.out.println("its now einsteins birthday!");
        Einstein.setAge(Einstein.getAge()+1);
        Einstein.greeting();

        Person Julius = new Person("Gaius","Julius","Caesar",54);
        Julius.greeting();

    }
}
