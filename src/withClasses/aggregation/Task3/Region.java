package withClasses.aggregation.Task3;

import java.util.ArrayList;
import java.util.List;

public class Region {

    private final String name;
    private final City centralCity;
    private List<District> districts = new ArrayList<>();
    private District district;

    public Region(String name, String centralCity) {
        this.name = name;
        this.centralCity = new City(centralCity);
    }
    public void addDistrict(District district){
        districts.add(district);
    }

    @Override
    public String toString() {
        return centralCity.toString();
    }
}
