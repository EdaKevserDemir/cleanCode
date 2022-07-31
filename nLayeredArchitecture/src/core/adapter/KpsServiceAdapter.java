package core.adapter;

import business.abstracts.PersonService;
import entities.concretes.Person;

public class KpsServiceAdapter implements PersonService {
    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService=new KpsService();
        return kpsService.checkPerson(person.identityNumber,person.firstName,person.lastName,person.yearOfBirth);
    }


}
