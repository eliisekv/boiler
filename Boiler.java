public class Boiler{
	public double maht;
	public double temperatuur;
	public Boiler(double maht, double temperatuur){
		this.maht=maht;
		this.temperatuur=temperatuur;
	}
	public void kyta(double vatid, double sekundid){
		double dzaulid=vatid*sekundid;
		temperatuur+=dzaulid/4.19/1000;
	}
}