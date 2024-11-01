package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$AnnotationRangeListSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SaversKt$AnnotationRangeListSaver$1 INSTANCE = new SaversKt$AnnotationRangeListSaver$1();

    SaversKt$AnnotationRangeListSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(SaverScope saverScope, List<? extends AnnotatedString.Range<? extends Object>> list) {
        Saver saver;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<? extends Object> range = list.get(i8);
            saver = SaversKt.AnnotationRangeSaver;
            arrayList.add(SaversKt.save(range, saver, saverScope));
        }
        return arrayList;
    }
}
