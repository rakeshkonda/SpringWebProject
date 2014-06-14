package classes.MapOps;

/**
 * Created with IntelliJ IDEA.
 * User: rakesh
 * Date: 5/29/13
 * Time: 1:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person implements Comparable {
    private int personId;
    private String name;

    public Person(int personId, String name){
        this.personId = personId;
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (personId != person.personId) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if(o == null){
            return -1;
        }
        Person person = (Person) o;

        if(this.getPersonId() == person.getPersonId()){
            return 0;
        } else if(this.getPersonId() > person.getPersonId()){
            return 1;
        } else {
            return -1;
        }
    }
}
