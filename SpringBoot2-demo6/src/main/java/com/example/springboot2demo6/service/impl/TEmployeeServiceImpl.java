package com.example.springboot2demo6.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot2demo6.domain.TEmployee;
import com.example.springboot2demo6.mapper.TEmployeeMapper;
import com.example.springboot2demo6.service.TEmployeeService;
import org.springframework.stereotype.Service;

/**
* @author lh
* @description 针对表【t_employee】的数据库操作Service实现
* @createDate 2022-03-19 09:10:17
*/
@Service
public class TEmployeeServiceImpl extends ServiceImpl<TEmployeeMapper, TEmployee>
implements TEmployeeService{

}
