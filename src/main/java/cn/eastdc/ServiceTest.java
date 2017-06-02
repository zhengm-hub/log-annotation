package cn.eastdc;

import cn.eastdc.annotation.Log;
import org.springframework.stereotype.Service;

/**
 * Created by zhming on 2017/5/18.
 */
@Service
public class ServiceTest {

    @Log("test1 begin...")
    public void test1() {
        System.out.println("=====test1======");
    }

    @Log("test2 begin...")
    public void test2() {
        System.out.println("=====test2========");
    }
}
