package per.jeremy.designpattern.observer.delegate;

import java.util.Date;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/3/16
 */
public class WatchingNBAListener {

    public WatchingNBAListener() {
        System.out.println("我正在看NBA " + new Date());
    }

    public void stopWatchingNBA(Date date) {
        System.out.println("老师来了，快关闭NBA 。 结束时间" + date);
    }

}
