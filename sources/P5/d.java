package P5;

import android.text.Editable;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public int f8110c = 1;

    @Override // P5.c
    public Object[] b(Editable editable, int i8) {
        int i9 = this.f8108a;
        int i10 = (i8 - 1) * i9;
        if (i8 > 2) {
            i10 -= (i8 - 2) * i9;
        }
        return new Object[]{new LeadingMarginSpan.Standard(i10)};
    }

    @Override // P5.c
    public void c(Editable text) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(text, "text");
        a(text);
        text.setSpan(this, text.length(), text.length(), 17);
        int i8 = this.f8110c;
        this.f8110c = i8 + 1;
        text.append((CharSequence) String.valueOf(i8)).append(". ");
    }
}
