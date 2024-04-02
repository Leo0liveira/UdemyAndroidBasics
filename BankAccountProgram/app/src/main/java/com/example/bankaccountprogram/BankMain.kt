package com.example.bankaccountprogram

fun main(){
    val leoBankAccount = BankAccount("Leonardo Oliveira", 1313.21)

    leoBankAccount.deposite(200.00)
    leoBankAccount.withdraw(1000.02)
    leoBankAccount.deposite(3300.00)
    leoBankAccount.withdraw(500.51)
    leoBankAccount.deposite(200.00)
    leoBankAccount.withdraw(100.03)

    leoBankAccount.acctBalance()


    leoBankAccount.displayTransactionHistory()
    println("${leoBankAccount.accountHolder}'s balance is $${leoBankAccount.acctBalance()}")

}