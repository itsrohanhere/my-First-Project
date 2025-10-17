package com.myApplication.my.First.Project.Controller;

import com.myApplication.my.First.Project.Entity.JournalEntry;
import com.myApplication.my.First.Project.repository.JournalEntryRepo;
import com.myApplication.my.First.Project.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // component with speciality
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping("/abc")
    public List<JournalEntry> getAll(){
        return new ArrayList<>();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
         return true;

    }

    @GetMapping("/id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId){
        return null;
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId){
        return  null;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateEntry(@PathVariable long id,@RequestBody JournalEntry myEntry){
        return null;
    }

}
