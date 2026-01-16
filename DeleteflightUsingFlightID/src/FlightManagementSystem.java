import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem {

    public boolean deleteFlight(int flightId) {

        boolean isDeleted = false;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DB.getConnection();

            String query = "DELETE FROM flight WHERE flightId = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, flightId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                isDeleted = true;
            }

        } catch (Exception e) {
            isDeleted = false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                // ignore
            }
        }

        return isDeleted;
    }
}
