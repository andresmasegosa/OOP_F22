package session2.A_ClassesAndObjects.exercise;

/**
 * a) Write a class to represent a person. A person has a first name, last name, and an age.
 * b) Write code that create a person object and outputs the person's information as a string
 * formatted as ”Anders, Madsen, 28”
 */
public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {

        //Create the object
        Person person = new Person();

        person.firstName = "Anders";
        person.lastName = "Madsen";
        person.age = 38;

        System.out.println(person.firstName + ", " + person.lastName +", " + person.age);



        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_A_Classes", I_did_finish, I_did_understand, comment);

    }

}
