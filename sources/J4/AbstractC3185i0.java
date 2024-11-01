package j4;

import R5.AbstractC1435t;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: j4.i0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3185i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f34145a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.i0$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f34146a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34147b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MutableState f34148c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f34149d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ UriHandler f34150e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j4.i0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0781a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MutableState f34151a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AnnotatedString f34152b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ UriHandler f34153c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0781a(MutableState mutableState, AnnotatedString annotatedString, UriHandler uriHandler) {
                super(1);
                this.f34151a = mutableState;
                this.f34152b = annotatedString;
                this.f34153c = uriHandler;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m5554invokek4lQ0M(((Offset) obj).m2722unboximpl());
                return Q5.I.f8786a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m5554invokek4lQ0M(long j8) {
                TextLayoutResult textLayoutResult = (TextLayoutResult) this.f34151a.getValue();
                if (textLayoutResult != null) {
                    AnnotatedString annotatedString = this.f34152b;
                    UriHandler uriHandler = this.f34153c;
                    int m4641getOffsetForPositionk4lQ0M = textLayoutResult.m4641getOffsetForPositionk4lQ0M(j8);
                    AnnotatedString.Range range = (AnnotatedString.Range) AbstractC1435t.o0(annotatedString.getStringAnnotations(m4641getOffsetForPositionk4lQ0M, m4641getOffsetForPositionk4lQ0M));
                    if (range != null && AbstractC3292y.d(range.getTag(), "URL")) {
                        uriHandler.openUri((String) range.getItem());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MutableState mutableState, AnnotatedString annotatedString, UriHandler uriHandler, U5.d dVar) {
            super(2, dVar);
            this.f34148c = mutableState;
            this.f34149d = annotatedString;
            this.f34150e = uriHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f34148c, this.f34149d, this.f34150e, dVar);
            aVar.f34147b = obj;
            return aVar;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(PointerInputScope pointerInputScope, U5.d dVar) {
            return ((a) create(pointerInputScope, dVar)).invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f34146a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f34147b;
                C0781a c0781a = new C0781a(this.f34148c, this.f34149d, this.f34150e);
                this.f34146a = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, c0781a, this, 7, null) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.i0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MutableState f34154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MutableState mutableState) {
            super(1);
            this.f34154a = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((TextLayoutResult) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(TextLayoutResult it) {
            AbstractC3292y.i(it, "it");
            this.f34154a.setValue(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j4.i0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f34156b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f34157c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextStyle f34158d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f34159e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f34160f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Modifier modifier, long j8, TextStyle textStyle, int i8, int i9) {
            super(2);
            this.f34155a = str;
            this.f34156b = modifier;
            this.f34157c = j8;
            this.f34158d = textStyle;
            this.f34159e = i8;
            this.f34160f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC3185i0.a(this.f34155a, this.f34156b, this.f34157c, this.f34158d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f34159e | 1), this.f34160f);
        }
    }

    static {
        Pattern compile = Pattern.compile("(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)", 42);
        AbstractC3292y.h(compile, "compile(...)");
        f34145a = compile;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144 A[LOOP:0: B:61:0x013e->B:63:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r36, androidx.compose.ui.Modifier r37, long r38, androidx.compose.ui.text.TextStyle r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.AbstractC3185i0.a(java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final List b(String str) {
        Matcher matcher = f34145a.matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int start = matcher.start(1);
            int end = matcher.end();
            String substring = str.substring(start, end);
            AbstractC3292y.h(substring, "substring(...)");
            if (!l6.n.B(substring, "http://", false, 2, null) && !l6.n.B(substring, "https://", false, 2, null)) {
                substring = "https://" + substring;
            }
            arrayList.add(new C3202r0(substring, start, end));
        }
        return arrayList;
    }
}
