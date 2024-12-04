package mapInterface;

import java.util.*;

class Employee
{
    String name;
    int id;
    String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class EmployeeRecords
{
    Map<Integer,Employee> employeeMap;

    public EmployeeRecords() {
        employeeMap=new HashMap<>();
    }

    public void addEmployee(Employee employee)
    {
        employeeMap.put(employee.id,employee);
    }

    public void searchEmployeeById(int id)
    {
        if(employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        }
        else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void displayAllEmployees()
    {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees in the records.");
        }
        else {
            for (Employee employee : employeeMap.values())
            {
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args)
    {
        EmployeeRecords records = new EmployeeRecords();

        Employee emp1=new Employee("Deepika", 101, "HR");
        Employee emp2=new Employee("asha", 102, "Finance");
        Employee emp3=new Employee("Nisha", 103, "IT");

        records.addEmployee(emp1);
        records.addEmployee(emp2);
        records.addEmployee(emp3);

        System.out.println("Searching for employee with ID 102:");
        records.searchEmployeeById(102);

        System.out.println("All employees:");
        records.displayAllEmployees();

        System.out.println("Searching for employee with ID 104:");
        records.searchEmployeeById(104);
    }
}