package z4;

import Q5.I;
import Q5.r;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.text.HtmlCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3452f;
import n6.AbstractC3462k;
import n6.M;
import n6.U;
import q6.AbstractC3815N;
import q6.w;
import x4.AbstractC4223f;
import x4.AbstractC4227j;
import x4.C4224g;
import z4.AbstractC4270b;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4271c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f41485a = new a();

        a() {
            super(1);
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f41486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f41487b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState, Function1 function1) {
            super(1);
            this.f41486a = mutableState;
            this.f41487b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return I.f8786a;
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3292y.i(it, "it");
            this.f41486a.setValue(it);
            this.f41487b.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0947c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f41488a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f41489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f41490c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f41491d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f41492e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f41493f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f41494g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f41495h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f41496i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1 f41497j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f41498k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f41499l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0947c(AnnotatedString annotatedString, long j8, TextStyle textStyle, Modifier modifier, Map map, boolean z8, int i8, int i9, Function1 function1, Function1 function12, int i10, int i11) {
            super(2);
            this.f41488a = annotatedString;
            this.f41489b = j8;
            this.f41490c = textStyle;
            this.f41491d = modifier;
            this.f41492e = map;
            this.f41493f = z8;
            this.f41494g = i8;
            this.f41495h = i9;
            this.f41496i = function1;
            this.f41497j = function12;
            this.f41498k = i10;
            this.f41499l = i11;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4271c.a(this.f41488a, this.f41489b, this.f41490c, this.f41491d, this.f41492e, this.f41493f, this.f41494g, this.f41495h, this.f41496i, this.f41497j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f41498k | 1), this.f41499l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f41500a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f41501b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f41502c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f41503d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z4.c$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f41504a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f41505b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MutableState mutableState, Function1 function1) {
                super(1);
                this.f41504a = mutableState;
                this.f41505b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m5585invokek4lQ0M(((Offset) obj).m2722unboximpl());
                return I.f8786a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m5585invokek4lQ0M(long j8) {
                List<Rect> placeholderRects;
                List j02;
                Object obj;
                TextLayoutResult textLayoutResult = (TextLayoutResult) this.f41504a.getValue();
                if (textLayoutResult != null && (placeholderRects = textLayoutResult.getPlaceholderRects()) != null && (j02 = AbstractC1435t.j0(placeholderRects)) != null) {
                    Iterator it = j02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Rect rect = (Rect) obj;
                            if (Offset.m2712getXimpl(j8) > Offset.m2712getXimpl(rect.m2747getTopLeftF1C5BW0()) && Offset.m2712getXimpl(j8) < Offset.m2712getXimpl(rect.m2748getTopRightF1C5BW0())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Rect rect2 = (Rect) obj;
                    if (rect2 != null) {
                        j8 = Offset.m2706copydBAh8RU$default(rect2.m2748getTopRightF1C5BW0(), Offset.m2712getXimpl(rect2.m2748getTopRightF1C5BW0()) + 0.1f, 0.0f, 2, null);
                    }
                }
                if (((TextLayoutResult) this.f41504a.getValue()) != null) {
                    this.f41505b.invoke(Integer.valueOf(r0.m4641getOffsetForPositionk4lQ0M(j8) - 1));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(MutableState mutableState, Function1 function1, U5.d dVar) {
            super(2, dVar);
            this.f41502c = mutableState;
            this.f41503d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(this.f41502c, this.f41503d, dVar);
            dVar2.f41501b = obj;
            return dVar2;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(PointerInputScope pointerInputScope, U5.d dVar) {
            return ((d) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f41500a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f41501b;
                a aVar = new a(this.f41502c, this.f41503d);
                this.f41500a = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, aVar, this, 7, null) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f41506a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5586invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5586invoke() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f41507a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f41508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f41509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z8, Function0 function0, Context context) {
            super(1);
            this.f41507a = z8;
            this.f41508b = function0;
            this.f41509c = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.f8786a;
        }

        public final void invoke(List annotatedStringRanges) {
            AbstractC3292y.i(annotatedStringRanges, "annotatedStringRanges");
            if (this.f41507a) {
                this.f41508b.invoke();
                AnnotatedString.Range range = (AnnotatedString.Range) AbstractC1435t.o0(annotatedStringRanges);
                if (range != null) {
                    Context context = this.f41509c;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse((String) range.getItem()));
                    context.startActivity(intent);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41510a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f41511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f41512c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f41513d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f41514e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f41515f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ SpanStyle f41516g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f41517h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f41518i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f41519j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f41520k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Modifier modifier, Map map, long j8, TextStyle textStyle, boolean z8, SpanStyle spanStyle, int i8, Function0 function0, int i9, int i10) {
            super(2);
            this.f41510a = str;
            this.f41511b = modifier;
            this.f41512c = map;
            this.f41513d = j8;
            this.f41514e = textStyle;
            this.f41515f = z8;
            this.f41516g = spanStyle;
            this.f41517h = i8;
            this.f41518i = function0;
            this.f41519j = i9;
            this.f41520k = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4271c.b(this.f41510a, this.f41511b, this.f41512c, this.f41513d, this.f41514e, this.f41515f, this.f41516g, this.f41517h, this.f41518i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f41519j | 1), this.f41520k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f41521a = new h();

        h() {
            super(1);
        }

        public final void invoke(SemanticsPropertyReceiver semantics) {
            AbstractC3292y.i(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SemanticsPropertyReceiver) obj);
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f41522a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f41523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1, AnnotatedString annotatedString) {
            super(1);
            this.f41522a = function1;
            this.f41523b = annotatedString;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return I.f8786a;
        }

        public final void invoke(int i8) {
            this.f41522a.invoke(this.f41523b.getStringAnnotations("URL", i8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f41525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f41526c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f41527d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextStyle f41528e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SpanStyle f41529f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f41530g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f41531h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f41532i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f41533j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Modifier modifier, Map map, long j8, TextStyle textStyle, SpanStyle spanStyle, int i8, Function1 function1, int i9, int i10) {
            super(2);
            this.f41524a = str;
            this.f41525b = modifier;
            this.f41526c = map;
            this.f41527d = j8;
            this.f41528e = textStyle;
            this.f41529f = spanStyle;
            this.f41530g = i8;
            this.f41531h = function1;
            this.f41532i = i9;
            this.f41533j = i10;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4271c.c(this.f41524a, this.f41525b, this.f41526c, this.f41527d, this.f41528e, this.f41529f, this.f41530g, this.f41531h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f41532i | 1), this.f41533j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f41534a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MutableState mutableState) {
            super(0);
            this.f41534a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5587invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5587invoke() {
            this.f41534a.setValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4270b.a f41535a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Painter f41536b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(AbstractC4270b.a aVar, Painter painter) {
            super(3);
            this.f41535a = aVar;
            this.f41536b = painter;
        }

        public final void a(String it, Composer composer, int i8) {
            AbstractC3292y.i(it, "it");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-737684954, i8, -1, "com.stripe.android.uicore.text.rememberDrawableImages.<anonymous>.<anonymous> (Html.kt:95)");
            }
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 1, null);
            ImageKt.Image(this.f41536b, StringResources_androidKt.stringResource(this.f41535a.b(), composer, 0), fillMaxHeight$default, (Alignment) null, (ContentScale) null, 0.0f, this.f41535a.a(), composer, 392, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z4.c$m */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f41537a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f41538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f41539c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f41540d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f41541e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C4224g f41542f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Density f41543g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f41544h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z4.c$m$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Map.Entry f41545a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4224g f41546b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f41547c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Map.Entry entry, C4224g c4224g, long j8) {
                super(3);
                this.f41545a = entry;
                this.f41546b = c4224g;
                this.f41547c = j8;
            }

            public final void a(String it, Composer composer, int i8) {
                AbstractC3292y.i(it, "it");
                if ((i8 & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(858918421, i8, -1, "com.stripe.android.uicore.text.rememberRemoteImages.<anonymous>.<anonymous>.<anonymous> (Html.kt:186)");
                }
                AbstractC4223f.a((String) this.f41545a.getKey(), this.f41546b, null, SizeKt.m610height3ABfNKs(SizeKt.m629width3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(Size.m2781getWidthimpl(this.f41547c))), Dp.m5155constructorimpl(Size.m2778getHeightimpl(this.f41547c))), null, null, null, null, false, null, null, composer, 448, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // c6.InterfaceC2073o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
                return I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z4.c$m$b */
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            Object f41548a;

            /* renamed from: b, reason: collision with root package name */
            int f41549b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AnnotatedString.Range f41550c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4224g f41551d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AnnotatedString.Range range, C4224g c4224g, U5.d dVar) {
                super(2, dVar);
                this.f41550c = range;
                this.f41551d = c4224g;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f41550c, this.f41551d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object obj3;
                Object e8 = V5.b.e();
                int i8 = this.f41549b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        obj2 = this.f41548a;
                        t.b(obj);
                        obj3 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    Object item = this.f41550c.getItem();
                    C4224g c4224g = this.f41551d;
                    String str = (String) this.f41550c.getItem();
                    this.f41548a = item;
                    this.f41549b = 1;
                    Object h8 = c4224g.h(str, this);
                    if (h8 == e8) {
                        return e8;
                    }
                    obj2 = item;
                    obj3 = h8;
                }
                if (s.g(obj3)) {
                    obj3 = null;
                }
                return new r(obj2, obj3);
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(List list, w wVar, Function0 function0, C4224g c4224g, Density density, int i8, U5.d dVar) {
            super(2, dVar);
            this.f41539c = list;
            this.f41540d = wVar;
            this.f41541e = function0;
            this.f41542f = c4224g;
            this.f41543g = density;
            this.f41544h = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            m mVar = new m(this.f41539c, this.f41540d, this.f41541e, this.f41542f, this.f41543g, this.f41544h, dVar);
            mVar.f41538b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a9;
            U b9;
            r rVar;
            Object e8 = V5.b.e();
            int i8 = this.f41537a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    a9 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f41538b;
                List list = this.f41539c;
                C4224g c4224g = this.f41542f;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b9 = AbstractC3462k.b(m8, null, null, new b((AnnotatedString.Range) it.next(), c4224g, null), 3, null);
                    arrayList.add(b9);
                }
                this.f41537a = 1;
                a9 = AbstractC3452f.a(arrayList, this);
                if (a9 == e8) {
                    return e8;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (r rVar2 : (Iterable) a9) {
                Bitmap bitmap = (Bitmap) rVar2.d();
                if (bitmap != null) {
                    rVar = new r(rVar2.c(), bitmap);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList2.add(rVar);
                }
            }
            Map u8 = Q.u(arrayList2);
            w wVar = this.f41540d;
            Density density = this.f41543g;
            int i9 = this.f41544h;
            C4224g c4224g2 = this.f41542f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(Q.d(u8.size()));
            for (Map.Entry entry : u8.entrySet()) {
                Object key = entry.getKey();
                long m2784times7Ah8Wj8 = Size.m2784times7Ah8Wj8(androidx.compose.ui.geometry.SizeKt.Size(((Bitmap) entry.getValue()).getWidth(), ((Bitmap) entry.getValue()).getHeight()), 1 / density.getDensity());
                linkedHashMap.put(key, new InlineTextContent(new Placeholder(TextUnitKt.getSp(Size.m2781getWidthimpl(m2784times7Ah8Wj8)), TextUnitKt.getSp(Size.m2778getHeightimpl(m2784times7Ah8Wj8)), i9, null), ComposableLambdaKt.composableLambdaInstance(858918421, true, new a(entry, c4224g2, m2784times7Ah8Wj8))));
            }
            wVar.setValue(linkedHashMap);
            this.f41541e.invoke();
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.text.AnnotatedString r53, long r54, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.Modifier r57, java.util.Map r58, boolean r59, int r60, int r61, kotlin.jvm.functions.Function1 r62, kotlin.jvm.functions.Function1 r63, androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.AbstractC4271c.a(androidx.compose.ui.text.AnnotatedString, long, androidx.compose.ui.text.TextStyle, androidx.compose.ui.Modifier, java.util.Map, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r43, androidx.compose.ui.Modifier r44, java.util.Map r45, long r46, androidx.compose.ui.text.TextStyle r48, boolean r49, androidx.compose.ui.text.SpanStyle r50, int r51, kotlin.jvm.functions.Function0 r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.AbstractC4271c.b(java.lang.String, androidx.compose.ui.Modifier, java.util.Map, long, androidx.compose.ui.text.TextStyle, boolean, androidx.compose.ui.text.SpanStyle, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027b A[LOOP:1: B:82:0x0275->B:84:0x027b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r45, androidx.compose.ui.Modifier r46, java.util.Map r47, long r48, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.SpanStyle r51, int r52, kotlin.jvm.functions.Function1 r53, androidx.compose.runtime.Composer r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.AbstractC4271c.c(java.lang.String, androidx.compose.ui.Modifier, java.util.Map, long, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.SpanStyle, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AnnotatedString e(String text, Map map, SpanStyle spanStyle, Composer composer, int i8, int i9) {
        Map map2;
        SpanStyle spanStyle2;
        boolean z8;
        AbstractC3292y.i(text, "text");
        composer.startReplaceableGroup(1962487584);
        if ((i9 & 2) != 0) {
            map2 = Q.h();
        } else {
            map2 = map;
        }
        if ((i9 & 4) != 0) {
            spanStyle2 = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC3284p) null);
        } else {
            spanStyle2 = spanStyle;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1962487584, i8, -1, "com.stripe.android.uicore.text.annotatedStringResource (Html.kt:351)");
        }
        composer.startReplaceableGroup(-1904947080);
        if ((((i8 & 14) ^ 6) > 4 && composer.changed(text)) || (i8 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = HtmlCompat.fromHtml(text, 0);
            composer.updateRememberedValue(rememberedValue);
        }
        Spanned spanned = (Spanned) rememberedValue;
        composer.endReplaceableGroup();
        AbstractC3292y.f(spanned);
        composer.startReplaceableGroup(-1904940542);
        boolean changed = composer.changed(spanned);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            AbstractC3292y.h(spans, "getSpans(...)");
            int i10 = 0;
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (i10 < spanned.toString().length() && spanStart < spanned.toString().length() && spanStart - i10 >= 0) {
                    String substring = spanned.toString().substring(i10, spanStart);
                    AbstractC3292y.h(substring, "substring(...)");
                    builder.append(substring);
                    if (obj instanceof StyleSpan) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style != 1) {
                            if (style != 2) {
                                if (style == 3) {
                                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m4776boximpl(FontStyle.Companion.m4785getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (AbstractC3284p) null), spanStart, spanEnd);
                                }
                            } else {
                                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m4776boximpl(FontStyle.Companion.m4785getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (AbstractC3284p) null), spanStart, spanEnd);
                            }
                        } else {
                            builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (AbstractC3284p) null), spanStart, spanEnd);
                        }
                    } else if (obj instanceof UnderlineSpan) {
                        builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (AbstractC3284p) null), spanStart, spanEnd);
                    } else if (obj instanceof BulletSpan) {
                        builder.append("•\t");
                    } else if (obj instanceof ForegroundColorSpan) {
                        builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (AbstractC3284p) null), spanStart, spanEnd);
                    } else if (obj instanceof ImageSpan) {
                        ImageSpan imageSpan = (ImageSpan) obj;
                        if (imageSpan.getSource() != null) {
                            if (!map2.isEmpty()) {
                                String source = imageSpan.getSource();
                                AbstractC3292y.f(source);
                                map2.containsKey(source);
                            }
                            String source2 = imageSpan.getSource();
                            AbstractC3292y.f(source2);
                            InlineTextContentKt.appendInlineContent$default(builder, source2, null, 2, null);
                        }
                        i10 = spanEnd;
                    } else if (obj instanceof URLSpan) {
                        builder.addStyle(spanStyle2, spanStart, spanEnd);
                        String url = ((URLSpan) obj).getURL();
                        AbstractC3292y.h(url, "getURL(...)");
                        builder.addStringAnnotation("URL", url, spanStart, spanEnd);
                    }
                    i10 = spanStart;
                }
            }
            if (i10 != spanned.toString().length()) {
                String substring2 = spanned.toString().substring(i10);
                AbstractC3292y.h(substring2, "substring(...)");
                builder.append(substring2);
            }
            rememberedValue2 = builder.toAnnotatedString();
            composer.updateRememberedValue(rememberedValue2);
        }
        AnnotatedString annotatedString = (AnnotatedString) rememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    private static final Map f(Map map, int i8, Composer composer, int i9) {
        composer.startReplaceableGroup(1925244042);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1925244042, i9, -1, "com.stripe.android.uicore.text.rememberBitmapImages (Html.kt:114)");
        }
        Set entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i6.m.d(Q.d(AbstractC1435t.x(entrySet, 10)), 16));
        Iterator it = entrySet.iterator();
        if (!it.hasNext()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) it.next();
        android.support.v4.media.a.a(entry.getValue());
        throw null;
    }

    private static final Map g(Map map, int i8, Composer composer, int i9) {
        composer.startReplaceableGroup(389303035);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(389303035, i9, -1, "com.stripe.android.uicore.text.rememberDrawableImages (Html.kt:81)");
        }
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i6.m.d(Q.d(AbstractC1435t.x(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            AbstractC4270b.a aVar = (AbstractC4270b.a) entry.getValue();
            Painter painterResource = PainterResources_androidKt.painterResource(aVar.c(), composer, 0);
            float m2778getHeightimpl = Size.m2778getHeightimpl(painterResource.mo3485getIntrinsicSizeNHjbRc());
            float m2781getWidthimpl = Size.m2781getWidthimpl(painterResource.mo3485getIntrinsicSizeNHjbRc());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i10 = MaterialTheme.$stable;
            long m4700getFontSizeXSAIIZE = materialTheme.getTypography(composer, i10).getBody1().m4700getFontSizeXSAIIZE();
            TextUnitKt.m5355checkArithmeticR2X_6o(m4700getFontSizeXSAIIZE);
            r a9 = x.a(str, new InlineTextContent(new Placeholder(TextUnitKt.pack(TextUnit.m5340getRawTypeimpl(m4700getFontSizeXSAIIZE), TextUnit.m5342getValueimpl(m4700getFontSizeXSAIIZE) * (m2781getWidthimpl / m2778getHeightimpl)), materialTheme.getTypography(composer, i10).getBody1().m4700getFontSizeXSAIIZE(), i8, null), ComposableLambdaKt.composableLambda(composer, -737684954, true, new l(aVar, painterResource))));
            linkedHashMap.put(a9.c(), a9.d());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return linkedHashMap;
    }

    private static final State h(AnnotatedString annotatedString, Map map, C4224g c4224g, int i8, Function0 function0, Composer composer, int i9) {
        composer.startReplaceableGroup(-1863307166);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1863307166, i9, -1, "com.stripe.android.uicore.text.rememberRemoteImages (Html.kt:146)");
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        for (Object obj : stringAnnotations) {
            String str = (String) ((AnnotatedString.Range) obj).getItem();
            if (AbstractC4227j.a(str) && !map.keySet().contains(str)) {
                arrayList.add(obj);
            }
        }
        composer.startReplaceableGroup(-1903942547);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AbstractC3815N.a(Q.h());
            composer.updateRememberedValue(rememberedValue);
        }
        w wVar = (w) rememberedValue;
        composer.endReplaceableGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-1903937156);
        if (!arrayList.isEmpty()) {
            EffectsKt.LaunchedEffect(annotatedString, new m(arrayList, wVar, function0, c4224g, density, i8, null), composer, (i9 & 14) | 64);
        }
        composer.endReplaceableGroup();
        State a9 = A4.f.a(wVar, composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return a9;
    }
}
