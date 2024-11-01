package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LiveLiteralKt {
    private static boolean isLiveLiteralsEnabled;
    private static final HashMap<String, MutableState<Object>> liveLiteralCache = new HashMap<>();

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        isLiveLiteralsEnabled = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return isLiveLiteralsEnabled;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static final <T> State<T> liveLiteral(String str, T t8) {
        HashMap<String, MutableState<Object>> hashMap = liveLiteralCache;
        MutableState<Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
            hashMap.put(str, mutableState);
        }
        AbstractC3292y.g(mutableState, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return mutableState;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(String str, Object obj) {
        boolean z8;
        HashMap<String, MutableState<Object>> hashMap = liveLiteralCache;
        MutableState<Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            hashMap.put(str, mutableState);
            z8 = false;
        } else {
            z8 = true;
        }
        MutableState<Object> mutableState2 = mutableState;
        if (z8) {
            mutableState2.setValue(obj);
        }
    }
}
