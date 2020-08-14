package employeeNoSettersOrGettersOCP;

import java.io.Reader;
import java.io.StringReader;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    interface Importer {
        String fetchName();
    }

    interface Exporter {
        void storeName(String name);
    }

    public Employee(Importer source) {
        name = source.fetchName();
    }

    public void export(Exporter destination) {
        destination.storeName(name);
    }
}

class JsonImporter implements Employee.Importer {
    private Reader in;

    public JsonImporter(Reader in) {
        this.in = in;
    }

    public String fetchName() {
        //..
        return "Sofia";
    }
}

class XMLImporter implements Employee.Importer {
    private Reader in;

    public XMLImporter(Reader in) {
        this.in = in;
    }

    public String fetchName() {
        //..
        return "Yordanova";
    }
}

class JsonExporter implements Employee.Exporter {
    private String name;

    public void storeName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{\"name\":\"" + name + "\"}";
    }
}

class XMLExporter implements Employee.Exporter {
    private String name;

    public void storeName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "<name value=\"" + name + "\">";
    }
}

class Demo {
    public static void test() throws Exception {
        String json = "{\"name\":\"Sofia\"}";

        Reader in = new StringReader(json);
        Employee me = new Employee(new JsonImporter(in));

        Employee.Exporter exporter = new JsonExporter();
        me.export(exporter);
        String jsonVersion = exporter.toString();

    }
}
