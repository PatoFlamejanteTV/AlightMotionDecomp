package i6;

import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes5.dex */
public final class l extends j implements InterfaceC2978f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32787e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final l f32788f = new l(1, 0);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public l(long j8, long j9) {
        super(j8, j9, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (e() != lVar.e() || g() != lVar.g()) {
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
        return (int) ((31 * (e() ^ (e() >>> 32))) + (g() ^ (g() >>> 32)));
    }

    @Override // i6.InterfaceC2978f
    public boolean isEmpty() {
        if (e() > g()) {
            return true;
        }
        return false;
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(g());
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(e());
    }

    public String toString() {
        return e() + ".." + g();
    }
}
