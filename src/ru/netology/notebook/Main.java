package ru.netology.notebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Notebook nb = new SimpleNotebook();
        Scanner myScan = new Scanner(System.in);

        while (true) {
            System.out.println("----Select action or '0'/enter for exit-----:\n1. Add task\n2. Display tasks\n3. Delete task\n0. Exit");
            String input = myScan.nextLine();
            if (input.equals("0") || input.equals("")) break;
            int caseNum = Integer.parseInt(input);
            switch (caseNum) {
                //Добавить задачу
                case 1:
                    while (true) {
                        //запросив у пользователя индекс - можно приоритезировать задачи
                        // и делать вставку в середину списка
                        //для этого нужно добавить еще один параметр в метод addTask
                        System.out.println("Enter new task or 'exit' for finish:");
                        input = myScan.nextLine();
                        if (input.equals("exit")) {
                            break;
                        } else {
                            nb.addTask(input);
                        }
                    }
                    break;
                //Вывести список задач
                case 2:
                    nb.displayNotebook();
                    break;
                //Удалить задачу
                case 3:
                    nb.displayNotebook();
                    while (!nb.isEmpty()) {
                        System.out.println("Enter the number of the task to be deleted or 'exit':");
                        input = myScan.nextLine();
                        if (input.equals("exit")) break;
                        int taskNumDel = Integer.parseInt(input);
                        nb.deleteTask(taskNumDel);
                        nb.displayNotebook();
                    }
                    break;
            }

        }
    }

} 
