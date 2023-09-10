import java.lang.reflect.Array;
import java.util.*;
/* File: MyArrayBag.java
 * By: Daniel Smirnoff
 * Date: 9/9/2023
 * Compile:
 * Usage: Run ArrayBagTest.java to run tests
 * System: I think every system
 * Description: Basic java bag class
 */

public class MyArrayBag <T> implements MyArrayBagInterface <T> {
    private final T[] bag; //Main bag
    private static final int DEFAULT_CAPACITY = 10; //Default capacity for the bag
    private int numOfEntries; //Holds number of entries

    /*******************************************************************************************************/
    //Constructors ------------------------------------------------
    public MyArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayBag (int capacity) {
        numOfEntries = 0;
        T[] tempBag = (T[]) new Object [capacity];
        bag = tempBag;
    }

    /*******************************************************************************************************/
    //Core Methods ------------------------------------------------
    public boolean add(T newEntry) { //Add Method
        boolean result = true;
        if(isFull()) {
            result = false;
        } else {
            bag[numOfEntries] = newEntry;
            numOfEntries++;
        }
        return result;
    }
    /*******************************************************************************************************/
    public boolean isFull() { //Checks if bag is full by comparing entries to length
        return numOfEntries == bag.length;
    }
    /*******************************************************************************************************/
    public boolean isEmpty() { //Checks if bag is Empty if entries == 0
        return numOfEntries == 0;
    }
    /*******************************************************************************************************/
    public int getCurrentSize() { //Returns number of entries
        return numOfEntries;
    }
    /*******************************************************************************************************/
    public MyArrayBag<T> union(MyArrayBag<T> otherBag) { //Union function merges this array and another given array returning it in a unionized bag
        int resultSize = (getCurrentSize() + otherBag.getCurrentSize());
        MyArrayBag<T> result = new MyArrayBag<T>(resultSize);
        for (int i = 0; i < getCurrentSize(); i++) {
            result.add(bag[i]);
        }
        T[] otherArray = otherBag.toArray();
        for (int i = 0; i < otherArray.length; i++) {
            result.add(otherArray[i]);
        }

        return result;
    }
    /*******************************************************************************************************/
    public T remove() { //Removes an unspecified Item usually the last item in the array
        T result = null;
        if(numOfEntries > 0) {
            result = bag[numOfEntries - 1];
            bag[numOfEntries - 1] = null;
            numOfEntries--;
        }
        return result;
    }
    /*******************************************************************************************************/
    public boolean remove(T anEntry) { //Removes the first instance of a specific item
        for (int i = 0; i < bag.length; i++) {
            if(bag[i] == null) continue;
            if(bag[i].equals(anEntry)) {
                bag[i] = bag[numOfEntries - 1];
                bag[numOfEntries - 1] = null;
                numOfEntries--;
                return true;
            }
        }
        return false;
    }
    /*******************************************************************************************************/
    public int findAndRemove(T anEntry) { //Removes all instances of given item in the bag
        int count = 0;
        for (int i = 0; i < bag.length; i++) {
            if(bag[i] == null) continue;
            if(bag[i].equals(anEntry)) {
                bag[i] = bag[numOfEntries - 1];
                bag[numOfEntries - 1] = null;
                numOfEntries--;
                count++;
            }
        }
        return count;
    }
    /*******************************************************************************************************/

    

    //Extra Methods ------------------------------------
    public int getMaxSize() {
        return DEFAULT_CAPACITY;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        for(int i = 0; !found && (i < numOfEntries); i++) {
            if(anEntry.equals(bag[i])) {
                found = true;
            }
        }
        return found;
    }

    public T[] toArray() {
        return bag;
    }
    public MyArrayBag<T> GetBag() {
        return this;
    }
    public Object[] Count() {
        return CountVowelsAndConsonants();
    }

    public Object[] CountVowelsAndConsonants() { //Method returns a new bag containing the letters but excluding the vowels
        MyArrayBagInterface<String> letters = new MyArrayBag<String>(26);
        MyArrayBagInterface<String> vowels = new MyArrayBag<String>(5);
        MyArrayBagInterface<String> consonants = new MyArrayBag<String>();

        for (int i = 0; i < 26; i++) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            String letter = String.valueOf(alphabet.charAt(i));
            letters.add(letter);
        }
        vowels.add("a"); vowels.add("e"); vowels.add("i"); vowels.add("o"); vowels.add("u");
        Object[] vowelArr = vowels.toArray();
        for (int i = 0; i < 5; i++) {
            letters.findAndRemove((String)vowelArr[i]);

        }

        return letters.toArray();
    }

    
    
}
