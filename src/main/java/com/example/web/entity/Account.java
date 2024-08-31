package com.example.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "Accounts")
public class Account implements Serializable {

	@Id
	@NotBlank(message = "Không được để trống")
	String username;
	@NotBlank(message = "Không được để trống")
	@Size(min = 3, max = 12, message = "Mật khẩu phải từ 3 đến 12 ký tự")
	String password;
	@NotBlank(message = "Không được để trống")
	String fullname;
	@NotBlank(message = "Không được để trống")
	@Email(message = "Email không đúng định dạng")
	String email;
	String photo;
	String token;
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Order> orders;

	@JsonIgnore
	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
	List<Authority> authorities;
}