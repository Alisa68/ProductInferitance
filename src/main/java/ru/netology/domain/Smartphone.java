package ru.netology.domain;

public class Smartphone extends Product{
        private String manufacture;

        public Smartphone() {
            super();
        }

    public Smartphone(int id, String name, int price, String manufacture) {
        super(id, name, price);
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (this.getManufacture().equalsIgnoreCase(search)) {
            return true;
        }
        return false;
    }
}
