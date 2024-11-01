package B2;

import B2.z;
import R5.AbstractC1435t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: h, reason: collision with root package name */
    public static final a f404h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f405a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f406b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f407c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f408d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f409e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f410f;

    /* renamed from: g, reason: collision with root package name */
    private final z f411g;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public H(int i8, Object obj, Map headers) {
        boolean z8;
        boolean z9;
        String str;
        AbstractC3292y.i(headers, "headers");
        this.f405a = i8;
        this.f406b = obj;
        this.f407c = headers;
        if (i8 == 200) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f408d = z8;
        if (i8 >= 200 && i8 < 300) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f409e = z9;
        this.f410f = i8 == 429;
        z.a aVar = z.f554b;
        List c8 = c("Request-Id");
        if (c8 != null) {
            str = (String) AbstractC1435t.o0(c8);
        } else {
            str = null;
        }
        this.f411g = aVar.a(str);
    }

    public final Object a() {
        return this.f406b;
    }

    public final int b() {
        return this.f405a;
    }

    public final List c(String key) {
        Object obj;
        AbstractC3292y.i(key, "key");
        Iterator it = this.f407c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (l6.n.s((String) ((Map.Entry) obj).getKey(), key, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (List) entry.getValue();
    }

    public final z d() {
        return this.f411g;
    }

    public final boolean e() {
        return this.f409e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h8 = (H) obj;
        if (this.f405a == h8.f405a && AbstractC3292y.d(this.f406b, h8.f406b) && AbstractC3292y.d(this.f407c, h8.f407c)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f408d;
    }

    public int hashCode() {
        int hashCode;
        int i8 = this.f405a * 31;
        Object obj = this.f406b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((i8 + hashCode) * 31) + this.f407c.hashCode();
    }

    public String toString() {
        return "Request-Id: " + this.f411g + ", Status Code: " + this.f405a;
    }
}
