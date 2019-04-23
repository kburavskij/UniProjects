import java.sql.*;

public class DB {
    public static void viewTable() throws SQLException {

        Statement stmt = null;
        String selectAll = "SELECT * FROM Kvepalai";
        String selectFromMoteriski = "SELECT * FROM Kvepalai" + "WHERE kategorija = Moteriski";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost/name";
            String user = "root";
            String pass = "root";
            Connection connection = DriverManager.getConnection(URL, user, pass);

            Statement statement = connection.createStatement();


            ResultSet resultAll = statement.executeQuery(selectAll);
            ResultSet resultFromMoteriski = statement.executeQuery(selectFromMoteriski);

            while (resultAll.next()) {
                int id = resultAll.getInt("id");
                String pavadinimas = resultAll.getString("pavadinimas");
                String kategorija = resultAll.getNString("kategorija");
                int pakuotesTalpa = resultAll.getInt("pakuotesTalpa");
                Double pakuotesKaina = resultAll.getDouble("pakuotesKaina");
                System.out.println(id + "\t" + pavadinimas +
                        "\t" + kategorija + "\t" + pakuotesTalpa +
                        "\t" + pakuotesKaina);
            }

            while (resultFromMoteriski.next()){
                int id = resultAll.getInt("id");
                String pavadinimas = resultAll.getString("pavadinimas");
                String kategorija = resultAll.getNString("kategorija");
                int pakuotesTalpa = resultAll.getInt("pakuotesTalpa");
                Double pakuotesKaina = resultAll.getDouble("pakuotesKaina");
                System.out.println(id + "\t" + pavadinimas +
                        "\t" + kategorija + "\t" + pakuotesTalpa +
                        "\t" + pakuotesKaina);
            }

            statement.close();
            resultAll.close();
            resultFromMoteriski.close();
            connection.close();


        } catch (SQLException e ) {
        }
    }

}
