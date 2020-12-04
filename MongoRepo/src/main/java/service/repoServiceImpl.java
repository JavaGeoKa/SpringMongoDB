package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MongoRepoDB;
import dto.DataObjectDto;
import dto.ResponseObjectDto;
import model.DataObject;

@Service
public class repoServiceImpl implements RepoService {
	private Integer currentDataObjectNumber = 0;

	@Autowired
	MongoRepoDB mongoRepoDB;

	@Override
	public ResponseObjectDto addDataObject(DataObjectDto dataObjectDto) {

		currentDataObjectNumber += 1;
		DataObject dataObject = new DataObject(currentDataObjectNumber, dataObjectDto.getChat_id(),
				dataObjectDto.getImgurUrl(), dataObjectDto.getTags());
		if (mongoRepoDB.existsById(dataObject.getId())) {
			return null;
		}
		System.out.println(dataObject.getChat_id() + "CHATID");
		mongoRepoDB.save(dataObject);

		return convertDataObjectToResponseObjectDto(dataObject);
	}

	private ResponseObjectDto convertDataObjectToResponseObjectDto(DataObject dataObject) {
		return ResponseObjectDto.builder().id(dataObject.getId()).chat_id(dataObject.getChat_id())
				.imgurUrl(dataObject.getImgurUrl()).tags(dataObject.getTags()).dateTime(dataObject.getDateTime())
				.build();
	}

}
