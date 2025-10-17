package com.myApplication.my.First.Project.repository;

import com.myApplication.my.First.Project.Entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry,String> {


}
