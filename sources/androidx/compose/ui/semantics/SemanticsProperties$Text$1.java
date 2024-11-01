package androidx.compose.ui.semantics;

import R5.AbstractC1435t;
import androidx.compose.ui.text.AnnotatedString;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SemanticsProperties$Text$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
        List<AnnotatedString> Z02;
        if (list == null || (Z02 = AbstractC1435t.Z0(list)) == null) {
            return list2;
        }
        Z02.addAll(list2);
        return Z02;
    }
}
