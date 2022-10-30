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
    public Text(final byte[] bytes){
        super(bytes);
    }



}
