package mapper;

import mybatis.books;

import java.util.List;

public interface booksMapper {

    List<books> selectPage(Object o);
}
