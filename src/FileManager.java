import java.io.IOException;

public class FileManager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Fichier F1 = new LectureReverse("C:/Users/licence/Desktop/fichier.txt");
		Fichier F2 = new LectureLine("C:/Users/licence/Desktop/fichier.txt");
		
		System.out.println(F1.Lecture());
		System.out.println("\n");
		System.out.println(F2.Lecture());
		System.out.println("\n");
		
	}
}
