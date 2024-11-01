package i0;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import q0.C3626l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t extends s {

    /* renamed from: a, reason: collision with root package name */
    private final C3626l f32669a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(C3626l c3626l) {
        this.f32669a = c3626l;
    }

    @Override // i0.s, i0.q
    public final void r(Status status, boolean z8, Bundle bundle) {
        P.m.a(status, Boolean.valueOf(z8), this.f32669a);
    }

    @Override // i0.s, i0.q
    public final void v(int i8, boolean z8, Bundle bundle) {
        P.m.a(new Status(i8), Boolean.valueOf(z8), this.f32669a);
    }
}
