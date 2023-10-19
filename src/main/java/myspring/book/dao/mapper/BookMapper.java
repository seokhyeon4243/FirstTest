package myspring.book.dao.mapper;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookMapper {
	BookVO selectBookById(int id);
	List<BookVO> selectBookList();
}
