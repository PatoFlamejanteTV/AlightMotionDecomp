package x4;

import Q5.I;
import Q5.r;
import Q5.s;
import Q5.t;
import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import x4.AbstractC4226i;

/* renamed from: x4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4223f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f41004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Painter f41005c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4224g f41006d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f41007e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f41008f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f41009g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f41010h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Alignment f41011i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ContentScale f41012j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ColorFilter f41013k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0936a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f41014a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4224g f41015b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f41016c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f41017d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f41018e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MutableState f41019f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0936a(C4224g c4224g, String str, int i8, int i9, MutableState mutableState, U5.d dVar) {
                super(2, dVar);
                this.f41015b = c4224g;
                this.f41016c = str;
                this.f41017d = i8;
                this.f41018e = i9;
                this.f41019f = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0936a(this.f41015b, this.f41016c, this.f41017d, this.f41018e, this.f41019f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object g8;
                Bitmap bitmap;
                Object e8 = V5.b.e();
                int i8 = this.f41014a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        g8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    C4224g c4224g = this.f41015b;
                    String str = this.f41016c;
                    int i9 = this.f41017d;
                    int i10 = this.f41018e;
                    this.f41014a = 1;
                    g8 = c4224g.g(str, i9, i10, this);
                    if (g8 == e8) {
                        return e8;
                    }
                }
                MutableState mutableState = this.f41019f;
                if (s.h(g8) && (bitmap = (Bitmap) g8) != null) {
                    mutableState.setValue(new AbstractC4226i.c(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null)));
                }
                MutableState mutableState2 = this.f41019f;
                if (s.e(g8) != null) {
                    mutableState2.setValue(AbstractC4226i.a.f41089a);
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0936a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.f$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f41020a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z8) {
                super(1);
                this.f41020a = z8;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4226i targetState) {
                AbstractC3292y.i(targetState, "targetState");
                if (this.f41020a) {
                    return Boolean.TRUE;
                }
                return targetState;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x4.f$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3293z implements InterfaceC2074p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2073o f41021a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BoxWithConstraintsScope f41022b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2073o f41023c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Modifier f41024d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f41025e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Alignment f41026f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ContentScale f41027g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ColorFilter f41028h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC2073o interfaceC2073o, BoxWithConstraintsScope boxWithConstraintsScope, InterfaceC2073o interfaceC2073o2, Modifier modifier, String str, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter) {
                super(4);
                this.f41021a = interfaceC2073o;
                this.f41022b = boxWithConstraintsScope;
                this.f41023c = interfaceC2073o2;
                this.f41024d = modifier;
                this.f41025e = str;
                this.f41026f = alignment;
                this.f41027g = contentScale;
                this.f41028h = colorFilter;
            }

            public final void a(AnimatedContentScope AnimatedContent, AbstractC4226i it, Composer composer, int i8) {
                AbstractC3292y.i(AnimatedContent, "$this$AnimatedContent");
                AbstractC3292y.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1707989893, i8, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous>.<anonymous> (StripeImage.kt:95)");
                }
                if (AbstractC3292y.d(it, AbstractC4226i.a.f41089a)) {
                    composer.startReplaceableGroup(-1892467073);
                    this.f41021a.invoke(this.f41022b, composer, 0);
                    composer.endReplaceableGroup();
                } else if (AbstractC3292y.d(it, AbstractC4226i.b.f41090a)) {
                    composer.startReplaceableGroup(-1892465727);
                    this.f41023c.invoke(this.f41022b, composer, 0);
                    composer.endReplaceableGroup();
                } else if (it instanceof AbstractC4226i.c) {
                    composer.startReplaceableGroup(1463161246);
                    ImageKt.Image(((AbstractC4226i.c) it).a(), this.f41025e, TestTagKt.testTag(this.f41024d, "StripeImageFromUrl"), this.f41026f, this.f41027g, 0.0f, this.f41028h, composer, 8, 32);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(1463500913);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // c6.InterfaceC2074p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                a((AnimatedContentScope) obj, (AbstractC4226i) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z8, Painter painter, C4224g c4224g, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, Modifier modifier, String str2, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter) {
            super(3);
            this.f41003a = str;
            this.f41004b = z8;
            this.f41005c = painter;
            this.f41006d = c4224g;
            this.f41007e = interfaceC2073o;
            this.f41008f = interfaceC2073o2;
            this.f41009g = modifier;
            this.f41010h = str2;
            this.f41011i = alignment;
            this.f41012j = contentScale;
            this.f41013k = colorFilter;
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3292y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1632138495, i9, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:61)");
            }
            boolean booleanValue = ((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            r c8 = AbstractC4223f.c(BoxWithConstraints);
            int intValue = ((Number) c8.a()).intValue();
            int intValue2 = ((Number) c8.b()).intValue();
            composer.startReplaceableGroup(-406660964);
            Painter painter = this.f41005c;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = (!booleanValue || painter == null) ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AbstractC4226i.b.f41090a, null, 2, null) : SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new AbstractC4226i.c(painter), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceableGroup();
            String str = this.f41003a;
            EffectsKt.LaunchedEffect(str, new C0936a(this.f41006d, str, intValue, intValue2, mutableState, null), composer, 64);
            Object value = mutableState.getValue();
            composer.startReplaceableGroup(-406637573);
            boolean changed = composer.changed(this.f41004b);
            boolean z8 = this.f41004b;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new b(z8);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            AnimatedContentKt.AnimatedContent(value, null, null, null, "loading_image_animation", (Function1) rememberedValue2, ComposableLambdaKt.composableLambda(composer, 1707989893, true, new c(this.f41007e, BoxWithConstraints, this.f41008f, this.f41009g, this.f41010h, this.f41011i, this.f41012j, this.f41013k)), composer, 1597440, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x4.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4224g f41030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f41032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ContentScale f41033e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ColorFilter f41034f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Painter f41035g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Alignment f41036h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f41037i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f41038j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC2073o f41039k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f41040l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f41041m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f41042n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C4224g c4224g, String str2, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z8, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, int i8, int i9, int i10) {
            super(2);
            this.f41029a = str;
            this.f41030b = c4224g;
            this.f41031c = str2;
            this.f41032d = modifier;
            this.f41033e = contentScale;
            this.f41034f = colorFilter;
            this.f41035g = painter;
            this.f41036h = alignment;
            this.f41037i = z8;
            this.f41038j = interfaceC2073o;
            this.f41039k = interfaceC2073o2;
            this.f41040l = i8;
            this.f41041m = i9;
            this.f41042n = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4223f.a(this.f41029a, this.f41030b, this.f41031c, this.f41032d, this.f41033e, this.f41034f, this.f41035g, this.f41036h, this.f41037i, this.f41038j, this.f41039k, composer, RecomposeScopeImplKt.updateChangedFlags(this.f41040l | 1), RecomposeScopeImplKt.updateChangedFlags(this.f41041m), this.f41042n);
        }
    }

    public static final void a(String url, C4224g imageLoader, String str, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z8, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, Composer composer, int i8, int i9, int i10) {
        AbstractC3292y.i(url, "url");
        AbstractC3292y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(464230935);
        Modifier modifier2 = (i10 & 8) != 0 ? Modifier.Companion : modifier;
        ContentScale fit = (i10 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        ColorFilter colorFilter2 = (i10 & 32) != 0 ? null : colorFilter;
        Painter painter2 = (i10 & 64) != 0 ? null : painter;
        Alignment center = (i10 & 128) != 0 ? Alignment.Companion.getCenter() : alignment;
        boolean z9 = (i10 & 256) != 0 ? false : z8;
        InterfaceC2073o a9 = (i10 & 512) != 0 ? C4218a.f40969a.a() : interfaceC2073o;
        InterfaceC2073o b9 = (i10 & 1024) != 0 ? C4218a.f40969a.b() : interfaceC2073o2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(464230935, i8, i9, "com.stripe.android.uicore.image.StripeImage (StripeImage.kt:59)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -1632138495, true, new a(url, z9, painter2, imageLoader, a9, b9, modifier2, str, center, fit, colorFilter2)), startRestartGroup, 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(url, imageLoader, str, modifier2, fit, colorFilter2, painter2, center, z9, a9, b9, i8, i9, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r c(BoxWithConstraintsScope boxWithConstraintsScope) {
        int i8;
        int i9;
        int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(boxWithConstraintsScope.mo515getConstraintsmsEJaDk());
        IntSize.Companion companion = IntSize.Companion;
        if (m5123getMaxWidthimpl > IntSize.m5321getWidthimpl(companion.m5326getZeroYbymL2g()) && Constraints.m5123getMaxWidthimpl(boxWithConstraintsScope.mo515getConstraintsmsEJaDk()) < ((int) Dp.Companion.m5174getInfinityD9Ej5fM())) {
            i8 = Constraints.m5123getMaxWidthimpl(boxWithConstraintsScope.mo515getConstraintsmsEJaDk());
        } else {
            i8 = -1;
        }
        if (Constraints.m5122getMaxHeightimpl(boxWithConstraintsScope.mo515getConstraintsmsEJaDk()) > IntSize.m5320getHeightimpl(companion.m5326getZeroYbymL2g()) && Constraints.m5122getMaxHeightimpl(boxWithConstraintsScope.mo515getConstraintsmsEJaDk()) < ((int) Dp.Companion.m5174getInfinityD9Ej5fM())) {
            i9 = Constraints.m5122getMaxHeightimpl(boxWithConstraintsScope.mo515getConstraintsmsEJaDk());
        } else {
            i9 = -1;
        }
        if (i8 == -1) {
            i8 = i9;
        }
        if (i9 == -1) {
            i9 = i8;
        }
        return new r(Integer.valueOf(i8), Integer.valueOf(i9));
    }
}
