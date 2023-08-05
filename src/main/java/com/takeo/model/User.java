package com.takeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Setter
//@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

	
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String passWord;

}
