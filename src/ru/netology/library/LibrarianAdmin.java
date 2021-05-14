package ru.netology.library;

public class LibrarianAdmin extends User implements Librarian, Administrator {

    public LibrarianAdmin(String name, int age) {
        super(name, age);
    }

    @Override //Librarian
    public void orderBooks(Supplier supplier) {
        System.out.println("Librarian " + this.getName() +
                " ordered new books from supplier " + supplier.toString());
    }

    @Override //administrator
    public void findBooks() {
        System.out.println(this.getName() + " found books");
    }

    @Override //administrator
    public void delayNotice(Reader reader) {
        System.out.println("Reader " + reader.toString() + " have delayed books");
    }
}
