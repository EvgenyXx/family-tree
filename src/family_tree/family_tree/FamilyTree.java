package family_tree.family_tree;

import family_tree.human.Gender;
import family_tree.human.Human;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FamilyTree {
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
//        mother.getChildren().add(child);



    }

    public List<Human> getChildrenOfPerson(Human person) {
        List<Human> children = new ArrayList<>();
        for (Human child : person.getChildren()) {
            children.add(child);

        }
        return children;
    }

//    public void  allChildren (Human persons,Human child){
//        persons.addChild(child);
//        persons.addChild(child);
//    }



}
