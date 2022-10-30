package it.zampe.critto;

/**
 * Mutable abstract class which represents a data structure modelled on a 4x4 matrix of bytes
 */
public abstract class State {

    /**
     * A matrix of int(bytes) that represents the state
     */
    protected int[][] state;

    /**
     * Constructor that instantiates the 4 by 4 matrix
     * @param bytes an array of bytes in which there are all 16 bytes. The bytes must be ordered
     *              from the top left one to the bottom right one, following the rows order.
     * @pre the array must be in the correct form and must contain all 16 bytes.
     */
    protected State(final int[] bytes){
        state = new int[4][4];
        int currentArrayIndex = 0;
        for(int i = 0; i < state.length; i++)
            for(int j = 0; j < state.length; j++)
                state[i][j] = bytes[currentArrayIndex++];
    }


    /**
     * AF: returns the string representation of the state as follows:
     * [state1,1; state1,2; state1,3; state1,4]
     * [state2,1; state2,2; state2,3; state2,4]
     * [state3,1; state3,2; state3;3; state3,4]
     * [state4,1; state4,2; state4,3; state4,4]
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < state.length; i++){
            s.append('[');
            for(int j = 0; j < state.length; j++){
                s.append("0x");
                String p = Integer.toHexString(state[i][j]);
                if(p.length() == 1) p = "0" + p;
                if(p.length() > 2)
                    p = p.substring(p.length() - 2);
                s.append(p);
                if(j != state.length-1)
                    s.append("; ");

            }
            s.append("]\n");
        }
        return new String(s);
    }
}
