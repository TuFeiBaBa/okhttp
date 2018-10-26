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
     * {@link okhttp3.internal.cache.InternalCache}
     * Applications shouldn't implement this: instead use {@link okhttp3.Cache}.
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
     * Authenticator的实现示例：{@link JavaNetAuthenticator}
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

    /**
     * okhttp对重定向的处理：{@link okhttp3.internal.http.RetryAndFollowUpInterceptor#followUpRequest(Response, Route)}
     * 1.如果{@link OkHttpClient.Builder#followRedirects(boolean)}传入fasle，不会进行重定向。
     * 2.默认不支持跨协议的重定向，比如不在http和https之间进行重定向
     * 3.非"PROPFIND"请求的重定向，比如POST，都会变成"GET"，丢失请求体
     *
     * <a href="https://www.jianshu.com/p/61a60859a317">案例：okhttp post 重定向参数丢失 跨协议重定向</a>
     */

    /**
     * OkHttp在运行中的异步请求数最多为64{@link Dispatcher#maxRequests}，
     * 而同一个host 的异步请求数最多为5{@link Dispatcher#maxRequestsPerHost}。
     * 否则会加入到readyAsyncCalls中。{@link Dispatcher#enqueue(RealCall.AsyncCall)}
     */
}
