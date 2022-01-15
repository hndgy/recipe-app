package fr.hndgy.recipeapp.controllers;

import fr.hndgy.recipeapp.domain.Recipe;
import fr.hndgy.recipeapp.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RecursiveAction;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
        indexController = new IndexController(recipeService);

    }

    @Test
    void getIndexPage() {
        //given
        Set<Recipe> recipeSet = new HashSet<>();
        Recipe recipe1 = new Recipe();
        recipe1.setId(1L);
        recipeSet.add(recipe1);
        Recipe recipe2 = new Recipe();
        recipe2.setId(2L);
        recipeSet.add(recipe2);

        when(recipeService.getRecipes()).thenReturn(recipeSet);
        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        String viewName = indexController.getIndexPage(model);

        //then
        assertEquals("index",viewName);
        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipesList"), argumentCaptor.capture());
        // eq est un matcher qui vérifie si le nom de l'attribut = "recipes"

        Set<Recipe> setInController = argumentCaptor.getValue();

        assertEquals(2, setInController.size());
    }
}