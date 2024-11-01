package W6;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class A0 implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    private C1484j f10786a;

    /* renamed from: b, reason: collision with root package name */
    private Object f10787b = a();

    public A0(byte[] bArr) {
        this.f10786a = new C1484j(bArr, true);
    }

    private Object a() {
        try {
            return this.f10786a.p();
        } catch (IOException e8) {
            throw new r("malformed DER construction: " + e8, e8);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        if (this.f10787b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f10787b;
        if (obj != null) {
            this.f10787b = a();
            return obj;
        }
        throw new NoSuchElementException();
    }
}
