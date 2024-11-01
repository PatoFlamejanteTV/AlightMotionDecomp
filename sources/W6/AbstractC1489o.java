package W6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: W6.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1489o extends AbstractC1492s implements InterfaceC1490p {

    /* renamed from: a, reason: collision with root package name */
    byte[] f10866a;

    public AbstractC1489o(byte[] bArr) {
        if (bArr != null) {
            this.f10866a = bArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public static AbstractC1489o u(AbstractC1499z abstractC1499z, boolean z8) {
        if (z8) {
            if (abstractC1499z.z()) {
                return v(abstractC1499z.v());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC1492s v8 = abstractC1499z.v();
        if (abstractC1499z.z()) {
            AbstractC1489o v9 = v(v8);
            if (abstractC1499z instanceof M) {
                return new E(new AbstractC1489o[]{v9});
            }
            return (AbstractC1489o) new E(new AbstractC1489o[]{v9}).t();
        }
        if (v8 instanceof AbstractC1489o) {
            AbstractC1489o abstractC1489o = (AbstractC1489o) v8;
            if (abstractC1499z instanceof M) {
                return abstractC1489o;
            }
            return (AbstractC1489o) abstractC1489o.t();
        }
        if (v8 instanceof AbstractC1494u) {
            AbstractC1494u abstractC1494u = (AbstractC1494u) v8;
            if (abstractC1499z instanceof M) {
                return E.B(abstractC1494u);
            }
            return (AbstractC1489o) E.B(abstractC1494u).t();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC1499z.getClass().getName());
    }

    public static AbstractC1489o v(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1489o)) {
            if (obj instanceof byte[]) {
                try {
                    return v(AbstractC1492s.q((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1476d) {
                AbstractC1492s d8 = ((InterfaceC1476d) obj).d();
                if (d8 instanceof AbstractC1489o) {
                    return (AbstractC1489o) d8;
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1489o) obj;
    }

    @Override // W6.InterfaceC1490p
    public InputStream c() {
        return new ByteArrayInputStream(this.f10866a);
    }

    @Override // W6.y0
    public AbstractC1492s e() {
        return d();
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return J7.a.k(y());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof AbstractC1489o)) {
            return false;
        }
        return J7.a.a(this.f10866a, ((AbstractC1489o) abstractC1492s).f10866a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s s() {
        return new C1471a0(this.f10866a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return new C1471a0(this.f10866a);
    }

    public String toString() {
        return "#" + J7.h.b(K7.b.a(this.f10866a));
    }

    public byte[] y() {
        return this.f10866a;
    }
}
