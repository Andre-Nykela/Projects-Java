package app;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();


        List<Employee> list = new ArrayList<>(); // Na 'list' colocar o
        // nome da class que foi criada.

        for (int i = 0; i < n; i++) {
            System.out.println("Employee: #" + (1 + i) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();
            Employee emp = new Employee(name, id, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idNum = sc.nextInt();

        //Colocar o nome da class que foi criada para buscar se existe o id do funcionario
        Employee findID = list.stream().filter(x -> x.getId() == idNum).findFirst().orElse(null);

        if (findID == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            findID.increaseSalary(percent); //Se um id for encontrado, aqui será onde vai
            // aumentar o salário do funcionario através do metodo criado na classe.
        }
        System.out.println();
        for (Employee e : list) { //for each loop para imprimir na tela os dados atualizados.
            System.out.println(e);
        }
    }
}
