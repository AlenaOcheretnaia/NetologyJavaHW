package ru.netology.library;

public class ReaderImpl extends User implements Reader {
    private int numBooks;

    public int getNumBooks() {
        return this.numBooks;
    }

    public void setNumBooks(int num) {
        this.numBooks = num;
    }

    public ReaderImpl(String name, int age) {
        super(name, age);
    }

    @Override
    public void pickUpBooks(int num) {
        this.setNumBooks(this.getNumBooks() + num);
        System.out.println(new StringBuilder().append("Reader ").append(this.getName()).append(" picked up ").append(num)
                .append(" book(s) from the library. He now has ").append(this.getNumBooks()).toString());
    }

    @Override
    public void dropOffBooks(int num) {
        this.setNumBooks(this.getNumBooks() - num);
        System.out.println(this.getName() + " returned " + num
                + " book(s) in the library. He now has " + this.getNumBooks() + " more") ;
    }
}
