package p6;

import c6.InterfaceC2072n;
import j6.InterfaceC3216e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3289v;
import n6.InterfaceC3470o;
import s6.C3980F;
import s6.I;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final j f36393a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f36394b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f36395c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3980F f36396d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3980F f36397e;

    /* renamed from: f, reason: collision with root package name */
    private static final C3980F f36398f;

    /* renamed from: g, reason: collision with root package name */
    private static final C3980F f36399g;

    /* renamed from: h, reason: collision with root package name */
    private static final C3980F f36400h;

    /* renamed from: i, reason: collision with root package name */
    private static final C3980F f36401i;

    /* renamed from: j, reason: collision with root package name */
    private static final C3980F f36402j;

    /* renamed from: k, reason: collision with root package name */
    private static final C3980F f36403k;

    /* renamed from: l, reason: collision with root package name */
    private static final C3980F f36404l;

    /* renamed from: m, reason: collision with root package name */
    private static final C3980F f36405m;

    /* renamed from: n, reason: collision with root package name */
    private static final C3980F f36406n;

    /* renamed from: o, reason: collision with root package name */
    private static final C3980F f36407o;

    /* renamed from: p, reason: collision with root package name */
    private static final C3980F f36408p;

    /* renamed from: q, reason: collision with root package name */
    private static final C3980F f36409q;

    /* renamed from: r, reason: collision with root package name */
    private static final C3980F f36410r;

    /* renamed from: s, reason: collision with root package name */
    private static final C3980F f36411s;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3289v implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36412a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final j d(long j8, j jVar) {
            return c.x(j8, jVar);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (j) obj2);
        }
    }

    static {
        int e8;
        int e9;
        e8 = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f36394b = e8;
        e9 = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f36395c = e9;
        f36396d = new C3980F("BUFFERED");
        f36397e = new C3980F("SHOULD_BUFFER");
        f36398f = new C3980F("S_RESUMING_BY_RCV");
        f36399g = new C3980F("RESUMING_BY_EB");
        f36400h = new C3980F("POISONED");
        f36401i = new C3980F("DONE_RCV");
        f36402j = new C3980F("INTERRUPTED_SEND");
        f36403k = new C3980F("INTERRUPTED_RCV");
        f36404l = new C3980F("CHANNEL_CLOSED");
        f36405m = new C3980F("SUSPEND");
        f36406n = new C3980F("SUSPEND_NO_WAITER");
        f36407o = new C3980F("FAILED");
        f36408p = new C3980F("NO_RECEIVE_RESULT");
        f36409q = new C3980F("CLOSE_HANDLER_CLOSED");
        f36410r = new C3980F("CLOSE_HANDLER_INVOKED");
        f36411s = new C3980F("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i8) {
        if (i8 != 0) {
            if (i8 != Integer.MAX_VALUE) {
                return i8;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC3470o interfaceC3470o, Object obj, Function1 function1) {
        Object n8 = interfaceC3470o.n(obj, null, function1);
        if (n8 != null) {
            interfaceC3470o.C(n8);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean C(InterfaceC3470o interfaceC3470o, Object obj, Function1 function1, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        return B(interfaceC3470o, obj, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j8, boolean z8) {
        long j9;
        if (z8) {
            j9 = 4611686018427387904L;
        } else {
            j9 = 0;
        }
        return j9 + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j8, int i8) {
        return (i8 << 60) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j x(long j8, j jVar) {
        return new j(j8, jVar, jVar.u(), 0);
    }

    public static final InterfaceC3216e y() {
        return a.f36412a;
    }

    public static final C3980F z() {
        return f36404l;
    }
}
