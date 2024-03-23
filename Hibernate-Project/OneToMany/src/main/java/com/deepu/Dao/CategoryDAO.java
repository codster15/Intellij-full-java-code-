

package com.deepu.Dao;

import com.deepu.entity.CategoryEntity;

public interface CategoryDAO {

        void saveCategory (CategoryEntity entity);

        CategoryEntity FetchEntity (Integer categoryID);


        void removeCategoryEntity (Integer categoryID);




}
