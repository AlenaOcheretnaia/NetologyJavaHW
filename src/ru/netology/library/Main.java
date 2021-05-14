package ru.netology.library;

public class Main {

    public static void main(String[] args) {
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("Vasilisa", 55);
        Reader studentReader = new ReaderImpl("Mikhail", 20);
        Supplier supplier = new SupplierImpl ("Georgii", 40);

        librarianAdmin.orderBooks(supplier);
        librarianAdmin.findBooks();
        studentReader.pickUpBooks(3);
        studentReader.pickUpBooks(1);
        librarianAdmin.delayNotice(studentReader);
        studentReader.dropOffBooks(2);
        supplier.bringBooks();
    }
}
