package P5;

import android.text.Spanned;
import androidx.core.text.HtmlCompat;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes5.dex */
public abstract class a {
    public static final Spanned a(String source) {
        AbstractC3292y.i(source, "source");
        Spanned fromHtml = HtmlCompat.fromHtml(n.x(n.x(n.x(n.x(n.x(n.x(source, "<ul>", "<customUl>", true), "</ul>", "</customUl>", true), "<ol>", "<customOl>", true), "<ol>", "</customOl>", true), "<li>", "<customLi>", true), "</li>", "</customLi>", true), 0, null, new b());
        AbstractC3292y.h(fromHtml, "fromHtml(customTagsSourc…, null, HtmlTagHandler())");
        return fromHtml;
    }
}
