package i6;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes5.dex */
public final class i extends C2979g implements InterfaceC2978f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32777e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final i f32778f = new i(1, 0);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final i a() {
            return i.f32778f;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public i(int i8, int i9) {
        super(i8, i9, 1);
    }

    @Override // i6.C2979g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (e() != iVar.e() || g() != iVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i6.C2979g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + g();
    }

    @Override // i6.C2979g, i6.InterfaceC2978f
    public boolean isEmpty() {
        if (e() > g()) {
            return true;
        }
        return false;
    }

    public boolean m(int i8) {
        if (e() <= i8 && i8 <= g()) {
            return true;
        }
        return false;
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(g());
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(e());
    }

    @Override // i6.C2979g
    public String toString() {
        return e() + ".." + g();
    }
}
