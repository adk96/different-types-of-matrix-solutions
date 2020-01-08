/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;


public class Main {

    public static void main(String[] args) throws MatrixIndexException, java.io.IOException {
        Matrix m1 = new RandomAccessFileMatrix("C://Data//data1.bin", 4, 4);
        Matrix m2 = new RandomAccessFileMatrix("C://Data//data2.bin", 3, 3);
                 
        
        MatrixUtils.fillByRandom(m1);
        MatrixUtils.fillByRandom(m2);
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        
        
        System.out.println(m1.get(1, 1));
        System.out.println(m2.get(2, 2));
        System.out.println(m2.get(3, 3));
        
        //Matrix m = MatrixUtils.matrixMultiple(m1, m2);
        
        //System.out.println(m.toString());
        //MatrixUtils.writeMatrixToFile(m, "file.txt");
        Matrix m3 = MatrixUtils.loadMatrixFromFile("file.txt");
        System.out.println(m3.toString());
 
 

 
        /*
        Matrix1D m = new Matrix1D(3, 3);
        Matrix2D m1 = new Matrix2D(3, 3);
        try {
            m.put(1, 1, 1);
            m.put(1, 2, 2);
            m.put(1, 3, 3);
            m.put(2, 1, 4);
            m.put(2, 2, 5);
            m.put(2, 3, 6);
            m.put(3, 1, 7);
            m.put(3, 2, 8);
            m.put(3, 3, 9);
           
            m1.put(1, 1, 1);
            m1.put(1, 2, 2);
            m1.put(1, 3, 3);
            m1.put(2, 1, 4);
            m1.put(2, 2, 5);
            m1.put(2, 3, 6);
            m1.put(3, 1, 7);
            m1.put(3, 2, 8);
            m1.put(3, 3, 9);
           

        } catch (MatrixIndexException e) {
            System.out.print(e.getMessage());
        }
        System.out.println(m.toString());

        System.out.println(m1.toString());
        System.out.print(m.equals(m1)); 
      
        */
        

    /* Matrix m1 = new Matrix(2, 2);        
        m1.put(1, 1, 1);
        m1.put(1, 2, 2);
        m1.put(2, 1,  3);
        m1.put(2, 2, 4);
        
        Matrix m2 = new Matrix(2, 2);        
        m2.put(1, 1, 1);
        m2.put(1, 2, 2);
        m2.put(2, 1, 3);
        m2.put(2, 2, 4);
        
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        
        
        System.out.println(m1.equals(m2));*/
 /*     Matrix m1 = new Matrix(4, 4);        
        MatrixUtils.fillByRandom(m1);
        System.out.println(m1.toString());
        
        
         
        Matrix m3 = new Matrix(5, 5);
        MatrixUtils.fillByNumber(m3, 1);
        System.out.println(m3.toString());*/
    //Matrix m = MatrixUtils.fillByKeyboard();
    //System.out.println(m.toString());
    /* Matrix2D m1 = new Matrix2D(2, 3);
        Matrix2D m2 = new Matrix2D(3, 2);
        
        //MatrixUtils.fillByRandom(m1);
        //MatrixUtils.fillByRandom(m2);
        m1.put(1, 1, 1);
        m1.put(1, 2, 2);
        m1.put(2, 1, 3);
        m1.put(2, 2, 4);
        m1.put(1, 3, 1);
        
        m2.put(1, 1, 1);
        m2.put(1, 2, 1);
        m2.put(2, 1, 1);
        m2.put(2, 2, 1);
        m2.put(3, 1, 1);
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        
        Matrix2D m = MatrixUtils.MatrixMultiple(m1, m2);
        
        System.out.println(m.toString());*/
 /*Matrix m1 = new Matrix(10, 10);
        MatrixUtils.fillByNumber(m1, -10);

        m1.put(10, 10, 33);
        System.out.println(m1.toString());*/
 /*Matrix m1 = new Matrix(3, 3);
        Matrix m4 = new Matrix(100, 10);
        
        try {
            m1.get(1, 1);

        } catch (MatrixIndexException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println(m1.toString());

        Matrix m2 = new Matrix(m1);

        System.out.println(m2.toString());

        System.out.println(m1.equals(m2));

        Matrix m3 = new Matrix(2, 2);
        try {
            m3.put(1, 1, 10);
            m3.put(1, 2, 53);
            m3.put(2, 1, 20);
            m3.put(2, 2, 106);
        } catch (MatrixIndexException e) {
            System.out.println("Out of index");
        }
        System.out.println(m3.toString());
        System.out.println(m1.equals(m3));*/
}
}
