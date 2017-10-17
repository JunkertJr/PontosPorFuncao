package exemplo;

import java.util.List;

import exemplo.annotations.ALI_ALTA;
import exemplo.annotations.ALI_BAIXA;
import exemplo.annotations.ALI_MEDIA;
import exemplo.annotations.CE_BAIXA;
import exemplo.annotations.IE_ALTA;
import exemplo.annotations.OE_ALTA;
import exemplo.annotations.OE_BAIXA;
import exemplo.annotations.OE_MEDIA;

public class Libary {
	
	private String name;
	private List<Writer> writers;
	private List<Book> books;
	
	@IE_ALTA
	public void create(){
	}
	
	@IE_ALTA
	public void edit(){
	}
	
	@CE_BAIXA
	public void search(){
	}
	
	@ALI_MEDIA
	public void addWriters(){
	}
	
	@ALI_ALTA
	public void addBooks(){
	}
	
	@ALI_BAIXA
	public void deleteWriters(){
	}
	
	@ALI_BAIXA
	public void deleteBooks(){
	}
	
	@OE_ALTA
	public void generateReportsLibary(){
	}
	
	@OE_MEDIA
	public void generateReportsWriters(){
	}
	
	@OE_BAIXA
	public void generateReportsBooks(){
	}
	
	public String getName() {
		return name;
	}

	public List<Writer> getWriters() {
		return writers;
	}

	public List<Book> getBooks() {
		return books;
	}

}
