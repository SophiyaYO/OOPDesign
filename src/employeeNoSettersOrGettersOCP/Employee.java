package employeeNoSettersOrGettersOCP;

import java.io.Writer;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public enum FORMAT {XML, JSON}

    public Employee(String source, FORMAT inputFormat) {
    }

    public Employee(java.sql.Connection con, int ID) {
    }

    public void exportAsJSON(Writer out) {
    }

    public void exportAsXML(Writer out) {
    }

    public void exportAsSQL(java.sql.Connection out) {
    }
}
