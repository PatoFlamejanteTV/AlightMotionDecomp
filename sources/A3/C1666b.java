package a3;

import Q5.I;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.unit.TextUnitKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1666b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14087a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a3.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f14088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2072n interfaceC2072n) {
            super(3);
            this.f14088a = interfaceC2072n;
        }

        public final void a(String it, Composer composer, int i8) {
            AbstractC3292y.i(it, "it");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-254047745, i8, -1, "com.stripe.android.link.utils.InlineContentTemplateBuilder.add.<anonymous> (InlineContentTemplateBuilder.kt:30)");
            }
            this.f14088a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }
    }

    public static /* synthetic */ C1666b b(C1666b c1666b, String str, long j8, long j9, int i8, InterfaceC2072n interfaceC2072n, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            i10 = PlaceholderVerticalAlign.Companion.m4602getCenterJ6kI3mc();
        } else {
            i10 = i8;
        }
        return c1666b.a(str, j8, j9, i10, interfaceC2072n);
    }

    public static /* synthetic */ C1666b d(C1666b c1666b, String str, long j8, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = PlaceholderVerticalAlign.Companion.m4602getCenterJ6kI3mc();
        }
        return c1666b.c(str, j8, i8);
    }

    public final C1666b a(String id, long j8, long j9, int i8, InterfaceC2072n content) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(content, "content");
        this.f14087a.put(id, new InlineTextContent(new Placeholder(j8, j9, i8, null), ComposableLambdaKt.composableLambdaInstance(-254047745, true, new a(content))));
        return this;
    }

    public final C1666b c(String id, long j8, int i8) {
        AbstractC3292y.i(id, "id");
        a(id, j8, TextUnitKt.getEm(0), i8, C1665a.f14084a.a());
        return this;
    }

    public final Map e() {
        return this.f14087a;
    }
}
