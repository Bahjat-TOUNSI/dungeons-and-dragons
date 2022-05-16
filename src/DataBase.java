import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DataBase {

    public void getHeroFromDataBase() throws Exception{

        Properties props = new Properties();
        try (
                FileInputStream fis = new FileInputStream( "conf.properties" ) ) {
            props.load( fis);
        }
        Class.forName(props.getProperty("jdbc.driver.class"));
        String url = props.getProperty("jdbc.url");
        String login = props.getProperty("jdbc.login");
        String password = props.getProperty("jdbc.password");
        try( Connection connection = DriverManager.getConnection(url, login, password) ) {
//            String strSql = "INSERT INTO hero (Type, Nom, NiveauVie, NiveauForce, Arme, Bouclier)"
//                          + "VALUES ('Mage', 'Test', '300', '1200', 'rien', 'skateboard' )";
//            try (Statement statement = connection.createStatement()) {
//                statement.executeUpdate(strSql);
//            }
//        }
            String strSql = "SELECT * FROM hero";
            try (Statement statement = connection.createStatement()) {
              try (ResultSet resultSet = statement.executeQuery(strSql)) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String type = resultSet.getString("Type");
                        String name = resultSet.getString("Nom");
                        int hp = resultSet.getInt("NiveauVie");
                        int attackPower = resultSet.getInt("NiveauForce");
                        String weapon = resultSet.getString("Arme");
                        String shield = resultSet.getString("Bouclier");
                        System.out.printf("\nCe qui est enregistrée dans la data base:\n" + "%d: %s %s %d %d %s %s\n", id, type, name, hp, attackPower, weapon, shield + "\n");
                    }
                }
            }
        }
    }
}
