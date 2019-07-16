package com.imooc.repository;

import com.imooc.annotation.FirstLevelRepository;
import com.imooc.annotation.SecondLevelRepository;

//@FirstLevelRepository(value = "myFirstLevelRepository")
@SecondLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {
}
