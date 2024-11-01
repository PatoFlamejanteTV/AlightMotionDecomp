package W6;

/* renamed from: W6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1478e {

    /* renamed from: d, reason: collision with root package name */
    static final InterfaceC1476d[] f10834d = new InterfaceC1476d[0];

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1476d[] f10835a;

    /* renamed from: b, reason: collision with root package name */
    private int f10836b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10837c;

    public C1478e() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC1476d[] b(InterfaceC1476d[] interfaceC1476dArr) {
        if (interfaceC1476dArr.length < 1) {
            return f10834d;
        }
        return (InterfaceC1476d[]) interfaceC1476dArr.clone();
    }

    private void e(int i8) {
        InterfaceC1476d[] interfaceC1476dArr = new InterfaceC1476d[Math.max(this.f10835a.length, i8 + (i8 >> 1))];
        System.arraycopy(this.f10835a, 0, interfaceC1476dArr, 0, this.f10836b);
        this.f10835a = interfaceC1476dArr;
        this.f10837c = false;
    }

    public void a(InterfaceC1476d interfaceC1476d) {
        if (interfaceC1476d != null) {
            int length = this.f10835a.length;
            boolean z8 = true;
            int i8 = this.f10836b + 1;
            if (i8 <= length) {
                z8 = false;
            }
            if (this.f10837c | z8) {
                e(i8);
            }
            this.f10835a[this.f10836b] = interfaceC1476d;
            this.f10836b = i8;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1476d[] c() {
        int i8 = this.f10836b;
        if (i8 == 0) {
            return f10834d;
        }
        InterfaceC1476d[] interfaceC1476dArr = new InterfaceC1476d[i8];
        System.arraycopy(this.f10835a, 0, interfaceC1476dArr, 0, i8);
        return interfaceC1476dArr;
    }

    public InterfaceC1476d d(int i8) {
        if (i8 < this.f10836b) {
            return this.f10835a[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8 + " >= " + this.f10836b);
    }

    public int f() {
        return this.f10836b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC1476d[] g() {
        int i8 = this.f10836b;
        if (i8 == 0) {
            return f10834d;
        }
        InterfaceC1476d[] interfaceC1476dArr = this.f10835a;
        if (interfaceC1476dArr.length == i8) {
            this.f10837c = true;
            return interfaceC1476dArr;
        }
        InterfaceC1476d[] interfaceC1476dArr2 = new InterfaceC1476d[i8];
        System.arraycopy(interfaceC1476dArr, 0, interfaceC1476dArr2, 0, i8);
        return interfaceC1476dArr2;
    }

    public C1478e(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f10835a = i8 == 0 ? f10834d : new InterfaceC1476d[i8];
        this.f10836b = 0;
        this.f10837c = false;
    }
}
