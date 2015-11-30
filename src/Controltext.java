
public class Controltext {

	public static void main(String[] args) {
		Filespractice start  = new Filespractice();
		start.openfile();
		start.addRecords();
		start.closefile();

		Fileread begin = new Fileread();
		begin.openthefile();
		begin.readTheFile();
		begin.closethefile();
		
		/*writetofile commence = new writetofile();
		commence.openafile();
		commence.addRecords();
		commence.closeafile();
	*/
	}

}
