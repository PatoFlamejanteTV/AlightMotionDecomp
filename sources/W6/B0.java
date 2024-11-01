package W6;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class B0 extends AbstractC1494u {

    /* renamed from: b, reason: collision with root package name */
    private byte[] f10788b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B0(byte[] bArr) {
        this.f10788b = bArr;
    }

    private void A() {
        if (this.f10788b != null) {
            C1478e c1478e = new C1478e();
            A0 a02 = new A0(this.f10788b);
            while (a02.hasMoreElements()) {
                c1478e.a((AbstractC1492s) a02.nextElement());
            }
            this.f10876a = c1478e.g();
            this.f10788b = null;
        }
    }

    @Override // W6.AbstractC1494u, W6.AbstractC1492s, W6.AbstractC1487m
    public synchronized int hashCode() {
        A();
        return super.hashCode();
    }

    @Override // W6.AbstractC1494u, java.lang.Iterable
    public synchronized Iterator iterator() {
        A();
        return super.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public synchronized void m(C1491q c1491q, boolean z8) {
        try {
            byte[] bArr = this.f10788b;
            if (bArr != null) {
                c1491q.n(z8, 48, bArr);
            } else {
                super.t().m(c1491q, z8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public synchronized int n() {
        byte[] bArr = this.f10788b;
        if (bArr != null) {
            return E0.a(bArr.length) + 1 + this.f10788b.length;
        }
        return super.t().n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1494u, W6.AbstractC1492s
    public synchronized AbstractC1492s s() {
        A();
        return super.s();
    }

    @Override // W6.AbstractC1494u
    public synchronized int size() {
        A();
        return super.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1494u, W6.AbstractC1492s
    public synchronized AbstractC1492s t() {
        A();
        return super.t();
    }

    @Override // W6.AbstractC1494u
    public synchronized InterfaceC1476d v(int i8) {
        A();
        return super.v(i8);
    }

    @Override // W6.AbstractC1494u
    public synchronized Enumeration y() {
        byte[] bArr = this.f10788b;
        if (bArr != null) {
            return new A0(bArr);
        }
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1494u
    public InterfaceC1476d[] z() {
        A();
        return super.z();
    }
}
