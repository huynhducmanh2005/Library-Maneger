package com.project.MyManager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name = "title", nullable = false)
   private String title;

   @Column(name = "isbn", nullable = false, unique = true)
   private String isbn;

   @Column(name = "author", nullable = false)
   private String author;

   @Column(name = "publisher", nullable = false)
   private String publisher;

   @Column(name = "publish_year", nullable = false)
   private String publishYear;

   @Column(name = "total_copies", nullable = false)
   private double totalCopies;

   @Column(name = "available_copies", nullable = false)
   private String availableCopies;

   @Column(name = "shelf_location", nullable = false)
   private long shelfLocation;

   @Column(name = "price", nullable = false)
   private double price;

}
