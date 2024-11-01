package com.stripe.android.ui.core.cardscan;

import Q5.I;
import Q5.InterfaceC1416k;
import Q5.l;
import R5.a0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import g4.o;
import i4.C2971a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.C3289v;
import n2.r;
import p3.i;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CardScanActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28351b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f28352c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f28353a = l.b(new c());

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class b extends C3289v implements Function1 {
        b(Object obj) {
            super(1, obj, CardScanActivity.class, "onScanFinished", "onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", 0);
        }

        public final void d(CardScanSheetResult p02) {
            AbstractC3292y.i(p02, "p0");
            ((CardScanActivity) this.receiver).m(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((CardScanSheetResult) obj);
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2971a invoke() {
            return C2971a.c(CardScanActivity.this.getLayoutInflater());
        }
    }

    private final C2971a l() {
        return (C2971a) this.f28353a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(CardScanSheetResult cardScanSheetResult) {
        Intent putExtra = new Intent().putExtra("CardScanActivityResult", (Parcelable) cardScanSheetResult);
        AbstractC3292y.h(putExtra, "putExtra(...)");
        setResult(-1, putExtra);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l().getRoot());
        o.a aVar = o.f32442a;
        String f8 = r.f35413c.a(this).f();
        b bVar = new b(this);
        i.a aVar2 = i.f36196a;
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        o.a.b(aVar, this, f8, bVar, aVar2.a(applicationContext, a0.d("CardScan")), null, null, 48, null).a();
    }
}
