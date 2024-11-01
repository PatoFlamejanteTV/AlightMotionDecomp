package u2;

import Q5.I;
import Q5.t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import r.AbstractC3847b;
import r.InterfaceC3848c;
import s4.C3962d;
import s4.C3965g;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4074a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0898a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f40207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3965g f40208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0898a(C3965g c3965g, U5.d dVar) {
            super(2, dVar);
            this.f40208b = c3965g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0898a(this.f40208b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f40207a == 0) {
                t.b(obj);
                this.f40208b.d(AbstractC4074a.d());
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0898a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f40209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3848c f40210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3962d f40211c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ State f40212d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3848c interfaceC3848c, C3962d c3962d, State state, U5.d dVar) {
            super(2, dVar);
            this.f40210b = interfaceC3848c;
            this.f40211c = c3962d;
            this.f40212d = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f40210b, this.f40211c, this.f40212d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f40209a == 0) {
                t.b(obj);
                AbstractC3847b.b(this.f40210b, Color.m2947copywmQWz5c$default(this.f40211c.a(), AbstractC4074a.b(this.f40212d), 0.0f, 0.0f, 0.0f, 14, null), false, null, 4, null);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f40213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3848c f40214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3848c interfaceC3848c, U5.d dVar) {
            super(2, dVar);
            this.f40214b = interfaceC3848c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f40214b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f40213a == 0) {
                t.b(obj);
                AbstractC3847b.a(this.f40214b, Color.Companion.m2983getTransparent0d7_KjU(), false, false, null, 12, null);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3965g f40215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f40216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f40217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f40218d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f40219e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f40220f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3965g c3965g, Modifier modifier, Function0 function0, InterfaceC2072n interfaceC2072n, int i8, int i9) {
            super(2);
            this.f40215a = c3965g;
            this.f40216b = modifier;
            this.f40217c = function0;
            this.f40218d = interfaceC2072n;
            this.f40219e = i8;
            this.f40220f = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4074a.a(this.f40215a, this.f40216b, this.f40217c, this.f40218d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40219e | 1), this.f40220f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(s4.C3965g r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function0 r23, c6.InterfaceC2072n r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.AbstractC4074a.a(s4.g, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final /* synthetic */ boolean d() {
        return e();
    }

    private static final boolean e() {
        return false;
    }
}
