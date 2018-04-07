package booksshopping;
import java.util.*;

public class Details {
    Scanner s=new Scanner(System.in);
    protected int price=0,serial,details;

    Details()
    {
        System.out.println("Books available with us-");
        System.out.println("1. Let Us C");
        System.out.println("2. Let Us C++");
        System.out.println("3. Programming with JAVA");
        System.out.println("4. Core PYTHON Programming");
        System.out.println("");

        do
        {
            System.out.println("Do you want to see Details of any Book? -1. Yes or 2.No");
            details=s.nextInt();
            if(details==1)
            {
                System.out.println("Enter the Serial Number of the book whose details you want to see");
                serial=s.nextInt();
                if(serial==1)
                {
                    System.out.println("Name of the Book: 'Let Us C'");
                    System.out.println("Author: Yashavanth Kanetkar");
                    System.out.println("Price: Rs.244");
                    System.out.println("Other Details: For C language programmers, it is must to master the complexity of the language to deal with programming software in engineering, gaming and other fields.");
                }
                else if(serial==2)
                {
                    System.out.println("Name of the Book: 'Let Us C++'");
                    System.out.println("Author: Yashavanth Kanetkar");
                    System.out.println("Price: Rs.243");
                    System.out.println("Other Details: Let Us C++ is one of the best books ever written on the programming language C++. The book comes with a CD-ROM that has codes, demos, executables and compliers. MATLAB examples have also been added to the book. The book is lucidly written, similar to all the previous editions of the book, which were successful.");
                }
                else if(serial==3)
                {
                    System.out.println("Name of the Book: 'Programming with JAVA'");
                    System.out.println("Author: Herbert Schildt");
                    System.out.println("Price: Rs.713");
                    System.out.println("Other Details: A step-by-step guide by the famous computing author Herbert Schildt, Java: The Complete Reference, Seventh Edition is an introductory book to Java. Whether a person is a rookie or a pro programmer, this book is for everyone. Introducing the readers to Java from the scratch to its importance and contribution to the web, the book has it all.");
                }
                else if(serial==4)
                {
                    System.out.println("Name of the Book: 'Core PYTHON Programming'");
                    System.out.println("Author: ");
                    System.out.println("Price: Rs.243");
                    System.out.println("Other Details: This book covers almost all the concepts of Python in an easy and simple language. The reader starts at the basic level and goes up to the higher levels as he/she gains knowledge of the concepts.");
                }
            }
        }while(details==1);
        System.out.println("");
        System.out.println("Please ensure a minimum account balance of Rs.500");
        System.out.println("");
    }
}
}
