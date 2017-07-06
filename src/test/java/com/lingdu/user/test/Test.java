package com.lingdu.user.test;

import java.util.List;

import com.lingdu.common.util.SpringUtil;
import com.lingdu.user.domain.User;
import com.lingdu.user.service.UserService;

/**
 * 测试类
 * @author LingDu
 */
public class Test {
	//通过   SpringUtil.getBean(UserService.class) 找到 UserService 对象
	private static UserService service = SpringUtil.getBean(UserService.class);
	
	public static void main(String[] args) {
		//add();
		//update();
		//delete();
		selectAll();
	}
	
	/**
	 * 添加用户
	 */
	public static void add(){
		User user = new User();
		user.setName("超级管理员");
		user.setAccount("admin");
		service.addUser(user);
		System.out.println("添加用户成功！");
	}
	
	/**
	 * 查询所有
	 */
	public static void selectAll(){
		List<User> list = service.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
	
	/**
	 * 更新
	 */
	public static void update(){
		User user = new User();
		user.setId(71);
		user.setName("测试员");
		user.setAccount("test");
		service.updateUser(user);
		System.out.println("更新成功！");
	}
	
	/**
	 * 删除
	 */
	public static void delete(){
		//这里我删除id=71的用户
		service.deleteUser(71);
		System.out.println("删除成功！");
	}
}
