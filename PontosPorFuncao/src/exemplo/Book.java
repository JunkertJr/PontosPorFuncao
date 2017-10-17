package exemplo;

import exemplo.annotations.CE_BAIXA;
import exemplo.annotations.IE_ALTA;

public class Book {
	
	private String title;
	private int pages;
	private BookCategory category;
	private Writer author;
	
	@IE_ALTA
	public void create(){
	}
	
	@IE_ALTA
	public void edit(){
	}
	
	@CE_BAIXA
	public void search(){
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		return pages;
	}
	
	public BookCategory getCategory() {
		return category;
	}
	
	public Writer getAuthor() {
		return author;
	}
}
