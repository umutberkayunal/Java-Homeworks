package homework3.business;

import java.util.ArrayList;

import homework3.core.logging.Logger;
import homework3.dataAccess.CategoryDao;
import homework3.entities.Category;

public class CategoryManager {
	private CategoryDao categorydao;
	private Logger[] loggers;
	private ArrayList<String> categorynames = new ArrayList<String>();
	
	public CategoryManager(CategoryDao categorydao, Logger[] loggers) {
		this.categorydao = categorydao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		if(categorynames.contains(category.getName())) {
			throw new Exception("Category name already exists.");
		}
		categorydao.add(category);
		categorynames.add(category.getName());
		for(Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
