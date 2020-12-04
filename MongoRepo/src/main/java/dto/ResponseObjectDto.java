package dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseObjectDto {

	Integer id;
	String chat_id;
	String imgurUrl;
	List<String> tags;
	LocalDateTime dateTime;

}
