import java.util.*;
    /* File: ArrayBagTest.java
    * By: Daniel Smirnoff
    * Date: 9/9/2023
    * Compile:
    * Usage: Run main to start up tests. Each test runs a method and gets back results compare results to comments in the code to make sure everything checks out
    * System: I think every system
    * Description: bag test Driver
    */
public class ArrayBagTest {

    static MyArrayBagInterface<String> bag = new MyArrayBag<String>(); //Main Bag

    static MyArrayBagInterface<String> Union1bag = new MyArrayBag<String>(); //Union bags
    static MyArrayBagInterface<String> Union2bag = new MyArrayBag<String>();
    static MyArrayBagInterface<String> UnionResult = new MyArrayBag<String>();

    /*Run the main function to run tests */

    public static void main(String[] args) {
        

        //Check Add && IsEmpty && IsFull && CurrentSize / If Items get added both times and are in order with the max items being 10 then it passes
        System.out.println("\u001B[33mAdd Tests----------------------------");
        DisplayBag();
        System.out.println("Adding 5 Items");
        bag.add("Milk"); bag.add("Shampoo"); bag.add("Conditioner"); bag.add("Eggs"); bag.add("Bacon");
        DisplayBag();


        bag.add("Milk"); bag.add("Shampoo"); bag.add("Eggs"); bag.add("Conditioner"); bag.add("Bacon");
        System.out.println("5 more items added");
        DisplayBag();

        //Check Remove / If moved milk is true && If it removed 2 eggs && if it removed the latest item in the array then it passes
        System.out.println("Remove Tests----------------------------");
        System.out.println("Removed Milk: " + bag.remove("Milk"));
        DisplayBag();

        System.out.println("Amount of Eggs Removed: " + bag.findAndRemove("Eggs"));
        DisplayBag();

        System.out.println("Removing Unspecified Item: " + bag.remove());
        DisplayBag();

        //Check Union / If returns a combination of union1 and union2 items it passes
        System.out.println("Union Tests----------------------------");
        Union1bag.add("Milk"); Union1bag.add("Water"); Union1bag.add("Cereal");
        Union2bag.add("Eggs"); Union2bag.add("Banana"); Union2bag.add("Hummus");

        UnionResult = Union1bag.union(Union2bag.GetBag());
        Object[] unionArray = UnionResult.toArray();
        for (int index = 0 ; index < unionArray.length ; index++) {
            System.out.print(unionArray[index] + ", ");
        }

        //Check Consonants / If it prints the alphabet without any of the vowels it passes
        System.out.println("-");
        System.out.println("Consonants Tests----------------------------");
        Object[] consonants = bag.Count();
        for (int i = 0; i < consonants.length; i++) {
            System.out.print (consonants[i] + ", ");
        }

        




        
        
    }

    public static void CheckBag() {
        System.out.println("\u001B[34mNumber of Items in Bag: " + bag.getCurrentSize() + " Max Items: " + bag.getMaxSize());
        if(bag.isFull()) {
            System.out.println("\u001B[31mBag Full");
        } else if(bag.isEmpty()){
            System.out.println("\u001B[32mBag Empty");
        } else {
            System.out.println("\u001B[32mHas Space Left");
        }
    }
    public static void DisplayBag() {
        System.out.println ("\u001B[32mThe bag contains the following string(s):");
        Object[] bagArray = bag.toArray();
        for (int index = 0 ; index < bagArray.length ; index++) {
            System.out.print (bagArray[index] + ", ");
        }
        System.out.println ("\u001B[35m");
    }
}
