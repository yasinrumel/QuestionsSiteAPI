package com.project.questapp.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="post")
@Data
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@ManyToOne(fetch=FetchType.EAGER) // LAZY Post u cektiğimizde user gelmesin anlamına geliyor. EAGER tam tersi
	@JoinColumn(name="user_id",nullable=false) //post tablosundaki userid ile user tablosundaki user id yi bağlıyoruz
	@OnDelete(action=OnDeleteAction.CASCADE) //Bir user silindiğinde tüm postları silinsin
	User user;
	
	String title;
	@Lob
	@Column(columnDefinition="text")
	String text;
	
}
