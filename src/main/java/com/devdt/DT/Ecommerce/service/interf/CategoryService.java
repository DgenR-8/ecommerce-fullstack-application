package com.devdt.DT.Ecommerce.service.interf;

import com.devdt.DT.Ecommerce.dto.CategoryDto;
import com.devdt.DT.Ecommerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
