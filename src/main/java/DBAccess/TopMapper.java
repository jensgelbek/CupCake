package DBAccess;

import FunctionLayer.DBException;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Top;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TopMapper {
    public static List<Top> getAllToppings() throws DBException {
        List<Top> topList = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM topping";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                if (topList == null){
                    topList = new ArrayList<>();
                }
                int topping_id = rs.getInt("topping_id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                Top top = new Top(topping_id, name,price);
                topList.add(top);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new DBException(ex.getMessage());
        }
        return topList;
    }


}
