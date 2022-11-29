package org.example;

import java.util.ArrayList;

public class CinemaApplicationRun {

    public static void main(String[] args) {

        ArrayList<Viewer> viewers = new ArrayList<>();

        Viewer viewer1 = new Viewer("Tom", 35, 3);
        Viewer viewer2 = new Viewer("Ann", 29, 5);
        Viewer viewer3 = new Viewer("Peter", 20, 10);
        Viewer viewer4 = new Viewer("Liza", 30, 2);
        Viewer viewer5 = new Viewer("Tedd", 23, 8);

        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);

        ViewerStatistics vs = new ViewerStatistics();
        System.out.println(Math.round(vs.averageAge(viewers)));
    }
}
