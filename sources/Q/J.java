package Q;

import O.g;
import Q.AbstractC1395o;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import q0.C3626l;

/* loaded from: classes3.dex */
final class J implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O.g f8156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3626l f8157b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1395o.a f8158c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L f8159d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(O.g gVar, C3626l c3626l, AbstractC1395o.a aVar, L l8) {
        this.f8156a = gVar;
        this.f8157b = c3626l;
        this.f8158c = aVar;
        this.f8159d = l8;
    }

    @Override // O.g.a
    public final void a(Status status) {
        if (status.I()) {
            this.f8157b.c(this.f8158c.a(this.f8156a.b(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f8157b.b(AbstractC1382b.a(status));
        }
    }
}
