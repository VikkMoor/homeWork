package gb.project.family_tree.human;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private short id;
    private String first_name;
    private String last_name;
    private String patronymic;
    private Gender gender;
    private LocalDate dob, dod;
    private Human mother, father;
    private List<Human> childrenList;


    public Human(String first_name, String last_name, String patronymic,
                 Gender gender, LocalDate dob, LocalDate dod, Human mother,
                 Human father) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.gender = gender;
        this.dob = dob;
        this.dod = dod;
        this.mother = mother;
        this.father = father;
        this.childrenList = new ArrayList<>();
    }


    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDod() {
        return dod;
    }

    public void setDod(LocalDate dod) {
        this.dod = dod;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Human> childrenList) {
        this.childrenList = childrenList;
    }

    public void Children() {
        childrenList = new ArrayList<>();
    }

    public void addChild(Human human) {
        childrenList.add(human);
    }

    public String getChildrenInfo() {
        StringBuilder people = new StringBuilder();
        people.append("Kids: ");
        if (!childrenList.isEmpty()) {
            people.append(childrenList.get(0).getName());
            for (int i = 1; i < childrenList.size(); i++) {
                people.append(", ");
                people.append(childrenList.get(i).getName());
            }

        } else {
            people.append(" no kids.");
        }
        return people.toString();
    }

    ;

    public String getMotherInfo() {
        String people = "mother: ";
        if (mother != null) {
            people += mother.getName(mother);
        } else {
            people += " Unknown";
        }
        return people;
    }

    public String getFatherInfo() {
        String people = "father: ";
        if (father != null) {
            people += father.getName(father);
        } else {
            people += " Unknown";
        }
        return people;
    }

    private String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(first_name + " ");
        sb.append(patronymic + " ");
        sb.append(last_name);
        return sb.toString();
    }

    private String getName(Human human) {
        StringBuilder sb = new StringBuilder();
        sb.append(first_name + " ");
        sb.append(patronymic + " ");
        sb.append(last_name);
        return sb.toString();
    }


    private int getPeriod(LocalDate dob, LocalDate dod) {
        Period diff = Period.between(dob, dod);
        return diff.getYears();
    }

    public int getAge() {
        if (dod == null) {
            return getPeriod(dob, LocalDate.now());
        } else {
            return getPeriod(dob, dod);
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(", name: ");
        sb.append(first_name);
        sb.append(", patronymic: ");
        sb.append(patronymic);
        sb.append(", last name: ");
        sb.append(last_name);
        sb.append(", gender: ");
        sb.append(getGender());
        sb.append(", age: ");
        sb.append(getAge());
       sb.append("\n");
        sb.append(getMotherInfo());
        sb.append("\n");
        sb.append(getFatherInfo());
        sb.append("\n");
        sb.append(getChildrenInfo());
        return sb.toString();
    }
}
