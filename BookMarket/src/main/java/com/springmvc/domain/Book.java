package com.springmvc.domain;

public class Book {
	/**
	 *  書籍ID
	 */
	private String bookId;
	/**
	 *  書籍名
	 */
	private String name;
	/**
	 *  価額
	 */
	private int unitPrice;
	/**
	 *  著者
	 */
	private String author;
	/**
	 *  説明
	 */
	private String description;
	/**
	 *  出版社
	 */
	private String publisher;
	/**
	 *  分類
	 */
	private String category;
	/**
	 *  在庫数
	 */
	private long unitsInStock;
	/**
	 *  出版日（月/年）
	 */
	private String releaseDate;
	/**
	 *  新作、中古、電子書籍
	 */
	private String condition;

	public Book() {
	}

	public Book(String bookId, String name, int unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	/**
	 * @return bookId
	 */
	public String getBookId() {
		return bookId;
	}

	/**
	 * @param bookId セットする bookId
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return unitPrice
	 */
	public int getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice セットする unitPrice
	 */
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author セットする author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher セットする publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return unitsInStock
	 */
	public long getUnitsInStock() {
		return unitsInStock;
	}

	/**
	 * @param unitsInStock セットする unitsInStock
	 */
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	/**
	 * @return releaseDate
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate セットする releaseDate
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition セットする condition
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

}
