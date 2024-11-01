package androidx.compose.ui.text.font;

import Q5.s;
import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;
import n6.InterfaceC3470o;

/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        AbstractC3292y.f(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, U5.d dVar) {
        final C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrievalFailed */
            public void lambda$callbackFailAsync$1(int i8) {
                InterfaceC3470o.this.t(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i8 + ')'));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrieved */
            public void lambda$callbackSuccessAsync$0(android.graphics.Typeface typeface) {
                InterfaceC3470o.this.resumeWith(s.b(typeface));
            }
        }, null);
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
