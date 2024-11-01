package q3;

import B2.j;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import com.stripe.android.view.InterfaceC2668p;
import o3.InterfaceC3526a;

/* renamed from: q3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3637f implements InterfaceC3526a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q3.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36679a;

        /* renamed from: b, reason: collision with root package name */
        Object f36680b;

        /* renamed from: c, reason: collision with root package name */
        Object f36681c;

        /* renamed from: d, reason: collision with root package name */
        Object f36682d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36683e;

        /* renamed from: g, reason: collision with root package name */
        int f36685g;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36683e = obj;
            this.f36685g |= Integer.MIN_VALUE;
            return AbstractC3637f.this.d(null, null, null, this);
        }
    }

    @Override // o3.InterfaceC3526a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        InterfaceC3526a.C0819a.b(this, activityResultCaller, activityResultCallback);
    }

    @Override // o3.InterfaceC3526a
    public void c() {
        InterfaceC3526a.C0819a.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.stripe.android.view.InterfaceC2668p r6, java.lang.Object r7, B2.j.c r8, U5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof q3.AbstractC3637f.a
            if (r0 == 0) goto L13
            r0 = r9
            q3.f$a r0 = (q3.AbstractC3637f.a) r0
            int r1 = r0.f36685g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36685g = r1
            goto L18
        L13:
            q3.f$a r0 = new q3.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36683e
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f36685g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r9)
            goto L72
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f36682d
            r8 = r6
            B2.j$c r8 = (B2.j.c) r8
            java.lang.Object r7 = r0.f36681c
            java.lang.Object r6 = r0.f36680b
            com.stripe.android.view.p r6 = (com.stripe.android.view.InterfaceC2668p) r6
            java.lang.Object r2 = r0.f36679a
            q3.f r2 = (q3.AbstractC3637f) r2
            Q5.t.b(r9)
            goto L60
        L47:
            Q5.t.b(r9)
            androidx.lifecycle.LifecycleOwner r9 = r6.d()
            r0.f36679a = r5
            r0.f36680b = r6
            r0.f36681c = r7
            r0.f36682d = r8
            r0.f36685g = r4
            java.lang.Object r9 = q3.AbstractC3638g.a(r9, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r2 = r5
        L60:
            r9 = 0
            r0.f36679a = r9
            r0.f36680b = r9
            r0.f36681c = r9
            r0.f36682d = r9
            r0.f36685g = r3
            java.lang.Object r6 = r2.e(r6, r7, r8, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            Q5.I r6 = Q5.I.f8786a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.AbstractC3637f.d(com.stripe.android.view.p, java.lang.Object, B2.j$c, U5.d):java.lang.Object");
    }

    protected abstract Object e(InterfaceC2668p interfaceC2668p, Object obj, j.c cVar, U5.d dVar);
}
