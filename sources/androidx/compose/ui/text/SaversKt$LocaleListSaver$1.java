package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$LocaleListSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$LocaleListSaver$1 INSTANCE = new SaversKt$LocaleListSaver$1();

    SaversKt$LocaleListSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, LocaleList localeList) {
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(SaversKt.save(localeList2.get(i8), SaversKt.getSaver(Locale.Companion), saverScope));
        }
        return arrayList;
    }
}
