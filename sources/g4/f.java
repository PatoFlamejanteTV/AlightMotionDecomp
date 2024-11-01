package g4;

import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f implements o {

    /* renamed from: b, reason: collision with root package name */
    private final CardScanSheet f32297b;

    public f(CardScanSheet cardScanSheet) {
        AbstractC3292y.i(cardScanSheet, "cardScanSheet");
        this.f32297b = cardScanSheet;
    }

    @Override // g4.o
    public void a() {
        this.f32297b.present();
    }
}
