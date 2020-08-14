package testsInOOp;

import java.net.URL;
import java.util.HashMap;

interface JsonDB {
    public void open(URL location);

    public void close();

    public HashMap<String, String> lookup(String key);

    public class Default implements JsonDB {
        public void open(URL location) {
        }

        public void close() {
        }

        public HashMap<String, String> lookup(String key) {
            return null;
        }
    }
}


public class Employee {
    private String name;

    public Employee(String id, JsonDB database) throws Exception {
        HashMap<String, String> result = database.lookup(id);
        name = result.get("name");
    }
}

class DatabaseSpy implements JsonDB {
    JsonDB wrapped;

    public DatabaseSpy(JsonDB wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void open(URL location) {
        wrapped.open(location);
    }

    @Override
    public void close() {
        wrapped.close();
    }

    @Override
    public HashMap<String, String> lookup(String key) {
        HashMap<String, String> result = wrapped.lookup(key);
        System.out.println(result.toString());
        return result;
    }
}

class Test {
    public void test() throws Exception {
        String dbLocation = "http://holub.com/employees";
        JsonDB database = new DatabaseMock();
        database.open(new URL(dbLocation));
        Employee sofia = new Employee("Sofia", database);
        database.close();
    }
}
