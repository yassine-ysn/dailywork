package com.daily.work.domain;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class Activity {

    private Long id;
    private String description;
    private LocalDateTime debutDate;

    public Activity() {
    }

    public Activity(String description, LocalDateTime debutDate) {
        this.id = new AtomicLong().getAndIncrement();
        this.description = description;
        this.debutDate = debutDate;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public LocalDateTime getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(LocalDateTime debutDate) {
        this.debutDate = debutDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", Description='" + description + '\'' +
                ", debutDate=" + debutDate +
                '}';
    }
}
