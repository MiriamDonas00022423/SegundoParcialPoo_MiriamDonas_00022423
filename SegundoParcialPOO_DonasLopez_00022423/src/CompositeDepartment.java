import java.util.ArrayList;
import java.util.List;

    class CompositeDepartment implements Department {
        private String name;
        private String head;
        private List<Department> subordinates;

        public CompositeDepartment(String name, String head) {
            this.name = name;
            this.head = head;
            this.subordinates = new ArrayList<>();
        }

        public void addSubordinate(Department subordinate) {
            subordinates.add(subordinate);
        }

        public void removeSubordinate(Department subordinate) {
            subordinates.remove(subordinate);
        }

        public String getName() {
            return name;
        }

        public String getHead() {
            return head;
        }

        public List<Department> getSubordinates() {
            return subordinates;
        }
    }
