package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        // 1. adim: Driver'a kaydol
        Class.forName("org.postgresql.Driver");


        // 2. Adim Database'd baglan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","1q2w3e4r5t*");


        // 3. adim: Statement olustur.
        Statement st = con.createStatement();


        // 4. adim: Query calistir

        //1.Örnek: "workers" adında bir table oluşturup "worker_id,worker_name, worker_salary" sütunlarını ekleyin.
        String sql1 = "CREATE TABLE workers(worker_id VARCHAR(50), worker_name VARCHAR(50), worker_salary INT)";
        boolean result = st.execute(sql1);
        // System.out.println(result);//False return yapar, çünkü data çağrılmadı.

        //2.Örnek: Table'a worker_address sütunu ekleyerek alter yapın.
        String sql2 = "ALTER TABLE workers ADD worker_address VARCHAR(80)";
        st.execute(sql2);

        //3.Örnek: Drop workers table
        String sql3 = "DROP TABLE workers";
        st.execute(sql3);

        //5. Adım: Bağlantı ve Statement'ı kapat.
        con.close();
        st.close();

    }

}
