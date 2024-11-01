package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewbinding.R;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidViewBindingKt {
    @Composable
    public static final <T extends ViewBinding> void AndroidViewBinding(InterfaceC2073o interfaceC2073o, Modifier modifier, Function1 function1, Composer composer, int i8, int i9) {
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (startRestartGroup.changedInstance(interfaceC2073o) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i11 = i9 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i12 = i9 & 4;
        if (i12 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (i12 != 0) {
                function1 = AndroidViewBindingKt$AndroidViewBinding$1.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i10, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:79)");
            }
            AndroidViewBinding(interfaceC2073o, modifier, null, null, function1, startRestartGroup, (i10 & 14) | 384 | (i10 & 112) | ((i10 << 6) & 57344), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Function1 function12 = function1;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidViewBindingKt$AndroidViewBinding$2(interfaceC2073o, modifier2, function12, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachFragmentContainerView(ViewGroup viewGroup, Function1 function1) {
        if (viewGroup instanceof FragmentContainerView) {
            function1.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt instanceof ViewGroup) {
                forEachFragmentContainerView((ViewGroup) childAt, function1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(R.id.binding_reference);
        AbstractC3292y.g(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> void setBinding(View view, T t8) {
        view.setTag(R.id.binding_reference, t8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:1|(1:3)(2:103|(3:105|(1:107)(1:109)|108)(1:110))|4|(1:6)(2:96|(37:98|(1:100)(1:102)|101|8|(1:10)(2:89|(34:91|(1:93)(1:95)|94|12|(1:14)(2:82|(31:84|(1:86)(1:88)|87|16|(1:18)(2:75|(7:77|(1:79)(1:81)|80|20|(16:(1:32)(1:74)|33|(1:35)(1:73)|(1:37)(1:72)|(1:39)(1:71)|40|(1:42)|43|(4:65|66|67|68)|47|(3:49|(1:63)|53)(1:64)|54|(1:62)|58|(1:60)|61)(1:24)|25|(2:27|28)(1:30)))|19|20|(1:22)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(1:45)|65|66|67|68|47|(0)(0)|54|(1:56)|62|58|(0)|61|25|(0)(0)))|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|54|(0)|62|58|(0)|61|25|(0)(0)))|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|54|(0)|62|58|(0)|61|25|(0)(0)))|7|8|(0)(0)|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|54|(0)|62|58|(0)|61|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f7, code lost:            r8 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0048  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends androidx.viewbinding.ViewBinding> void AndroidViewBinding(c6.InterfaceC2073o r16, androidx.compose.ui.Modifier r17, kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding(c6.o, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
