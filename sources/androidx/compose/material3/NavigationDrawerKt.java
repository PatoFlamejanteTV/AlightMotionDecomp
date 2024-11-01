package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class NavigationDrawerKt {
    private static final float DrawerVelocityThreshold = Dp.m5155constructorimpl(400);
    private static final float MinimumDrawerWidth = Dp.m5155constructorimpl(PsExtractor.VIDEO_STREAM_MASK);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX WARN: Removed duplicated region for block: B:107:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DismissibleDrawerSheet-afqeVBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1689DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, c6.InterfaceC2073o r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1689DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0075  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DismissibleNavigationDrawer(c6.InterfaceC2072n r29, androidx.compose.ui.Modifier r30, androidx.compose.material3.DrawerState r31, boolean r32, c6.InterfaceC2072n r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(c6.n, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DrawerSheet-vywBR7E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1690DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.graphics.Shape r28, long r29, long r31, float r33, c6.InterfaceC2073o r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1690DrawerSheetvywBR7E(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawerSheet-afqeVBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1691ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, c6.InterfaceC2073o r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1691ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalNavigationDrawer-FHprtrg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1692ModalNavigationDrawerFHprtrg(c6.InterfaceC2072n r32, androidx.compose.ui.Modifier r33, androidx.compose.material3.DrawerState r34, boolean r35, long r36, c6.InterfaceC2072n r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1692ModalNavigationDrawerFHprtrg(c6.n, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavigationDrawerItem(c6.InterfaceC2072n r35, boolean r36, kotlin.jvm.functions.Function0 r37, androidx.compose.ui.Modifier r38, c6.InterfaceC2072n r39, c6.InterfaceC2072n r40, androidx.compose.ui.graphics.Shape r41, androidx.compose.material3.NavigationDrawerItemColors r42, androidx.compose.foundation.interaction.MutableInteractionSource r43, androidx.compose.runtime.Composer r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(c6.n, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, c6.n, c6.n, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PermanentDrawerSheet-afqeVBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1693PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, float r31, androidx.compose.foundation.layout.WindowInsets r32, c6.InterfaceC2073o r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1693PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0055  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PermanentNavigationDrawer(c6.InterfaceC2072n r16, androidx.compose.ui.Modifier r17, c6.InterfaceC2072n r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer(c6.n, androidx.compose.ui.Modifier, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc */
    public static final void m1694ScrimBx497Mc(boolean z8, Function0 function0, Function0 function02, long j8, Composer composer, int i8) {
        int i9;
        Modifier modifier;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(2106487387);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(function0)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(function02)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(j8)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i9, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:854)");
            }
            String m1772getStringNWtq28 = Strings_androidKt.m1772getStringNWtq28(Strings.Companion.m1762getCloseDraweradMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1858703137);
            if (z8) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(function0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (InterfaceC2072n) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed(m1772getStringNWtq28) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new NavigationDrawerKt$Scrim$dismissDrawer$2$1(m1772getStringNWtq28, function0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                modifier = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
            Color m2938boximpl = Color.m2938boximpl(j8);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed3 = startRestartGroup.changed(m2938boximpl) | startRestartGroup.changed(function02);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new NavigationDrawerKt$Scrim$1$1(j8, function02);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationDrawerKt$Scrim$2(z8, function0, function02, j8, i8));
        }
    }

    public static final float calculateFraction(float f8, float f9, float f10) {
        return m.j((f10 - f8) / (f9 - f8), 0.0f, 1.0f);
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final DrawerState rememberDrawerState(DrawerValue initialValue, Function1 function1, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(2098699222);
        if ((i9 & 2) != 0) {
            function1 = NavigationDrawerKt$rememberDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i8, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:225)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(initialValue) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NavigationDrawerKt$rememberDrawerState$2$1(initialValue, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }
}
