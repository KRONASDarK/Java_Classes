public final class Immutable {
    private final String name;
    private final int age;
    private Mutable mutable;

    public Immutable() {
        this.name = "No name";
        this.age = 0;
    }

    public Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Mutable {
        private String name;
        private int age;

        public Mutable(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}