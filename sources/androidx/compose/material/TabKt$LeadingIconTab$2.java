package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$LeadingIconTab$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ Indication $ripple;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ InterfaceC2072n $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$LeadingIconTab$2(Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z9, Function0 function0, InterfaceC2072n interfaceC2072n, int i8, InterfaceC2072n interfaceC2072n2) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z9;
        this.$onClick = function0;
        this.$icon = interfaceC2072n;
        this.$$dirty = i8;
        this.$text = interfaceC2072n2;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float f8;
        float f9;
        float f10;
        TextStyle m4696copyv2rsoow;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866677691, i8, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
        }
        Modifier modifier = this.$modifier;
        f8 = TabKt.SmallTabHeight;
        Modifier m799selectableO2vRcR0 = SelectableKt.m799selectableO2vRcR0(SizeKt.m610height3ABfNKs(modifier, f8), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m4493boximpl(Role.Companion.m4506getTabo7Vup1c()), this.$onClick);
        f9 = TabKt.HorizontalTextPadding;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m579paddingVpY3zN4$default(m799selectableO2vRcR0, f9, 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        InterfaceC2072n interfaceC2072n = this.$icon;
        int i9 = this.$$dirty;
        InterfaceC2072n interfaceC2072n2 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
        Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        interfaceC2072n.invoke(composer, Integer.valueOf((i9 >> 9) & 14));
        Modifier.Companion companion2 = Modifier.Companion;
        f10 = TabKt.TextDistanceFromLeadingIcon;
        SpacerKt.Spacer(SizeKt.m621requiredWidth3ABfNKs(companion2, f10), composer, 6);
        m4696copyv2rsoow = r8.m4696copyv2rsoow((r48 & 1) != 0 ? r8.spanStyle.m4628getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r8.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r8.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r8.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r8.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r8.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r8.spanStyle.m4626getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? TextAlign.m5052boximpl(r8.paragraphStyle.m4584getTextAligne0LSkKk()) : TextAlign.m5052boximpl(TextAlign.Companion.m5059getCentere0LSkKk()), (r48 & 65536) != 0 ? TextDirection.m5066boximpl(r8.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r48 & 131072) != 0 ? r8.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r8.platformStyle : null, (r48 & 1048576) != 0 ? r8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? LineBreak.m4972boximpl(r8.paragraphStyle.m4581getLineBreakrAG3T2k()) : null, (r48 & 4194304) != 0 ? Hyphens.m4962boximpl(r8.paragraphStyle.m4579getHyphensvmbZdU8()) : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getButton().paragraphStyle.getTextMotion() : null);
        TextKt.ProvideTextStyle(m4696copyv2rsoow, interfaceC2072n2, composer, (i9 >> 3) & 112);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
