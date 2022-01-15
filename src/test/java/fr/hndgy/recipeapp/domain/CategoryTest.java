package fr.hndgy.recipeapp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();

    }

    @Test
    void getId() {

        Long idValue = 4L;
        category.setId(idValue);
        Assert.assertEquals(idValue, category.getId());

    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}