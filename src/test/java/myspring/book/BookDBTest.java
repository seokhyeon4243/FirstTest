package myspring.book;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.book.dao.mapper.BookMapper;
import myspring.book.service.BookService;
import myspring.book.vo.BookVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-beans-book.xml")
public class BookDBTest {
	@Autowired
	DataSource dataSource;
	
	@Autowired
	BookMapper bookMapper;
	
	@Autowired
	BookService bookService;
	
	@Test
	public void service() {
		BookVO book = bookService.getBook(1);
		System.out.println(book);
	}
	
	@Test
	public void mapper() {
		BookVO book = bookMapper.selectBookById(1);
		System.out.println(book);
	}
	
	@Test
	public void conn() {
		try {
			Connection connection = dataSource.getConnection();
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println("DB Product Name = " + metaData.getDatabaseProductName());
			System.out.println("DB Driver = " + metaData.getDriverName());
			System.out.println("DB Url = " + metaData.getURL());
			System.out.println("DB Username = " + metaData.getUserName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
