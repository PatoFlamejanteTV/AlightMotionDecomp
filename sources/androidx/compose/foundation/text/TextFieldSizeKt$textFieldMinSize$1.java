package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2073o;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextFieldSizeKt$textFieldMinSize$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ TextStyle $style;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2073o {
        final /* synthetic */ TextFieldSize $minSizeState;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03201 extends AbstractC3293z implements Function1 {
            final /* synthetic */ Placeable $measured;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03201(Placeable placeable) {
                super(1);
                this.$measured = placeable;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return I.f8786a;
            }

            public final void invoke(Placeable.PlacementScope layout) {
                AbstractC3292y.i(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, this.$measured, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldSize textFieldSize) {
            super(3);
            this.$minSizeState = textFieldSize;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m927invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m5129unboximpl());
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final MeasureResult m927invoke3p2s80s(MeasureScope layout, Measurable measurable, long j8) {
            AbstractC3292y.i(layout, "$this$layout");
            AbstractC3292y.i(measurable, "measurable");
            SizeKt.m609defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, 0.0f, 3, null);
            long m926getMinSizeYbymL2g = this.$minSizeState.m926getMinSizeYbymL2g();
            Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, m.k(IntSize.m5321getWidthimpl(m926getMinSizeYbymL2g), Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8)), 0, m.k(IntSize.m5320getHeightimpl(m926getMinSizeYbymL2g), Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8)), 0, 10, null));
            return MeasureScope.CC.q(layout, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new C03201(mo4108measureBRTryo0), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(TextStyle textStyle) {
        super(3);
        this.$style = textStyle;
    }

    public static final /* synthetic */ Object access$invoke$lambda$2(State state) {
        return state.getValue();
    }

    private static final Object invoke$lambda$2(State<? extends Object> state) {
        return state.getValue();
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
          (r9v2 ?? I:java.lang.Object) from 0x00dc: INVOKE (r12v0 ?? I:androidx.compose.runtime.Composer), (r9v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:35)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @androidx.compose.runtime.Composable
    public final androidx.compose.ui.Modifier invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
          (r9v2 ?? I:java.lang.Object) from 0x00dc: INVOKE (r12v0 ?? I:androidx.compose.runtime.Composer), (r9v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:35)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
}
