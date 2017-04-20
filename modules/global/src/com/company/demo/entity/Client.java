package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "DEMO_CLIENT")
@Entity(name = "demo$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 5557933041538825263L;

    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Lob
    @Column(name = "SUMMARY")
    protected String summary;

    @Column(name = "PRIORITY")
    protected Integer priority;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority() {
        return priority;
    }


}