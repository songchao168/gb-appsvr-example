package genebook.websvr.example.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class BookDTO {
	private Timestamp createTime;
	
	private String id;

//	@Length(min=1,max=20, message="ISBN长度在1-20之间")
	private String isbn;
	
//	@NotEmpty(message="书名不能为空")
	private String name;
	
	private BigDecimal price;
	
	private String state="0";

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}
