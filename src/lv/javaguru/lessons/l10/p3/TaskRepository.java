package lv.javaguru.lessons.l10.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Konstantins Buts on 2018-11-27.
 */
public class TaskRepository implements Repository<Task> {

    private List<Task> taskList = new ArrayList<>();

    @Override
    public List<Task> findAll() {
        return taskList;
    }

    @Override
    public Optional<Task> findById(String id) {
        for (Task task : taskList) {
            if (task.getId().equals(id)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    @Override
    public void add(Task task) {
        taskList.add(task);
    }

    @Override
    public void remove(Task task) {
        taskList.remove(task);
    }

}
