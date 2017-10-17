package exemplo;

import java.util.List;

import exemplo.annotations.ALI_BAIXA;
import exemplo.annotations.ALI_MEDIA;
import exemplo.annotations.CE_BAIXA;
import exemplo.annotations.IE_ALTA;
import exemplo.annotations.IE_MEDIA;

public class Writer {
	
	private String name;
	private List<Book> books;
	
	@IE_MEDIA
	public void create(){
	}
	
	@IE_ALTA
	public void edit(){
	}
	
	@CE_BAIXA
	public void search(){
	}
	
	@ALI_MEDIA
	public void addBooks(){
	}
	
	@ALI_BAIXA
	public void deleteBooks(){
	}
	
	public String getName() {
		return name;
	}
	
	public List<Book> getBooks() {
		return books;
	}
}
