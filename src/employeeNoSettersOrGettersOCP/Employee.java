package employeeNoSettersOrGettersOCP;

import java.io.Reader;

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

class JsonImporter implements Employee.Importer{
    private Reader in;
    public JsonImporter (Reader in) {
        this.in = in;
    }
    public String fetchName(){
        //..
        return "Sofia";
    }
}

class XMLImporter implements Employee.Importer{
    private Reader in;
    public XMLImporter(Reader in){this.in=in;}
    public String fetchName(){
        //..
        return "Yordanova";
    }
}
