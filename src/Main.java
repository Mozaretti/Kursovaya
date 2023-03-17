public class Main {
    Employee[] employee = new Employee[5];
    public static void main(String[] args) {

    }

    public void printEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    public void sum() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Сумма зарплат: " + sum);
    }
}