package j4;

import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j4.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3201q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f34243b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34244c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final List f34245a;

    /* renamed from: j4.q0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C3201q0(List items) {
        AbstractC3292y.i(items, "items");
        this.f34245a = items;
    }

    public final List a() {
        return this.f34245a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3201q0) && AbstractC3292y.d(this.f34245a, ((C3201q0) obj).f34245a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f34245a.hashCode();
    }

    public String toString() {
        return "LayoutSpec(items=" + this.f34245a + ")";
    }
}
