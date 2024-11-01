package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnnotatedStringKt$toUpperCase$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ LocaleList $localeList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringKt$toUpperCase$1(LocaleList localeList) {
        super(3);
        this.$localeList = localeList;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final String invoke(String str, int i8, int i9) {
        String substring = str.substring(i8, i9);
        AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringKt.toUpperCase(substring, this.$localeList);
    }
}
