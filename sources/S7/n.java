package S7;

import D5.t;
import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f9932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9933b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9934c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9935d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9936e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9937f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9938g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9939h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9940i;

    /* renamed from: j, reason: collision with root package name */
    public final List f9941j;

    public n(String linksTitle, String nonIabVendorsLabel, String uspDnsTitle, List uspDnsText, String uspDoNotSellToggleText, String uspPrivacyPolicyLinkText, String uspDeleteDataLinkText, String uspAccessDataLinkText, String uspAcceptButton, List initScreenCustomLinks) {
        AbstractC3292y.i(linksTitle, "linksTitle");
        AbstractC3292y.i(nonIabVendorsLabel, "nonIabVendorsLabel");
        AbstractC3292y.i(uspDnsTitle, "uspDnsTitle");
        AbstractC3292y.i(uspDnsText, "uspDnsText");
        AbstractC3292y.i(uspDoNotSellToggleText, "uspDoNotSellToggleText");
        AbstractC3292y.i(uspPrivacyPolicyLinkText, "uspPrivacyPolicyLinkText");
        AbstractC3292y.i(uspDeleteDataLinkText, "uspDeleteDataLinkText");
        AbstractC3292y.i(uspAccessDataLinkText, "uspAccessDataLinkText");
        AbstractC3292y.i(uspAcceptButton, "uspAcceptButton");
        AbstractC3292y.i(initScreenCustomLinks, "initScreenCustomLinks");
        this.f9932a = linksTitle;
        this.f9933b = nonIabVendorsLabel;
        this.f9934c = uspDnsTitle;
        this.f9935d = uspDnsText;
        this.f9936e = uspDoNotSellToggleText;
        this.f9937f = uspPrivacyPolicyLinkText;
        this.f9938g = uspDeleteDataLinkText;
        this.f9939h = uspAccessDataLinkText;
        this.f9940i = uspAcceptButton;
        this.f9941j = initScreenCustomLinks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3292y.d(this.f9932a, nVar.f9932a) && AbstractC3292y.d(this.f9933b, nVar.f9933b) && AbstractC3292y.d(this.f9934c, nVar.f9934c) && AbstractC3292y.d(this.f9935d, nVar.f9935d) && AbstractC3292y.d(this.f9936e, nVar.f9936e) && AbstractC3292y.d(this.f9937f, nVar.f9937f) && AbstractC3292y.d(this.f9938g, nVar.f9938g) && AbstractC3292y.d(this.f9939h, nVar.f9939h) && AbstractC3292y.d(this.f9940i, nVar.f9940i) && AbstractC3292y.d(this.f9941j, nVar.f9941j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9941j.hashCode() + t.a(this.f9940i, t.a(this.f9939h, t.a(this.f9938g, t.a(this.f9937f, t.a(this.f9936e, H6.l.a(this.f9935d, t.a(this.f9934c, t.a(this.f9933b, this.f9932a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PremiumUiLabels(linksTitle=");
        a9.append(this.f9932a);
        a9.append(", nonIabVendorsLabel=");
        a9.append(this.f9933b);
        a9.append(", uspDnsTitle=");
        a9.append(this.f9934c);
        a9.append(", uspDnsText=");
        a9.append(this.f9935d);
        a9.append(", uspDoNotSellToggleText=");
        a9.append(this.f9936e);
        a9.append(", uspPrivacyPolicyLinkText=");
        a9.append(this.f9937f);
        a9.append(", uspDeleteDataLinkText=");
        a9.append(this.f9938g);
        a9.append(", uspAccessDataLinkText=");
        a9.append(this.f9939h);
        a9.append(", uspAcceptButton=");
        a9.append(this.f9940i);
        a9.append(", initScreenCustomLinks=");
        a9.append(this.f9941j);
        a9.append(')');
        return a9.toString();
    }

    public /* synthetic */ n(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? AbstractC1435t.m() : list, (i8 & 16) != 0 ? "" : str4, (i8 & 32) != 0 ? "" : str5, (i8 & 64) != 0 ? "" : str6, (i8 & 128) != 0 ? "" : str7, (i8 & 256) == 0 ? str8 : "", (i8 & 512) != 0 ? new ArrayList() : list2);
    }
}
