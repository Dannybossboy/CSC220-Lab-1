public class MyArrayBag <T> implements MyArrayBagInterface <T> {
    private final T[] bag;
    private static final int DEFAULT_CAPACITY = 10;
    private int numOfEntries;

    public MyArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayBag (int capacity) {
        numOfEntries = 0;
        T[] tempBag = (T[]) new Object [capacity];
        bag = tempBag;
    }


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

    public T[] toArray() {
        return null;
    }

    public boolean isFull() {
        return numOfEntries == bag.length;
    }

    public boolean isEmpty() {
        return numOfEntries == 0;
    }

    public int getCurrentSize() {
        return numOfEntries;
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

    public T remove() {
        T result = null;
        if(numOfEntries > 0) {
            result = bag[numOfEntries - 1];
            bag[numOfEntries - 1] = null;
            numOfEntries--;
        }
        return result;
    }
    public int getMaxSize() {
        return DEFAULT_CAPACITY;
    }
    
    public boolean remove(T anEntry) {
        /*
        int index = getIndexOf();
        T result = removeEntry(index);
        return anEntry.equals(result);
        */
        return false;
    }
    
}
