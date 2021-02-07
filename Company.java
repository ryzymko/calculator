public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Wojtek";
        employee1.lastName = " Wojdyła";
        employee1.yearOfBirth = 1991;
        employee1.seniority = 3;

        String emp1Info = employee1.name + employee1.lastName+ ", Rok urodzenia: "
        +employee1.yearOfBirth+ ", Staż pracy (w latach): " +employee1.seniority;

        System.out.println(emp1Info);

        Employee employee2 = new Employee();
        employee2.name = "Adam ";
        employee2.lastName = "Kowalski";
        employee2.yearOfBirth = 1995;
        employee2.seniority = 3;

        String emp2Info = employee2.name + employee2.lastName + ", Rok urodzenia: "
                +employee2.yearOfBirth+ ", Staż pracy: (w latach): " + employee2.seniority;

        System.out.println(emp2Info);

        Employee employee3 = new Employee();
        employee3.name = "Kinga ";
        employee3.lastName = "Han";
        employee3.yearOfBirth = 1995;
        employee3.seniority = 5;

        String emp3Info = employee3.name + employee3.lastName + ", Rok urodzenia: "
                +employee3.yearOfBirth + ", Staż pracy (w latach): " + employee3.seniority;

        System.out.println(emp3Info);


    }

}
