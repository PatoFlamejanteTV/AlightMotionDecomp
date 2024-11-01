package W6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class E extends AbstractC1489o {

    /* renamed from: b, reason: collision with root package name */
    private final int f10797b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1489o[] f10798c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        int f10799a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10799a < E.this.f10866a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i8 = this.f10799a;
            E e8 = E.this;
            byte[] bArr = e8.f10866a;
            if (i8 < bArr.length) {
                int min = Math.min(bArr.length - i8, e8.f10797b);
                byte[] bArr2 = new byte[min];
                System.arraycopy(E.this.f10866a, this.f10799a, bArr2, 0, min);
                this.f10799a += min;
                return new C1471a0(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements Enumeration {

        /* renamed from: a, reason: collision with root package name */
        int f10801a = 0;

        b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            if (this.f10801a < E.this.f10798c.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            if (this.f10801a < E.this.f10798c.length) {
                AbstractC1489o[] abstractC1489oArr = E.this.f10798c;
                int i8 = this.f10801a;
                this.f10801a = i8 + 1;
                return abstractC1489oArr[i8];
            }
            throw new NoSuchElementException();
        }
    }

    public E(byte[] bArr) {
        this(bArr, 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static E B(AbstractC1494u abstractC1494u) {
        int size = abstractC1494u.size();
        AbstractC1489o[] abstractC1489oArr = new AbstractC1489o[size];
        for (int i8 = 0; i8 < size; i8++) {
            abstractC1489oArr[i8] = AbstractC1489o.v(abstractC1494u.v(i8));
        }
        return new E(abstractC1489oArr);
    }

    private static byte[] D(AbstractC1489o[] abstractC1489oArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != abstractC1489oArr.length; i8++) {
            try {
                byteArrayOutputStream.write(abstractC1489oArr[i8].y());
            } catch (IOException e8) {
                throw new IllegalArgumentException("exception converting octets " + e8.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public Enumeration C() {
        if (this.f10798c == null) {
            return new a();
        }
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.p(z8, 36, C());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        Enumeration C8 = C();
        int i8 = 0;
        while (C8.hasMoreElements()) {
            i8 += ((InterfaceC1476d) C8.nextElement()).d().n();
        }
        return i8 + 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return true;
    }

    public E(byte[] bArr, int i8) {
        this(bArr, null, i8);
    }

    private E(byte[] bArr, AbstractC1489o[] abstractC1489oArr, int i8) {
        super(bArr);
        this.f10798c = abstractC1489oArr;
        this.f10797b = i8;
    }

    public E(AbstractC1489o[] abstractC1489oArr) {
        this(abstractC1489oArr, 1000);
    }

    public E(AbstractC1489o[] abstractC1489oArr, int i8) {
        this(D(abstractC1489oArr), abstractC1489oArr, i8);
    }
}
