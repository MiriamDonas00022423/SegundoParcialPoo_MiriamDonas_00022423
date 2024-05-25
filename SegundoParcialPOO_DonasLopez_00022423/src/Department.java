import java.util.List;

public interface Department {

    String getName();
    String getHead();
    List<Department> getSubordinates();

}
