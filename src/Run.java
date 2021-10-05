import java.util.*;

public class Run
{

    public static void main(String[] args)
    {
        //1: Create 4 person objects.
        //person 1: Jens, 175 cm, 69 kg.
        //person 2: Helle, 168 cm, 58 kg
        //person 3: Berit, 163 cm, 72 kg
        //person 4: Allan, 192 cm, 95 kg
        Person p1 = new Person("Jens", 175, 69);
        Person p2 = new Person("Helle", 168, 58);
        Person p3 = new Person("Berit", 163, 72);
        Person p4 = new Person("Allan", 192, 95);


        //2: Create a Person array with 4 positions.
        //Populate the array with the 4 person objects
        Person[] persons = {p1, p2, p3, p4};
        Person[] persons2 = new Person[1];


        //3: Using System.out.println(), print out the names and heights and weights of the 4 people.
        // Note: It must work without modification if you changed the size of the array and the number of
        // person objects in it.
        System.out.println(Arrays.toString(persons));

        try {
            findLargestPerson(persons2);
        }
        catch (NullPointerException e) {
            System.out.println("There was an empty position in the array.");
        }









    }







    //4: Write a static method that returns the height of the specified name. The specified name
    //is sent to the method as a parameter. The Person array to search in is also sent as a parameter.
    //If the specified name does not exist in the array, the method should return 0.
    public static int getHeightFromName(String name, Person[] people) {
        for(int i=0; i < people.length; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return people[i].getHeight();
            }
        }
        return 0;
    }





    //5: Write a static method that returns the tallest person object in a given person array.
    //The method must take in a person array as a parameter.
    public static Person findLargestPerson(Person[] people) throws NullPointerException {

        Person person = people[0];
        //int max = people[0].getHeight();
        for (int i=0; i< people.length; i++) {
            if(people[i].getHeight() > person.getHeight()) {
                person = people[i];
                //return people[i];
            }
        }
        return person;
    }


    //6: write a static method that returns the first person object in the array, that weighs more and is taller than x and y.
    //x and y should be parameters to the method and the person array to search in as well.
    //The method should return null if the array is empty. (no people objects in it).


    //7: write a method like the one above, but this time do not return only the first person object that fits the criteria.
    //Instead return all objects that fits the criteria. The method must work also if you changed the array and number of
    //people in it.
}