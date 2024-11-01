package Y2;

import Q5.I;
import Y2.c;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import c6.InterfaceC2072n;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P2.e f11846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P2.d f11847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f11848c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11849d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f11850e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11851f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(P2.e eVar, P2.d dVar, k kVar, boolean z8, Function1 function1, int i8) {
            super(2);
            this.f11846a = eVar;
            this.f11847b = dVar;
            this.f11848c = kVar;
            this.f11849d = z8;
            this.f11850e = function1;
            this.f11851f = i8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8786a;
        }

        public final void invoke(Composer composer, int i8) {
            f.a(this.f11846a, this.f11847b, this.f11848c, this.f11849d, this.f11850e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11851f | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11852a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11853a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f12023a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f12024b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11853a = iArr;
        }
    }

    public static final void a(P2.e linkConfigurationCoordinator, P2.d configuration, k linkSignupMode, boolean z8, Function1 onLinkSignupStateChanged, Composer composer, int i8) {
        boolean z9;
        CreationExtras creationExtras;
        Composer composer2;
        AbstractC3292y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(linkSignupMode, "linkSignupMode");
        AbstractC3292y.i(onLinkSignupStateChanged, "onLinkSignupStateChanged");
        Composer startRestartGroup = composer.startRestartGroup(-868353516);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-868353516, i8, -1, "com.stripe.android.link.ui.inline.LinkElement (LinkElement.kt:24)");
        }
        startRestartGroup.startReplaceableGroup(1371639076);
        if ((((i8 & 14) ^ 6) > 4 && startRestartGroup.changed(linkConfigurationCoordinator)) || (i8 & 6) == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean changed = z9 | startRestartGroup.changed(configuration);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = linkConfigurationCoordinator.e(configuration);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        Object m2560rememberSaveable = RememberSaveableKt.m2560rememberSaveable(new Object[]{linkConfigurationCoordinator, configuration}, (Saver<Object, ? extends Object>) null, (String) null, (Function0) b.f11852a, startRestartGroup, 3080, 6);
        AbstractC3292y.h(m2560rememberSaveable, "rememberSaveable(...)");
        String str = (String) m2560rememberSaveable;
        c.a aVar = new c.a(linkSignupMode, (S2.b) rememberedValue);
        startRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
            if (current instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) Y2.c.class, current, str, aVar, creationExtras, startRestartGroup, 36936, 0);
            startRestartGroup.endReplaceableGroup();
            Y2.c cVar = (Y2.c) viewModel;
            int i9 = c.f11853a[cVar.r().ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    startRestartGroup.startReplaceableGroup(-427637412);
                    startRestartGroup.endReplaceableGroup();
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceableGroup(-427946079);
                    int i10 = i8 >> 6;
                    i.c(cVar, z8, onLinkSignupStateChanged, SizeKt.fillMaxWidth$default(PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5155constructorimpl(6), 1, null), 0.0f, 1, null), startRestartGroup, (i10 & 896) | (i10 & 112) | 3080, 0);
                    startRestartGroup.endReplaceableGroup();
                    composer2 = startRestartGroup;
                }
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(-428303447);
                int i11 = i8 >> 6;
                h.f(cVar, z8, onLinkSignupStateChanged, SizeKt.fillMaxWidth$default(PaddingKt.m579paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5155constructorimpl(6), 1, null), 0.0f, 1, null), composer2, (i11 & 112) | 3080 | (i11 & 896), 0);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(linkConfigurationCoordinator, configuration, linkSignupMode, z8, onLinkSignupStateChanged, i8));
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
