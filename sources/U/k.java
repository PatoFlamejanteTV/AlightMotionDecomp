package u;

import java.util.concurrent.Executor;
import w.InterfaceC4139b;

/* loaded from: classes3.dex */
public final class k implements InterfaceC4139b {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final k f40130a = new k();
    }

    public static k a() {
        return a.f40130a;
    }

    public static Executor b() {
        return (Executor) w.d.d(j.a());
    }

    @Override // N5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
