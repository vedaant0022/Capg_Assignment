import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem {

    public boolean updateFlightFare(int flightId, double flightFare) {

        boolean isUpdated = false;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DB.getConnection();

            String query = "UPDATE flight SET flightfare = ? WHERE flightId = ?";
            ps = con.prepareStatement(query);

            ps.setDouble(1, flightFare);
            ps.setInt(2, flightId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                isUpdated = true;
            }

        } catch (Exception e) {
            isUpdated = false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                // ignore
            }
        }

        return isUpdated;
    }
}
