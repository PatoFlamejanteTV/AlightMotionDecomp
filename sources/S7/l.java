package S7;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f9923a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9926d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9927e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9928f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9929g;

    public l(String title, String bodyText, String searchBarHint, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(bodyText, "bodyText");
        AbstractC3292y.i(searchBarHint, "searchBarHint");
        AbstractC3292y.i(partnersLabel, "partnersLabel");
        AbstractC3292y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3292y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3292y.i(backLabel, "backLabel");
        this.f9923a = title;
        this.f9924b = bodyText;
        this.f9925c = searchBarHint;
        this.f9926d = partnersLabel;
        this.f9927e = showAllVendorsMenu;
        this.f9928f = showIABVendorsMenu;
        this.f9929g = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3292y.d(this.f9923a, lVar.f9923a) && AbstractC3292y.d(this.f9924b, lVar.f9924b) && AbstractC3292y.d(this.f9925c, lVar.f9925c) && AbstractC3292y.d(this.f9926d, lVar.f9926d) && AbstractC3292y.d(this.f9927e, lVar.f9927e) && AbstractC3292y.d(this.f9928f, lVar.f9928f) && AbstractC3292y.d(this.f9929g, lVar.f9929g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9929g.hashCode() + t.a(this.f9928f, t.a(this.f9927e, t.a(this.f9926d, t.a(this.f9925c, t.a(this.f9924b, this.f9923a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PartnerScreen(title=");
        a9.append(this.f9923a);
        a9.append(", bodyText=");
        a9.append(this.f9924b);
        a9.append(", searchBarHint=");
        a9.append(this.f9925c);
        a9.append(", partnersLabel=");
        a9.append(this.f9926d);
        a9.append(", showAllVendorsMenu=");
        a9.append(this.f9927e);
        a9.append(", showIABVendorsMenu=");
        a9.append(this.f9928f);
        a9.append(", backLabel=");
        a9.append(this.f9929g);
        a9.append(')');
        return a9.toString();
    }
}
