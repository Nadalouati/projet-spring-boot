package com.sheryians.major.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.model.Category;
import com.sheryians.major.repository.CategoryRepository;



@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> gatAllCategory(){
		return categoryRepository.findAll();	
	}
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
}
