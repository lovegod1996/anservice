package com.a123.an.test;

import com.a123.an.dao.HelpDaoImpl;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Author: lovegod
 * Created by 123 on 2016/11/7.
 */
public class HelpTest {
    @Test
    public void testGetHelpList(){
        HelpDaoImpl daoimpl=new HelpDaoImpl();
        List<Map<String ,Object>> helpList=daoimpl.getHelpList(0);
       System.out.println(helpList);
    }
}
