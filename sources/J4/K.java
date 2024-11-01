package j4;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.InterfaceC3813L;
import r4.w0;

/* loaded from: classes4.dex */
public abstract class K implements r4.w0, r4.m0 {

    /* renamed from: a, reason: collision with root package name */
    private final AutofillType f33870a;

    public /* synthetic */ K(AbstractC3284p abstractC3284p) {
        this();
    }

    @Override // r4.w0
    public InterfaceC3813L e() {
        return w0.a.c(this);
    }

    @Override // r4.w0, r4.j0
    public void f(boolean z8, r4.k0 k0Var, Modifier modifier, Set set, r4.G g8, int i8, int i9, Composer composer, int i10) {
        w0.a.a(this, z8, k0Var, modifier, set, g8, i8, i9, composer, i10);
    }

    @Override // r4.w0
    public AutofillType o() {
        return this.f33870a;
    }

    @Override // r4.w0
    public boolean p() {
        return w0.a.b(this);
    }

    public abstract InterfaceC3813L v();

    public abstract boolean w();

    public abstract InterfaceC3813L x();

    public final void y(CardScanSheetResult cardScanSheetResult) {
        AbstractC3292y.i(cardScanSheetResult, "cardScanSheetResult");
        if (cardScanSheetResult instanceof CardScanSheetResult.Completed) {
            q(((CardScanSheetResult.Completed) cardScanSheetResult).getScannedCard().getPan());
        }
    }

    private K() {
        this.f33870a = AutofillType.CreditCardNumber;
    }
}
