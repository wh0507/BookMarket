package com.springmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springmvc.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {

	private List<Book> listOfBoolks = new ArrayList<Book>();

	public BookRepositoryImpl() {
		Book book1 = new Book("ISBN1234", "確かな力が身につくC#「超」入門", 3500);
		book1.setAuthor("北村 愛実");
		book1.setDescription("「JavaScript」「Python」「PHP」に続くシリーズ第4弾。\n"
				+ "初めてプログラミングに挑戦する初心者を対象に、C#言語の基礎から本格的なアプリケーションの作り方を優しく解説します。\n"
				+ "開発環境のインストールからしっかりと解説していきますので、初心者でも安心して学習を開始することができます。プログラミングの教科書として、最初に読む一冊としておすすめです。");
		book1.setPublisher("SB Creative");
		book1.setCategory("IT専門");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2017/7/26");

		Book book2 = new Book("ISBN1235", "スッキリわかるJava入門 第3版 (スッキリわかる入門シリーズ)", 2860);
		book2.setAuthor("中山清喬 (著), 国本大悟 (著), 株式会社フレアリンク (監修)");
		book2.setDescription("発売から8年であっという間に総計40万部到達した大人気シリーズの原点。\n"
				+ "「どうして? 」「なぜそうなる? 」が必ずわかるJava入門書史上最強の定番書!\n"
				+ "読みやすさ、使いやすさをさらに磨いた増補改訂版登場!");
		book2.setPublisher("インプレス");
		book2.setCategory("IT専門");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2019/11/15");

		Book book3 = new Book("ISBN1236", "はじめての人の飲食店開業塾 (まずはこの本から!) 単行本", 1485);
		book3.setAuthor("赤沼 慎太郎");
		book3.setDescription("まずはこの本から!\n"
				+ "はじめての開業準備の、不安を取り除く一冊です。\n"
				+ "儲かるお店を、本書と共にオープンしましょう!");
		book3.setPublisher("かんき出版");
		book3.setCategory("飲食");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2009/3/16");

		listOfBoolks.add(book1);
		listOfBoolks.add(book2);
		listOfBoolks.add(book3);
	}

	@Override
	public List<Book> getAllBookList() {

		return listOfBoolks;
	}

}
