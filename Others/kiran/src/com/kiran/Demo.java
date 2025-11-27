package com.kiran;

import java.util.Scanner;

class bank {

int balance = 500;
int deposit1;

int withdraw;
int opt;
int bpin = 1010;
static int count = 0;
Scanner s = new Scanner(System.in);

public bank() {
System.out.print("-------------------------------------");
System.out.println("Welcome to SBI BANK");
System.out.println("-------------------------------------");
}

public void validate_pin() {

System.out.println("Enter 4 digit pin");
int pin = s.nextInt();
char a = 'Y';
while (a == 'Y') {
if (pin == bpin) 
{
System.out.println("Welcome to SBI BANK");
a = 'N';
} 
else {

System.out.println("invalid pin");

count++;

if (count == 3) {

System.out.println("Contact bank manager");
System.exit(0);

} else {

validate_pin();
return;

}

}

}
}

void deposit() {
System.out.println("Welcome to SBI");
System.out.println("Dear customer enter the deposit amount ");

deposit1 = s.nextInt();
balance = balance + deposit1;

}

void account_balance() {

System.out.println("Dear customer your account balance is:" + balance);
}

void withdarw_amount() {
System.out.println("Welcome to SBI");
System.out.println("Dear customer enter withdraw amount");
withdraw = s.nextInt();
balance = balance - withdraw;
System.out.println("Dear Customer your account balance is:" + balance);
}

}

public class Demo {

public static void main(String... k) {
bank b = new bank();
int pin;
Scanner s = new Scanner(System.in);

b.validate_pin();
int choice = 0;
while (choice != 4) {
System.out.println("The following options are ");

System.out.println("1 Deposit");
System.out.println("2 Account Balance");
System.out.println("3 Withdraw");

System.out.println("4 Exit&quot");
System.out.println("Enter the choice");
choice = s.nextInt();
switch (choice) {

case 1:
b.deposit();
break;
case 2:
b.account_balance();
break;
case 3:
b.withdarw_amount();
break;

default:
	System.out.println("THANK YOU VISIT AGAIN SBI");
System.exit(0);


}
}
}
}