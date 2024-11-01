package S7;

import D5.t;
import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f9877a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9878b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9879c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9880d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9881e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9882f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9883g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9884h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9885i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9886j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9887k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9888l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9889m;

    /* renamed from: n, reason: collision with root package name */
    public final List f9890n;

    /* renamed from: o, reason: collision with root package name */
    public final List f9891o;

    public i(String doneLabel, String searchLabel, String cancelLabel, String showVendorsLabel, String showIabLabel, String consentLabel, String flexPurposesLabel, String cookieAccessBodyText, String noneLabel, String someLabel, String allLabel, String closeLabel, String allVendorsLabel, List summaryScreenBodyRejectService, List summaryScreenBodyTextReject) {
        AbstractC3292y.i(doneLabel, "doneLabel");
        AbstractC3292y.i(searchLabel, "searchLabel");
        AbstractC3292y.i(cancelLabel, "cancelLabel");
        AbstractC3292y.i(showVendorsLabel, "showVendorsLabel");
        AbstractC3292y.i(showIabLabel, "showIabLabel");
        AbstractC3292y.i(consentLabel, "consentLabel");
        AbstractC3292y.i(flexPurposesLabel, "flexPurposesLabel");
        AbstractC3292y.i(cookieAccessBodyText, "cookieAccessBodyText");
        AbstractC3292y.i(noneLabel, "noneLabel");
        AbstractC3292y.i(someLabel, "someLabel");
        AbstractC3292y.i(allLabel, "allLabel");
        AbstractC3292y.i(closeLabel, "closeLabel");
        AbstractC3292y.i(allVendorsLabel, "allVendorsLabel");
        AbstractC3292y.i(summaryScreenBodyRejectService, "summaryScreenBodyRejectService");
        AbstractC3292y.i(summaryScreenBodyTextReject, "summaryScreenBodyTextReject");
        this.f9877a = doneLabel;
        this.f9878b = searchLabel;
        this.f9879c = cancelLabel;
        this.f9880d = showVendorsLabel;
        this.f9881e = showIabLabel;
        this.f9882f = consentLabel;
        this.f9883g = flexPurposesLabel;
        this.f9884h = cookieAccessBodyText;
        this.f9885i = noneLabel;
        this.f9886j = someLabel;
        this.f9887k = allLabel;
        this.f9888l = closeLabel;
        this.f9889m = allVendorsLabel;
        this.f9890n = summaryScreenBodyRejectService;
        this.f9891o = summaryScreenBodyTextReject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3292y.d(this.f9877a, iVar.f9877a) && AbstractC3292y.d(this.f9878b, iVar.f9878b) && AbstractC3292y.d(this.f9879c, iVar.f9879c) && AbstractC3292y.d(this.f9880d, iVar.f9880d) && AbstractC3292y.d(this.f9881e, iVar.f9881e) && AbstractC3292y.d(this.f9882f, iVar.f9882f) && AbstractC3292y.d(this.f9883g, iVar.f9883g) && AbstractC3292y.d(this.f9884h, iVar.f9884h) && AbstractC3292y.d(this.f9885i, iVar.f9885i) && AbstractC3292y.d(this.f9886j, iVar.f9886j) && AbstractC3292y.d(this.f9887k, iVar.f9887k) && AbstractC3292y.d(this.f9888l, iVar.f9888l) && AbstractC3292y.d(this.f9889m, iVar.f9889m) && AbstractC3292y.d(this.f9890n, iVar.f9890n) && AbstractC3292y.d(this.f9891o, iVar.f9891o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9891o.hashCode() + H6.l.a(this.f9890n, t.a(this.f9889m, t.a(this.f9888l, t.a(this.f9887k, t.a(this.f9886j, t.a(this.f9885i, t.a(this.f9884h, t.a(this.f9883g, t.a(this.f9882f, t.a(this.f9881e, t.a(this.f9880d, t.a(this.f9879c, t.a(this.f9878b, this.f9877a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "MobileUiLabels(doneLabel=" + this.f9877a + ", searchLabel=" + this.f9878b + ", cancelLabel=" + this.f9879c + ", showVendorsLabel=" + this.f9880d + ", showIabLabel=" + this.f9881e + ", consentLabel=" + this.f9882f + ", flexPurposesLabel=" + this.f9883g + ", cookieAccessBodyText=" + this.f9884h + ", noneLabel=" + this.f9885i + ", someLabel=" + this.f9886j + ", allLabel=" + this.f9887k + ", closeLabel=" + this.f9888l + ", allVendorsLabel=" + this.f9889m + ", summaryScreenBodyRejectService=" + this.f9890n + ", summaryScreenBodyTextReject=" + this.f9891o + ')';
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? "" : null, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? "" : null, (i8 & 8) != 0 ? "" : null, (i8 & 16) != 0 ? "" : null, (i8 & 32) != 0 ? "" : null, (i8 & 64) != 0 ? "" : null, (i8 & 128) != 0 ? "" : null, (i8 & 256) != 0 ? "" : null, (i8 & 512) != 0 ? "" : null, (i8 & 1024) != 0 ? "" : null, (i8 & 2048) != 0 ? "" : null, (i8 & 4096) == 0 ? null : "", (i8 & 8192) != 0 ? AbstractC1435t.m() : null, (i8 & 16384) != 0 ? AbstractC1435t.m() : null);
    }
}
