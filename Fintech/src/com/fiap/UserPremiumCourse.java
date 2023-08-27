package com.fiap;

public class UserPremiumCourse {
	private int userCourseId;
	private UserPremium user;
	private Course course;
	
	public UserPremiumCourse(UserPremium user, Course course) {
		this.user = user;
		this.course = course;
	}

	public int getUserCourseId() {
		return userCourseId;
	}

	public void setUserCourseId(int userCourseId) {
		this.userCourseId = userCourseId;
	}

	public UserPremium getUser() {
		return user;
	}

	public void setUser(UserPremium user) {
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
