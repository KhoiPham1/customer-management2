package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {//generic cú pháp khai báo trong <generic >
    Iterable<Customer>findAllByProvince(Province province);
    Page<Customer>findTop3ByFirstNameContaining(String firstname, Pageable pageable);// câu lệnh truy ván, cơ chế proxy( ủy nghiệm) , create query spring data.

}
