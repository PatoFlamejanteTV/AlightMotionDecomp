package q6;

/* renamed from: q6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3805D extends r6.d {

    /* renamed from: a, reason: collision with root package name */
    public long f37352a = -1;

    /* renamed from: b, reason: collision with root package name */
    public U5.d f37353b;

    @Override // r6.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(C3803B c3803b) {
        if (this.f37352a >= 0) {
            return false;
        }
        this.f37352a = c3803b.X();
        return true;
    }

    @Override // r6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public U5.d[] b(C3803B c3803b) {
        long j8 = this.f37352a;
        this.f37352a = -1L;
        this.f37353b = null;
        return c3803b.W(j8);
    }
}
