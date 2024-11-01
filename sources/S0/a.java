package S0;

/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f9363a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f9364b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9365c;

    public a(int i8, d... dVarArr) {
        this.f9363a = i8;
        this.f9364b = dVarArr;
        this.f9365c = new b(i8);
    }

    @Override // S0.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f9363a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f9364b) {
            if (stackTraceElementArr2.length <= this.f9363a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f9363a) {
            return this.f9365c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
