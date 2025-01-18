public class Bank {
  // Instance variable for storing account balance
  private double amount;

  // Parameterized constructor to initialize the amount
  public Bank(double amount) {
      this.amount = amount;
  }

  // Method to withdraw money from the account
  public void withdraw(double withdrawalAmount) {
      String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
      System.out.println(message);
      if (withdrawalAmount <= amount) {
          amount -= withdrawalAmount;
      }
  }

  // Method to deposit money into the account
  public void deposit(double depositAmount) {
      amount += depositAmount;
      System.out.println("Deposit successful");
  }

  // Method to display the total balance
  public void displayBalance() {
      System.out.println("Total balance: " + amount);
  }

  // Main method to test the program
  public static void main(String[] args) {
      // Initialize the Bank object with an initial balance of 10000
      Bank bankAccount = new Bank(10000);

      // Perform a withdrawal of 2000
      bankAccount.withdraw(2000);

      // Deposit 5000 into the account
      bankAccount.deposit(5000);

      // Display the final balance
      bankAccount.displayBalance();
  }
}
