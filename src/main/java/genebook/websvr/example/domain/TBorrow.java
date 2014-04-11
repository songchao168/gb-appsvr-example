package genebook.websvr.example.domain;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the T_BORROW database table.
 * 
 */
@Entity
@Table(name="T_BORROW")
public class TBorrow implements Serializable {
	private static final long serialVersionUID = 1L;

    @Temporal( TemporalType.DATE)
	@Column(name="BE_RETURN_DATE")
	private Date beReturnDate;

	@Column(name="BOOK_ID")
	private String bookId;

    @Temporal( TemporalType.DATE)
	@Column(name="BORROW_DATE")
	private Date borrowDate;

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO,generator = "uuid-string")
	private String id;

    @Temporal( TemporalType.DATE)
	@Column(name="RETURN_DATE")
	private Date returnDate;

	private String status;

	@Column(name="USER_ID")
	private String userId;

    public TBorrow() {
    }

	public Date getBeReturnDate() {
		return this.beReturnDate;
	}

	public void setBeReturnDate(Date beReturnDate) {
		this.beReturnDate = beReturnDate;
	}

	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Date getBorrowDate() {
		return this.borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}