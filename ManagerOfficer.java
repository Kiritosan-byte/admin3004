package University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private List<People> people;

    public ManagerOfficer() {
        this.people = new ArrayList<>();
    }

    public void addPeopple(People people) {
        this.people.add(people);
    }

    public List<People> searchPeopleByName(String name) {
        return this.people.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void show(){
        for (int i = 0; i < this.people.size(); i++) {
            this.people.get(i).output();
        }
    }
}
