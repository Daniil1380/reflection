public class Person {

    @MyFirstAnnotation(value = "hello")
    private String name;

    private String surname;

    @MyFirstAnnotation(value = "hello")
    private String city;

    public void die() {
        System.out.println("Died");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }
}
