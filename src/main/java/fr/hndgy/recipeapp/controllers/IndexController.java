package fr.hndgy.recipeapp.controllers;

import fr.hndgy.recipeapp.domain.Category;
import fr.hndgy.recipeapp.domain.UnitOfMeasure;
import fr.hndgy.recipeapp.repositories.CategoryRepository;
import fr.hndgy.recipeapp.repositories.RecipeRepository;
import fr.hndgy.recipeapp.repositories.UnitOfMeasureRepository;
import fr.hndgy.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/","index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipesList",this.recipeService.getRecipes());
        return "index";
    }
}
