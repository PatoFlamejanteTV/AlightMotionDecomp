package P;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f7948a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7949b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D f7950c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(D d8, LifecycleCallback lifecycleCallback, String str) {
        this.f7950c = d8;
        this.f7948a = lifecycleCallback;
        this.f7949b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        D d8 = this.f7950c;
        i8 = d8.f7953b;
        if (i8 > 0) {
            LifecycleCallback lifecycleCallback = this.f7948a;
            bundle = d8.f7954c;
            if (bundle != null) {
                String str = this.f7949b;
                bundle3 = d8.f7954c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i9 = this.f7950c.f7953b;
        if (i9 >= 2) {
            this.f7948a.j();
        }
        i10 = this.f7950c.f7953b;
        if (i10 >= 3) {
            this.f7948a.h();
        }
        i11 = this.f7950c.f7953b;
        if (i11 >= 4) {
            this.f7948a.k();
        }
        i12 = this.f7950c.f7953b;
        if (i12 >= 5) {
            this.f7948a.g();
        }
    }
}
