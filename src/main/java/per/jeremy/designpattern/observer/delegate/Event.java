package per.jeremy.designpattern.observer.delegate;

import java.lang.reflect.Method;

/**
 * The type Event.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /3/16
 */
public class Event {

    // 事件触发的对象
    private Object object;
    // 方法名
    private String methodName;
    // 参数
    private Object[] params;
    // 参数类型
    private Class[] paramTypes;

    /**
     * Instantiates a new Event.
     */
    public Event() {
    }

    /**
     * Instantiates a new Event.
     *
     * @param object     the object
     * @param methodName the method name
     * @param args       the args
     */
    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    /**
     * 根据参数数组生成参数类型数组
     *
     * @param params
     */
    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    /**
     * 执行该对象的该方法
     *
     * @throws Exception the exception
     */
    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());
        if (null == method) {
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }

    /**
     * Gets object.
     *
     * @return the object
     */
    public Object getObject() {
        return object;
    }


    /**
     * Sets object.
     *
     * @param object the object
     */
    public void setObject(Object object) {
        this.object = object;
    }

    /**
     * Gets method name.
     *
     * @return the method name
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets method name.
     *
     * @param methodName the method name
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * Get params object [ ].
     *
     * @return the object [ ]
     */
    public Object[] getParams() {
        return params;
    }

    /**
     * Sets params.
     *
     * @param params the params
     */
    public void setParams(Object[] params) {
        this.params = params;
    }

    /**
     * Get param types class [ ].
     *
     * @return the class [ ]
     */
    public Class[] getParamTypes() {
        return paramTypes;
    }

    /**
     * Sets param types.
     *
     * @param paramTypes the param types
     */
    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }

}
