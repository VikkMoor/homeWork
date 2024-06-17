package gb.project.family_tree;

import gb.project.family_tree.family_tree.FamilyTree;
import gb.project.family_tree.human.Gender;
import gb.project.family_tree.human.Human;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        FamilyTree tree = new FamilyTree((short) 5);

        Human human1 = new Human("Sergey", "Nakozin", "Urievich", Gender.Male,
                                LocalDate.of(1961, 3, 29), null, null, null);
        Human human2 = new Human("Irina", "Nakozina", "Tsalievna", Gender.Female,
                                LocalDate.of(1957, 12, 13), null, null, null);
        Human human3 = new Human("Victoria", "Murzina", "Sergeevna", Gender.Female,
                                LocalDate.of(1988, 12, 26), null, human2, human1);
        Human human4 = new Human("Anastasia", "Nakozina", "Igorevna", Gender.Female,
                                LocalDate.of(1989, 1, 21), null, null, null);
        Human human5 = new Human("Semen", "Murzin", "Sergeevich", Gender.Male,
                                LocalDate.of(2013, 11, 25), null, human3, null);
        Human human6 = new Human("Andrei", "Nakozin", "Sergeevich", Gender.Male,
                                LocalDate.of(1985, 5, 4), null, human2, human1);
        Human human7 = new Human("Miroslav", "Nakozin", "Andreevich", Gender.Male,
                                LocalDate.of(2023, 9, 28), null, human4, human6);
        Human human8 = new Human("Eva", "Nakozina", "Andreevna", Gender.Female,
                                LocalDate.of(2017, 12, 8), null, human4, human6);

        tree.addHuman(human1);
        tree.addHuman(human2);
        tree.addHuman(human3);
        tree.addHuman(human4);
        tree.addHuman(human5);
        tree.addHuman(human6);
        tree.addHuman(human7);
        tree.addHuman(human8);

        human1.addChild(human3);
        human1.addChild(human6);
        human2.addChild(human3);
        human2.addChild(human6);
        human3.addChild(human5);
        human4.addChild(human7);
        human6.addChild(human7);
        human6.addChild(human8);
        human4.addChild(human8);





        System.out.println(tree.getInfo());
    }
}