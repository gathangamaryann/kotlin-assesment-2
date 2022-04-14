/*
1.Create a classCurrentAccount with the following attributes:account
number, account name, balance. It has the following functions:
a.deposit(amount: Double) - Increments the balance by the
amount deposited
b.withdraw(amount: Double) - Decrements the balance by the
amount withdrawn
c.details() - Prints out the account number and balance and
name in this format: “Account number x with balance y is
operated by z”(5points)
2.Create another classSavingsAccount. It has the same functions and
attributes as the current account except for one attribute,
withdrawals: Int. Withdrawals is a counter variable that is used to
keep track of how many withdrawals have been made from the account
in a year. The only other difference is that the savings account
withdraw() method first checks if the number of withdrawals is less
than 4 for it to allow one to withdraw money from the account. It also
increments the withdrawals attribute after a successful withdrawal
(5points)
3.A product is represented by a data class with these attributes: name,
weight, price, category. Category can either be groceries, hygiene or
other. Write a function that takes in a product and uses a when
statement to assign each product to a list based on its category
(3 points)
4.Write a function that given a string returns a string composed of only
the characters in even indices. For example given “banana” it will return
“bnn”(2 points)*/





fun main(){
    var money=CurrentAccount(5649,"mymoney",3569.3)
    var veggies=Product("cabbage",3.4,60,"groceries")
    var cotton = Product("pinky",2.3,300,"towel")
    var pen = Product("bluepen",1.3,40,"others")






}
 class CurrentAccount(var accountnumber:Int,var accountname:String, var balance:Double){
     fun deposit(amount:Double){
         var depots=500
         println(balance+depots)

     }
     fun withdrawal(amount: Double){

     }
     fun details(){

     }
 }

class SavingsAccount(var accountnumber: Int,var accountname: String,var balance: Double){
    fun  withdrawal(withdrawal:Int){

    }
}
data class Product(var name:String,var weight:Double,var price:Int,var category:String){
    fun clothes(){

    }
    fun food(){

    }
    fun stationery(){

    }
}

fun fruit():String{

    var type = "banana"

    println(fruit())
    return type
}
