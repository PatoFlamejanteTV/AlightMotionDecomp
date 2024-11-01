package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ViewCompatShims {
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    private static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static ContentCaptureSession getContentCaptureSession(View view) {
            return view.getContentCaptureSession();
        }
    }

    @RequiresApi(30)
    /* loaded from: classes.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static void setImportantForContentCapture(View view, int i8) {
            view.setImportantForContentCapture(i8);
        }
    }

    private ViewCompatShims() {
    }

    @Nullable
    public static AutofillIdCompat getAutofillId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AutofillIdCompat.toAutofillIdCompat(Api26Impl.getAutofillId(view));
        }
        return null;
    }

    @Nullable
    public static ContentCaptureSessionCompat getContentCaptureSession(@NonNull View view) {
        ContentCaptureSession contentCaptureSession;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSession = Api29Impl.getContentCaptureSession(view)) == null) {
            return null;
        }
        return ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public static void setImportantForContentCapture(@NonNull View view, int i8) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setImportantForContentCapture(view, i8);
        }
    }
}
