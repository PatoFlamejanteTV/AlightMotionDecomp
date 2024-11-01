package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;

/* loaded from: classes3.dex */
public interface NavDirections {
    @IdRes
    int getActionId();

    Bundle getArguments();
}
