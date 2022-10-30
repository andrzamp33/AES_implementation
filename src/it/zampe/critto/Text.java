package it.zampe.critto;

/**
 * Concrete and mutable ADT which represent the plainText and its transformations. Also includes transformational
 * methods to change the state of the text.
 */
public class Text extends State{

    /**
     * Constructor that instantiates the 4 by 4 matrix
     * @param bytes an array of bytes in which there are all 16 bytes. The bytes must be ordered
     *              from the top left one to the bottom right one, following the rows order.
     * @pre the array must be in the correct form and must contain all 16 bytes.
     */
    public Text(final int[] bytes){
        super(bytes);
    }

    /**
     * Uses the s-box to substitute the bytes in the text
     * First phase of the AES encryption during the middle 9 rounds
     */
    void subByte(){
        SBox sBox = SBox.getInstance();
        for(int i = 0; i < state.length; i++)
            for(int j = 0; j < state.length; j++)
                state[i][j] = sBox.apply(state[i][j]);
    }

    /**
     * Second phase of the AES encryption during the middle 9 rounds
     */
    void shiftRows(){
        for(int i = 1; i < state.length; i++)
            for(int j = 0; j < i; j++)
                shift(state[i]);

    }

    /**
     * internally used to factor code
     * this method makes a single left shift in the array passed
     * @param arr the array to singularly left shift
     */
    private void shift(int[] arr){
        int head = arr[0];
        for(int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i+1];
        arr[arr.length-1] = head;
    }
}
