package com.cst438.domain;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Like {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long likeId;
	private long id;
	private long drinkId;
	private String drinkStr;
	private String drinkImg;
	
	public long getLikeId() {
		return likeId;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDrinkId() {
		return drinkId;
	}

	public void setDrinkId(long drinkId) {
		this.drinkId = drinkId;
	}

	public String getDrinkStr() {
		return drinkStr;
	}
	public void setDrinkStr(String drinkStr) {
		this.drinkStr = drinkStr;
	}
	public String getDrinkImg() {
		
		return drinkImg;
	}
	public void setDrinkImg(String drinkImg) {
		this.drinkImg = drinkImg;
	}

	public Like(long id, long drinkId, String drinkStr, String drinkImg) {
		super();
		this.id = id;
		this.drinkId = drinkId;
		this.drinkStr = drinkStr;
		this.drinkImg = drinkImg;
	}

     
}