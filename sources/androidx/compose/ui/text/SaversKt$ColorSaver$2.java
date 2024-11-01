package androidx.compose.ui.text;

import Q5.C;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$ColorSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$ColorSaver$2 INSTANCE = new SaversKt$ColorSaver$2();

    SaversKt$ColorSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Color invoke(Object obj) {
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.ULong");
        return Color.m2938boximpl(Color.m2944constructorimpl(((C) obj).g()));
    }
}
