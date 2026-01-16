//make the necessary change to make this class a Exception
class StationNotAvailableException extends Exception {
	StationNotAvailableException(String message) {
        super(message);
    }
}
