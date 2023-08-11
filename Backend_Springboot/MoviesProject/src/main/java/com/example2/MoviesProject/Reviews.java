package com.example2.MoviesProject;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews 
{
	@Id
	private ObjectId id;
	private String body;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	private LocalDateTime created;
    private LocalDateTime updated;

	public Reviews(String body, LocalDateTime created, LocalDateTime updated) {
		super();
		this.body = body;
		this.created = created;
		this.updated = updated;
	}
	
}
