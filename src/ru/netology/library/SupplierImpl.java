package ru.netology.library;

public class SupplierImpl extends User implements Supplier {

    public SupplierImpl(String name, int age) {
        super(name, age);
    }

    @Override
    public void bringBooks() {
        System.out.println("Supplier " + this.getName() + " brings new books");
    }
}
