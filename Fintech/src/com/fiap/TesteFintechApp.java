package com.fiap;
import java.util.Date;

public class TesteFintechApp {
	public static void main(String[] args) {
	// Criar tipo de categori renda ou despesa
	CategoryType renda = new CategoryType(1, "renda");
	CategoryType despesa = new CategoryType(2,"despesa");
	
	  System.out.println(renda.getTypeName());
	  
	// Criar categorias
	  
	Category salario = new Category(1, "salario", renda);
	Category ações = new Category (2, "ações", renda);
	Category alimentação = new Category(3, "alimentação", despesa);
	Category transporte = new Category(4, "transporte", despesa);
	
	// Cria usuários free e premium(uso de herança)
	FreeUser freeUser1 = new FreeUser(1, "alinefree", "senha123", "alinefree@email.com" );
	UserPremium premiumUser = new UserPremium(2, "premiumUser", "senhapremium", "premium@email.com");
	
	// Cria transações
	
	Date transactionDate = new Date();
	Transaction transacaoReceitaSalario = new Transaction(1, freeUser1, 3000, transactionDate, salario);
	Transaction transacaoDespesaComida = new Transaction(2, freeUser1, 600, transactionDate, alimentação);
	
	Transaction transacaoReceitaAção = new Transaction(3, premiumUser, 10000, transactionDate, ações);
	Transaction transacaoDespesaTransp = new Transaction(4, premiumUser, 50, transactionDate, transporte);
	
	//Adiciona Transacao ao usuario
	
	freeUser1.addTransaction(transacaoReceitaSalario);
	freeUser1.addTransaction(transacaoDespesaComida);
	premiumUser.addTransaction(transacaoReceitaAção);
	premiumUser.addTransaction(transacaoDespesaTransp);
	
	// Teste para ver se as transações estão aparecendo para o respectivo usuário
	System.out.println("Transações de " + freeUser1.getUsername() + ":");
		for (Transaction transaction : freeUser1.getTransactions()) {
			 System.out.println("Transaction ID: " + transaction.getTransactionId());
	            System.out.println("Amount: " + transaction.getAmount());
	            System.out.println("Date: " + transaction.getDate());
	            System.out.println("Category: " + transaction.getCategory().getName());
	            System.out.println("------------");
		}
		
	System.out.println("Transações de " + premiumUser.getUsername() + ":");
	for (Transaction transaction : premiumUser.getTransactions()) {
		 System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println("Date: " + transaction.getDate());
            System.out.println("Category: " + transaction.getCategory().getName());
            System.out.println("------------");
	}

	// Criar cursos
	Course financaTop = new Course(1, "FinancaTop", 180.50);
    
	// Inscreva o usuário premium em cursos
	
	premiumUser.ChooseCourse(financaTop);
	// Exiba os cursos em que o usuário premium está inscrito
	
    System.out.println("Cursos inscritos por " + premiumUser.getUsername() + ":");
    for (UserPremiumCourse userPremiumCourse : premiumUser.getListCourses()) {
        System.out.println(userPremiumCourse.getCourse().getName());	
	}
	}
}
