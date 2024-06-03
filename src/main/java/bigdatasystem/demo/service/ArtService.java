package bigdatasystem.demo.service;

import bigdatasystem.demo.dto.Art;

import bigdatasystem.demo.repository.ArtRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Service
public class ArtService {

    @Autowired
    private ArtRepository artRepository;
    //private MongoTemplate mongoTemplate;

    public List<Art> getArtsList() { // 모든 다큐먼트 조회
        return artRepository.findAll();
        //return objectMapper.writeValueAsString(ArtRepository.findByName(name))
        //return ArtRepository.findAll();
    }

    public Art getArtById(String id) { // id로 다큐먼트 조회
        return artRepository.findById(id).orElse(null);
    }


}


