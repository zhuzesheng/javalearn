package super关键字;

class Country{
    String name;
    void value(){
        name = "China";
    }
}

class City extends Country {
    String name;

    @Override
    void value() {
        name = "shanghai";
        super.value();
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        City c = new City();
        c.value();
    }
}
