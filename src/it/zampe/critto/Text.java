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
     */
    void subByte(){
        SBox sBox = SBox.getInstance();
        for(int i = 0; i < state.length; i++)
            for(int j = 0; j < state.length; j++)
                state[i][j] = sBox.apply(state[i][j]);
    }

}
