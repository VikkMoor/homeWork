package gb.project.family_tree;

import java.time.LocalDate;
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
    private List<Human> children;


    public Human(String first_name, String last_name, String patronymic,
                 Gender gender, LocalDate dob, LocalDate dod, Human mother,
                 Human father, List<Human> children) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.gender = gender;
        this.dob = dob;
        this.dod = dod;
        this.mother = mother;
        this.father = father;
        this. children = new ArrayList<>();
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public String getChildrenInfo(){
        StringBuilder people = new StringBuilder();
        people.append("Kids: ");
        if (!children.isEmpty()){
            people.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++){
                people.append(", ");
                people.append(children.get(i).getName());
            }

        } else {
            people.append(" no kids.");
        }
        return people.toString();
    };

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
        sb.append(", birthday: ");
        sb.append(getDob());
        sb.append(", death day: ");
        sb.append(getDod());
        sb.append("\n");
        sb.append(getMotherInfo());
        sb.append("\n");
        sb.append(getFatherInfo());
        sb.append("\n");
        sb.append(getChildrenInfo());
        return sb.toString();
    }
}
