import java.util.Objects;

public class Task implements Comparable<Task> {
    private int priority;
    private String description;

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority); 
    }

    @Override
    public String toString() {
        return "Priority: " + priority + " - Task: " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, description);
    }
}
