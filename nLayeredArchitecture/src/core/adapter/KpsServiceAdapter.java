package core.adapter;

import business.abstracts.IPersonService;
import entities.concretes.Person;

public class KpsServiceAdapter implements IPersonService {
    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService=new KpsService();
        return kpsService.checkPerson(person.identityNumber,person.firstName,person.lastName,person.yearOfBirth);
    }


}
