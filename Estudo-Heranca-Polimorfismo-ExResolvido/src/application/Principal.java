package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<Employee>();

		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee # " + i + " data: ");
			System.out.print("Outsourced Employee (y/n):");
			char opcao = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hour: ");
			double valurPerHour = sc.nextDouble();

			if (opcao == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCahrge = sc.nextDouble();
				// Aqui eu declaro uma instância de Employee, porem recebendo uma instancia do
				// tipo OutsourcedEmployee
				Employee emp = new OutsourcedEmployee(name, hours, additionalCahrge, additionalCahrge);
				list.add(emp);
				// outra forma de fazer o list.add(new OutsourcedEmployee(name, hours,
				// additionalCahrge, additionalCahrge))
			} else {
				Employee emp = new Employee(name, hours, valurPerHour);
				list.add(emp);
			}

		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		

		for (Employee emp : list) {
			System.out.println(emp.getName() + ": $ " + String.format("%.2f", emp.payment()));

		}

		sc.close();

	}

}
