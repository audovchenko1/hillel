import java.util.*;

public class Main {
    public static void main(String[] args) {
        //slide 1
        ArrayList<Integer> collection = new ArrayList<>();
        System.out.println("Slide 1: created empty collection");

        //slide 2
        ArrayList<Integer> filledCollection = fillCollectionWithRandomValues(collection);
        System.out.println("Slide 2: ");
        System.out.println(filledCollection);

        //slide 3
        ArrayList<Integer> copiedCollection = copyCollection(filledCollection);
        System.out.println("Slide 3: ");
        System.out.println(copiedCollection);

        //slide 4
        ArrayList<Integer> unique = getUniqueCollection();
        System.out.println("Slide 4: ");
        System.out.println(unique);

        //slide 5
        ArrayList<Integer> sortedCollection = sortCollection(unique);
        System.out.println("Slide 5: ");
        System.out.println(sortedCollection);

        //slide 6
        String minMaxAnswer = findMinMax(unique);
        System.out.println("Slide 6: ");
        System.out.println(minMaxAnswer);

        //slide 7
        int sum = getSumOfCollection(unique);
        System.out.println("Slide 7: ");
        System.out.println(sum);

        //slide 8
        ArrayList<Integer> positiveCollection = positiveCollection(filledCollection);
        System.out.println("Slide 8: ");
        System.out.println(positiveCollection);

        //slide 9
        int numToFind = getRandomInt(-10, 10);
        boolean isExists = isExists(filledCollection, numToFind);
        String s = "Number " + numToFind;
        if (!isExists) {
            s += " not";
        }
        s += " exists in collection";
        System.out.println("Slide 9: ");
        System.out.println(s);

        //slide 10
        int numToOccure = getRandomInt(-10, 10);
        int count = countOccurences(filledCollection, numToOccure);
        System.out.println("Slide 10: ");
        System.out.println("Number " + numToOccure + " occurences " + count + " times");

        //slide 11
        ArrayList<Integer> expandedCollection = expandCollectionInReversOrder(filledCollection);
        System.out.println("Slide 11: ");
        System.out.println(expandedCollection);

        //slide 12
        ArrayList<Integer> swappedFirstLastCollection = swappedFirstLast(filledCollection);
        System.out.println("Slide 12: ");
        System.out.println(swappedFirstLastCollection);

        //slide 13
        int secondMaxInCollection = findSecondMaxInCollection(filledCollection);
        System.out.println("Slide 13: ");
        System.out.println("Second max in collection is " + secondMaxInCollection);

        //slide 14
        //prepare palindromic list
        System.out.println("Slide 14: ");
        ArrayList<Integer> col = expandCollectionInReversOrder(new ArrayList<>(
                Arrays.asList(1,2,3,4,5)
        ));
        System.out.println("List: ");
        System.out.println(col);
        boolean isPalindrome = isPalindrome(col);
        System.out.println("Collection palindrome: " + (isPalindrome ? "YES" : "NO"));

        //slide 15
        System.out.println("Step 15: ");
        List<Integer> filledArrayList = add1000000Elements(
            new ArrayList<>()
        );

        List<Integer> filledLinkedList = add1000000Elements(
            new LinkedList<>()
        );

        long start = System.currentTimeMillis();
        getRandom100000(filledArrayList);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("ArrayList time spent: " + timeElapsed + " ms | " + (float) timeElapsed / 1000 + " seconds");

        start = System.currentTimeMillis();
        getRandom100000(filledLinkedList);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("LinkedList time spent: " + timeElapsed + " ms | " + timeElapsed / 1000 + " seconds");
    }

    /**
     * Slide 2
     */
    private static ArrayList<Integer> fillCollectionWithRandomValues(ArrayList<Integer> collection)
    {
        Random a = new Random();
        int max = 10;
        int min = -10;
        for (int i =0; i < 10; i++){
            collection.add(a.nextInt(max + 1 - min) + min);
        }

        return collection;
    }

