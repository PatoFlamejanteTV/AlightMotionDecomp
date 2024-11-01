package com.stripe.android.customersheet;

import D3.f;
import O3.G;
import O3.H;
import O3.InterfaceC1371t;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.model.o;
import com.stripe.android.payments.bankaccount.navigation.c;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import p3.i;
import v3.w;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a */
    private final boolean f24929a;

    /* renamed from: b */
    private final boolean f24930b;

    /* renamed from: c */
    private final boolean f24931c;

    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: d */
        private final String f24932d;

        /* renamed from: e */
        private final List f24933e;

        /* renamed from: f */
        private final B3.c f24934f;

        /* renamed from: g */
        private final List f24935g;

        /* renamed from: h */
        private final F3.a f24936h;

        /* renamed from: i */
        private final G3.d f24937i;

        /* renamed from: j */
        private final f f24938j;

        /* renamed from: k */
        private final boolean f24939k;

        /* renamed from: l */
        private final boolean f24940l;

        /* renamed from: m */
        private final boolean f24941m;

        /* renamed from: n */
        private final C2.c f24942n;

        /* renamed from: o */
        private final boolean f24943o;

        /* renamed from: p */
        private final C2.c f24944p;

        /* renamed from: q */
        private final boolean f24945q;

        /* renamed from: r */
        private final PrimaryButton.b f24946r;

        /* renamed from: s */
        private final C2.c f24947s;

        /* renamed from: t */
        private final boolean f24948t;

        /* renamed from: u */
        private final boolean f24949u;

        /* renamed from: v */
        private final com.stripe.android.payments.bankaccount.navigation.d f24950v;

        /* renamed from: w */
        private final i f24951w;

        public /* synthetic */ a(String str, List list, B3.c cVar, List list2, F3.a aVar, G3.d dVar, f fVar, boolean z8, boolean z9, boolean z10, C2.c cVar2, boolean z11, C2.c cVar3, boolean z12, PrimaryButton.b bVar, C2.c cVar4, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar2, i iVar, int i8, AbstractC3284p abstractC3284p) {
            this(str, list, cVar, list2, aVar, dVar, fVar, z8, z9, z10, (i8 & 1024) != 0 ? null : cVar2, z11, cVar3, z12, bVar, (32768 & i8) != 0 ? null : cVar4, (65536 & i8) != 0 ? false : z13, (i8 & 131072) != 0 ? false : z14, dVar2, iVar);
        }

        @Override // com.stripe.android.customersheet.c
        public boolean b() {
            return this.f24941m;
        }

        @Override // com.stripe.android.customersheet.c
        public G d(Function0 onEditIconPressed) {
            AbstractC3292y.i(onEditIconPressed, "onEditIconPressed");
            return H.f7207a.a(a(), w(), G.a.b.f7206a);
        }

        public final a e(String paymentMethodCode, List supportedPaymentMethods, B3.c cVar, List formElements, F3.a formArguments, G3.d usBankAccountFormArguments, f fVar, boolean z8, boolean z9, boolean z10, C2.c cVar2, boolean z11, C2.c primaryButtonLabel, boolean z12, PrimaryButton.b bVar, C2.c cVar3, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, i errorReporter) {
            AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3292y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3292y.i(formElements, "formElements");
            AbstractC3292y.i(formArguments, "formArguments");
            AbstractC3292y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3292y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3292y.i(errorReporter, "errorReporter");
            return new a(paymentMethodCode, supportedPaymentMethods, cVar, formElements, formArguments, usBankAccountFormArguments, fVar, z8, z9, z10, cVar2, z11, primaryButtonLabel, z12, bVar, cVar3, z13, z14, dVar, errorReporter);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f24932d, aVar.f24932d) && AbstractC3292y.d(this.f24933e, aVar.f24933e) && AbstractC3292y.d(this.f24934f, aVar.f24934f) && AbstractC3292y.d(this.f24935g, aVar.f24935g) && AbstractC3292y.d(this.f24936h, aVar.f24936h) && AbstractC3292y.d(this.f24937i, aVar.f24937i) && AbstractC3292y.d(this.f24938j, aVar.f24938j) && this.f24939k == aVar.f24939k && this.f24940l == aVar.f24940l && this.f24941m == aVar.f24941m && AbstractC3292y.d(this.f24942n, aVar.f24942n) && this.f24943o == aVar.f24943o && AbstractC3292y.d(this.f24944p, aVar.f24944p) && this.f24945q == aVar.f24945q && AbstractC3292y.d(this.f24946r, aVar.f24946r) && AbstractC3292y.d(this.f24947s, aVar.f24947s) && this.f24948t == aVar.f24948t && this.f24949u == aVar.f24949u && AbstractC3292y.d(this.f24950v, aVar.f24950v) && AbstractC3292y.d(this.f24951w, aVar.f24951w);
        }

        public final com.stripe.android.payments.bankaccount.navigation.d g() {
            return this.f24950v;
        }

        public final PrimaryButton.b h() {
            return this.f24946r;
        }

        public int hashCode() {
            int hashCode = ((this.f24932d.hashCode() * 31) + this.f24933e.hashCode()) * 31;
            B3.c cVar = this.f24934f;
            int hashCode2 = (((((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f24935g.hashCode()) * 31) + this.f24936h.hashCode()) * 31) + this.f24937i.hashCode()) * 31;
            f fVar = this.f24938j;
            int hashCode3 = (((((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24939k)) * 31) + androidx.compose.foundation.a.a(this.f24940l)) * 31) + androidx.compose.foundation.a.a(this.f24941m)) * 31;
            C2.c cVar2 = this.f24942n;
            int hashCode4 = (((((((hashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24943o)) * 31) + this.f24944p.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24945q)) * 31;
            PrimaryButton.b bVar = this.f24946r;
            int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            C2.c cVar3 = this.f24947s;
            int hashCode6 = (((((hashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24948t)) * 31) + androidx.compose.foundation.a.a(this.f24949u)) * 31;
            com.stripe.android.payments.bankaccount.navigation.d dVar = this.f24950v;
            return ((hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f24951w.hashCode();
        }

        public final boolean i() {
            return this.f24949u;
        }

        public final f j() {
            return this.f24938j;
        }

        public final boolean k() {
            return this.f24939k;
        }

        public final C2.c l() {
            return this.f24942n;
        }

        public final F3.a m() {
            return this.f24936h;
        }

        public final List n() {
            return this.f24935g;
        }

        public final B3.c o() {
            return this.f24934f;
        }

        public final C2.c p() {
            return this.f24947s;
        }

        public final String q() {
            return this.f24932d;
        }

        public final boolean r() {
            return this.f24945q;
        }

        public final C2.c s() {
            return this.f24944p;
        }

        public final boolean t() {
            return this.f24948t;
        }

        public String toString() {
            return "AddPaymentMethod(paymentMethodCode=" + this.f24932d + ", supportedPaymentMethods=" + this.f24933e + ", formFieldValues=" + this.f24934f + ", formElements=" + this.f24935g + ", formArguments=" + this.f24936h + ", usBankAccountFormArguments=" + this.f24937i + ", draftPaymentSelection=" + this.f24938j + ", enabled=" + this.f24939k + ", isLiveMode=" + this.f24940l + ", isProcessing=" + this.f24941m + ", errorMessage=" + this.f24942n + ", isFirstPaymentMethod=" + this.f24943o + ", primaryButtonLabel=" + this.f24944p + ", primaryButtonEnabled=" + this.f24945q + ", customPrimaryButtonUiState=" + this.f24946r + ", mandateText=" + this.f24947s + ", showMandateAbovePrimaryButton=" + this.f24948t + ", displayDismissConfirmationModal=" + this.f24949u + ", bankAccountResult=" + this.f24950v + ", errorReporter=" + this.f24951w + ")";
        }

        public final List u() {
            return this.f24933e;
        }

        public final G3.d v() {
            return this.f24937i;
        }

        public boolean w() {
            return this.f24940l;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String paymentMethodCode, List supportedPaymentMethods, B3.c cVar, List formElements, F3.a formArguments, G3.d usBankAccountFormArguments, f fVar, boolean z8, boolean z9, boolean z10, C2.c cVar2, boolean z11, C2.c primaryButtonLabel, boolean z12, PrimaryButton.b bVar, C2.c cVar3, boolean z13, boolean z14, com.stripe.android.payments.bankaccount.navigation.d dVar, i errorReporter) {
            super(z9, z10, !z11, null);
            AbstractC3292y.i(paymentMethodCode, "paymentMethodCode");
            AbstractC3292y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3292y.i(formElements, "formElements");
            AbstractC3292y.i(formArguments, "formArguments");
            AbstractC3292y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3292y.i(primaryButtonLabel, "primaryButtonLabel");
            AbstractC3292y.i(errorReporter, "errorReporter");
            this.f24932d = paymentMethodCode;
            this.f24933e = supportedPaymentMethods;
            this.f24934f = cVar;
            this.f24935g = formElements;
            this.f24936h = formArguments;
            this.f24937i = usBankAccountFormArguments;
            this.f24938j = fVar;
            this.f24939k = z8;
            this.f24940l = z9;
            this.f24941m = z10;
            this.f24942n = cVar2;
            this.f24943o = z11;
            this.f24944p = primaryButtonLabel;
            this.f24945q = z12;
            this.f24946r = bVar;
            this.f24947s = cVar3;
            this.f24948t = z13;
            this.f24949u = z14;
            this.f24950v = dVar;
            this.f24951w = errorReporter;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: d */
        private final InterfaceC1371t f24952d;

        /* renamed from: e */
        private final boolean f24953e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1371t editPaymentMethodInteractor, boolean z8) {
            super(z8, false, true, null);
            AbstractC3292y.i(editPaymentMethodInteractor, "editPaymentMethodInteractor");
            this.f24952d = editPaymentMethodInteractor;
            this.f24953e = z8;
        }

        @Override // com.stripe.android.customersheet.c
        public G d(Function0 onEditIconPressed) {
            AbstractC3292y.i(onEditIconPressed, "onEditIconPressed");
            return H.f7207a.a(a(), f(), G.a.b.f7206a);
        }

        public final InterfaceC1371t e() {
            return this.f24952d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f24952d, bVar.f24952d) && this.f24953e == bVar.f24953e;
        }

        public boolean f() {
            return this.f24953e;
        }

        public int hashCode() {
            return (this.f24952d.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24953e);
        }

        public String toString() {
            return "EditPaymentMethod(editPaymentMethodInteractor=" + this.f24952d + ", isLiveMode=" + this.f24953e + ")";
        }
    }

    /* renamed from: com.stripe.android.customersheet.c$c */
    /* loaded from: classes4.dex */
    public static final class C0461c extends c {

        /* renamed from: d */
        private final boolean f24954d;

        public C0461c(boolean z8) {
            super(z8, false, false, null);
            this.f24954d = z8;
        }

        @Override // com.stripe.android.customersheet.c
        public G d(Function0 onEditIconPressed) {
            AbstractC3292y.i(onEditIconPressed, "onEditIconPressed");
            return H.f7207a.a(a(), e(), G.a.b.f7206a);
        }

        public boolean e() {
            return this.f24954d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0461c) && this.f24954d == ((C0461c) obj).f24954d;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f24954d);
        }

        public String toString() {
            return "Loading(isLiveMode=" + this.f24954d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends c {

        /* renamed from: d */
        private final String f24955d;

        /* renamed from: e */
        private final List f24956e;

        /* renamed from: f */
        private final f f24957f;

        /* renamed from: g */
        private final boolean f24958g;

        /* renamed from: h */
        private final boolean f24959h;

        /* renamed from: i */
        private final boolean f24960i;

        /* renamed from: j */
        private final boolean f24961j;

        /* renamed from: k */
        private final boolean f24962k;

        /* renamed from: l */
        private final boolean f24963l;

        /* renamed from: m */
        private final boolean f24964m;

        /* renamed from: n */
        private final String f24965n;

        /* renamed from: o */
        private final C2.c f24966o;

        /* renamed from: p */
        private final boolean f24967p;

        /* renamed from: q */
        private final C2.c f24968q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, List savedPaymentMethods, f fVar, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str2, C2.c cVar, boolean z15) {
            super(z8, z9, false, null);
            AbstractC3292y.i(savedPaymentMethods, "savedPaymentMethods");
            this.f24955d = str;
            this.f24956e = savedPaymentMethods;
            this.f24957f = fVar;
            this.f24958g = z8;
            this.f24959h = z9;
            this.f24960i = z10;
            this.f24961j = z11;
            this.f24962k = z12;
            this.f24963l = z13;
            this.f24964m = z14;
            this.f24965n = str2;
            this.f24966o = cVar;
            this.f24967p = z15;
            this.f24968q = C2.d.a(w.f40582F);
        }

        @Override // com.stripe.android.customersheet.c
        public boolean b() {
            return this.f24959h;
        }

        @Override // com.stripe.android.customersheet.c
        public G d(Function0 onEditIconPressed) {
            AbstractC3292y.i(onEditIconPressed, "onEditIconPressed");
            return H.f7207a.a(a(), q(), new G.a.C0136a(this.f24960i, this.f24963l, onEditIconPressed));
        }

        public final boolean e() {
            return this.f24964m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3292y.d(this.f24955d, dVar.f24955d) && AbstractC3292y.d(this.f24956e, dVar.f24956e) && AbstractC3292y.d(this.f24957f, dVar.f24957f) && this.f24958g == dVar.f24958g && this.f24959h == dVar.f24959h && this.f24960i == dVar.f24960i && this.f24961j == dVar.f24961j && this.f24962k == dVar.f24962k && this.f24963l == dVar.f24963l && this.f24964m == dVar.f24964m && AbstractC3292y.d(this.f24965n, dVar.f24965n) && AbstractC3292y.d(this.f24966o, dVar.f24966o) && this.f24967p == dVar.f24967p;
        }

        public final String f() {
            return this.f24965n;
        }

        public final C2.c g() {
            return this.f24966o;
        }

        public final f h() {
            return this.f24957f;
        }

        public int hashCode() {
            String str = this.f24955d;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f24956e.hashCode()) * 31;
            f fVar = this.f24957f;
            int hashCode2 = (((((((((((((((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24958g)) * 31) + androidx.compose.foundation.a.a(this.f24959h)) * 31) + androidx.compose.foundation.a.a(this.f24960i)) * 31) + androidx.compose.foundation.a.a(this.f24961j)) * 31) + androidx.compose.foundation.a.a(this.f24962k)) * 31) + androidx.compose.foundation.a.a(this.f24963l)) * 31) + androidx.compose.foundation.a.a(this.f24964m)) * 31;
            String str2 = this.f24965n;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C2.c cVar = this.f24966o;
            return ((hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f24967p);
        }

        public final boolean i() {
            return !b();
        }

        public final C2.c j() {
            return this.f24968q;
        }

        public final boolean k() {
            return this.f24962k;
        }

        public final List l() {
            return this.f24956e;
        }

        public final String m() {
            return this.f24955d;
        }

        public final boolean n() {
            return this.f24967p;
        }

        public final boolean o() {
            return this.f24960i;
        }

        public final boolean p() {
            return this.f24961j;
        }

        public boolean q() {
            return this.f24958g;
        }

        public String toString() {
            return "SelectPaymentMethod(title=" + this.f24955d + ", savedPaymentMethods=" + this.f24956e + ", paymentSelection=" + this.f24957f + ", isLiveMode=" + this.f24958g + ", isProcessing=" + this.f24959h + ", isEditing=" + this.f24960i + ", isGooglePayEnabled=" + this.f24961j + ", primaryButtonVisible=" + this.f24962k + ", canEdit=" + this.f24963l + ", canRemovePaymentMethods=" + this.f24964m + ", errorMessage=" + this.f24965n + ", mandateText=" + this.f24966o + ", isCbcEligible=" + this.f24967p + ")";
        }
    }

    public /* synthetic */ c(boolean z8, boolean z9, boolean z10, AbstractC3284p abstractC3284p) {
        this(z8, z9, z10);
    }

    public boolean a() {
        return this.f24931c;
    }

    public boolean b() {
        return this.f24930b;
    }

    public final boolean c(t3.d isFinancialConnectionsAvailable) {
        PaymentAccount paymentAccount;
        FinancialConnectionsSession a9;
        AbstractC3292y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        if (this instanceof a) {
            a aVar = (a) this;
            if (AbstractC3292y.d(aVar.q(), o.p.f25745O.f25773a) && isFinancialConnectionsAvailable.invoke() && (aVar.g() instanceof d.b)) {
                c.C0542c f8 = ((d.b) aVar.g()).a().f();
                if (f8 != null && (a9 = f8.a()) != null) {
                    paymentAccount = a9.getPaymentAccount();
                } else {
                    paymentAccount = null;
                }
                if (paymentAccount instanceof FinancialConnectionsAccount) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract G d(Function0 function0);

    private c(boolean z8, boolean z9, boolean z10) {
        this.f24929a = z8;
        this.f24930b = z9;
        this.f24931c = z10;
    }
}
