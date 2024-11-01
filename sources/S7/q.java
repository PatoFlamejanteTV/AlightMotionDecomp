package S7;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f9947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9948b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9949c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9950d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9951e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9952f;

    public q(String title, String legalDescriptionTextLabel, String agreeToAllButton, String searchBarHint, String closeLabel, String backLabel) {
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(legalDescriptionTextLabel, "legalDescriptionTextLabel");
        AbstractC3292y.i(agreeToAllButton, "agreeToAllButton");
        AbstractC3292y.i(searchBarHint, "searchBarHint");
        AbstractC3292y.i(closeLabel, "closeLabel");
        AbstractC3292y.i(backLabel, "backLabel");
        this.f9947a = title;
        this.f9948b = legalDescriptionTextLabel;
        this.f9949c = agreeToAllButton;
        this.f9950d = searchBarHint;
        this.f9951e = closeLabel;
        this.f9952f = backLabel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3292y.d(this.f9947a, qVar.f9947a) && AbstractC3292y.d(this.f9948b, qVar.f9948b) && AbstractC3292y.d(this.f9949c, qVar.f9949c) && AbstractC3292y.d(this.f9950d, qVar.f9950d) && AbstractC3292y.d(this.f9951e, qVar.f9951e) && AbstractC3292y.d(this.f9952f, qVar.f9952f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9952f.hashCode() + t.a(this.f9951e, t.a(this.f9950d, t.a(this.f9949c, t.a(this.f9948b, this.f9947a.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("StacksScreen(title=");
        a9.append(this.f9947a);
        a9.append(", legalDescriptionTextLabel=");
        a9.append(this.f9948b);
        a9.append(", agreeToAllButton=");
        a9.append(this.f9949c);
        a9.append(", searchBarHint=");
        a9.append(this.f9950d);
        a9.append(", closeLabel=");
        a9.append(this.f9951e);
        a9.append(", backLabel=");
        a9.append(this.f9952f);
        a9.append(')');
        return a9.toString();
    }
}
