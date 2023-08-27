package com.fiap;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe que cria usuários premium. Usuários premium tem direito a cursos de finanças
 * @author Aline
 *
 */
public class UserPremium extends User{
	private List<UserPremiumCourse> listCourses;
	
	public UserPremium(int userId, String username, String password, String email) {
		super(userId, username, password, email);
		this.listCourses = new ArrayList<>();
	}

	public List<UserPremiumCourse> getListCourses(){
		return listCourses;
	}
	
	public void ChooseCourse(Course course) {
		UserPremiumCourse userCourse = new UserPremiumCourse(this, course);
		listCourses.add(userCourse);
	}
}
