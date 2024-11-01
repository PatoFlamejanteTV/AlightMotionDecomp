package j3;

import android.content.Context;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class j implements z5.e {

    /* renamed from: a, reason: collision with root package name */
    private final N5.a f33700a;

    /* renamed from: b, reason: collision with root package name */
    private final N5.a f33701b;

    /* renamed from: c, reason: collision with root package name */
    private final N5.a f33702c;

    public j(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        this.f33700a = aVar;
        this.f33701b = aVar2;
        this.f33702c = aVar3;
    }

    public static j a(N5.a aVar, N5.a aVar2, N5.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static PaymentAnalyticsRequestFactory c(Context context, Function0 function0, Set set) {
        return new PaymentAnalyticsRequestFactory(context, function0, set);
    }

    @Override // N5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PaymentAnalyticsRequestFactory get() {
        return c((Context) this.f33700a.get(), (Function0) this.f33701b.get(), (Set) this.f33702c.get());
    }
}
