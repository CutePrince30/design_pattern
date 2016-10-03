package per.jeremy.designpattern.test.observer.delegate;

import junit.framework.TestCase;
import per.jeremy.designpattern.observer.delegate.GoodNotifier;
import per.jeremy.designpattern.observer.delegate.Notifier;
import per.jeremy.designpattern.observer.delegate.PlayingGameListener;
import per.jeremy.designpattern.observer.delegate.WatchingNBAListener;

import java.util.Date;

/**
 * The type Delegate test.
 *
 * @author sunyunjie (jaysunyun_361@163.com)
 * @date 10 /3/16
 */
public class DelegateTest extends TestCase {

    /**
     * Test.
     */
    public void test() {
        Notifier notifier = new GoodNotifier();

        PlayingGameListener playingGameListener = new PlayingGameListener();
        WatchingNBAListener watchingNBAListener = new WatchingNBAListener();

        notifier.addListener(playingGameListener, "stopPlayingGame", new Date());
        notifier.addListener(watchingNBAListener, "stopWatchingNBA", new Date());

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        notifier.notifyX();
    }

}
