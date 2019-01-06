package top.gendseo.books.pojo;

import java.util.List;



public class BooksBean {

	private String total;
	private List<Book> rows;

	public void setRows(List<Book> books) {
		this.rows = books;
	}

	public List<Book> getRows() {
		return rows;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}