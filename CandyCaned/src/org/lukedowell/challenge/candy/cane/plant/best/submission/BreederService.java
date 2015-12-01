package org.lukedowell.challenge.candy.cane.plant.best.submission;

/**
 * Created by ldowell on 12/1/15.
 */
public class BreederService {

    public static CandyCanePlant breed(CandyCanePlant father, CandyCanePlant mother) {
        int fatherProd = father.getCandyCanesProducedPerWeek();
        int motherProd = mother.getCandyCanesProducedPerWeek();

        // Return the baby plant
        int childProduction = (int) Math.round(Math.pow(fatherProd, motherProd) % (fatherProd + motherProd));

        System.out.format("Father with prod: %d and Mother with prod: %d makes -- Child: %d \n", fatherProd, motherProd, childProduction);

        return new CandyCanePlant((int) Math.round(childProduction));
    }
}
