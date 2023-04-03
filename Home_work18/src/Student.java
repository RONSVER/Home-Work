public class Student {
    ////1 Создайте класс Student, содержащий поля name и group. Поля сделайте приватными.
    //2 Создайте геттеры и сеттеры для этих полей.
    //3 Создайте конструктор, который принимает значения для инициализации поля name.
    //4 Создайте конструктор, который принимает значения для инициализации обоих полей.
    //Инициализацию имени конструктор должен делегировать в конструктор из пункта 3, а затем инициализировать оставшееся поле group.
    //5 Создайте клонирующий конструктор, который принимает объект типа Student и создаёт нового студента на его основе.
    private String name;

    private String group;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, String group) {
        this(name);
        this.group = group;
    }

    public Student(Student study) {
        this.name = study.name;
        this.group = study.group;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}
