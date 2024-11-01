package androidx.compose.foundation;

import U5.d;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo253applyToFlingBMRW4eQ(long j8, InterfaceC2072n interfaceC2072n, d dVar);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo254applyToScrollRhakbz0(long j8, int i8, Function1 function1);

    Modifier getEffectModifier();

    boolean isInProgress();
}
