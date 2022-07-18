package com.example.springproject.wishlist.repository;

import com.example.springproject.db.MemoryDbRepositoryAbstract;
import com.example.springproject.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
