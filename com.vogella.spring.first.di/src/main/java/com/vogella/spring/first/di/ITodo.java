package com.vogella.spring.first.di;

import java.util.Date;

public interface ITodo {

	long getId();

	String getSummary();

	void setSummary(String summary);

	void setDescription(String description);

	String getDescription();

	boolean isDone();

	void setDone(boolean isDone);

	Date getDueDate();

	void setDueDate(Date dueDate);

	ITodo copy();

}
