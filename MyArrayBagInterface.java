public interface MyArrayBagInterface <T>{

    //Core Methods
    public int getCurrentSize(); // gets amount of entries in bag

    public boolean isFull(); //Checks if bag is full

    public boolean isEmpty(); //Check if bag is empty

    public boolean add(T newEntry); //Adds new entry

    public T remove(); //Removes Unspecified Entry

    public boolean remove(T anEntry); //Removes given Entry from bag

    //Extra Methods
    public boolean contains(T anEntry);
    public int getMaxSize(); //Gets the max size of bag
}