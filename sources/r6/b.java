package r6;

import Q5.I;
import Q5.s;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private d[] f38788a;

    /* renamed from: b, reason: collision with root package name */
    private int f38789b;

    /* renamed from: c, reason: collision with root package name */
    private int f38790c;

    /* renamed from: d, reason: collision with root package name */
    private y f38791d;

    public static final /* synthetic */ int e(b bVar) {
        return bVar.f38789b;
    }

    public static final /* synthetic */ d[] f(b bVar) {
        return bVar.f38788a;
    }

    public final InterfaceC3813L g() {
        y yVar;
        synchronized (this) {
            yVar = this.f38791d;
            if (yVar == null) {
                yVar = new y(this.f38789b);
                this.f38791d = yVar;
            }
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d h() {
        d dVar;
        y yVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f38788a;
                if (dVarArr == null) {
                    dVarArr = j(2);
                    this.f38788a = dVarArr;
                } else if (this.f38789b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                    this.f38788a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i8 = this.f38790c;
                do {
                    dVar = dVarArr[i8];
                    if (dVar == null) {
                        dVar = i();
                        dVarArr[i8] = dVar;
                    }
                    i8++;
                    if (i8 >= dVarArr.length) {
                        i8 = 0;
                    }
                    AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f38790c = i8;
                this.f38789b++;
                yVar = this.f38791d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.Z(1);
        }
        return dVar;
    }

    protected abstract d i();

    protected abstract d[] j(int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(d dVar) {
        y yVar;
        int i8;
        U5.d[] b9;
        synchronized (this) {
            try {
                int i9 = this.f38789b - 1;
                this.f38789b = i9;
                yVar = this.f38791d;
                if (i9 == 0) {
                    this.f38790c = 0;
                }
                AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b9 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (U5.d dVar2 : b9) {
            if (dVar2 != null) {
                s.a aVar = Q5.s.f8810b;
                dVar2.resumeWith(Q5.s.b(I.f8786a));
            }
        }
        if (yVar != null) {
            yVar.Z(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int l() {
        return this.f38789b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d[] m() {
        return this.f38788a;
    }
}
