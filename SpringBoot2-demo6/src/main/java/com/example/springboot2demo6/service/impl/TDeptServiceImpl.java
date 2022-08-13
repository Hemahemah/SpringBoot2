package com.example.springboot2demo6.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot2demo6.domain.TDept;
import com.example.springboot2demo6.mapper.TDeptMapper;
import com.example.springboot2demo6.service.TDeptService;
import org.springframework.stereotype.Service;

/**
* @author lh
* @description 针对表【t_dept】的数据库操作Service实现
* @createDate 2022-03-19 09:10:17
*/
@Service
public class TDeptServiceImpl extends ServiceImpl<TDeptMapper, TDept>
implements TDeptService{

}
