import java.lang.reflect.Array;
import java.util.Arrays;
import util.Input;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = Arrays.copyOf(people, people.length+1);
        newPeople[newPeople.length-1] = newPerson;
        return newPeople;
    }

    public static void main(String[] args) {

        Person[] people = {
                new Person("Joey"),
                new Person("Lorena"),
                new Person("Candy")
        };

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person[] updatedPeople = addPerson(people, new Person("Morticia"));

        for (Person person : updatedPeople) {
            System.out.println(person.getName());
        }




    }
}
