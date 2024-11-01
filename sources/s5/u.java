package s5;

import android.text.Layout;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class u {
    public static final boolean a(TextView textView) {
        int lineCount;
        AbstractC3292y.i(textView, "<this>");
        Layout layout = textView.getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            return true;
        }
        return false;
    }
}
