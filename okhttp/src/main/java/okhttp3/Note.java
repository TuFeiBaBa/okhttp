package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author TuFei
 * @date 18-10-18.
 */
class Note {
    /**
     * okhttp的默认连接超时时间是10秒。如果设置timeout为0，意味着没有timeout。
     * 读超时、写超时亦是如此。
     * @see OkHttpClient.Builder#connectTimeout(long, TimeUnit)
     */

    /**
     * 完全禁用代理，调用{@code proxy(Proxy.NO_PROXY)}
     * @see OkHttpClient.Builder#proxy(Proxy)
     * 设置代理的选择策略
     * @see OkHttpClient.Builder#proxySelector(ProxySelector)
     */

    /**
     * 设置Cookie的处理。可以参考{@link JavaNetCookieJar}的实现,
     * 但该实现并没有将cookie持久化。
     * @see OkHttpClient.Builder#cookieJar(CookieJar)
     */

    /**
     * {@link CacheControl#FORCE_NETWORK}、{@link CacheControl#FORCE_CACHE}
     */

    /**
     * X.509是密码学里公钥证书的格式标准
     */

    /**
     * 可以配置跟服务端通讯的协议。但不能包括{@link Protocol#HTTP_1_0}，
     * 也不能传null
     * @see OkHttpClient.Builder#protocols(List)
     * @see OkHttpClient.Builder#protocols(List)
     */


    /**
     * okhttp异步任务默认创建的线程池，size为{@link Integer#MAX_VALUE}。
     * keepAliveTime为60s。创建的线程都是守护线程。
     * @see Dispatcher#executorService()
     */

    /**
     * 同步请求：{@link RealCall#execute()}
     * 异步请求：{@link RealCall#enqueue(Callback)}
     */
}
