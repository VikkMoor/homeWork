package gb.project.family_tree;

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

    public String getHumansInfo() {


    }

}
