package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class A1 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    protected final L0 f33225a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f33226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f33227c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f33228d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, K0 k02, int i8) {
        this(a12, k02, i8, (byte) 0);
        this.f33227c = 0;
        this.f33228d = a12.f33228d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, L0 l02, int i8) {
        this(a12, l02, i8, (byte) 0);
        this.f33227c = 1;
        this.f33228d = (Object[]) a12.f33228d;
    }

    A1(A1 a12, L0 l02, int i8, byte b9) {
        super(a12);
        this.f33225a = l02;
        this.f33226b = i8;
    }

    public A1(L0 l02, Object obj, int i8) {
        this.f33227c = i8;
        this.f33225a = l02;
        this.f33226b = 0;
        this.f33228d = obj;
    }

    final void a() {
        switch (this.f33227c) {
            case 0:
                ((K0) this.f33225a).q(this.f33226b, this.f33228d);
                return;
            default:
                this.f33225a.h((Object[]) this.f33228d, this.f33226b);
                return;
        }
    }

    final A1 b(int i8, int i9) {
        switch (this.f33227c) {
            case 0:
                return new A1(this, ((K0) this.f33225a).b(i8), i9);
            default:
                return new A1(this, this.f33225a.b(i8), i9);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        A1 a12 = this;
        while (a12.f33225a.p() != 0) {
            a12.setPendingCount(a12.f33225a.p() - 1);
            int i8 = 0;
            int i9 = 0;
            while (i8 < a12.f33225a.p() - 1) {
                A1 b9 = a12.b(i8, a12.f33226b + i9);
                i9 = (int) (i9 + b9.f33225a.count());
                b9.fork();
                i8++;
            }
            a12 = a12.b(i8, a12.f33226b + i9);
        }
        a12.a();
        a12.propagateCompletion();
    }
}
