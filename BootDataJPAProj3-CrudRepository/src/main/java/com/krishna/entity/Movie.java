package com.krishna.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;


/*@Data
@Entity
@Table(name="SP_DATA_MOVIE")
@RequiredArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name = "SP_DATA_MOVIE")
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="MID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer mid;
	@Column(name="MNAME",length = 20)
	@NonNull
	private  String  mname;
	@Column(name="YEAR",length = 20)
	@NonNull
	private  String  year;
	@Column(name="RATING")
	@NonNull
	private   Float rating;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Movie(Integer mid, @NonNull String mname, @NonNull String year, @NonNull float rating) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.year = year;
		this.rating = rating;
	}


	public Integer getMid() {
		return mid;
	}


	public void setMid(Integer mid) {
		this.mid = mid;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", year=" + year + ", rating=" + rating + "]";
	}
	
	

}
