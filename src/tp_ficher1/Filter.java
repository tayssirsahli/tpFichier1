package tp_ficher1;

import java.io.File;
import java.io.FilenameFilter;

public class Filter implements FilenameFilter {

	private char lettre;

	public Filter(char lettreDébut) {
		lettre = lettreDébut;
	}

	@Override
	public boolean accept(File dir, String name) {
		
		return name.startsWith(String.valueOf(lettre));
	}

}
