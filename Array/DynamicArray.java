/*
Creating Dynamic Array using Static Array (Not resizeble)

Exmaple - Consider an empty array A of size 2. 
1. insert 7 into A - A = [7, x]
2. insert 3 into A - A = [7, 3]
3. insert 9 into A - not enough size to hold another object
    - Create another static array of size double of the original array
    - Copy the content of the original static array to new array
*/
package Array;

public class DynamicArray {
    private int maxSize;
    private int currentSize = 0;
    int[] currentArray = new int[1];

    //Initialising array to size
    public DynamicArray(int size) {
        System.out.println("Inside the package");
        this.maxSize = size;
    }

    public void Add(int element) {
        // currentSize = length ; then double the size of the array
        if(currentSize == currentArray.length) {
            // Generate new array with double of the size
            int[] newStaticArray = new int[2*currentSize];

            // move the all the elements from current array into the newly created
            currentArray = Shuffle(currentArray, newStaticArray);
        }
        this._Add(element);
    }

    private Boolean _Add(int element) { 
        this.currentArray[currentSize] = element;
        this.currentSize++;
        return true;
    }

    private int[] Shuffle(int oldArray[], int newArray[]) {
        for(int i = 0;  i < oldArray.length; i++){
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
//        DynamicArray da = new DynamicArray(4);
    }
}
