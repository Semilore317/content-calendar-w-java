package dev.abrahambankole.content_calendar.controller;

import dev.abrahambankole.content_calendar.model.Content;
import dev.abrahambankole.content_calendar.repository.ContentCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    // make a request and find all the content in the system
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

    // Create Read Update Delete - filter | paging | sorting
}
