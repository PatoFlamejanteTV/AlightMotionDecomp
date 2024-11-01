package S7;

import D5.t;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f9858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9860c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9861d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9862e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9863f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9864g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9865h;

    public g(String title, String body, String settings, String accept, String reject, String consentLink, String privacyPolicyLink, String privacyPolicyLinkText) {
        AbstractC3292y.i(title, "title");
        AbstractC3292y.i(body, "body");
        AbstractC3292y.i(settings, "settings");
        AbstractC3292y.i(accept, "accept");
        AbstractC3292y.i(reject, "reject");
        AbstractC3292y.i(consentLink, "consentLink");
        AbstractC3292y.i(privacyPolicyLink, "privacyPolicyLink");
        AbstractC3292y.i(privacyPolicyLinkText, "privacyPolicyLinkText");
        this.f9858a = title;
        this.f9859b = body;
        this.f9860c = settings;
        this.f9861d = accept;
        this.f9862e = reject;
        this.f9863f = consentLink;
        this.f9864g = privacyPolicyLink;
        this.f9865h = privacyPolicyLinkText;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3292y.d(this.f9858a, gVar.f9858a) && AbstractC3292y.d(this.f9859b, gVar.f9859b) && AbstractC3292y.d(this.f9860c, gVar.f9860c) && AbstractC3292y.d(this.f9861d, gVar.f9861d) && AbstractC3292y.d(this.f9862e, gVar.f9862e) && AbstractC3292y.d(this.f9863f, gVar.f9863f) && AbstractC3292y.d(this.f9864g, gVar.f9864g) && AbstractC3292y.d(this.f9865h, gVar.f9865h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9865h.hashCode() + t.a(this.f9864g, t.a(this.f9863f, t.a(this.f9862e, t.a(this.f9861d, t.a(this.f9860c, t.a(this.f9859b, this.f9858a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("InitScreen(title=");
        a9.append(this.f9858a);
        a9.append(", body=");
        a9.append(this.f9859b);
        a9.append(", settings=");
        a9.append(this.f9860c);
        a9.append(", accept=");
        a9.append(this.f9861d);
        a9.append(", reject=");
        a9.append(this.f9862e);
        a9.append(", consentLink=");
        a9.append(this.f9863f);
        a9.append(", privacyPolicyLink=");
        a9.append(this.f9864g);
        a9.append(", privacyPolicyLinkText=");
        a9.append(this.f9865h);
        a9.append(')');
        return a9.toString();
    }
}
