//1. Переписать код в соответствии с Single Responsibility Principle:

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}

public class SalaryCalculator {
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25); // calculate in other way
        return baseSalary - tax;
    }
}

// Класс `Employee` отвечает только за хранение информации о сотруднике и получение информации о нем.
// Класс `SalaryCalculator` отвечает только за расчет чистой зарплаты на основе базовой зарплаты.
// Каждый класс имеет только одну причину для изменения, что соответствует принципу единственной ответственности.