package W6;

import J7.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: W6.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1496w extends AbstractC1492s implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC1476d[] f10881a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f10882b;

    /* renamed from: W6.w$a */
    /* loaded from: classes5.dex */
    class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        private int f10883a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10883a < AbstractC1496w.this.f10881a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f10883a;
            InterfaceC1476d[] interfaceC1476dArr = AbstractC1496w.this.f10881a;
            if (i8 < interfaceC1476dArr.length) {
                this.f10883a = i8 + 1;
                return interfaceC1476dArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1496w() {
        this.f10881a = C1478e.f10834d;
        this.f10882b = true;
    }

    private static boolean A(byte[] bArr, byte[] bArr2) {
        int i8 = bArr[0] & (-33);
        int i9 = bArr2[0] & (-33);
        if (i8 != i9) {
            if (i8 >= i9) {
                return false;
            }
            return true;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i10 = 1; i10 < min; i10++) {
            byte b9 = bArr[i10];
            byte b10 = bArr2[i10];
            if (b9 != b10) {
                if ((b9 & 255) >= (b10 & 255)) {
                    return false;
                }
                return true;
            }
        }
        if ((bArr[min] & 255) > (bArr2[min] & 255)) {
            return false;
        }
        return true;
    }

    private static void B(InterfaceC1476d[] interfaceC1476dArr) {
        int i8;
        int length = interfaceC1476dArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC1476d interfaceC1476d = interfaceC1476dArr[0];
        InterfaceC1476d interfaceC1476d2 = interfaceC1476dArr[1];
        byte[] u8 = u(interfaceC1476d);
        byte[] u9 = u(interfaceC1476d2);
        if (A(u9, u8)) {
            interfaceC1476d2 = interfaceC1476d;
            interfaceC1476d = interfaceC1476d2;
            u9 = u8;
            u8 = u9;
        }
        for (int i9 = 2; i9 < length; i9++) {
            InterfaceC1476d interfaceC1476d3 = interfaceC1476dArr[i9];
            byte[] u10 = u(interfaceC1476d3);
            if (A(u9, u10)) {
                interfaceC1476dArr[i9 - 2] = interfaceC1476d;
                interfaceC1476d = interfaceC1476d2;
                u8 = u9;
                interfaceC1476d2 = interfaceC1476d3;
                u9 = u10;
            } else if (A(u8, u10)) {
                interfaceC1476dArr[i9 - 2] = interfaceC1476d;
                interfaceC1476d = interfaceC1476d3;
                u8 = u10;
            } else {
                int i10 = i9 - 1;
                while (true) {
                    i8 = i10 - 1;
                    if (i8 <= 0) {
                        break;
                    }
                    InterfaceC1476d interfaceC1476d4 = interfaceC1476dArr[i10 - 2];
                    if (A(u(interfaceC1476d4), u10)) {
                        break;
                    }
                    interfaceC1476dArr[i8] = interfaceC1476d4;
                    i10 = i8;
                }
                interfaceC1476dArr[i8] = interfaceC1476d3;
            }
        }
        interfaceC1476dArr[length - 2] = interfaceC1476d;
        interfaceC1476dArr[length - 1] = interfaceC1476d2;
    }

    private static byte[] u(InterfaceC1476d interfaceC1476d) {
        try {
            return interfaceC1476d.d().k("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static AbstractC1496w v(AbstractC1499z abstractC1499z, boolean z8) {
        if (z8) {
            if (abstractC1499z.z()) {
                return y(abstractC1499z.v());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC1492s v8 = abstractC1499z.v();
        if (abstractC1499z.z()) {
            if (abstractC1499z instanceof M) {
                return new K(v8);
            }
            return new u0(v8);
        }
        if (v8 instanceof AbstractC1496w) {
            AbstractC1496w abstractC1496w = (AbstractC1496w) v8;
            if (abstractC1499z instanceof M) {
                return abstractC1496w;
            }
            return (AbstractC1496w) abstractC1496w.t();
        }
        if (v8 instanceof AbstractC1494u) {
            InterfaceC1476d[] z9 = ((AbstractC1494u) v8).z();
            if (abstractC1499z instanceof M) {
                return new K(false, z9);
            }
            return new u0(false, z9);
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC1499z.getClass().getName());
    }

    public static AbstractC1496w y(Object obj) {
        if (obj != null && !(obj instanceof AbstractC1496w)) {
            if (obj instanceof InterfaceC1497x) {
                return y(((InterfaceC1497x) obj).d());
            }
            if (obj instanceof byte[]) {
                try {
                    return y(AbstractC1492s.q((byte[]) obj));
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct set from byte[]: " + e8.getMessage());
                }
            }
            if (obj instanceof InterfaceC1476d) {
                AbstractC1492s d8 = ((InterfaceC1476d) obj).d();
                if (d8 instanceof AbstractC1496w) {
                    return (AbstractC1496w) d8;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (AbstractC1496w) obj;
    }

    public InterfaceC1476d[] C() {
        return C1478e.b(this.f10881a);
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        int length = this.f10881a.length;
        int i8 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i8 += this.f10881a[length].d().hashCode();
            } else {
                return i8;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a.C0078a(C());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof AbstractC1496w)) {
            return false;
        }
        AbstractC1496w abstractC1496w = (AbstractC1496w) abstractC1492s;
        int size = size();
        if (abstractC1496w.size() != size) {
            return false;
        }
        f0 f0Var = (f0) s();
        f0 f0Var2 = (f0) abstractC1496w.s();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1492s d8 = f0Var.f10881a[i8].d();
            AbstractC1492s d9 = f0Var2.f10881a[i8].d();
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
        InterfaceC1476d[] interfaceC1476dArr;
        if (this.f10882b) {
            interfaceC1476dArr = this.f10881a;
        } else {
            interfaceC1476dArr = (InterfaceC1476d[]) this.f10881a.clone();
            B(interfaceC1476dArr);
        }
        return new f0(true, interfaceC1476dArr);
    }

    public int size() {
        return this.f10881a.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s t() {
        return new u0(this.f10882b, this.f10881a);
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
            stringBuffer.append(this.f10881a[i8]);
            i8++;
            if (i8 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public Enumeration z() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1496w(InterfaceC1476d interfaceC1476d) {
        if (interfaceC1476d == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f10881a = new InterfaceC1476d[]{interfaceC1476d};
        this.f10882b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1496w(C1478e c1478e, boolean z8) {
        InterfaceC1476d[] g8;
        if (c1478e == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z8 || c1478e.f() < 2) {
            g8 = c1478e.g();
        } else {
            g8 = c1478e.c();
            B(g8);
        }
        this.f10881a = g8;
        this.f10882b = z8 || g8.length < 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1496w(boolean z8, InterfaceC1476d[] interfaceC1476dArr) {
        this.f10881a = interfaceC1476dArr;
        this.f10882b = z8 || interfaceC1476dArr.length < 2;
    }
}
