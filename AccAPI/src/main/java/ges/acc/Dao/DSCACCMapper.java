package ges.acc.Dao;

import ges.acc.Entity.DSCACC;

import java.util.List;

public interface DSCACCMapper {
    int deleteByPrimaryKey(String ACC001);

    int insert(DSCACC record);

    int insertSelective(DSCACC record);

    List<DSCACC> selectAllData();

    DSCACC selectByPrimaryKey(String ACC001);

    int updateByPrimaryKeySelective(DSCACC record);

    int updateByPrimaryKey(DSCACC record);
}