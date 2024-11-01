package J2;

import com.stripe.android.customersheet.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import m4.InterfaceC3370a;

/* loaded from: classes4.dex */
final class b implements InterfaceC3370a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f4081a;

    public b(Function1 viewActionHandler) {
        AbstractC3292y.i(viewActionHandler, "viewActionHandler");
        this.f4081a = viewActionHandler;
    }

    @Override // m4.InterfaceC3370a
    public void a() {
        this.f4081a.invoke(a.e.f24790a);
    }
}
