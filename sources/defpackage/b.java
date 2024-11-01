package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14849d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f14850a;

    /* renamed from: b, reason: collision with root package name */
    private final Typeface f14851b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14852c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public final SpannableString a(String text) {
            Spanned fromHtml;
            AbstractC3292y.i(text, "text");
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml(text, 0);
                return new SpannableString(fromHtml);
            }
            return new SpannableString(Html.fromHtml(text));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public b(float f8, Typeface typeface, int i8) {
        AbstractC3292y.i(typeface, "typeface");
        this.f14850a = f8;
        this.f14851b = typeface;
        this.f14852c = i8;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint p8) {
        AbstractC3292y.i(p8, "p");
        p8.setTextSize(this.f14850a);
        p8.setTypeface(this.f14851b);
        p8.setColor(this.f14852c);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint p8) {
        AbstractC3292y.i(p8, "p");
        p8.setTextSize(this.f14850a);
        p8.setTypeface(this.f14851b);
        p8.setColor(this.f14852c);
    }
}
