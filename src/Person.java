public class Person {
    protected String nation;
    protected String name;
    protected String surname;
    protected int tickets;

    public Person(String nation, String name, String surname, int tickets) {
        this.nation = nation;
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public int spendTicket() {
        if (tickets > 0) {
            tickets--;
        }
        return tickets;
    }

    public String toString() {
        return nation + " писатель " + name + " " + surname + " прокатился на карусели";
    }
}
