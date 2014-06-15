package com.example.SimpleDo;

import java.io.Serializable;
import java.util.Date;

/**
 * Class for To Do items.
 *
 * Created by James on 23/05/2014.
 */
public class ToDoItem implements Serializable {

    //The name of the task
    private String name;
    //The due date
    private Date date;
    //Is the task complete
    private boolean complete;
    //The group the task belongs to
    private String group;
    //The priority of the task
    private String priority;

    /**
     * Constructor for the ToDoItem class.
     *
     * @param name  The name of the task.
     * @param date  The due date of the task.
     * @param group The group of the task.
     */
    public ToDoItem(String name, Date date, String group, String priority) {
        this.name = name;
        this.date = date;
        this.group = group;
        this.priority = priority;
        complete = false;
    }

    public String getDueTime() {
        if (date != null) return "" + date.getHours() + ":" + date.getMinutes();
        else return "";
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYear() {
        return date.getYear();
    }

    public int getMonth() {
        return date.getMonth();
    }

    public int getDay() {
        return date.getDay();
    }

    public int getHour() { return date.getHours();}

    public int getMin() { return date.getMinutes();}

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getName() {
        return name;
    }
}