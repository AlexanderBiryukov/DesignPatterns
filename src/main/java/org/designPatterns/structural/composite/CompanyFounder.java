package org.designPatterns.structural.composite;
// создание компании в виде древовидной структуры
public class CompanyFounder {
    public static void main(String[] args) {
        Company company = new Company("Amazon");

        BusinessUnit businessUnit1 = new BusinessUnit("Sales department");
        BusinessUnit businessUnit2 = new BusinessUnit("Development department");
        BusinessUnit businessUnit3 = new BusinessUnit("Marketing department");

        Employee employee1 = new Employee("Petr");
        Employee employee2 = new Employee("Igor");
        Employee employee3 = new Employee("Vlad");
        Employee employee4 = new Employee("Ivan");
        Employee employee5 = new Employee("Maria");

        company.addComponent(businessUnit1);
        company.addComponent(businessUnit2);
        company.addComponent(businessUnit3);

        businessUnit1.addComponent(employee1);
        businessUnit1.addComponent(employee2);
        businessUnit2.addComponent(employee3);
        businessUnit2.addComponent(employee4);
        businessUnit3.addComponent(employee5);


        System.out.println("Company: " + company + "\n");

        for (Component c : company.getBusinessUnits()) {
            System.out.println(c + ": ");
            c.getComponents().forEach(System.out::println);
            System.out.println();
        }

    }
}
