package androidx.compose.ui.graphics.vector;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Brush;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $fill;
    final /* synthetic */ float $fillAlpha;
    final /* synthetic */ String $name;
    final /* synthetic */ List<PathNode> $pathData;
    final /* synthetic */ int $pathFillType;
    final /* synthetic */ Brush $stroke;
    final /* synthetic */ float $strokeAlpha;
    final /* synthetic */ int $strokeLineCap;
    final /* synthetic */ int $strokeLineJoin;
    final /* synthetic */ float $strokeLineMiter;
    final /* synthetic */ float $strokeLineWidth;
    final /* synthetic */ float $trimPathEnd;
    final /* synthetic */ float $trimPathOffset;
    final /* synthetic */ float $trimPathStart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorComposeKt$Path$3(List<? extends PathNode> list, int i8, String str, Brush brush, float f8, Brush brush2, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14, int i11, int i12, int i13) {
        super(2);
        this.$pathData = list;
        this.$pathFillType = i8;
        this.$name = str;
        this.$fill = brush;
        this.$fillAlpha = f8;
        this.$stroke = brush2;
        this.$strokeAlpha = f9;
        this.$strokeLineWidth = f10;
        this.$strokeLineCap = i9;
        this.$strokeLineJoin = i10;
        this.$strokeLineMiter = f11;
        this.$trimPathStart = f12;
        this.$trimPathEnd = f13;
        this.$trimPathOffset = f14;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        VectorComposeKt.m3513Path9cdaXJ4(this.$pathData, this.$pathFillType, this.$name, this.$fill, this.$fillAlpha, this.$stroke, this.$strokeAlpha, this.$strokeLineWidth, this.$strokeLineCap, this.$strokeLineJoin, this.$strokeLineMiter, this.$trimPathStart, this.$trimPathEnd, this.$trimPathOffset, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
