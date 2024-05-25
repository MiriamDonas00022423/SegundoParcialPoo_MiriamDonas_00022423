public class Main {
    public static void main(String[] args) {

        Employee ceo = new Employee("Rocio Lopez", "CEO");
        Employee managerMain = new Employee("Marta", "Main Department Manager");
        Employee managerSecondary = new Employee("Juan perez", "Secondary Department Manager");
        Employee employee1 = new Employee("Salvador", "Main Department Employee");
        Employee employee2 = new Employee("Pablo", "Secondary Department Employee");


        CompositeDepartment mainDepartment = new CompositeDepartment("Main Department", ceo.getName());
        CompositeDepartment secondaryDepartment = new CompositeDepartment("Secondary Department", managerSecondary.getName());


        mainDepartment.addSubordinate(ceo);
        mainDepartment.addSubordinate(managerMain);
        mainDepartment.addSubordinate(employee1);
        secondaryDepartment.addSubordinate(managerSecondary);
        secondaryDepartment.addSubordinate(employee2);


        System.out.println("CEO: " + ceo.getName());
        System.out.println("Main Department Head: " + mainDepartment.getHead());
        System.out.println("Secondary Department Head: " + secondaryDepartment.getHead());
        System.out.println("\nEmployees in Main Department:");
        for (Department subordinate : mainDepartment.getSubordinates()) {
            System.out.println("- " + ((Employee) subordinate).getName());
        }
        System.out.println("\nEmployees in Secondary Department:");
        for (Department subordinate : secondaryDepartment.getSubordinates()) {
            System.out.println("- " + ((Employee) subordinate).getName());
        }
    }

}