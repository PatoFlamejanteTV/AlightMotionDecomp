package i6;

/* renamed from: i6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2976d implements InterfaceC2977e {

    /* renamed from: a, reason: collision with root package name */
    private final float f32767a;

    /* renamed from: b, reason: collision with root package name */
    private final float f32768b;

    public C2976d(float f8, float f9) {
        this.f32767a = f8;
        this.f32768b = f9;
    }

    public boolean a(float f8) {
        if (f8 >= this.f32767a && f8 <= this.f32768b) {
            return true;
        }
        return false;
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f32768b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i6.InterfaceC2977e
    public /* bridge */ /* synthetic */ boolean c(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i6.InterfaceC2977e
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    @Override // i6.InterfaceC2978f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f32767a);
    }

    public boolean e(float f8, float f9) {
        if (f8 <= f9) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2976d) {
            if (!isEmpty() || !((C2976d) obj).isEmpty()) {
                C2976d c2976d = (C2976d) obj;
                if (this.f32767a != c2976d.f32767a || this.f32768b != c2976d.f32768b) {
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
        return (Float.floatToIntBits(this.f32767a) * 31) + Float.floatToIntBits(this.f32768b);
    }

    @Override // i6.InterfaceC2977e, i6.InterfaceC2978f
    public boolean isEmpty() {
        if (this.f32767a > this.f32768b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f32767a + ".." + this.f32768b;
    }
}
