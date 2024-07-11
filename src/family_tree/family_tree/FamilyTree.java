package family_tree.family_tree;


import family_tree.human.Human;

import java.io.Serializable;
import java.util.ArrayList;


import java.util.List;

public class FamilyTree implements Serializable {
    private final List<Human> persons;

    public FamilyTree() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Human person) {
        persons.add(person);
    }

    public void setParents(Human child, Human father, Human mother) {
        child.setFather(father);
        child.setMother(mother);
        father.addChild(child);
        mother.addChild(child);
    }

    public List<Human> getChildrenOfPerson(Human person) {
        List<Human> children = new ArrayList<>();
        for (Human child : person.getChildren()) {
            children.add(child);
        }
        return children;
    }

    @Override
    public String toString() {
        return "FamilyTree{" +
                "persons=" + persons +
                '}';
    }
}
