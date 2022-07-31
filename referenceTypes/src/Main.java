public class Main {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);

        int[]sayilar1=new int[]{1,2,3,4,5};
        int[]sayilar2=new int[]{10,20,30,40,50};
        sayilar1=sayilar2;
        sayilar2[0]=30;
        System.out.println(sayilar1[0]);


        Customer customer=new Customer();
        Customer customer1=customer;

        Person person=customer;
        Person person1=new Employee();

        PersonDal personDal=new PersonDal();
        personDal.add(new Employee());
        personDal.add(new Visitor());




    }
}
