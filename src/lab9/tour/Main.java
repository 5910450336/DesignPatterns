package lab9.tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleTour st1 = new SingleTour("Bangkok Tour",500,50,0);
        SingleTour st2 = new SingleTour("Korea Tour",5000,30,0);
        SingleTour st3 = new SingleTour("Chiang Mai Tour",1000,60,0);
        List<Tour> thaiTours = new ArrayList<Tour>();
        thaiTours.add(st1);
        thaiTours.add(st2);
        thaiTours.add(st3);

        PackageTour packageTour = new PackageTour("Thailand Tour",thaiTours);


        st3.setReservedSeats(50);

        System.out.println(st3.toString());

        System.out.println(packageTour.toString());


    }
}

