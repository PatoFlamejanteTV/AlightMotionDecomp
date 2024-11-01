package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class VectorComposeKt$Group$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ List<PathNode> $clipPathData;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ String $name;
    final /* synthetic */ float $pivotX;
    final /* synthetic */ float $pivotY;
    final /* synthetic */ float $rotation;
    final /* synthetic */ float $scaleX;
    final /* synthetic */ float $scaleY;
    final /* synthetic */ float $translationX;
    final /* synthetic */ float $translationY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorComposeKt$Group$4(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List<? extends PathNode> list, InterfaceC2072n interfaceC2072n, int i8, int i9) {
        super(2);
        this.$name = str;
        this.$rotation = f8;
        this.$pivotX = f9;
        this.$pivotY = f10;
        this.$scaleX = f11;
        this.$scaleY = f12;
        this.$translationX = f13;
        this.$translationY = f14;
        this.$clipPathData = list;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        VectorComposeKt.Group(this.$name, this.$rotation, this.$pivotX, this.$pivotY, this.$scaleX, this.$scaleY, this.$translationX, this.$translationY, this.$clipPathData, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
