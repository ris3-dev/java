//task1
//public class StringLength {
//    public static void main(String[] args) {
//
//        String fruit = "banana";
//        int length = fruit.length();
//        System.out.println("The length of string: " + fruit + " is: " + length + " letters");
//    }
//}

//task 2
//public class StringCharAtIndex {
//    public static void main(String args[]) {
//        String fruit = "Banana";
//        char letter = fruit.charAt(1);
//        System.out.println("The character at index 1 is: " + letter);
//    }
//}

//task 3
//public class Main{
//    public static void main(String args[]) {
//        String fruit = "Banana";
//
//        String partFrom1To4 = fruit.substring(1, 4);
//        String partFrom4To5 = fruit.substring(4, 6);
//
//        System.out.println("The full string is: " + fruit);
//        System.out.println("The string from index 1 to 4 is: " + partFrom1To4);
//        System.out.println("The string from index 4 to 5 is: " + partFrom4To5);
//    }
//}

//task 4
//public class StringUseEqualsMethod{
//    public static void main(String args[]) {
//        String fruit = "Banana";
//        String fruit2 = "Cherry";
//        String fruit3 = "Peach";
//
//        boolean result = fruit.equals(fruit2);
//
//        System.out.println(" Fruit " + fruit + " is equal to " + fruit2 + "?: " + result);
//    }
//}

//task 5
//public class StringUpperLower {
//    public static void main(String args[]) {
//        String fruit = "banana";
//
//        String fruitInUpperCase = fruit.toUpperCase();
//        String fruitLowerCase = fruit.toLowerCase();
//
//        System.out.println(fruitInUpperCase + fruitLowerCase);
//    }
//}

//task 6
//public class StringContainSubstring {
//    public static void main(String args[]) {
//        String fruit =  "plum";
//        boolean hasAna = fruit.contains("um");
//        boolean hasBrooks = fruit.contains("brooks");
//
//        System.out.println(hasAna);
//        System.out.println(hasBrooks);
//    }
//}

//task 7
//public class StringReplaceAllChar {
//    public static void main(String args[]) {
//        String fruit = "Banana";
//
//        String fruitWith_A_replaceWith_O= fruit.replace('a', 'o');
//
//        System.out.println(fruitWith_A_replaceWith_O);
//    }
//}

//activities
//public class namingCharacter {
//    public static void main(String args[]) {
//        String name = "Harry";
//        String surname = "Johnson";
//
//        String username = name + surname;
//        String usernameLowerCase = username.toLowerCase();
//
//        String email = usernameLowerCase + "@gmail.com";
//
//        String replaceEmail = email.replace('g', 'h');
//
//        System.out.println(replaceEmail);
//    }
//}

//activites2
//public class Main {
//
//    public static void main(String[] args) {
//        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
//        int titleLength = bookTitle.length();//TODO: Complete the code statement to find out the length of bookTitle
//                System.out.println("Length of the book title: " + titleLength);
//
//        //Declare and initialise the length of shortened book title
//
//        int maxLength = 20;
//        // Shortened the book title
//        String shortBookTitle = bookTitle.substring(0, maxLength);// TODO: Write the code to shorten the bookTitle to 20 characters
//
//                System.out.println("Original title: " + bookTitle);
//        System.out.println("Shortened title: " + shortBookTitle);
//
//        // Declare and initialize the searchWord
//        String searchWord = "Captain";
//
//        // Check if the searchWord is present in book title
//        boolean containsWord = bookTitle.contains(searchWord);//TODO: Write the code snippet to check if searchWord is present in bookTitle.
//                System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);
//    }
//}
//

//string activities array
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        Integer[] intArray = {2, 5, 46, 12, 34};
//        System.out.println(Arrays.asList(intArray));
//    }
//}




//assignment
//public class Main {
//    public static void main(String[] args) {
//        //TODO 1: Declare and initialize variable for Number of tickets
//        int numberOfTickets = 8;
//        System.out.println("Total number of tickets: " + numberOfTickets);
//
//        //TODO 1: Declare and initialize variable for Price per ticket
//        double priceOfTicket = 10.57;
//        System.out.println("The price per ticket in USD: " + priceOfTicket);
//
//        //TODO 2: Calculate the total price based on number of tickets and price per ticket
//        double totalPrice = priceOfTicket * numberOfTickets;
//        System.out.println("Total price for " + numberOfTickets + " tickets: $" + totalPrice);
//
//    }
//}
//

//practice
//public class Main {
//    public static void main(String[] args) {
//
//        boolean dollarsToSpareInPocketToday = false;
//
//        if( dollarsToSpareInPocketToday )
//        {
//            System.out.println("I will go to the Movies");
//        } else
//        {
//            if(dollarsToSpareInPocketToday)
//            {
//                System.out.println("I will go to a Cafe for a cup of coffee.");
//            } else
//            {
//                System.out.println("I will chill at home.");
//            }
//        }
//    }
//}

//123//
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Integer [] intArray = { 2, 4, 6, 8, 10 };
//
//        List<Integer> list = Arrays.asList(intArray);
//
//        Iterator<Integer> it = list.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        }
//
//    }

//activities

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter your age!: ");
//        int age = keyboard.nextInt();
//
//        System.out.println("Enter your money: ");
//        float money = keyboard.nextFloat();
//
//        keyboard.nextLine();
//        System.out.println("Enter your name: ");
//        String name = keyboard.nextLine();
//
//        System.out.println(name + " age " + age + " has " + money +  " dollars in pocket" );
//    }
//}

//switch
// import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);

//        System.out.println("Enter the flavour of your choice: ");
//        String flavour = keyboard.nextLine();

//        switch (flavour) {
//            case "Strawberry":
//                System.out.println("I will enjoy Strawberry");
//                break;

//            case "Vanilla":
//                System.out.println("I will enjoy vanilla");
//                break;

//            case "Mango":
//                System.out.println("I will enjoy Mango");
//                break;

//            default:
//                System.out.println("I will enjoy glass of water");
//                break;
//        }
//    }
// }

// switch statement calculator

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);

       System.out.println("Enter the 1st number");
       int number1 = keyboard.nextInt();

       System.out.println("Enter the 2nd number");
       int number2 = keyboard.nextInt();

       System.out.println("Enter the Operator");
       //check if the new line is there in the input buffer
       if(keyboard.hasNextLine()){
           keyboard.nextLine();
       }
       String operator = keyboard.nextLine();

       int result = 0;
       switch(operator){
           case "+":
               result = number1 + number2;
               break;

           case "-":
               result = number1 - number2;
               break;

           case "*":
               result = number1 * number2;
               break;

           case "/":
               result = number1 / number2;
               break;

           default:
               System.out.println("Invalid operator");
       }
       System.out.println("The result is: " + result);
   }
}
























