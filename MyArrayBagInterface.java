public interface MyArrayBagInterface <T>{
    /* File: MyArrayBagInterface.java
    * By: Daniel Smirnoff
    * Date: 9/9/2023
    * Compile:
    * Usage: Run ArrayBagTest.java to run tests
    * System: I think every system
    * Description: Basic java bag interface
    */

    //Core Methods-----------------------------------------------------
    public int getCurrentSize(); // gets amount of entries in bag

    public boolean isFull(); //Checks if bag is full

    public boolean isEmpty(); //Check if bag is empty

    public boolean add(T newEntry); //Adds new entry

    public T remove(); //Removes Unspecified Entry

    public boolean remove(T anEntry); //Removes given Entry from bag

    //Other Required Methods----------------------------------------------

    public int findAndRemove(T anEntry);

    public MyArrayBag<T> union(MyArrayBag<T> otherBag);

    //Extra Methods--------------------------------------------------------
    public boolean contains(T anEntry);
    public int getMaxSize(); //Gets the max size of bag
    public T[] toArray(); // Returns the array of the bag
    public MyArrayBag<T> GetBag(); //Returns the Bag itself
    public Object[] Count(); //Runs the Consonants function
}