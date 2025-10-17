package com.myApplication.my.First.Project.service;

import com.myApplication.my.First.Project.Entity.JournalEntry;
import com.myApplication.my.First.Project.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepo.save(journalEntry);
    }

}
