package com.devdt.DT.Ecommerce.repository;

import com.devdt.DT.Ecommerce.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
