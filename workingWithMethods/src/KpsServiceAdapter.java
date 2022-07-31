public class KpsServiceAdapter implements IPersonService{
    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService=new KpsService();
        return kpsService.checkPerson(person.id,person.identityNumber,person.firstName,person.lastName,person.yearOfBirth);
    }
}
