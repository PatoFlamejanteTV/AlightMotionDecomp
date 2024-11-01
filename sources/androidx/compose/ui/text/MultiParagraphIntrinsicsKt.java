package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i8, int i9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<Placeholder> range = list.get(i10);
            AnnotatedString.Range<Placeholder> range2 = range;
            if (AnnotatedStringKt.intersect(i8, i9, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i11);
            if (i8 <= range3.getStart() && range3.getEnd() <= i9) {
                arrayList2.add(new AnnotatedString.Range(range3.getItem(), range3.getStart() - i8, range3.getEnd() - i8));
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
