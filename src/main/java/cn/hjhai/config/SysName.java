package cn.hjhai.config;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2020/5/15 9:20
 */
public class SysName {
    public static final String SYSNAME = "root,hjhaicheck,selectdomain,image,hjhaicheck,storage,TOIMG," +
            "user,users,admin,retrievepass,deleteimg,hjhaitempimg,360,hjhaitempwatermarimg,components,log";

    public static Boolean CheckSysName(String name){
        boolean b = true;
        if(SYSNAME.contains(name)){
            b = false;
        }
        return b ;
    }

}
