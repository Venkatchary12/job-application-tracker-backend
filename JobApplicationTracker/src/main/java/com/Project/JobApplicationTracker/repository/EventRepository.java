package com.Project.JobApplicationTracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.JobApplicationTracker.entities.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}

