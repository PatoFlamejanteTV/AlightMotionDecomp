package r;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3849d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f37662a = ColorKt.Color$default(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);

    /* renamed from: b, reason: collision with root package name */
    private static final Function1 f37663b = a.f37664a;

    /* renamed from: r.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37664a = new a();

        a() {
            super(1);
        }

        public final long a(long j8) {
            return ColorKt.m2993compositeOverOWjLjI(AbstractC3849d.f37662a, j8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Color.m2938boximpl(a(((Color) obj).m2958unboximpl()));
        }
    }

    private static final Window c(Context context) {
        while (!(context instanceof Activity)) {
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                AbstractC3292y.h(context, "getBaseContext(...)");
            } else {
                return null;
            }
        }
        return ((Activity) context).getWindow();
    }

    private static final Window d(Composer composer, int i8) {
        DialogWindowProvider dialogWindowProvider;
        composer.startReplaceableGroup(1009281237);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009281237, i8, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:192)");
        }
        ViewParent parent = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getParent();
        Window window = null;
        if (parent instanceof DialogWindowProvider) {
            dialogWindowProvider = (DialogWindowProvider) parent;
        } else {
            dialogWindowProvider = null;
        }
        if (dialogWindowProvider != null) {
            window = dialogWindowProvider.getWindow();
        }
        if (window == null) {
            Context context = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getContext();
            AbstractC3292y.h(context, "getContext(...)");
            window = c(context);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return window;
    }

    public static final InterfaceC3848c e(Window window, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-715745933);
        if ((i9 & 1) != 0) {
            window = d(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-715745933, i8, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:185)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(view) | composer.changed(window);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3846a(view, window);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C3846a c3846a = (C3846a) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3846a;
    }
}
