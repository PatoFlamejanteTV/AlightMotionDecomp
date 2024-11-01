package W6;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: W6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1492s extends AbstractC1487m {
    public static AbstractC1492s q(byte[] bArr) {
        C1484j c1484j = new C1484j(bArr);
        try {
            AbstractC1492s p8 = c1484j.p();
            if (c1484j.available() == 0) {
                return p8;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // W6.AbstractC1487m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC1476d) && l(((InterfaceC1476d) obj).d())) {
            return true;
        }
        return false;
    }

    @Override // W6.AbstractC1487m
    public void g(OutputStream outputStream) {
        C1491q.a(outputStream).t(this);
    }

    @Override // W6.AbstractC1487m
    public abstract int hashCode();

    @Override // W6.AbstractC1487m
    public void j(OutputStream outputStream, String str) {
        C1491q.b(outputStream, str).t(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean l(AbstractC1492s abstractC1492s);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void m(C1491q c1491q, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int n();

    public final boolean o(AbstractC1492s abstractC1492s) {
        if (this != abstractC1492s && !l(abstractC1492s)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean r();

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public final AbstractC1492s d() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1492s s() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1492s t() {
        return this;
    }
}
