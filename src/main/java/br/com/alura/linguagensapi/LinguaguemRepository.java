package br.com.alura.linguagensapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguaguemRepository extends MongoRepository<Linguagem,String>{
    
}
