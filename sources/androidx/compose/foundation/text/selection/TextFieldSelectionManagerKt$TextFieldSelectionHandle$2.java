package androidx.compose.foundation.text.selection;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(boolean z8, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i8) {
        super(2);
        this.$isStartHandle = z8;
        this.$direction = resolvedTextDirection;
        this.$manager = textFieldSelectionManager;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        TextFieldSelectionManagerKt.TextFieldSelectionHandle(this.$isStartHandle, this.$direction, this.$manager, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
