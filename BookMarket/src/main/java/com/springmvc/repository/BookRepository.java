package com.springmvc.repository;

import java.util.List;

import com.springmvc.domain.Book;

public interface BookRepository {

	// 書籍リスト
	List<Book> getAllBookList();

}
