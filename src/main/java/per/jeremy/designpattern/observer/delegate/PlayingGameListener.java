package per.jeremy.designpattern.observer.delegate;

import java.util.Date;

/**
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10/3/16
 */
public class PlayingGameListener {

    public PlayingGameListener() {
        System.out.println("我正在玩游戏 开始时间" + new Date());
    }

    public void stopPlayingGame(Date date) {
        System.out.println("老师来了，快回到座位上，结束时间" + date);
    }

}
