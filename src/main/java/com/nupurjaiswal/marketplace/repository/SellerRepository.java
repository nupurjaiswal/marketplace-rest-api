package com.nupurjaiswal.marketplace.repository;

import com.nupurjaiswal.marketplace.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
