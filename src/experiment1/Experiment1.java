/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;

/**
 *
 * @author adamv_000
 */
public class Experiment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String text50 = "AAAAAA";

        Runtime runtime = Runtime.getRuntime();
     

        long startTime;
        long endTime;
        long freeMemory;
        long usedMemory;
        long resultMem;
        long resultTime;
        String testedString = "";
        

        testedString += text50;

        for (int i = 0; i < 4; i++) {

            startTime = System.currentTimeMillis();
            runtime.gc();
            freeMemory = runtime.freeMemory();

            for (int j = 0; j < 1000000; j++) {
                Toolkit.reverseStringRecursion(testedString);
            }
            
            usedMemory = runtime.freeMemory();
            endTime = System.currentTimeMillis();
            System.out.println("***********************************************");
            System.out.println("Text length: " + testedString.length());
            System.out.println("Total time: " + (endTime - startTime));
            System.out.println("Memory usage: " + (freeMemory - usedMemory));
            System.out.println("**********************************************");
                 
            testedString +=text50;
        }

  


   

    }

}
