import java.sql.*;
public class FlightManagementSystem
{
    // Fill the code
    public boolean addFlight(Flight obj) {
    	int count =0;
    	Connection con = null;
    	PreparedStatement ps = null;
    	
    	try {
    		con = DB.getConnection();
    		String query = "INSERT INTO Flight VALUES (?,?,?,?,?)";
    		ps = con.prepareStatement(query);
    		ps.setInt(1, obj.getFlightId());
    		ps.setString(2, obj.getSource());
    		ps.setString(3, obj.getDestination());
    		ps.setInt(4, obj.getNoOfSeats());
    		ps.setDouble(5, obj.getFlightFare());
    		
    		count = ps.executeUpdate();
    	}
    	catch(Exception e) {
    		//left unooperated
    	}
    	finally {
    		try { if (ps != null) ps.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
    	}
    	
    	
    	if(count==0) {
    		return false;
    	}
    	return true;
    }
}