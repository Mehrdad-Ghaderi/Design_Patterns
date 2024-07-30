package mvc.johnpurcell.modelviewcontroller.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonDAO {
    public void addPerson(Person person) throws SQLException {
        Connection con = Database.getInstance().getConnection();
        PreparedStatement p = con.prepareStatement("insert into people (name, password) values (?,?)");
        p.setString(1, person.getName());
        p.setString(2, person.getPassword());
        p.execute();
        p.close();
    }

    public Person getPerson(int id) {
        return null;
    }

    public List<Person> getPeople() {
        return null;
    }

    public void update(Person person) {

    }

    public void deletePerson(int id) {

    }
}
