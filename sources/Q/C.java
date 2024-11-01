package Q;

import android.content.Intent;

/* loaded from: classes3.dex */
final class C extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f8150a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P.e f8151b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(Intent intent, P.e eVar, int i8) {
        this.f8150a = intent;
        this.f8151b = eVar;
    }

    @Override // Q.D
    public final void a() {
        Intent intent = this.f8150a;
        if (intent != null) {
            this.f8151b.startActivityForResult(intent, 2);
        }
    }
}
