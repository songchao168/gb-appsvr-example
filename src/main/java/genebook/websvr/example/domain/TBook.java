package genebook.websvr.example.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the T_BOOK database table.
 * 
 */
@Entity
@Table(name="T_BOOK")
@GenericGenerator(name="uuid_s",strategy="uuid") 
public class TBook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATE_TIME")
	private Timestamp createTime;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO,generator = "uuid-string")
	@GeneratedValue(generator="uuid_s")
	private String id;

	private String isbn;

	private String name;

	private BigDecimal price;

	@Column(name="STATE")
	private String state;

    public TBook() {
    }

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}