package gb.project.family_tree;

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
        Human human4 = new Human("Sergei", "Murzin", "Vasilievich", Gender.Male,
                                LocalDate.of(1984, 1, 27), null, null, null);
        Human human5 = new Human("Semen", "Murzin", "Sergeevich", Gender.Male,
                                LocalDate.of(2013, 11, 25), null, human4, human3);

        tree.addHuman(human1);
        tree.addHuman(human2);
        tree.addHuman(human3);
        tree.addHuman(human4);
        tree.addHuman(human5);

        human1.addChild(human3);
        human2.addChild(human3);
        human3.addChild(human5);
        human4.addChild(human5);




        System.out.println(tree.getInfo());
    }
}