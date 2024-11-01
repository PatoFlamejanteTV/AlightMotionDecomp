package b2;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1967e {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f14909a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1968f f14910b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1968f f14911c;

    public C1967e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.f14909a = concurrentHashMap;
        concurrentHashMap.put(Date.class, AbstractC1964b.f14908c);
        concurrentHashMap.put(int[].class, AbstractC1963a.f14892c);
        concurrentHashMap.put(Integer[].class, AbstractC1963a.f14893d);
        concurrentHashMap.put(short[].class, AbstractC1963a.f14892c);
        concurrentHashMap.put(Short[].class, AbstractC1963a.f14893d);
        concurrentHashMap.put(long[].class, AbstractC1963a.f14900k);
        concurrentHashMap.put(Long[].class, AbstractC1963a.f14901l);
        concurrentHashMap.put(byte[].class, AbstractC1963a.f14896g);
        concurrentHashMap.put(Byte[].class, AbstractC1963a.f14897h);
        concurrentHashMap.put(char[].class, AbstractC1963a.f14898i);
        concurrentHashMap.put(Character[].class, AbstractC1963a.f14899j);
        concurrentHashMap.put(float[].class, AbstractC1963a.f14902m);
        concurrentHashMap.put(Float[].class, AbstractC1963a.f14903n);
        concurrentHashMap.put(double[].class, AbstractC1963a.f14904o);
        concurrentHashMap.put(Double[].class, AbstractC1963a.f14905p);
        concurrentHashMap.put(boolean[].class, AbstractC1963a.f14906q);
        concurrentHashMap.put(Boolean[].class, AbstractC1963a.f14907r);
        this.f14910b = new C1965c(this);
        this.f14911c = new C1966d(this);
        concurrentHashMap.put(X1.c.class, this.f14910b);
        concurrentHashMap.put(X1.b.class, this.f14910b);
        concurrentHashMap.put(X1.a.class, this.f14910b);
        concurrentHashMap.put(X1.d.class, this.f14910b);
    }
}
