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


        List<Employee> list = new ArrayList<>(); // Primeiro de tudo, na lista colocar o
        // nome da class que eu crei.

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

        //Aqui tbm colocar o nome da class que eu criei para buscar se existe o id do funcionario
        Employee findID = list.stream().filter(x -> x.getId() == idNum).findFirst().orElse(null);

        if (findID == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            findID.increaseSalary(percent); //se encontrar o id, aqui sera onde vai
            // almentar o salario do funcionario através de um metodo que eu crei na clase.
        }
        System.out.println();
        for (Employee e : list) { //for each loop para imprimir na tela os dados atualizados.
            System.out.println(e);
        }
    }
}
