package Q;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
final class B extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f8147a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f8148b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f8149c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Intent intent, Activity activity, int i8) {
        this.f8147a = intent;
        this.f8148b = activity;
        this.f8149c = i8;
    }

    @Override // Q.D
    public final void a() {
        Intent intent = this.f8147a;
        if (intent != null) {
            this.f8148b.startActivityForResult(intent, this.f8149c);
        }
    }
}
