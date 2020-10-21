package DBAccess;

import FunctionLayer.Bottom;
import FunctionLayer.DBException;
import FunctionLayer.Top;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BottomMapper {
    public static List<Bottom> getAllBottoms() throws DBException {
        List<Bottom> bottomList = null;
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM bottoms";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            System.out.println("Før while");
            while (rs.next()) {

                if (bottomList == null) {
                    bottomList = new ArrayList<>();
                }
                int bottom_id = rs.getInt("bottom_id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                Bottom bottom = new Bottom(bottom_id, name, price);
                bottomList.add(bottom);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new DBException(ex.getMessage());
        }
        return bottomList;
    }
}
