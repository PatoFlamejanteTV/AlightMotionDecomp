package O;

import N.C1341d;

/* loaded from: classes3.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    private final C1341d f6924a;

    public k(C1341d c1341d) {
        this.f6924a = c1341d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f6924a));
    }
}
