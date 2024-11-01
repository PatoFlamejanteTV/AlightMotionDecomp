package i6;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: i6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2975c extends AbstractC2973a implements InterfaceC2978f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32765e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C2975c f32766f = new C2975c(1, 0);

    /* renamed from: i6.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2975c(char c8, char c9) {
        super(c8, c9, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2975c) {
            if (!isEmpty() || !((C2975c) obj).isEmpty()) {
                C2975c c2975c = (C2975c) obj;
                if (e() != c2975c.e() || g() != c2975c.g()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + g();
    }

    @Override // i6.InterfaceC2978f
    public boolean isEmpty() {
        if (AbstractC3292y.k(e(), g()) > 0) {
            return true;
        }
        return false;
    }

    public boolean k(char c8) {
        if (AbstractC3292y.k(e(), c8) <= 0 && AbstractC3292y.k(c8, g()) <= 0) {
            return true;
        }
        return false;
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(g());
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(e());
    }

    public String toString() {
        return e() + ".." + g();
    }
}
