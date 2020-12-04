package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.DataObjectDto;
import dto.ResponseObjectDto;
import service.RepoService;

@RestController
public class MongoRepoController {

	@Autowired
	RepoService repoService;

	@PostMapping("/data")
	public ResponseObjectDto addPost(@RequestBody DataObjectDto dataObjectDto) {
		return repoService.addDataObject(dataObjectDto);
	}

}
