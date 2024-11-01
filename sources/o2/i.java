package O2;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.googlepaylauncher.j;
import n6.M;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.googlepaylauncher.m f7138a;

    i(com.stripe.android.googlepaylauncher.m mVar) {
        this.f7138a = mVar;
    }

    public static z5.i b(com.stripe.android.googlepaylauncher.m mVar) {
        return z5.f.a(new i(mVar));
    }

    @Override // O2.h
    public com.stripe.android.googlepaylauncher.j a(M m8, j.d dVar, j.e eVar, ActivityResultLauncher activityResultLauncher, boolean z8) {
        return this.f7138a.b(m8, dVar, eVar, activityResultLauncher, z8);
    }
}
