package com.cis.batch33.library.repository;

import com.cis.batch33.library.entity.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LIbraryMemberRepository extends JpaRepository<LibraryMember, Integer> {

}
