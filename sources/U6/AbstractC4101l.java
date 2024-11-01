package u6;

import java.util.concurrent.TimeUnit;
import s6.G;
import s6.I;

/* renamed from: u6.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4101l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f40368a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f40369b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f40370c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f40371d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f40372e;

    /* renamed from: f, reason: collision with root package name */
    public static AbstractC4096g f40373f;

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC4098i f40374g;

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC4098i f40375h;

    static {
        long f8;
        int e8;
        int e9;
        long f9;
        f8 = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f40369b = f8;
        e8 = I.e("kotlinx.coroutines.scheduler.core.pool.size", i6.m.d(G.a(), 2), 1, 0, 8, null);
        f40370c = e8;
        e9 = I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f40371d = e9;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f9 = I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f40372e = timeUnit.toNanos(f9);
        f40373f = C4094e.f40358a;
        f40374g = new C4099j(0);
        f40375h = new C4099j(1);
    }
}
