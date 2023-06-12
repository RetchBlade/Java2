package Versuch8;

public class Title {

	private int trackNr;
	private String durance, interpret, name,title,cdNr;
	public Title(String cdNr, int trackNr) {
		
		this.cdNr = cdNr;
		this.trackNr = trackNr;
	}
	
	public String getCdNr() {
		return cdNr;
	}
	
	public void setCdNr(String cdNr) {
		this.cdNr = cdNr;
	}
	
	public String getDurance() {
		return durance;
	}
	
	public void setDurance(String durance) {
		this.durance = durance;
	}
	
	public String getInterpret() {
		return interpret;
	}
	
	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTrackNr() {
		return trackNr;
	}
	public void setTrackNr(int trackNr) {
		this.trackNr = trackNr;
	}
	
	
}
