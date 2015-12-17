import java.io.IOException;
import java.util.ArrayList;

public class LectureLine extends Fichier{

	public LectureLine(String nom) {
		super(nom);
	}
	
	public ArrayList<String> Lecture() throws IOException{
		ArrayList<String> temp = super.Lecture();
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i=temp.size()-1; i>=0; i--){
			result.add(temp.get(i));
		}
		return result;
	}
}