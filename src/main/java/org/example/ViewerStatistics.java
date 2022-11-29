package org.example;

import java.util.ArrayList;
public class ViewerStatistics {
    public double averageAge(ArrayList<Viewer> list) {
        double averageAge = 0;
        if (!list.isEmpty()) {
            int sum = 0;
            for (Viewer viewer : list) {
                sum += viewer.getAge();
            }
            averageAge = sum / list.size();
        }
        return averageAge;
    }
}
