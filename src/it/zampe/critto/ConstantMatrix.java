package it.zampe.critto;

/**
 * Concrete and immutable singleton class which represent the matrix used in the MixColumns procedure.
 */
public class ConstantMatrix {

    private final int[][] matrix = {
            {0x02, 0x03, 0x01, 0x01},
            {0x01, 0x02, 0x03, 0x01},
            {0x01, 0x01, 0x02, 0x03},
            {0x03, 0x01, 0x01, 0x02}
    };

    private static ConstantMatrix instance;

    private ConstantMatrix(){};

    /**
     * @return The instance of the singleton, which is the matrix used for MixColumns
     */
    public ConstantMatrix getInstance(){
        if(instance == null)
            instance = new ConstantMatrix();
        return instance;
    }

    /**
     * @param vector the vector you want to be multiplied with the matrix
     * @return the new vector after the multiplications
     */
    public int[] apply(final int[] vector){
        int[] result = new int[vector.length];
        for(int i = 0; i < matrix.length; i++){
            result[i] = multiply(matrix[i], vector);
        }
        return result;
    }

    /**
     * internally used to factor code
     * @param matVector the current vector of the matrix to be multiplied
     * @param vector the vector the user passed
     * @return the sum of each matVector[i] * vector[i]
     */
    private int multiply(int[] matVector, int[] vector){
        int sum = 0;
        for(int i = 0; i < matVector.length; i++){
            sum += matVector[i] * vector[i];
        }
        return sum;
    }
}
