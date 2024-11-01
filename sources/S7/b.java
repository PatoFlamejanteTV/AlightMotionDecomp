package S7;

import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f9784a;

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f9785b;

    public b(Typeface typeface, Typeface typeface2) {
        this.f9784a = typeface;
        this.f9785b = typeface2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3292y.d(this.f9784a, bVar.f9784a) && AbstractC3292y.d(this.f9785b, bVar.f9785b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Typeface typeface = this.f9784a;
        int i8 = 0;
        if (typeface == null) {
            hashCode = 0;
        } else {
            hashCode = typeface.hashCode();
        }
        int i9 = hashCode * 31;
        Typeface typeface2 = this.f9785b;
        if (typeface2 != null) {
            i8 = typeface2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("ChoiceFonts(bold=");
        a9.append(this.f9784a);
        a9.append(", regular=");
        a9.append(this.f9785b);
        a9.append(')');
        return a9.toString();
    }
}
