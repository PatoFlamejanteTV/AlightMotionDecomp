package P;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes3.dex */
final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f7941a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f7942b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B f7943c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(B b9, LifecycleCallback lifecycleCallback, String str) {
        this.f7943c = b9;
        this.f7941a = lifecycleCallback;
        this.f7942b = str;
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
        B b9 = this.f7943c;
        i8 = b9.f7946b;
        if (i8 > 0) {
            LifecycleCallback lifecycleCallback = this.f7941a;
            bundle = b9.f7947c;
            if (bundle != null) {
                String str = this.f7942b;
                bundle3 = b9.f7947c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i9 = this.f7943c.f7946b;
        if (i9 >= 2) {
            this.f7941a.j();
        }
        i10 = this.f7943c.f7946b;
        if (i10 >= 3) {
            this.f7941a.h();
        }
        i11 = this.f7943c.f7946b;
        if (i11 >= 4) {
            this.f7941a.k();
        }
        i12 = this.f7943c.f7946b;
        if (i12 >= 5) {
            this.f7941a.g();
        }
    }
}
