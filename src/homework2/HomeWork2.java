/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.nio.IntBuffer;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class HomeWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int capacity = 10;

        IntBuffer ib = IntBuffer.allocate(capacity);

        ib.put(4);
        ib.put(2);
        ib.put(4, 2);
        ib.put(7, 2);
        ib.rewind(); 

        System.out.println("IntBuffer ib: "+ Arrays.toString(ib.array()));

    }

}
