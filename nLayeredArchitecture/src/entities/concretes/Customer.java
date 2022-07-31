package entities.concretes;

public class Customer extends Person {

    public int cityId;

    public Customer(int id, String firstName, String lastName, String identityNumber, int yearOfBirth) {
        super(id, firstName, lastName, identityNumber, yearOfBirth);
        this.cityId = cityId;
    }
}
