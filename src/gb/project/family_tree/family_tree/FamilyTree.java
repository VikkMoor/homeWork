package gb.project.family_tree.family_tree;

import gb.project.family_tree.human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private short id;
    private short human_id;
    private List<Human> humanList;

    public FamilyTree(short id) {
        this.id = id;
        humanList = new ArrayList<>();
    }

    public void addHuman(Human human) {
        human.setId(human_id++);
        humanList.add(human);
    }


    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("In the tree ");
        sb.append(humanList.size());
        sb.append(" objects: \n");
        for (Human human : humanList) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
}
