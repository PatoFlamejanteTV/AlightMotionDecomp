package w0;

/* loaded from: classes3.dex */
final class i extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40660a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Object obj) {
        this.f40660a = obj;
    }

    @Override // w0.g
    public Object b() {
        return this.f40660a;
    }

    @Override // w0.g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f40660a.equals(((i) obj).f40660a);
        }
        return false;
    }

    public int hashCode() {
        return this.f40660a.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f40660a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
