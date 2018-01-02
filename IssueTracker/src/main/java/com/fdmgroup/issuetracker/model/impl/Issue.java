package com.fdmgroup.issuetracker.model.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Issue")
public class Issue {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int issueId;
}