    /**
     * Slide 3
     */
    private static ArrayList<Integer> copyCollection(ArrayList<Integer> target)
    {
        return new ArrayList<Integer>(target);
    }

    /**
     * Slide 4
     */
    private static ArrayList<Integer> getUniqueCollection() {
        ArrayList<Integer> unique = new ArrayList<>();

        Random a = new Random();
        int max = 25;
        int min = 1;

        while (unique.size() < 10) {
            int randNumber = a.nextInt(max + 1 - min) + min;
            if (!unique.contains(randNumber)) {
                unique.add(randNumber);
            }
        }
        return unique;
    }

    /**
     * Slide 5
     */
    private static ArrayList<Integer> sortCollection(ArrayList<Integer> collection) {
        Collections.sort(collection);
        return collection;
    }

    /**
     * Slide 6
     */
    private static String findMinMax(ArrayList<Integer> collection) {
        Collections.sort(collection);

        int maxInCollection = collection.get(collection.size() - 1);
        int minInCollection = collection.get(0);

        return "Min value: " + minInCollection + "\n\rMax value: " + maxInCollection;
    }

    /**
     * Slide 7
     */
    private static int getSumOfCollection(ArrayList<Integer> collection) {
        int sum = 0;
        for( Integer item : collection){
            sum += item;
        }

        return sum;
    }

    /**
     * Slide 8
     */
    private static ArrayList<Integer> positiveCollection(ArrayList<Integer> collection) {
        ArrayList<Integer> positiveCollection = new ArrayList<>();
        for (Integer item : collection) {
            if(item >= 0){
                positiveCollection.add(item);
            }
        }

        return positiveCollection;
    }

    /**
     * Slide 9
     */
    private static boolean isExists(ArrayList<Integer> collection, int number) {
        return collection.contains(number);
    }

    /**
     * Slide 10
     */
    private static int countOccurences(ArrayList<Integer> checkCollection, int number) {
        int count = 0;
        for (Integer item : checkCollection){
            if(item == number){
                count++;
            }

        }
        return count;
    }

    /**
     * Slide 11
     */
    private static ArrayList<Integer> expandCollectionInReversOrder(ArrayList<Integer> collection) {
        int lenght = collection.size() - 1;
        for(int i = lenght; i >= 0; i--) {
            collection.add(collection.get(i));
        }

        return collection;
    }

    /**
     * Slide 12
     */
    private static ArrayList<Integer> swappedFirstLast(ArrayList<Integer> collection) {
        Collections.swap(collection, 0, collection.size() - 1);
        return collection;
    }

    /**
     * Slide 13
     */
    private static int findSecondMaxInCollection(ArrayList<Integer> collection) {
        int maxInCollection;
        Collections.sort(collection);
        maxInCollection = collection.get(collection.size() - 1);
        int length = collection.size() - 1;
        int secondMaxInCollection = 0;
        for (int i = length; i >= 0; i--) {
            if (collection.get(i) < maxInCollection) {
                secondMaxInCollection = collection.get(i);
                break;
            }
        }

        return secondMaxInCollection;
    }

    /**
     * Slide 14
     */
    private static boolean isPalindrome(ArrayList<Integer> collection) {
        int length = collection.size();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            int a = collection.get(i);
            int b = collection.get(length - 1 - i);
            isPalindrome = a == b;
            if (!isPalindrome) {
                break;
            }
        }

        return isPalindrome;
    }

    /**
     * Slide 15
     */
    private static List<Integer> add1000000Elements(List<Integer> collection) {
        for (int i = 0; i < 1000000; i++) {
            collection.add(i);
        }

        return collection;
    }

    /**
     * Slide 15
     */
    private static void getRandom100000(List<Integer> collection) {
        Random a = new Random();
        int min = 0;
        int max = 99999;
        Integer item = null;
        for (int i = 0; i < 100000; i++) {
            int index = a.nextInt(max + 1 - min) + min;
            item = collection.get(index);
        }
    }

    private static int getRandomInt(int min, int max) {
        Random a = new Random();
        return a.nextInt(max + 1 - min) + min;
    }
}