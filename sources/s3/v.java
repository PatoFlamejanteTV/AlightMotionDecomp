package s3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import q3.InterfaceC3639h;

/* loaded from: classes4.dex */
public final class v implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f39054a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f39055b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f39056c;

    /* renamed from: d, reason: collision with root package name */
    private final N5.a f39057d;

    /* renamed from: e, reason: collision with root package name */
    private final N5.a f39058e;

    /* renamed from: f, reason: collision with root package name */
    private final N5.a f39059f;

    /* renamed from: g, reason: collision with root package name */
    private final N5.a f39060g;

    /* renamed from: h, reason: collision with root package name */
    private final N5.a f39061h;

    /* renamed from: i, reason: collision with root package name */
    private final N5.a f39062i;

    /* renamed from: j, reason: collision with root package name */
    private final N5.a f39063j;

    /* renamed from: k, reason: collision with root package name */
    private final N5.a f39064k;

    public v(s sVar, N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7, N5.a aVar8, N5.a aVar9, N5.a aVar10) {
        this.f39054a = sVar;
        this.f39055b = aVar;
        this.f39056c = aVar2;
        this.f39057d = aVar3;
        this.f39058e = aVar4;
        this.f39059f = aVar5;
        this.f39060g = aVar6;
        this.f39061h = aVar7;
        this.f39062i = aVar8;
        this.f39063j = aVar9;
        this.f39064k = aVar10;
    }

    public static v a(s sVar, N5.a aVar, N5.a aVar2, N5.a aVar3, N5.a aVar4, N5.a aVar5, N5.a aVar6, N5.a aVar7, N5.a aVar8, N5.a aVar9, N5.a aVar10) {
        return new v(sVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static InterfaceC3639h c(s sVar, Context context, boolean z8, U5.g gVar, U5.g gVar2, Map map, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Function0 function0, Set set, boolean z9, boolean z10) {
        return (InterfaceC3639h) z5.h.d(sVar.c(context, z8, gVar, gVar2, map, paymentAnalyticsRequestFactory, function0, set, z9, z10));
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3639h get() {
        return c(this.f39054a, (Context) this.f39055b.get(), ((Boolean) this.f39056c.get()).booleanValue(), (U5.g) this.f39057d.get(), (U5.g) this.f39058e.get(), (Map) this.f39059f.get(), (PaymentAnalyticsRequestFactory) this.f39060g.get(), (Function0) this.f39061h.get(), (Set) this.f39062i.get(), ((Boolean) this.f39063j.get()).booleanValue(), ((Boolean) this.f39064k.get()).booleanValue());
    }
}
