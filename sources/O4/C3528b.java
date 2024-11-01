package o4;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3528b {

    /* renamed from: a, reason: collision with root package name */
    private final float f35934a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35935b;

    public C3528b(float f8, float f9) {
        this.f35934a = f8;
        this.f35935b = f9;
    }

    public final float a() {
        return this.f35935b;
    }

    public final float b() {
        return this.f35934a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3528b)) {
            return false;
        }
        C3528b c3528b = (C3528b) obj;
        if (Float.compare(this.f35934a, c3528b.f35934a) == 0 && Float.compare(this.f35935b, c3528b.f35935b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f35934a) * 31) + Float.floatToIntBits(this.f35935b);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + this.f35934a + ", borderStrokeWidth=" + this.f35935b + ")";
    }
}
