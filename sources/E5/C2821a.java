package e5;

import android.content.Context;
import f5.InterfaceC2867a;
import h5.C2954e;
import h5.k;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.N;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2821a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31709a;

    public C2821a(Context context) {
        AbstractC3292y.i(context, "context");
        this.f31709a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|8))|53|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0040, code lost:            r7 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:            r7.printStackTrace();        r8 = n6.C3445b0.c();        r10 = new e5.i(r9, r7, null);        r2.f31714a = null;        r2.f31717d = 6;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:            if (n6.AbstractC3458i.g(r8, r10, r2) == r3) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:            return r3;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0028. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(e5.C2821a r7, h5.C2953d r8, f5.InterfaceC2867a r9, U5.d r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.C2821a.b(e5.a, h5.d, f5.a, U5.d):java.lang.Object");
    }

    public final void c(String token, InterfaceC2867a initListener) {
        AbstractC3292y.i(token, "token");
        AbstractC3292y.i(initListener, "initListener");
        if (new C2954e(this.f31709a).a() != k.f32654a.d(this.f31709a)) {
            AbstractC3462k.d(N.a(C3445b0.b()), null, null, new C2822b(this, token, initListener, null), 3, null);
        } else {
            initListener.c();
        }
    }
}
