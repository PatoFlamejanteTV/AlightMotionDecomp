package W6;

import J7.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: W6.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1494u extends AbstractC1492s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC1476d[] f10876a;

    /* renamed from: W6.u$a */
    /* loaded from: classes5.dex */
    class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        private int f10877a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10877a < AbstractC1494u.this.f10876a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f10877a;
            InterfaceC1476d[] interfaceC1476dArr = AbstractC1494u.this.f10876a;
            if (i8 < interfaceC1476dArr.length) {
                this.f10877a = i8 + 1;
                return interfaceC1476dArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1494u() {
        this.f10876a = C1478e.f10834d;
    }

    public static AbstractC1494u u(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1494u)) {
            if (obj instanceof InterfaceC1495v) {
                return u(((InterfaceC1495v) obj).d());
            }
            if (obj instanceof byte[]) {
                try {
                    return u(AbstractC1492s.q((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1476d) {
                AbstractC1492s d8 = ((InterfaceC1476d) obj).d();
                if (d8 instanceof AbstractC1494u) {
                    return (AbstractC1494u) d8;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1494u) obj;
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        int length = this.f10876a.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 = (i8 * 257) ^ this.f10876a[length].d().hashCode();
            } else {
                return i8;
            }
        }
    }

    public Iterator iterator() {
        return new a.C0078a(this.f10876a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof AbstractC1494u)) {
            return false;
        }
        AbstractC1494u abstractC1494u = (AbstractC1494u) abstractC1492s;
        int size = size();
        if (abstractC1494u.size() != size) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1492s d8 = this.f10876a[i8].d();
            AbstractC1492s d9 = abstractC1494u.f10876a[i8].d();
            if (d8 != d9 && !d8.l(d9)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s s() {
        return new C1479e0(this.f10876a, false);
    }

    public int size() {
        return this.f10876a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return new s0(this.f10876a, false);
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i8 = 0;
        while (true) {
            stringBuffer.append(this.f10876a[i8]);
            i8++;
            if (i8 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public InterfaceC1476d v(int i8) {
        return this.f10876a[i8];
    }

    public Enumeration y() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1476d[] z() {
        return this.f10876a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1494u(C1478e c1478e) {
        if (c1478e == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f10876a = c1478e.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1494u(InterfaceC1476d[] interfaceC1476dArr, boolean z8) {
        this.f10876a = z8 ? C1478e.b(interfaceC1476dArr) : interfaceC1476dArr;
    }
}
