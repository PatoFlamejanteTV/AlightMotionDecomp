package Q;

import N.C1345h;
import O.a;
import android.content.Context;
import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f8154a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C1345h f8155b;

    public G(C1345h c1345h) {
        AbstractC1396p.l(c1345h);
        this.f8155b = c1345h;
    }

    public final int a(Context context, int i8) {
        return this.f8154a.get(i8, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC1396p.l(context);
        AbstractC1396p.l(fVar);
        int i8 = 0;
        if (!fVar.i()) {
            return 0;
        }
        int k8 = fVar.k();
        int a9 = a(context, k8);
        if (a9 == -1) {
            int i9 = 0;
            while (true) {
                if (i9 < this.f8154a.size()) {
                    int keyAt = this.f8154a.keyAt(i9);
                    if (keyAt > k8 && this.f8154a.get(keyAt) == 0) {
                        break;
                    }
                    i9++;
                } else {
                    i8 = -1;
                    break;
                }
            }
            if (i8 == -1) {
                a9 = this.f8155b.h(context, k8);
            } else {
                a9 = i8;
            }
            this.f8154a.put(k8, a9);
        }
        return a9;
    }

    public final void c() {
        this.f8154a.clear();
    }
}
