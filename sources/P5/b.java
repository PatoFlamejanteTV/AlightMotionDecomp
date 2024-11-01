package P5;

import R5.AbstractC1435t;
import android.text.Editable;
import android.text.Html;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import org.xml.sax.XMLReader;

/* loaded from: classes5.dex */
public final class b implements Html.TagHandler {

    /* renamed from: a, reason: collision with root package name */
    public final List f8107a = new ArrayList();

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z8, String str, Editable text, XMLReader xMLReader) {
        c cVar;
        AbstractC3292y.i(text, "output");
        int i8 = 0;
        if (AbstractC3292y.d("customUl", str) && z8) {
            this.f8107a.add(0, new e());
            return;
        }
        if (AbstractC3292y.d("customOl", str) && z8) {
            this.f8107a.add(0, new d());
            return;
        }
        if ((AbstractC3292y.d("customUl", str) || AbstractC3292y.d("customOl", str)) && !z8) {
            AbstractC1435t.N(this.f8107a);
            return;
        }
        if (AbstractC3292y.d("customLi", str) && z8) {
            ((c) AbstractC1435t.m0(this.f8107a)).c(text);
            return;
        }
        if (AbstractC3292y.d("customLi", str) && !z8) {
            c cVar2 = (c) AbstractC1435t.m0(this.f8107a);
            int size = this.f8107a.size();
            cVar2.getClass();
            AbstractC3292y.i(text, "text");
            cVar2.a(text);
            c[] listTags = (c[]) text.getSpans(0, text.length(), c.class);
            AbstractC3292y.h(listTags, "listTags");
            if (listTags.length == 0) {
                cVar = null;
            } else {
                cVar = listTags[listTags.length - 1];
            }
            int spanStart = text.getSpanStart(cVar);
            text.removeSpan(cVar);
            if (spanStart != text.length()) {
                Object[] b9 = cVar2.b(text, size);
                int length = b9.length;
                while (i8 < length) {
                    Object obj = b9[i8];
                    i8++;
                    text.setSpan(obj, spanStart, text.length(), 33);
                }
            }
        }
    }
}
