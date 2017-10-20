import java.util.HashMap;
import java.util.Map;

public class zqlFirstAssistantContext<T> {

    //防止实例化
    private  zqlFirstAssistantContext(){};

    //登记实例
    private static final Map<String,zqlFirstFactory> mapObj = new HashMap<String,zqlFirstFactory>();

    //静态内部类class loader确保线程安全上下文
    private static class lazyHolder{
        private static final zqlFirstAssistantContext context = new zqlFirstAssistantContext();
    }

    //获取唯一实例
    public static final zqlFirstAssistantContext getInstance(){
        return lazyHolder.context;
    }

    //双重检查锁定，登记获取factory
    public <T> zqlFirstFactory getZqlFirstFactory(String key){
        if(null == mapObj.get(key)){
            synchronized (mapObj){
                if(null == mapObj.get(key)){
                    zqlFirstFactory factoryObj = null;
                    factoryObj = new zqlFirstBothMtrthAssistantFactory<T>();
                    mapObj.put(key,factoryObj);
                }
            }
        }
        return mapObj.get(key);
    }
}
