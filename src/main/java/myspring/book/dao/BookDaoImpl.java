package myspring.book.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.book.dao.mapper.BookMapper;
import myspring.book.vo.BookVO;

@Repository("bookDao")
public class BookDaoImpl implements BookDao{

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<BookVO> readAll() {
		List<BookVO> bookList = bookMapper.selectBookList();
		return bookList;
	}

	@Override
	public BookVO read(int id) {
		BookVO book = bookMapper.selectBookById(id);
		return book;
	}
	

}
