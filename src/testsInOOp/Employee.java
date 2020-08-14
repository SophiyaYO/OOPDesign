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
    private static String dbLocation = "http://holub.com/employees";

    public Employee(String id) throws Exception{
        JsonDB database = new JsonDB.Default();
        database.open(new URL(dbLocation));
        HashMap<String,String> result = database.lookup(id);
        name = result.get("name");
        database.close();
    }
}
