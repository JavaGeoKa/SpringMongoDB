package model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "predicts")

public class DataObject {
	Integer id;
	String chat_id;
	String imgurUrl;
	List<String> tags;
	LocalDateTime dateTime;

	public DataObject(Integer id, String chat_id, String imgurUrl, List<String> tags) {
		this.id = id;
		this.chat_id = chat_id;
		this.imgurUrl = imgurUrl;
		this.tags = tags;
		this.dateTime = LocalDateTime.now();
	}

}
