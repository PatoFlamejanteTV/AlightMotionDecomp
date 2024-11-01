package t3;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4006b implements c {

    /* renamed from: b, reason: collision with root package name */
    private final FinancialConnectionsSheetLauncher f39467b;

    public C4006b(FinancialConnectionsSheetLauncher launcher) {
        AbstractC3292y.i(launcher, "launcher");
        this.f39467b = launcher;
    }

    @Override // t3.c
    public void a(String financialConnectionsSessionClientSecret, String publishableKey, String str) {
        AbstractC3292y.i(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
        AbstractC3292y.i(publishableKey, "publishableKey");
        this.f39467b.present(new FinancialConnectionsSheet.Configuration(financialConnectionsSessionClientSecret, publishableKey, str));
    }
}
