package w0;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4140a extends g {

    /* renamed from: a, reason: collision with root package name */
    static final C4140a f40651a = new C4140a();

    private C4140a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g e() {
        return f40651a;
    }

    @Override // w0.g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // w0.g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
