import java.util.ArrayList;
import java.util.List;

public class Creneau {

	private String site = null;
	private String codeUV = null;
	private String type = null;
	private int groupe = 1;
	private String jour = null;
	private String heureDebut = null;
	private String heureFin = null;
	private int frequence = 1;
	private String salle = null;

	public Creneau(String line) {
		int i = 1;
		String[] infos = line.split("[\\t ]");
		this.site = infos[0];
		while(infos[i].isEmpty()) {
			i++;
		}
		this.codeUV = infos[i++];
		while(infos[i].isEmpty()) {
			i++;
		}
		this.type = infos[i++];
		while(infos[i].isEmpty()) {
			i++;
		}
		this.groupe = Integer.parseInt(infos[i++]);
		while(infos[i].isEmpty()) {
			i++;
		}
		this.jour = infos[i++];
		while(infos[i].isEmpty()) {
			i++;
		}
		this.heureDebut = infos[i++];
		while(infos[i].isEmpty()) {
			i++;
		}
		this.heureFin = infos[i++];
		while(infos[i].isEmpty()) {
			i++;
		}
		this.frequence = Integer.parseInt(infos[i++]);
		while(infos[i].isEmpty()) {
			i++;
		}
		this.salle = infos[i];
	}

	private String getOldDay() {
		if (this.jour.startsWith("m")) {
			return this.jour.substring(0,2).toUpperCase();
		}
		return this.jour.substring(0,1).toUpperCase();
	}

	private String getOldTime(String time) {
		return time.replace(":", "H");
	}

	public String printOld() {
		return this.codeUV
				+ " "
				+ (this.type.equals("CM") ? "C " : this.type)
				+ this.groupe
				+ "  : "
				+ this.getOldDay()
				+ " "
				+ this.getOldTime(this.heureDebut)
				+ "-"
				+ this.getOldTime(this.heureFin)
				+ (this.frequence > 1 ? " (1 SEMAINE / " + this.frequence + ")"
						: "") + " en " + this.salle;
	}

	public String printNew() {
		List<String> strings = new ArrayList<String>();
		strings.add(this.site);
		strings.add(this.codeUV);
		strings.add(this.type + " " + this.groupe);
		strings.add(this.jour);
		strings.add(this.heureDebut);
		strings.add(this.heureFin);
		strings.add("" + this.frequence);
		strings.add(this.salle);
		return String.join("\t", strings);
	}

}
