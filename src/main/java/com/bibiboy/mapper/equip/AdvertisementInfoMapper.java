package com.bibiboy.mapper.equip;

import com.bibiboy.bean.equip.AdvertisementInfo;
import com.bibiboy.bean.equip.AdvertisementInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdvertisementInfoMapper {
    int countByExample(AdvertisementInfoExample example);

    int deleteByExample(AdvertisementInfoExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(AdvertisementInfo record);

    int insertSelective(AdvertisementInfo record);

    List<AdvertisementInfo> selectByExample(AdvertisementInfoExample example);

    AdvertisementInfo selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") AdvertisementInfo record, @Param("example") AdvertisementInfoExample example);

    int updateByExample(@Param("record") AdvertisementInfo record, @Param("example") AdvertisementInfoExample example);

    int updateByPrimaryKeySelective(AdvertisementInfo record);

    int updateByPrimaryKey(AdvertisementInfo record);
    
    @Select(value="select * from advertisement_info ORDER BY n_Top DESC,n_Sort")
    List<AdvertisementInfo> findList();
}