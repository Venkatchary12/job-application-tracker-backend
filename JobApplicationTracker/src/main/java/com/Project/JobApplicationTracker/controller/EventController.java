package com.Project.JobApplicationTracker.controller;


import org.springframework.web.bind.annotation.*;

import com.Project.JobApplicationTracker.entities.Event;
import com.Project.JobApplicationTracker.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = {
        "https://job-application-tracker-frontend.netlify.app",
        "http://localhost:5173"},allowCredentials = "true")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }
}

