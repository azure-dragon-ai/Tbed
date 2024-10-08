package cn.hjhai.utils;

import javax.servlet.http.HttpServletRequest;

import cn.hjhai.service.impl.ImgServiceImpl;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/11/6 17:35
 */
public class GetIPS implements Runnable {
    private String imgname ;

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }
    @Override
    public void run() {
        ImgServiceImpl imgService = SpringContextHolder.getBean(ImgServiceImpl.class);
    }
    public static void runxc(String imgnames){
        GetIPS getIPS = new GetIPS();
        getIPS.setImgname(imgnames);
        Thread thread = new Thread(getIPS);
        thread.start();
    }

    public static String getIpAddr(HttpServletRequest request){
        String ip = request.getHeader("X-Forwarded-For");
        if(org.apache.commons.lang3.StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(org.apache.commons.lang3.StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        return request.getRemoteAddr();

    }


}
