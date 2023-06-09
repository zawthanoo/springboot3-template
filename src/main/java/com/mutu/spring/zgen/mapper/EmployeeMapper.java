package com.mutu.spring.zgen.mapper;

import com.mutu.spring.zgen.entity.Employee;
import com.mutu.spring.zgen.entity.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String empNo);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExampleWithRowbounds(EmployeeExample example, RowBounds rowBounds);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(String empNo);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}