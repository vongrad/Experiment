/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;

import org.omg.SendingContext.RunTime;

/**
 *
 * @author adamv_000
 */
public class Experiment2Run {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        //Sample data
        String[] testArr = new String[1000000];
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = "Lala" + i;
        }

        Experiment2.testForeach(testArr);
        Experiment2.testForeach(testArr);

        for (String string : testArr) {
            string = string + "bla";
        }

        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = testArr[i];
        }

        long startTime;
        long endTime;

        for (int j = 0; j < 10; j++) {

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                Experiment2.testFor(testArr);
            }
            endTime = System.currentTimeMillis();
            long result = endTime - startTime;

            startTime = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                Experiment2.testForeach(testArr);
            }
            endTime = System.currentTimeMillis();
            long result2 = endTime - startTime;

            System.out.println("Time FOREACH: " + result);
            System.out.println("Time FOR: " + result2);
        }

    }
}
