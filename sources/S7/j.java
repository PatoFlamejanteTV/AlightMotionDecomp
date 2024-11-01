package S7;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f9892a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9893b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9894c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9895d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9896e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9897f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9898g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9899h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9900i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9901j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9902k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9903l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9904m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9905n;

    /* renamed from: o, reason: collision with root package name */
    public final String f9906o;

    /* renamed from: p, reason: collision with root package name */
    public final String f9907p;

    public j(String titleText, String bodyText, String legitimateInterestLink, String purposesLabel, String consentLabel, String specialPurposesAndFeaturesLabel, String agreeToAllButtonText, String saveAndExitButtonText, String legalDescriptionTextLabel, String otherPreferencesText, String noneLabel, String someLabel, String allLabel, String closeLabel, String backLabel, String showPartners) {
        AbstractC3292y.i(titleText, "titleText");
        AbstractC3292y.i(bodyText, "bodyText");
        AbstractC3292y.i(legitimateInterestLink, "legitimateInterestLink");
        AbstractC3292y.i(purposesLabel, "purposesLabel");
        AbstractC3292y.i(consentLabel, "consentLabel");
        AbstractC3292y.i(specialPurposesAndFeaturesLabel, "specialPurposesAndFeaturesLabel");
        AbstractC3292y.i(agreeToAllButtonText, "agreeToAllButtonText");
        AbstractC3292y.i(saveAndExitButtonText, "saveAndExitButtonText");
        AbstractC3292y.i(legalDescriptionTextLabel, "legalDescriptionTextLabel");
        AbstractC3292y.i(otherPreferencesText, "otherPreferencesText");
        AbstractC3292y.i(noneLabel, "noneLabel");
        AbstractC3292y.i(someLabel, "someLabel");
        AbstractC3292y.i(allLabel, "allLabel");
        AbstractC3292y.i(closeLabel, "closeLabel");
        AbstractC3292y.i(backLabel, "backLabel");
        AbstractC3292y.i(showPartners, "showPartners");
        this.f9892a = titleText;
        this.f9893b = bodyText;
        this.f9894c = legitimateInterestLink;
        this.f9895d = purposesLabel;
        this.f9896e = consentLabel;
        this.f9897f = specialPurposesAndFeaturesLabel;
        this.f9898g = agreeToAllButtonText;
        this.f9899h = saveAndExitButtonText;
        this.f9900i = legalDescriptionTextLabel;
        this.f9901j = otherPreferencesText;
        this.f9902k = noneLabel;
        this.f9903l = someLabel;
        this.f9904m = allLabel;
        this.f9905n = closeLabel;
        this.f9906o = backLabel;
        this.f9907p = showPartners;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3292y.d(this.f9892a, jVar.f9892a) && AbstractC3292y.d(this.f9893b, jVar.f9893b) && AbstractC3292y.d(this.f9894c, jVar.f9894c) && AbstractC3292y.d(this.f9895d, jVar.f9895d) && AbstractC3292y.d(this.f9896e, jVar.f9896e) && AbstractC3292y.d(this.f9897f, jVar.f9897f) && AbstractC3292y.d(this.f9898g, jVar.f9898g) && AbstractC3292y.d(this.f9899h, jVar.f9899h) && AbstractC3292y.d(this.f9900i, jVar.f9900i) && AbstractC3292y.d(this.f9901j, jVar.f9901j) && AbstractC3292y.d(this.f9902k, jVar.f9902k) && AbstractC3292y.d(this.f9903l, jVar.f9903l) && AbstractC3292y.d(this.f9904m, jVar.f9904m) && AbstractC3292y.d(this.f9905n, jVar.f9905n) && AbstractC3292y.d(this.f9906o, jVar.f9906o) && AbstractC3292y.d(this.f9907p, jVar.f9907p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9907p.hashCode() + t.a(this.f9906o, t.a(this.f9905n, t.a(this.f9904m, t.a(this.f9903l, t.a(this.f9902k, t.a(this.f9901j, t.a(this.f9900i, t.a(this.f9899h, t.a(this.f9898g, t.a(this.f9897f, t.a(this.f9896e, t.a(this.f9895d, t.a(this.f9894c, t.a(this.f9893b, this.f9892a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "OptionsScreen(titleText=" + this.f9892a + ", bodyText=" + this.f9893b + ", legitimateInterestLink=" + this.f9894c + ", purposesLabel=" + this.f9895d + ", consentLabel=" + this.f9896e + ", specialPurposesAndFeaturesLabel=" + this.f9897f + ", agreeToAllButtonText=" + this.f9898g + ", saveAndExitButtonText=" + this.f9899h + ", legalDescriptionTextLabel=" + this.f9900i + ", otherPreferencesText=" + this.f9901j + ", noneLabel=" + this.f9902k + ", someLabel=" + this.f9903l + ", allLabel=" + this.f9904m + ", closeLabel=" + this.f9905n + ", backLabel=" + this.f9906o + ", showPartners=" + this.f9907p + ')';
    }
}
