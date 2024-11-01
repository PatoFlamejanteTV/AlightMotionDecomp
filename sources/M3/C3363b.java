package m3;

import R5.a0;
import android.app.Application;
import android.content.Context;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3363b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3363b f35010a = new C3363b();

    /* renamed from: m3.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CollectBankAccountContract.a f35011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CollectBankAccountContract.a aVar) {
            super(0);
            this.f35011a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f35011a.h();
        }
    }

    private C3363b() {
    }

    public final Function0 a(CollectBankAccountContract.a args) {
        AbstractC3292y.i(args, "args");
        return new a(args);
    }

    public final Context b(Application application) {
        AbstractC3292y.i(application, "application");
        return application;
    }

    public final boolean c() {
        return false;
    }

    public final Set d() {
        return a0.f();
    }
}
