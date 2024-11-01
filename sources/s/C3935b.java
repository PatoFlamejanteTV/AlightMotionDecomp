package s;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3935b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f38899a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3935b(Integer num) {
        this.f38899a = num;
    }

    @Override // s.g
    public Integer a() {
        return this.f38899a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f38899a;
        Integer a9 = ((g) obj).a();
        if (num == null) {
            if (a9 == null) {
                return true;
            }
            return false;
        }
        return num.equals(a9);
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f38899a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f38899a + "}";
    }
}
