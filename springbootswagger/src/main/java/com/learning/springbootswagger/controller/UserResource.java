package com.learning.springbootswagger.controller;

import java.awt.print.Pageable;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
//@Component
@RequestMapping("/rest")
@Api(value = "User Details API", description = "User Details API")
public class UserResource {

	@GetMapping("/users")
	@ApiOperation(value = "Get All Users of Details")
	@ApiResponses(value = {
			@ApiResponse(code = 100, message = "Executing API"),
			@ApiResponse(code = 300, message = "API condition")
	})
	public PagedResources<Resource<User>> getAllUser(@PageableDefault(size = 50) Pageable pageable, PagedResourcesAssembler<User> pagedAssembler) {
//	public List<User> getAllUser() {
		List<User> userList = userList();
		
//		return userList();
		
//		pagedAssembler.toResource(new PageImpl<>(userList, pageable, userList.size()));
		
		PagedResources<Resource<User>> userPaged = pagedAssembler.toResource(new PageImpl<>(userList));
		return userPaged;
		
//		return Arrays.asList( new User("Sushma Regonda", 66000L), 
//							  new User("Sravan Kumar Pala", 78000L)
//							);
		
	}
	
	@PostMapping(value = "/secureFile")
	@ApiOperation(value = "Secure a file")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Success")})
	public String secureFile(@RequestParam("file") MultipartFile file) throws IOException {
		
		InputStream inputStream =  new BufferedInputStream(file.getInputStream());
		
		OutputStream os = new ByteArrayOutputStream(); 
//		int byteRead = 0;
		byte[] outputByte = new byte[4096];
		while(inputStream.read(outputByte, 0, 4096) != -1)
        {
			os.write(outputByte, 0, 4096);
        }
		inputStream.close();
//		bis.close();
		os.flush();
		os.close();
		
		return "downloaded";
		
	}
	
	private List<User> userList() {
		return Arrays.asList( new User("Sushma Regonda", 66000L), 
				  new User("Sravan Kumar Pala", 78000L)
				);
	}
	
	private class User {
		
		@ApiModelProperty(notes = "name of the user")
		private String userName;
		private Long salary;
		
		public User(String userName, Long salary) {
			super();
			this.userName = userName;
			this.salary = salary;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getSalary() {
			return salary;
		}

		public void setSalary(Long salary) {
			this.salary = salary;
		}
		
	}
}
