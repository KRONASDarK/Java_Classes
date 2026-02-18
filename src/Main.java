public class Main {
    public static void main(String[] args) {
        Immutable immutable = new Immutable();
        Immutable.Mutable mutable = new Immutable.Mutable("John Doe", 28);

        System.out.println(immutable.getName() + " is " + immutable.getAge() + " years old.");

        Immutable immutable2 = new Immutable("John Hack", 25);
        System.out.println(immutable2.getName() + " is " + immutable2.getAge() + " years old.");

        System.out.println(mutable.getName() + " is " + mutable.getAge() + " years old.");

        mutable.setName("John Single");
        mutable.setAge(20);

        System.out.println(mutable.getName() + " is " + mutable.getAge() + " years old.");
    }
}
