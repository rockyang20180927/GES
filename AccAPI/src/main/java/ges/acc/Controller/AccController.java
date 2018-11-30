package ges.acc.Controller;

import ges.acc.Dao.DSCACCMapper;
import ges.acc.Entity.DSCACC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import GES.Acc.AccList;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AccController
 * @Author ROCk
 * @Date 2018-11-23 10:53
 * @Description 账套对外接口模型
 **/
@RestController
@RequestMapping("/Acc")
public class AccController {
   @Autowired
   private  DSCACCMapper DAO;

    @RequestMapping("/list")
    public List<AccList> getAllAccData()
    {
        List<AccList> listall=new ArrayList<AccList>();
        List<DSCACC> list=DAO.selectAllData();
        for (DSCACC dscacc:
                list) {
            AccList accList=new AccList();
            accList.setAccNo(dscacc.getACC001());
            accList.setAccName(dscacc.getACC007());
            listall.add(accList);
        }
        return listall;
    }

}
