package androidx.core.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface WindowInsetsAnimationControlListenerCompat {
    void onCancelled(@Nullable WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat);

    void onFinished(@NonNull WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat);

    void onReady(@NonNull WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat, int i8);
}
