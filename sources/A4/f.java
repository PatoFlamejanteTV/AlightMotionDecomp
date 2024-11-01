package A4;

import Q5.C1413h;
import Q5.I;
import Q5.t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f174a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3813L interfaceC3813L) {
            super(0);
            this.f174a = interfaceC3813L;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f174a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f175a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f176b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3813L f177c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProduceStateScope f178a;

            a(ProduceStateScope produceStateScope) {
                this.f178a = produceStateScope;
            }

            @Override // q6.InterfaceC3822g
            public final Object emit(Object obj, U5.d dVar) {
                this.f178a.setValue(obj);
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3813L interfaceC3813L, U5.d dVar) {
            super(2, dVar);
            this.f177c = interfaceC3813L;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(this.f177c, dVar);
            bVar.f176b = obj;
            return bVar;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(ProduceStateScope produceStateScope, U5.d dVar) {
            return ((b) create(produceStateScope, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f175a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.f176b;
                InterfaceC3813L interfaceC3813L = this.f177c;
                a aVar = new a(produceStateScope);
                this.f175a = 1;
                if (interfaceC3813L.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f179a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f180b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2072n f181c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MutableState f182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2072n interfaceC2072n, MutableState mutableState, U5.d dVar) {
            super(2, dVar);
            this.f181c = interfaceC2072n;
            this.f182d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            c cVar = new c(this.f181c, this.f182d, dVar);
            cVar.f180b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f179a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                M m8 = (M) this.f180b;
                InterfaceC2072n interfaceC2072n = this.f181c;
                d dVar = new d(this.f182d, m8.getCoroutineContext());
                this.f179a = 1;
                if (interfaceC2072n.invoke(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public static final State a(InterfaceC3813L interfaceC3813L, Composer composer, int i8) {
        AbstractC3292y.i(interfaceC3813L, "<this>");
        composer.startReplaceableGroup(-419709006);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-419709006, i8, -1, "com.stripe.android.uicore.utils.collectAsState (StateFlowsCompose.kt:42)");
        }
        composer.startReplaceableGroup(-2023564304);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a(interfaceC3813L);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State b9 = b((Function0) rememberedValue, interfaceC3813L, new b(interfaceC3813L, null), composer, 582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return b9;
    }

    private static final State b(Function0 function0, Object obj, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(2085798134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085798134, i8, -1, "com.stripe.android.uicore.utils.produceState (StateFlowsCompose.kt:32)");
        }
        composer.startReplaceableGroup(-1742439704);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0.invoke(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(obj, new c(interfaceC2072n, mutableState, null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
