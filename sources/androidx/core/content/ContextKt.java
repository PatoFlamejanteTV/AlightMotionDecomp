package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        AbstractC3292y.n(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, @AttrRes int i8, @StyleRes int i9, Function1 function1) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i8, i9);
        function1.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            attributeSet = null;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i8, i9);
        function1.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, @StyleRes int i8, int[] iArr, Function1 function1) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, iArr);
        function1.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
