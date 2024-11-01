package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
interface StaticLayoutFactoryImpl {
    @DoNotInline
    StaticLayout create(StaticLayoutParams staticLayoutParams);

    boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z8);
}
