package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class R0 {
    public static /* synthetic */ void a(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i8, Object obj) {
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        if (obj == null) {
            if ((i8 & 2) != 0) {
                function05 = null;
            } else {
                function05 = function0;
            }
            if ((i8 & 4) != 0) {
                function06 = null;
            } else {
                function06 = function02;
            }
            if ((i8 & 8) != 0) {
                function07 = null;
            } else {
                function07 = function03;
            }
            if ((i8 & 16) != 0) {
                function08 = null;
            } else {
                function08 = function04;
            }
            textToolbar.showMenu(rect, function05, function06, function07, function08);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }
}
