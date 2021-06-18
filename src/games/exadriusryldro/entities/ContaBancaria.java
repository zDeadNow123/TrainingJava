package games.exadriusryldro.entities;

public class ContaBancaria {
	
	private String accountHolder;
	private final int accountNumber;
	private double initialDeposit;
	
	// Constructors
	
	public ContaBancaria(String accountHolder, int accountNumber, double initialDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.initialDeposit = initialDeposit;
	}
	
	public ContaBancaria(String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	// Getters and Setters
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return initialDeposit;
	}
	
	// Add and Sub
	
	public void addDeposit(double deposit) {
		this.initialDeposit += deposit;
	}
	
	public void subDeposit(double deposit) {
		this.initialDeposit -= deposit + 5.00;
	}
	
	// Define um texto padrão que a operação toString deve retornar
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance $ %.2f%n", getAccountNumber(), getAccountHolder(), getAccountBalance());
	}

}
