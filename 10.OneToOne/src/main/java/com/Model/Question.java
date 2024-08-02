package com.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Question
{
	@Id
    	int qid;
	@Column
    	String ques;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pk_A")
	Answer ans;
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
}
