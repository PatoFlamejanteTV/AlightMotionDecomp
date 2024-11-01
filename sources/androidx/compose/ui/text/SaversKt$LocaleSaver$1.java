package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$LocaleSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$LocaleSaver$1 INSTANCE = new SaversKt$LocaleSaver$1();

    SaversKt$LocaleSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, Locale locale) {
        return locale.toLanguageTag();
    }
}
