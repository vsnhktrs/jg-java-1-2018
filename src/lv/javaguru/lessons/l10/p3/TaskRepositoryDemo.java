package lv.javaguru.lessons.l10.p3;

import java.util.function.Consumer;

/**
 * @author Konstantins Buts on 2018-11-27.
 */
public class TaskRepositoryDemo {

    public static void main(String[] args) {

        Repository<Task> taskRepository = new TaskRepository();

        System.out.println("taskRepository.findAll() = " + taskRepository.findAll());

        Task buyMilkTask = new Task("1", "Buy Milk", "Limbazu piens");
        Task doDishesTask = new Task("2", "Wash dishes", "Self explanatory");

        taskRepository.add(buyMilkTask);
        taskRepository.add(doDishesTask);

        System.out.println("taskRepository.findAll() = " + taskRepository.findAll());

        taskRepository.findById("1").ifPresent(task -> System.out.println("Task title = " + task.getTitle()));

        taskRepository.findById("10").ifPresent(new Consumer<Task>() {

            @Override
            public void accept(Task task) {
                System.out.println("Task title = " + task.getTitle());
            }

        });

        taskRepository.remove(buyMilkTask);

        System.out.println("taskRepository.findAll() = " + taskRepository.findAll());

    }

}
