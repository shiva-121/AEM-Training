package Activity1;

public class Training {
	String name;
	MyDate startDate;
	MyDate endDate;
	String trainerName;
	int totalParticipants;
	String stream;
	Attendance isPresent;
	
	public Training(String name, MyDate startDate, MyDate endDate, String trainerName, int totalParticipants,
			String stream, Attendance isPresent) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainerName = trainerName;
		this.totalParticipants = totalParticipants;
		this.stream = stream;
		this.isPresent = isPresent;
	}

	@Override
	public String toString() {
		return "Training [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", trainerName="
				+ trainerName + ", totalParticipants=" + totalParticipants + ", stream=" + stream + ", isPresent="
				+ isPresent + "]";
	}
	
	
	
}
