package com.sist.main2;
import java.util.*;
public class Container {
	Model[] models= {new BoardModel(),
					new FoodModel(),
					new RecipeModel(),
					new SeoulModel(),
					new NoticeMoedl()};
		
	public Model getmodel(int no) {
		return models[no-1];
	}
}
