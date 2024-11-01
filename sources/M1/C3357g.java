package m1;

import android.util.Log;
import c1.InterfaceC2009b;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;
import s.AbstractC3937d;
import s.C3936c;

/* renamed from: m1.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3357g implements InterfaceC3358h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34924b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2009b f34925a;

    /* renamed from: m1.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3357g(InterfaceC2009b transportFactoryProvider) {
        AbstractC3292y.i(transportFactoryProvider, "transportFactoryProvider");
        this.f34925a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(z zVar) {
        String b9 = C3345A.f34816a.c().b(zVar);
        AbstractC3292y.h(b9, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + b9);
        byte[] bytes = b9.getBytes(C3338d.f34755b);
        AbstractC3292y.h(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // m1.InterfaceC3358h
    public void a(z sessionEvent) {
        AbstractC3292y.i(sessionEvent, "sessionEvent");
        ((s.j) this.f34925a.get()).a("FIREBASE_APPQUALITY_SESSION", z.class, C3936c.b("json"), new s.h() { // from class: m1.f
            @Override // s.h
            public final Object apply(Object obj) {
                byte[] c8;
                c8 = C3357g.this.c((z) obj);
                return c8;
            }
        }).b(AbstractC3937d.f(sessionEvent));
    }
}
