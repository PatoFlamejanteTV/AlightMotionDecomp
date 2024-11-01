package M;

import android.os.Bundle;
import android.util.Log;
import q0.C3626l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final int f5431a;

    /* renamed from: b, reason: collision with root package name */
    final C3626l f5432b = new C3626l();

    /* renamed from: c, reason: collision with root package name */
    final int f5433c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f5434d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(int i8, int i9, Bundle bundle) {
        this.f5431a = i8;
        this.f5433c = i9;
        this.f5434d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(B b9) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + b9.toString());
        }
        this.f5432b.b(b9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f5432b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f5433c + " id=" + this.f5431a + " oneWay=" + b() + "}";
    }
}
