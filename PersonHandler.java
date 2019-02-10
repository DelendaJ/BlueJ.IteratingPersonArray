
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        Person currentPerson;
        while (counter < personArray.length) {
            currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation; 
            counter++;
        }

        return result;
    }

    public String forLoop() {
        String result = "";
        Person currentPerson;
        for (int counter = 0; counter < personArray.length; counter++){
            currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;

        }

        return result;
    }

    public String forEachLoop() {
        String result = "";
        for (Person currentPerson : personArray) {
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        }

        return result;
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}
