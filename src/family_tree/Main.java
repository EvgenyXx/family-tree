package family_tree;

import family_tree.family_tree.FamilyTree;
import family_tree.human.Gender;
import family_tree.human.Human;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human father1 = new Human("Николай", LocalDate.of(1970, 5, 15), null, null, Gender.MALE);
        Human mother1 = new Human("Екатерина", LocalDate.of(1975, 8, 20), null, null, Gender.FEMALE);
        Human child1 = new Human("Кирилл", LocalDate.of(2000, 3, 10), null, null, Gender.MALE);
        Human child2 = new Human("Виктория", LocalDate.of(2005, 7, 25), null, null, Gender.FEMALE);

        FamilyTree familyTree = new FamilyTree();

        familyTree.addPerson(father1);
        familyTree.addPerson(mother1);
        familyTree.addPerson(child1);
        familyTree.addPerson(child2);

        familyTree.setParents(child1, father1, mother1);
        familyTree.setParents(child2, father1, mother1);

        List<Human> children = familyTree.getChildrenOfPerson(father1);
        System.out.println("Отец " + father1.getName() + ":");
        System.out.println("Дети ");
        for (Human child : children) {
            System.out.println(child.getName());
        }
        System.out.println();
        System.out.println("Мама " + mother1.getName() + ":");
        System.out.println("Дети ");
        for (Human child : children){
            System.out.println(child.getName());
        }



    }
}
