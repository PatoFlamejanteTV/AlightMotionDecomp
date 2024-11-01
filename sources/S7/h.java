package S7;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f9866a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9867b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9868c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9869d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9870e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9871f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9872g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9873h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9874i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9875j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9876k;

    public h(String title, String body, String objected, String accept, String objectAllButton, String searchBarHint, String purposesLabel, String partnersLabel, String showAllVendorsMenu, String showIABVendorsMenu, String backLabel) {
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(body, "body");
        AbstractC3292y.i(objected, "objected");
        AbstractC3292y.i(accept, "accept");
        AbstractC3292y.i(objectAllButton, "objectAllButton");
        AbstractC3292y.i(searchBarHint, "searchBarHint");
        AbstractC3292y.i(purposesLabel, "purposesLabel");
        AbstractC3292y.i(partnersLabel, "partnersLabel");
        AbstractC3292y.i(showAllVendorsMenu, "showAllVendorsMenu");
        AbstractC3292y.i(showIABVendorsMenu, "showIABVendorsMenu");
        AbstractC3292y.i(backLabel, "backLabel");
        this.f9866a = title;
        this.f9867b = body;
        this.f9868c = objected;
        this.f9869d = accept;
        this.f9870e = objectAllButton;
        this.f9871f = searchBarHint;
        this.f9872g = purposesLabel;
        this.f9873h = partnersLabel;
        this.f9874i = showAllVendorsMenu;
        this.f9875j = showIABVendorsMenu;
        this.f9876k = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3292y.d(this.f9866a, hVar.f9866a) && AbstractC3292y.d(this.f9867b, hVar.f9867b) && AbstractC3292y.d(this.f9868c, hVar.f9868c) && AbstractC3292y.d(this.f9869d, hVar.f9869d) && AbstractC3292y.d(this.f9870e, hVar.f9870e) && AbstractC3292y.d(this.f9871f, hVar.f9871f) && AbstractC3292y.d(this.f9872g, hVar.f9872g) && AbstractC3292y.d(this.f9873h, hVar.f9873h) && AbstractC3292y.d(this.f9874i, hVar.f9874i) && AbstractC3292y.d(this.f9875j, hVar.f9875j) && AbstractC3292y.d(this.f9876k, hVar.f9876k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9876k.hashCode() + t.a(this.f9875j, t.a(this.f9874i, t.a(this.f9873h, t.a(this.f9872g, t.a(this.f9871f, t.a(this.f9870e, t.a(this.f9869d, t.a(this.f9868c, t.a(this.f9867b, this.f9866a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "LegInterestScreen(title=" + this.f9866a + ", body=" + this.f9867b + ", objected=" + this.f9868c + ", accept=" + this.f9869d + ", objectAllButton=" + this.f9870e + ", searchBarHint=" + this.f9871f + ", purposesLabel=" + this.f9872g + ", partnersLabel=" + this.f9873h + ", showAllVendorsMenu=" + this.f9874i + ", showIABVendorsMenu=" + this.f9875j + ", backLabel=" + this.f9876k + ')';
    }
}
