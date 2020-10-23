

public class UserAgent {
    public static boolean isWebpEnabled(String ua) {
        String mozilla = "Mozilla";
        String chrome = "Chrome";
        String android = "Android";
        // 判断userAgent中是否包含指定浏览器信息，如有指定字符则可将图片转换为webp格式

        //User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0 Safari/605.1.15
        //User-Agent: Mozilla/5.0 (iPhone; CPU iPhone OS 13_5_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.1.1 Mobile/15E148 Safari/604.1
        //判断是否包含iOS iPad iPhone
        if(ua.contains("iOS") || ua.contains("iPad") || ua.contains("iPhone") ){
            if(ua.contains("Version/14")){
                return true;
            }else{
                return false;
            }
        }else
        {
            return (ua.contains(mozilla) || ua.contains(chrome) || ua.contains(android));
        }
    }
}
