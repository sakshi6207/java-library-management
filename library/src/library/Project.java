package library;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		char Y; 
		do {
		System.out.println("******************Library Management System******************");
		System.out.println("press 1 to add a book");
		System.out.println("press 2 to issue a book");
		System.out.println("press 3 to return a book");
		System.out.println("press 4 to  print complete issue book details");
		System.out.println("press 5 to exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int x=sc.nextInt();
		
		switch(x) {
		case 1:
			Library s1=new Library();
			s1.add();
			break;
		case 2:
			Library s2=new Library();
			s2.issue();
			break;
		case 3:
			Library s3=new Library();
			s3.ret();
			break;
		case 4:
			Library s4=new Library();
			s4.detail();
			break;
		case 5:
			Library s5=new Library();
			s5.exit();
			break;
	default:
		System.out.println("Invalid Number");
		}
		System.out.println("You want to select next option Y/N");
		Y=sc.next().charAt(0);
		}
		while(Y=='y'|| Y=='Y');
		
		if(Y=='n'|| Y=='N') {
			Library z=new Library();
			z.exit();
		}

		
		}
}
	

class Library
{
	
	 static int num,total;
	 static String name,Bdate,RDate;
	void add()
	{
		System.out.println("Enter book name,price and Book_no: ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		float price=sc.nextInt();
		 num=sc.nextInt();
		System.out.println("your details is:"+name+" "+price+" "+num);
	}
	void issue() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Book name:");
		name=sc.nextLine();
		System.out.println("enter book id:");
		num=sc.nextInt();
		sc.nextLine();
		System.out.println("issue date:");
		Bdate=sc.nextLine();
		System.out.println("Total num of Book issued");
		total=sc.nextInt();
		sc.nextLine();
		System.out.println("Return book date");
		RDate=sc.next();	
	}
   int getid() {
	return num;   
   }
	
	void ret() 
			{
		System.out.println("Enter Student_name & book_id:");
		Scanner sc=new Scanner(System.in);
		String name1=sc.nextLine();
		int id=sc.nextInt();
		if(num==id) {
			System.out.println("Total Details:");
			System.out.println("Book Name:"+ Library.name);
			System.out.println("Book id:"+ Library.num);
			System.out.println("Issue date"+ Library.Bdate);
			System.out.println("Total num of book issued"+ Library.total);
			System.out.println("Book return date:"+ Library.RDate);		
     }
		else {
			System.out.println("Wrong id,pls Enter correct id");
		}		
}
	void detail() 
	{
		
		System.out.println("Book Name:"+ Library.name);
		System.out.println("Book id:"+ Library.num);
		System.out.println("Issue date"+ Library.Bdate);
		System.out.println("Total num of book issued"+ Library.total);
		System.out.println("Book return date:"+ Library.RDate);
}
	void exit()
	{
		System.exit(0);
	}
}
	
