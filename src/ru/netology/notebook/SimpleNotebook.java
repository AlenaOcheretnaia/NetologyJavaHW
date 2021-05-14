package ru.netology.notebook;


import java.util.ArrayList;
import java.util.List;

public class SimpleNotebook implements Notebook {

    List<String> myNotebook = new ArrayList<String>();

    public void displayNotebook() {
        if (myNotebook.isEmpty()) {
            System.out.println("Your Notebook is empty");
        } else {
            System.out.println("\nList of recorded tasks:");
            int i = 1;
            for (String task : myNotebook) {
                System.out.println(i++ + ". " + task);
            }
        }
    }

    public void deleteTask(int taskNum) {
        if (taskNum <= myNotebook.size() && taskNum != 0) {
            System.out.println("Task " + taskNum + " was successfully deleted.");
            myNotebook.remove(taskNum-1);
        } else {
            System.out.println("!!! There is no such task in the list !!!");
        }

    }

    public void addTask(String newTask) {
        if (!newTask.equals("")) {
            myNotebook.add(newTask);
        } else {
            System.out.println("!!! You didn't enter any task !!!");
        }
    }
    public boolean isEmpty(){
        return myNotebook.isEmpty();
    }
}
