package org.launchcode.comparators;
import org.launchcode.City;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by ethan on 4/3/17.
 */
public class CompoundComparator implements Comparator<City> {

    private List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> city) { comparators.add(city); }

    @Override
    public int compare(City o1, City o2)
    }
}
