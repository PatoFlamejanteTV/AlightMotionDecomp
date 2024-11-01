package n6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n6.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3455g0 implements InterfaceC3478s0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35721a;

    public C3455g0(boolean z8) {
        this.f35721a = z8;
    }

    @Override // n6.InterfaceC3478s0
    public K0 a() {
        return null;
    }

    @Override // n6.InterfaceC3478s0
    public boolean isActive() {
        return this.f35721a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
