package l4;

import android.text.SpannableString;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final SpannableString f34692a;

    /* renamed from: b, reason: collision with root package name */
    private final SpannableString f34693b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34694c;

    public d(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        AbstractC3292y.i(primaryText, "primaryText");
        AbstractC3292y.i(secondaryText, "secondaryText");
        AbstractC3292y.i(placeId, "placeId");
        this.f34692a = primaryText;
        this.f34693b = secondaryText;
        this.f34694c = placeId;
    }

    public final String a() {
        return this.f34694c;
    }

    public final SpannableString b() {
        return this.f34692a;
    }

    public final SpannableString c() {
        return this.f34693b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3292y.d(this.f34692a, dVar.f34692a) && AbstractC3292y.d(this.f34693b, dVar.f34693b) && AbstractC3292y.d(this.f34694c, dVar.f34694c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f34692a.hashCode() * 31) + this.f34693b.hashCode()) * 31) + this.f34694c.hashCode();
    }

    public String toString() {
        SpannableString spannableString = this.f34692a;
        SpannableString spannableString2 = this.f34693b;
        return "AutocompletePrediction(primaryText=" + ((Object) spannableString) + ", secondaryText=" + ((Object) spannableString2) + ", placeId=" + this.f34694c + ")";
    }
}
