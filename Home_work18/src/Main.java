public class Main {
    public static void main(String[] args) {
        //Проект 2. Создание конструкторов и методов доступа
        //6 В основной программе создайте переменную student1, проинициализируйте её с помощью оператора new и с помощью конструктора.
        //7 В переменную student2 присвойте значение student1.
        //8 В переменную student3 присвойте значение, полученное с помощью клонирующего конструктора.
        //9 Измените значение поля name у student1.
        //10 Выведите на консоль значения полей student1, student2 и student3.

        Student student1 = new Student("Kiril");
        Student student2 = new Student("Sergey", "tel - ran");
        Student student3 = student1;
        Student studentCopy = new Student(student1);
        student1.setName("Yakov");
        System.out.println(student3.getName());
        System.out.println(studentCopy.getName());
    }
}