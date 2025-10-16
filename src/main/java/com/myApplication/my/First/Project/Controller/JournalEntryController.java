package com.myApplication.my.First.Project.Controller;

import com.myApplication.my.First.Project.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // component with speciality
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @GetMapping("/abc")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
         journalEntries.put(myEntry.getId(), myEntry);
         return true;

    }

    @GetMapping("/id/{myId}")
    public JournalEntry getEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable Long myId){
        return  journalEntries.remove(myId);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateEntry(@PathVariable long id,@RequestBody JournalEntry myEntry){
        return journalEntries.put(id, myEntry);
    }

}
