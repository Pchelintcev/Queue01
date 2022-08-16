import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //создаём персоны, через класс Person
        Person Misha = new Person("Михаил", "Салтыков-Щедрин", 6);
        Person Boris = new Person("Борис", "Пастернак", 7);
        Person Vanya = new Person("Иван", "Бунин", 5);
        Person Sasha = new Person("Александр", "Блок", 4);
        Person Lev = new Person("Лев", "Толстой", 8);

        //создаем список ""russian"
        ArrayList<Person> russian = new ArrayList<>();
        //добавляем в список персоны
        russian.add(Misha);
        russian.add(Boris);
        russian.add(Vanya);
        russian.add(Sasha);
        russian.add(Lev);

        //делаем очередь "queue" и добавляем в очередь всех из списка "русские"
        Queue<Person> queue = new LinkedList<>(russian);


        while (!queue.isEmpty()) { // пока в очереди есть кто-то
            Person s = queue.poll(); // s = посмотреть кто следующий
            System.out.println(s); // вывести s на экран
        }
        System.out.println(queue.isEmpty()); //очередь пуста?
    }
}
