package W;

import Q.AbstractC1396p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f10708a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f10709b = Executors.defaultThreadFactory();

    public a(String str) {
        AbstractC1396p.m(str, "Name must not be null");
        this.f10708a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f10709b.newThread(new b(runnable, 0));
        newThread.setName(this.f10708a);
        return newThread;
    }
}
