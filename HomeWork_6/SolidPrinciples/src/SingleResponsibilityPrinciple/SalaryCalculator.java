package SingleResponsibilityPrinciple;

/*
Добавлен классSalaryCalculator, который принимает сотрудника в качестве параметра и рассчитывает чистую заработную плату в методе calculateNetSalary, используя информацию о базовой зарплате методом getBaseSalary.
Теперь класс Employee и SalaryCalculator выполняет только свою основную ответственность.
*/
public class SalaryCalculator {
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);
        return employee.getBaseSalary() - tax;
    }
}
