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
}
