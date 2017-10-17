package PontosPorFuncao;

import java.io.File;
import java.util.Vector;

public class LeitorArquivo {
	
	public static File[] buscaArquivoDoDiretorio(File diretorio) {
		Vector<File> vetor = new Vector<File>();
		File[] files = diretorio.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				File[] recFiles = buscaArquivoDoDiretorio(files[i]);
				for (int j = 0; j < recFiles.length; j++) {
					vetor.addElement(recFiles[j]);
				}
			} else {
				vetor.addElement(files[i]);
			}
		}
		
		File[] encontrados = new File[vetor.size()];
		for (int i = 0; i < vetor.size(); i++) {
			encontrados[i] = (File)vetor.elementAt(i);
		}
		return encontrados;
	}
		
}
