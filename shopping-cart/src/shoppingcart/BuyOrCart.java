package booksshopping;
import java.util.*;

public class BuyOrCart extends Details {
    protected int i,num1,num2,input,copy,copy1,copy2,copy3,copy4,serial,serial1,serial2,serial3,serial4,remove,numr;
    protected String str,str1,str2,str3,str4;
    ArrayList<String> a=new ArrayList<String>();

    BuyOrCart()
    {
        System.out.println("Do you want to 1. Buy the book OR 2. Add the book to Cart?");
        input=s.nextInt();
        if(input==1)
        {
            System.out.println("\nPlease enter how many books you want to buy");
            num1=s.nextInt();
            if(num1==1)
            {
                System.out.println("\nPlease enter the Serial Number of the book that you want to buy");
                serial=s.nextInt();
                if(serial == 1)
                    str = "Let us C";
                else if(serial == 2)
                    str = "Let us C++";
                else if(serial == 3)
                    str = "Programming with JAVA";
                else if(serial == 4)
                    str = "Core PYTHON Programming";

                System.out.format("\nHow many copies of '%s' do you want?",str);
                copy=s.nextInt();
                if(serial==1)
                {
                    for(i=1;i<=copy;i++)
                    {
                        price+=244;
                    }

                }
                else if(serial==2)
                {
                    for(i=1;i<=copy;i++)
                    {
                        price+=243;
                    }
                }
                else if(serial==3)
                {
                    for(i=1;i<=copy;i++)
                    {
                        price+=713;
                    }
                }
                else if(serial==4)
                {
                    price+=243;
                }

            }
            else if(num1==2)
            {
                System.out.println("\nPlease enter the Serial Numbers of the books that you want to buy");
                serial1=s.nextInt();
                serial2=s.nextInt();
                if(serial1 == 1 && serial2 == 2) {
                    str1 = "Let us C";
                    str2 = "Let us C++";
                }
                else if(serial1 == 1 && serial2 == 3) {
                    str1 = "Let us C";
                    str2 = "Programming with JAVA";
                }
                else if(serial1 == 1 && serial2 == 4) {
                    str1 = "Let us C";
                    str2 = "Core PYTHON Programming";
                }
                else if(serial1 == 2 && serial2 == 3) {
                    str1 = "Let us C++";
                    str2 = "Programming with JAVA";
                }
                else if(serial1 == 2 && serial2 == 4) {
                    str1 = "Let us C++";
                    str2 = "Core PYTHON Programming";
                }
                else if(serial1 == 3 && serial2 == 4) {
                    str1 = "Programming with JAVA";
                    str2 = "Core PYTHON Programming";
                }

                System.out.printf("How many copies of '%s' do you want?",str1);
                copy1=s.nextInt();
                System.out.printf("How many copies of '%s' do you want?",str2);
                copy2=s.nextInt();
                if(serial1==1 && serial2==2)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=243;
                    }
                }
                else if(serial1==1 && serial2==3)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=713;
                    }
                }
                else if(serial1==1 && serial2==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=243;
                    }
                }
                else if(serial1==2 && serial2==3)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=243;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=713;
                    }
                }
                else if(serial1==2 && serial2==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=243;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=243;
                    }
                }
                else if(serial1==3 && serial2==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=713;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=243;
                    }
                }
            }
            else if(num1==3)
            {
                System.out.println("\nPlease Enter the serial numbers of the books that you want to purchase");
                serial1=s.nextInt();
                serial2=s.nextInt();
                serial3=s.nextInt();
                if(serial1 == 1 && serial2 == 2 && serial3 == 3) {
                    str1 = "Let us C";
                    str2 = "Let us C++";
                    str3 = "Programming with JAVA";
                }
                else if(serial1 == 1 && serial2 == 3 && serial3 == 4) {
                    str1 = "Let us C";
                    str2 = "Programming with JAVA";
                    str3 = "Core PYTHON Programming";
                }
                else if(serial1 == 2 && serial2 == 3 && serial3 == 4) {
                    str1 = "Let us C++";
                    str2 = "Programming with JAVA";
                    str3 = "Core PYTHON Programming";
                }
                else if(serial1 == 1 && serial2 == 2 && serial3 == 4) {
                    str1 = "Let us C";
                    str2 = "Let us C++";
                    str3 = "Core PYTHON Programming";
                }

                System.out.printf("\nHow many copies of '%s' do you want?",str1);
                copy1=s.nextInt();
                System.out.printf("\nHow many copies of '%s' do you want?",str2);
                copy2=s.nextInt();
                System.out.printf("\nHow many copies of '%s' do you want?",str3);
                copy3=s.nextInt();
                if(serial1==1 && serial2==2 && serial3==3)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=243;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        price+=713;
                    }
                }
                else if(serial1==1 && serial2==2 && serial3==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=243;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        price+=243;
                    }
                }
                else if(serial1==1 && serial2==3 && serial3==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=713;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        price+=243;
                    }
                }
                else if(serial1==2 && serial2==3 && serial3==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        price+=243;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        price+=713;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        price+=243;
                    }
                }
            }
            else if(num1==4)
            {
                str1 = "Let us C";
                str2 = "Let us C++";
                str3 = "Programming with JAVA";
                str4 = "Core PYTHON Programming";
                System.out.printf("\nHow many books of '%s' do you want?",str1);
                copy1=s.nextInt();
                System.out.printf("\nHow many books of '%s' do you want?",str2);
                copy2=s.nextInt();
                System.out.printf("\nHow many books of '%s' do you want?",str3);
                copy3=s.nextInt();
                System.out.printf("\nHow many books of '%s do you want?",str4);
                copy4=s.nextInt();
                for(i=1;i<=copy1;i++)
                    price+=244;
                for(i=1;i<=copy2;i++)
                    price+=243;
                for(i=1;i<=copy3;i++)
                    price+=713;
                for(i=1;i<=copy4;i++)
                    price+=243;
            }
        }
        else if(input==2)
        {
            System.out.println("");
            System.out.println("Enter the number of books that you want to add to cart");
            num2=s.nextInt();

            String s1=new String("Let Us C");
            String s2=new String("Let Us C++");
            String s3=new String("Programming with JAVA");
            String s4=new String("Core PYTHON Programming");

            if(num2==1)
            {
                System.out.println("");
                System.out.println("Enter the Serial Number of the book that you want to add to cart");
                serial=s.nextInt();
                if(serial == 1)
                    str = "Let us C";
                else if(serial == 2)
                    str = "Let us C++";
                else if(serial == 3)
                    str = "Programming with JAVA";
                else if(serial == 4)
                    str = "Programming with JAVA";
                else if(serial1 == 1 && serial2 == 2) {
                    str1 = "Let us C";
                    str2 = "Let us C++";
                }
                System.out.printf("How many copies of '%s' do you want to add to Cart?",str);
                copy=s.nextInt();
                if(serial==1)
                {
                    for(i=1;i<=copy;i++)
                    {
                        a.add(s1);
                        price+=244;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial==2)
                {
                    for(i=1;i<=copy;i++)
                    {
                        a.add(s2);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial==3)
                {
                    for(i=1;i<=copy;i++)
                    {
                        a.add(s3);
                        price+=713;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial==4)
                {
                    for(i=1;i<=copy;i++)
                    {
                        a.add(s4);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
            }
            else if(num2==2)
            {
                System.out.println("");
                System.out.println("Enter the Serial Numbers of the books that you want to add to cart");
                serial1=s.nextInt();
                serial2=s.nextInt();

                if(serial1 == 1 && serial2 == 2) {
                    str1 = "Let us C";
                    str2 = "Let us C++";
                }
                else if(serial1 == 1 && serial2 == 3) {
                    str1 = "Let us C";
                    str2 = "Programming with JAVA";
                }
                else if(serial1 == 1 && serial2 == 4) {
                    str1 = "Let us C";
                    str2 = "Core PYTHON Programming";
                }
                else if(serial1 == 2 && serial2 == 3) {
                    str1 = "Let us C++";
                    str2 = "Programming with JAVA";
                }
                else if(serial1 == 2 && serial2 == 4) {
                    str1 = "Let us C++";
                    str2 = "Core PYTHON Programming";
                }
                else if(serial1 == 3 && serial2 == 4) {
                    str1 = "Programming with JAVA";
                    str2 = "Core PYTHON Programming";
                }

                System.out.printf("How many copies of '%s' do you want to add to Cart?",str1);
                copy1=s.nextInt();
                System.out.printf("How many copies of '%s' do you want to add to Cart?",str2);
                copy2=s.nextInt();
                if(serial1==1 && serial2==2)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s1);
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s2);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==1 && serial2==3)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s1);
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s3);
                        price+=713;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==1 && serial2==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s1);
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s4);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==2 && serial2==3)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s2);
                        price+=243;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s3);
                        price+=713;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==2 && serial2==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s2);
                        price+=243;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s4);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==3 && serial2==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s3);
                        price+=713;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s4);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
            }
            else if(num2==3)
            {
                int serial1,serial2,serial3,i;
                System.out.println("\nEnter the serial numbers of the books that you want to add to cart");
                serial1=s.nextInt();
                serial2=s.nextInt();
                serial3=s.nextInt();

                if(serial1 == 1 && serial2 == 2 && serial3 == 3) {
                    str1 = "Let us C";
                    str2 = "Let us C++";
                    str3 = "Programming with JAVA";
                }
                else if(serial1 == 1 && serial2 == 3 && serial3 == 4) {
                    str1 = "Let us C";
                    str2 = "Programming with JAVA";
                    str3 = "Core PYTHON Programming";
                }
                else if(serial1 == 2 && serial2 == 3 && serial3 == 4) {
                    str1 = "Let us C++";
                    str2 = "Programming with JAVA";
                    str3 = "Core PYTHON Programming";
                }
                else if(serial1 == 1 && serial2 == 2 && serial3 == 4) {
                    str1 = "Let us C";
                    str2 = "Let us C++";
                    str3 = "Core PYTHON Programming";
                }

                System.out.printf("\nHow many copies of '%s' do you want to add to Cart?",str1);
                copy1=s.nextInt();
                System.out.printf("\nHow many copies of '%s' do you want to add to Cart?",str2);
                copy2=s.nextInt();
                System.out.printf("\nHow many copies of '%s' do you want?",str3);
                copy3=s.nextInt();
                if(serial1==1 && serial2==2 && serial3==3)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s1);
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s2);
                        price+=243;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        a.add(s3);
                        price+=713;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==1 && serial2==2 && serial3==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s1);
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s2);
                        price+=243;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        a.add(s4);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==1 && serial2==3 && serial3==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s1);
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s3);
                        price+=713;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        a.add(s4);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
                else if(serial1==2 && serial2==3 && serial3==4)
                {
                    for(i=1;i<=copy1;i++)
                    {
                        a.add(s2);
                        price+=244;
                    }
                    for(i=1;i<=copy2;i++)
                    {
                        a.add(s3);
                        price+=243;
                    }
                    for(i=1;i<=copy3;i++)
                    {
                        a.add(s4);
                        price+=243;
                    }
                    System.out.println("Cart: "+a);
                    System.out.println("Size of Cart: "+a.size());
                    System.out.println("Price: "+price);
                }
            }
            else if(num2==4)
            {
                str1 = "Let us C";
                str2 = "Let us C++";
                str3 = "Programming with JAVA";
                str4 = "Core PYTHON Programming";

                System.out.printf("\nHow many copies of '%s' do you want to add to Cart?",str1);
                copy1=s.nextInt();
                System.out.printf("\nHow many copies of '%s' do you want to add to Cart?",str1);
                copy2=s.nextInt();
                System.out.printf("\nHow many copies of '%s' do you want to add to Cart?",str3);
                copy3=s.nextInt();
                a.add(s1);
                System.out.printf("\nHow many copies of '%s' do you want to add to Cart?",str4);
                copy4=s.nextInt();
                for(i=1;i<=copy1;i++)
                {
                    a.add(s1);
                    price+=244;
                }
                for(i=1;i<=copy2;i++)
                {
                    a.add(s1);
                    price+=243;
                }
                for(i=1;i<=copy3;i++)
                {
                    a.add(s1);
                    price+=713;
                }
                for(i=1;i<=copy4;i++)
                {
                    a.add(s1);
                    price+=243;
                }
                System.out.println("\nCart: "+a);
                System.out.println("Size of Cart: "+a.size());
                System.out.println("Price: "+price);
            }
            System.out.println("");
            System.out.println("Do you want to remove any books from your cart? - 1.Yes 2.No");
            remove=s.nextInt();
            if(remove==1)
            {
                System.out.println("\nHow many books do you want to remove from your Cart?");
                numr=s.nextInt();
                if(numr<a.size())
                {
                    if(numr==1)
                    {
                        int serial,copyr,i;
                        System.out.println("\nPlease enter the serial number of the book that you want to remove from the Cart");
                        serial=s.nextInt();
                        if(serial == 1)
                            str = "Let us C";
                        else if(serial == 2)
                            str = "Let us C++";
                        else if(serial == 3)
                            str = "Programming with JAVA";
                        else if(serial == 4)
                            str = "Programming with JAVA";
                        else if(serial1 == 1 && serial2 == 2) {
                            str1 = "Let us C";
                            str2 = "Let us C++";
                        }
                        System.out.printf("How many copies of '%s' do you want to remove from the Cart?",str);
                        copyr=s.nextInt();
                        if(serial==1)
                        {
                            for(i=1;i<=copyr;i++)
                            {
                                a.remove(s1);
                                price-=244;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial==2)
                        {
                            for(i=1;i<=copyr;i++)
                            {
                                a.remove(s2);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial==3)
                        {
                            for(i=1;i<=copyr;i++)
                            {
                                a.remove(s3);
                                price-=713;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial==4)
                        {
                            for(i=1;i<=copyr;i++)
                            {
                                a.remove(s4);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                    }
                    else if(numr==2)
                    {
                        int serial1,serial2,copyr1,copyr2,i;
                        System.out.println("\nPlease enter the Serial Numbers of the books that you want to remove");
                        serial1=s.nextInt();
                        serial2=s.nextInt();

                        if(serial1 == 1 && serial2 == 2) {
                            str1 = "Let us C";
                            str2 = "Let us C++";
                        }
                        else if(serial1 == 1 && serial2 == 3) {
                            str1 = "Let us C";
                            str2 = "Programming with JAVA";
                        }
                        else if(serial1 == 1 && serial2 == 4) {
                            str1 = "Let us C";
                            str2 = "Core PYTHON Programming";
                        }
                        else if(serial1 == 2 && serial2 == 3) {
                            str1 = "Let us C++";
                            str2 = "Programming with JAVA";
                        }
                        else if(serial1 == 2 && serial2 == 4) {
                            str1 = "Let us C++";
                            str2 = "Core PYTHON Programming";
                        }
                        else if(serial1 == 3 && serial2 == 4) {
                            str1 = "Programming with JAVA";
                            str2 = "Core PYTHON Programming";
                        }

                        System.out.printf("How many copies of '%s' do you want to remove from the Cart?",str1);
                        copyr1=s.nextInt();
                        System.out.printf("How many copies of '%s' do you want to remove from the Cart?",str2);
                        copyr2=s.nextInt();
                        if(serial1==1 && serial1==2)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s1);
                                price-=244;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s2);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial1==1 && serial1==3)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s1);
                                price-=244;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s3);
                                price-=713;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        if(serial1==1 && serial1==4)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s1);
                                price-=244;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s4);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial1==2 && serial1==3)
                        {
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s2);
                                price-=243;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s3);
                                price-=713;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial1==2 && serial1==4)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s2);
                                price-=243;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s4);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial1==3 && serial1==4)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s3);
                                price-=713;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s4);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                    }
                    else if(numr==3)
                    {
                        int serial1,serial2,serial3,copyr1,copyr2,copyr3,i;
                        System.out.println("\nPlease enter the serial numbers of the books that you want to remove");
                        serial1=s.nextInt();
                        serial2=s.nextInt();
                        serial3=s.nextInt();

                        if(serial1 == 1 && serial2 == 2 && serial3 == 3) {
                            str1 = "Let us C";
                            str2 = "Let us C++";
                            str3 = "Programming with JAVA";
                        }
                        else if(serial1 == 1 && serial2 == 3 && serial3 == 4) {
                            str1 = "Let us C";
                            str2 = "Programming with JAVA";
                            str3 = "Core PYTHON Programming";
                        }
                        else if(serial1 == 2 && serial2 == 3 && serial3 == 4) {
                            str1 = "Let us C++";
                            str2 = "Programming with JAVA";
                            str3 = "Core PYTHON Programming";
                        }
                        else if(serial1 == 1 && serial2 == 2 && serial3 == 4) {
                            str1 = "Let us C";
                            str2 = "Let us C++";
                            str3 = "Core PYTHON Programming";
                        }

                        System.out.printf("How many copies of '%s' do you want to remove from the Cart?",str1);
                        copyr1=s.nextInt();
                        System.out.printf("How many copies of '%s'do you want to remove from the Cart?",str2);
                        copyr2=s.nextInt();
                        System.out.printf("How many copies of '%s' do you want to remove from the Cart?",str3);
                        copyr3=s.nextInt();
                        if(serial1==1 && serial2==2 && serial3==3)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s1);
                                price-=244;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s2);
                                price-=243;
                            }
                            for(i=1;i<=copyr3;i++)
                            {
                                a.remove(s3);
                                price-=713;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial1==1 && serial2==2 && serial3==4)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s1);
                                price-=244;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s2);
                                price-=243;
                            }
                            for(i=1;i<=copyr3;i++)
                            {
                                a.remove(s4);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial1==1 && serial2==3 && serial3==4)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s1);
                                price-=244;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s3);
                                price-=713;
                            }
                            for(i=1;i<=copyr3;i++)
                            {
                                a.remove(s4);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                        else if(serial1==2 && serial2==3 && serial3==4)
                        {
                            for(i=1;i<=copyr1;i++)
                            {
                                a.remove(s2);
                                price-=243;
                            }
                            for(i=1;i<=copyr2;i++)
                            {
                                a.remove(s3);
                                price-=713;
                            }
                            for(i=1;i<=copyr3;i++)
                            {
                                a.remove(s4);
                                price-=243;
                            }
                            System.out.println("\nCart: "+a);
                            System.out.println("Size of Cart: "+a.size());
                            System.out.println("Price: "+price);
                        }
                    }
                    else if(numr==4)
                    {
                        int copyr1,copyr2,copyr3,copyr4,i;
                        str1 = "Let us C";
                        str2 = "Let us C++";
                        str3 = "Programming with JAVA";
                        str4 = "Core PYTHON Programming";

                        System.out.printf("How many copies of'%s' do you want to remove from the Cart?",str1);
                        copyr1=s.nextInt();
                        System.out.printf("How many copies of '%s' do you want to remove from the Cart?",str2);
                        copyr2=s.nextInt();
                        System.out.printf("How many copies of the '%s' do you want to remove from the Cart?",str3);
                        copyr3=s.nextInt();
                        System.out.printf("How many copies of the '%s' do you want to remove from the Cart?",str4);
                        copyr4=s.nextInt();
                        for(i=1;i<=copyr1;i++)
                        {
                            a.remove(s1);
                            price-=244;
                        }
                        for(i=1;i<=copyr2;i++)
                        {
                            a.remove(s2);
                            price-=243;
                        }
                        for(i=1;i<=copyr3;i++)
                        {
                            a.remove(s3);
                            price-=713;
                        }
                        for(i=1;i<=copyr4;i++)
                        {
                            a.remove(s4);
                            price-=243;
                        }
                        System.out.println("\nCart: "+a);
                        System.out.println("Size of Cart: "+a.size());
                        System.out.println("Price: "+price);
                    }
                }
                else{
                    throw new SizeExceededException("Sorry - Size of Present Cart is Exceeded");
                }
            }
            else
            {
                System.out.println("");
            }
        }
    }
}
