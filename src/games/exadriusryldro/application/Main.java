package games.exadriusryldro.application;

import java.util.Locale;
import java.util.Scanner;

import games.exadriusryldro.entities.ContaBancaria;

public final class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		// Define uma instancia da conta bancaria pro computador entender que a parada existe (ja que ele aparenta nao raciocinar muito bem)
		
		ContaBancaria contaBancaria;
		
		
		// Recebe os dados basicos
		
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter account holder: ");
		String accountHolder = scanner.nextLine();
		
		System.out.print("\nIs there an initial deposit (y/n)? ");
		char isInitialDepositString = scanner.next().charAt(0);
		
		// Verificação para saber se o caracter digitado corresponde a alternativa acima
		
		if(isInitialDepositString != 'y' && isInitialDepositString != 'n') {
			scanner.close(); 
			return;
		}
		
		// Verifica se o deposito ocorreu
		
		if(isInitialDepositString == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = scanner.nextDouble();
			
			contaBancaria = new ContaBancaria(accountHolder, accountNumber, initialDepositValue);
		} else {
			contaBancaria = new ContaBancaria(accountHolder, accountNumber);
		}
		
		// Retorna os dados do usuario e solicita um incremento e decremento no saldo
		
		System.out.printf("%nAccount data:%n");
		System.out.println(contaBancaria.toString());
		
		System.out.print("Enter a deposit value: ");
		contaBancaria.addDeposit(scanner.nextDouble());
		
		System.out.printf("Updated account data:%n");
		System.out.println(contaBancaria.toString());
		
		System.out.print("Enter a withdraw value: ");
		contaBancaria.subDeposit(scanner.nextDouble());
		
		System.out.printf("Updated account data:%n");
		System.out.println(contaBancaria.toString());
		
		
		scanner.close();
	}

}
