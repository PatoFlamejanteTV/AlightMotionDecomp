package P2;

import com.stripe.android.link.LinkActivityContract;
import j3.m;

/* loaded from: classes4.dex */
public final class a implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f8005a;

    public a(N5.a aVar) {
        this.f8005a = aVar;
    }

    public static a a(N5.a aVar) {
        return new a(aVar);
    }

    public static LinkActivityContract c(m mVar) {
        return new LinkActivityContract(mVar);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinkActivityContract get() {
        return c((m) this.f8005a.get());
    }
}
