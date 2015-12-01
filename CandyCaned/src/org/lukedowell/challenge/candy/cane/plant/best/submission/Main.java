package org.lukedowell.challenge.candy.cane.plant.best.submission;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Pack200;

/**
 * Created by ldowell on 12/1/15.
 */
public class Main {

    private static List<CandyCanePlant> plants = new ArrayList<>();

    public static void main(String[] args) {
        plants.add(new CandyCanePlant(5));
        plants.add(new CandyCanePlant(3));
        plants.add(new CandyCanePlant(2));
        plants.add(new CandyCanePlant(2));

        for(int i = 0; i < plants.size(); i++) {
            CandyCanePlant cPlant = plants.get(i);
            if(i + 1 < plants.size()) {
                for(int j = i+1; j < plants.size(); j++) {
                    BreederService.breed(cPlant, plants.get(j));
                }
            }
            System.out.println("--------------");
        }
    }

    private static int getNumFriskyPlants() {
        int friskyCount = 0;
        for(CandyCanePlant plant : plants) {
            if(!plant.hasBred()) {
                friskyCount++;
            }
        }
        return friskyCount;
    }

    private static void getBreedingPair() {

    }
}
