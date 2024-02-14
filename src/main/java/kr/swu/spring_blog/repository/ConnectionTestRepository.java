package kr.swu.spring_blog.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConnectionTestRepository {
    String getNow();
}
