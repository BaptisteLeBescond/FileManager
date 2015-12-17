import java.io.IOException;
import java.util.ArrayList;

public class LectureReverse extends Fichier{

	public LectureReverse(String nom) {
		super(nom);
	}
	
	public ArrayList<String> Lecture() throws IOException{
		ArrayList<String> temp = super.Lecture();
		String result = null;

		for(int i=temp.size()-1; i>=0; i--){
			for(int j=temp.get(i).length()-1; j>=0; j--){
				result += temp.get(i).charAt(j);
			}

		}
		System.out.println(result);
		return temp;
	}
}
