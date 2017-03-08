package refactoring.user;

/*
В классе User необходимо переписать методы: getAddress, getCountry, setCountry, getCity, setCity.
И нужно добавить в класс приватное поле Address address.


 */
public class User {
    private String name;
    private String surname;
    private int age;
    private boolean man;
    private Address address;
    private Work work;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = new Address();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return address.getCountry();
    }

    public void setCountry(String country) {
        address.setCountry(country);
    }

    public String getCity() {
        return address.getCity();
    }


    public void setCity(String city) {
        address.setCity(city);
    }

    public String getAddress() {
        return address.getCountry() + " " + address.getCity() + " " + address.getHouse();
    }


    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public void printInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Фамилия: " + getSurname());
        printAdditionalInfo();
    }

    public void printAdditionalInfo() {
        if (getAge() < 16)
            System.out.println("Пользователь моложе 16 лет");
        else
            System.out.println("Пользователь старше 16 лет");
    }

    public String getBoss() {
        Work work = getWork();
        return work.getBoss();
    }
}