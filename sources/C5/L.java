package c5;

import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class L {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15628e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f15629a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15630b;

    /* renamed from: c, reason: collision with root package name */
    private int f15631c;

    /* renamed from: d, reason: collision with root package name */
    private long f15632d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public L(String type, String json) {
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(json, "json");
        this.f15629a = type;
        this.f15630b = json;
        this.f15631c = -1;
        this.f15632d = System.currentTimeMillis();
    }

    private final int f() {
        if (UptodownApp.f29249C.M()) {
            return MBridgeCommon.DEFAULT_LOAD_TIMEOUT;
        }
        if (!l6.n.s(this.f15629a, "new_releases", true) && !l6.n.s(this.f15629a, "last_updates", true)) {
            return 1800000;
        }
        return 600000;
    }

    public final boolean a() {
        if (System.currentTimeMillis() - this.f15632d < f()) {
            return true;
        }
        return false;
    }

    public final String b() {
        return this.f15630b;
    }

    public final K c() {
        K k8 = new K();
        k8.i(this.f15630b);
        k8.j(200);
        return k8;
    }

    public final long d() {
        return this.f15632d;
    }

    public final String e() {
        return this.f15629a;
    }

    public final void g(int i8) {
        this.f15631c = i8;
    }

    public final void h(long j8) {
        this.f15632d = j8;
    }
}
