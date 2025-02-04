package top.misec.config;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * @author JunzhouLiu
 */
@Slf4j
@ToString
@Data
public class BiliVerify {

    private HashMap<String, Object> cookieMap = new HashMap<>();
    private String biliCookies;

    public void initCookiesMap() {
        String[] sourceArray = biliCookies.split(";");
        for (String s : sourceArray) {
            String[] target = s.split("=");
            cookieMap.put(target[0].trim(), target[1].trim());
        }
        log.info("inti cookies map ");
    }

    public String getBiliJct() {
        return cookieMap.get("bili_jct").toString();
    }

    public String getDedeUserId() {
        return cookieMap.get("DedeUserID").toString();
    }
}
