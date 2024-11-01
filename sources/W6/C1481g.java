package W6;

import java.io.IOException;

/* renamed from: W6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1481g extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f10843a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1481g(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10843a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1481g(String str, Throwable th) {
        super(str);
        this.f10843a = th;
    }
}
