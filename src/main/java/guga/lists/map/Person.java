package guga.lists.map;

import java.time.ZonedDateTime;

/**
 * The type Person.
 */
public class Person {


    String name;
    ZonedDateTime dateOfBirth;

    public Person(String name, ZonedDateTime dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
