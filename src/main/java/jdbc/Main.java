package jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        // DBWork objesi olustur
        DBWork db = new DBWork();

        // Connection methodunu cagir
        Connection con = db.connect_to_db("techproed","postgres","1q2w3e4r5t*");

        // Yeni table olusturma methodunu cagir
        db.createTable(con,"employees");


    }
}
