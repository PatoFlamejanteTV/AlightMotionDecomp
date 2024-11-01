package e4;

import Y3.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2817a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2817a f31704a = new C2817a();

    private C2817a() {
    }

    public final void a(ProgressBar progressBar, q qVar) {
        String h8;
        AbstractC3292y.i(progressBar, "progressBar");
        if (qVar != null && (h8 = qVar.h()) != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(h8)));
        }
    }

    public final SpannableString b(Context context, String text, Y3.c customization) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(customization, "customization");
        SpannableString spannableString = new SpannableString(text);
        String p8 = customization.p();
        if (p8 != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(p8)), 0, spannableString.length(), 0);
        }
        Integer valueOf = Integer.valueOf(customization.u());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, valueOf.intValue(), context.getResources().getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String y8 = customization.y();
        if (y8 != null) {
            spannableString.setSpan(new TypefaceSpan(y8), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int c(int i8) {
        return d(i8, 0.8f);
    }

    public final int d(int i8, float f8) {
        return Color.argb(Color.alpha(i8), Math.min(Math.max((int) (Color.red(i8) * f8), 0), 255), Math.min(Math.max((int) (Color.green(i8) * f8), 0), 255), Math.min(Math.max((int) (Color.blue(i8) * f8), 0), 255));
    }

    public final void e(AppCompatActivity activity, int i8) {
        AbstractC3292y.i(activity, "activity");
        activity.getWindow().setStatusBarColor(i8);
    }
}
