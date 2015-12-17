import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

abstract class Fichier implements TraiteurFichier{
	private String nomFichier;
	
	public Fichier(String nom){
		this.nomFichier = nom;
	}
	
	public ArrayList<String> Lecture() throws IOException{
		ArrayList<String> result = new ArrayList<String>();
		BufferedReader in = null;
		try{
			File file = new File(nomFichier);
			FileReader reader = new FileReader(file);
			in = new BufferedReader(reader);
			
			String content;
			while ((content = in.readLine()) != null) {
				result.add(content);
			}
		}
		finally{
			if(in != null)
				in.close();
		}
		return result;
	}
}
