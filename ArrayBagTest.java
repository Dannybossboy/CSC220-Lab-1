public class ArrayBagTest {

    static MyArrayBagInterface<String> bag = new MyArrayBag<String>();

    public static void main(String[] args) {
        

        //Check Add && IsEmpty && IsFull && CurrentSize
        CheckBag();

        bag.add("Milk"); bag.add("Shampoo"); bag.add("Conditioner"); bag.add("Eggs"); bag.add("Bacon");
        CheckBag();


        bag.add("Milk"); bag.add("Shampoo"); bag.add("Conditioner"); bag.add("Eggs"); bag.add("Bacon");
        System.out.println("5 more items added");
        CheckBag();

        //Check Remove



        
        
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
}
