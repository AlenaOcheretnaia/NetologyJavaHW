package ru.netology.notebook;

public interface Notebook {

    public void addTask(String newTask);

    public void displayNotebook();

    public void deleteTask(int taskNum);

    public boolean isEmpty();

}
