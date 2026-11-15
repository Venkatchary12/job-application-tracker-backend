package com.Project.JobApplicationTracker.service;



import java.util.List;

import com.Project.JobApplicationTracker.entities.Event;

public interface EventService {
    List<Event> getAllEvents();
    Event addEvent(Event event);
    Event updateEvent(Long id, Event event);
    void deleteEvent(Long id);
}

