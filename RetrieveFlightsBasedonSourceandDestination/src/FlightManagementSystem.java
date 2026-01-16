import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FlightManagementSystem {

    public ArrayList<Flight> viewFlightsBySourceAndDestination(String source, String destination) {

        ArrayList<Flight> flightList = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = DB.getConnection();

            String query = "SELECT * FROM flight WHERE source = ? AND destination = ?";
            ps = con.prepareStatement(query);

            ps.setString(1, source);
            ps.setString(2, destination);

            rs = ps.executeQuery();

            while (rs.next()) {
                Flight flight = new Flight(
                        rs.getInt("flightId"),
                        rs.getString("source"),
                        rs.getString("destination"),
                        rs.getInt("noofseats"),
                        rs.getDouble("flightfare")
                );
                flightList.add(flight);
            }

        } catch (Exception e) {
            // ignore as per problem note
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                // ignore
            }
        }

        return flightList;
    }
}
