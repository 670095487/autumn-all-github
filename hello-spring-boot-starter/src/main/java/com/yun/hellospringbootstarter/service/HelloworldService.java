package com.yun.hellospringbootstarter.service;

/**
 * Created by yunN on 2021/05/31.
 */
public class HelloworldService {
    private String words;

    private String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello() {
        return "hello, " + words;
    }

}
/**

AbstractFrozenHandler

@author yunnuan

@createTime 2020年11月23日 22:06

@description 冻结的抽象类 （可在抽象类中定义好大流程，若大流程相同，子类可只用于关注自身特殊实现）
*/
public class AbstractFrozenHandler implements FrozenHandler {

public String getFrozenSerialNo() {
return “抽象父类串”;
}

@Override
public void afterPropertiesSet() throws Exception {

}

/**

适配器模式下，子类继承此抽象类，可选择实现对应的方法，无需全部实现
@return 。
*/
@Override
public String getString() {
return null;
}
@Override
public String getAllString() {
return null;
}
}

package com.yun.autumn_web.service.frozen;

/**

FFrozen

@author yunnuan

@createTime 2020年11月23日 22:11

@description
*/
public class FFrozen extends AbstractFrozenHandler {
@Override
public String getFrozenSerialNo() {
return super.getFrozenSerialNo();
}

@Override
public void afterPropertiesSet() throws Exception {
FrozenFactory.registryHandler(“FFrozen”, this);
}

@Override
public String getString() {
return “FFrozen”;
}
}

package com.yun.autumn_web.service.frozen;

/**

FrozenApplication

@author yunnuan

@createTime 2020年11月23日 22:11

@description
*/
public class FrozenApplication {

public static void main(String[] args) {
FrozenHandler fFrozen = FrozenFactory.getRealHandler(“FFrozen”);
fFrozen.getString();

 FrozenHandler tFrozen = FrozenFactory.getRealHandler("TFrozen");
 tFrozen.getString();
}
}

package com.yun.autumn_web.service.frozen;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**

FrozenFactory

@author yunN

@createTime 2021年04月14日 15:09

@description 链路工厂
*/
public class FrozenFactory {

private final static Map<String, FrozenHandler> HANDLER_MAP = new HashMap<>(16);

public static FrozenHandler getRealHandler(String target){
return HANDLER_MAP.get(target);
}

public static void registryHandler(String target, FrozenHandler frozenHandler) {
if (!StringUtils.isEmpty(target) && frozenHandler != null) {
HANDLER_MAP.put(target, frozenHandler);
}
}
}
package com.yun.autumn_web.service.frozen;

import org.springframework.beans.factory.InitializingBean;

/**

FrozenHandler

@author yunnuan

@createTime 2020年11月23日 22:05

@description
*/
public interface FrozenHandler extends InitializingBean {

String getString();

String getAllString();
}
package com.yun.autumn_web.service.frozen;

import com.yun.autumn_web.dao.UserLimitInfoDao;
import com.yun.autumn_web.pojo.QpUserLimitInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**

TFrozen

@author yunnuan

@createTime 2020年11月23日 22:08

@description
*/
public class TFrozen extends AbstractFrozenHandler {

@Override
public void afterPropertiesSet() throws Exception {
FrozenFactory.registryHandler(“TFrozen”, this);
}

/**

接口里的方法
@return 冻结类型
*/
@Override
public String getString() {
return “TFrozen”;
}
}
