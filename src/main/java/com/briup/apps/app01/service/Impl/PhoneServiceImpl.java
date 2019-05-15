package com.briup.apps.app01.service.Impl;

import com.briup.apps.app01.bean.Phone;
import com.briup.apps.app01.bean.PhoneExample;
import com.briup.apps.app01.mapper.PhoneMapper;
import com.briup.apps.app01.service.IPhoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: app01
 * @description:
 * @author: CC
 * @create: 2019/05/03 20:20
 */
@Service
public class PhoneServiceImpl implements IPhoneService{

    @Resource
    private PhoneMapper phoneMapper;
    @Override
    public List<Phone> findAll() {
        PhoneExample example = new PhoneExample();
        return phoneMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Phone phone) {
        if (phone.getId() != null){
            //修改
//            phoneMapper.updateByExample()
        }else{
            //插入
            phoneMapper.insert(phone);
        }
    }

    @Override
    public Phone findById(long id) {
        PhoneExample example = new PhoneExample();
        example.createCriteria().andIdEqualTo(id);
        List<Phone> list = phoneMapper.selectByExample(example);
        if (list.size() > 0){
            return list.get(0);
        }else{
            return null;
        }

    }
}
