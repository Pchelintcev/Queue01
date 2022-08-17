import java.util.*;

public class Main {

    static List<Person> formList() { //TODO формируем список

        Person Misha = new Person("Русский", "Михаил", "Салтыков-Щедрин", 4);
        Person Boris = new Person("Немецкий", "Эрих Мария", "Ремарк", 5);
        Person Vanya = new Person("Французский", "Антуан", "де Сент-Экзюпери", 3);
        Person Sasha = new Person("Итальянский", "Умберто", "Эко", 2);
        Person Lev = new Person("Американский", "Эрнест", "Хемингуэй", 6);

        ArrayList<Person> writers = new ArrayList<>();

        writers.add(Misha);
        writers.add(Boris);
        writers.add(Vanya);
        writers.add(Sasha);
        writers.add(Lev);

        return writers;
    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(formList());

        while (!queue.isEmpty()) {
            Person p = queue.poll();
            if (p.tickets > 0) {
                System.out.println(p + ", билетов осталось " + p.spendTicket());
                queue.offer(p);
            }
        }
    }
}
