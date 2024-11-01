package androidx.core.view.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.platform.coreshims.b;
import androidx.compose.ui.platform.coreshims.c;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewStructureCompat;
import androidx.core.view.autofill.AutofillIdCompat;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
public class ContentCaptureSessionCompat {
    private static final String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final View mView;
    private final Object mWrappedObj;

    @RequiresApi(23)
    /* loaded from: classes3.dex */
    private static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static Bundle getExtras(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    private static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newAutofillId(autofillId, j8);
        }

        @DoNotInline
        static ViewStructure newViewStructure(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @DoNotInline
        static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j8);
        }

        @DoNotInline
        static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @DoNotInline
        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @DoNotInline
        static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @RequiresApi(34)
    /* loaded from: classes3.dex */
    private static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        static void notifyViewsAppeared(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    @RequiresApi(29)
    private ContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }

    @NonNull
    @RequiresApi(29)
    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(@NonNull ContentCaptureSession contentCaptureSession, @NonNull View view) {
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    @Nullable
    public AutofillId newAutofillId(long j8) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession a9 = b.a(this.mWrappedObj);
            AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            return Api29Impl.newAutofillId(a9, autofillId.toAutofillId(), j8);
        }
        return null;
    }

    @Nullable
    public ViewStructureCompat newVirtualViewStructure(@NonNull AutofillId autofillId, long j8) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(Api29Impl.newVirtualViewStructure(b.a(this.mWrappedObj), autofillId, j8));
        }
        return null;
    }

    public void notifyViewTextChanged(@NonNull AutofillId autofillId, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewTextChanged(b.a(this.mWrappedObj), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(@NonNull List<ViewStructure> list) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            Api34Impl.notifyViewsAppeared(b.a(this.mWrappedObj), list);
            return;
        }
        if (i8 >= 29) {
            ViewStructure newViewStructure = Api29Impl.newViewStructure(b.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(b.a(this.mWrappedObj), newViewStructure);
            for (int i9 = 0; i9 < list.size(); i9++) {
                Api29Impl.notifyViewAppeared(b.a(this.mWrappedObj), c.a(list.get(i9)));
            }
            ViewStructure newViewStructure2 = Api29Impl.newViewStructure(b.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(b.a(this.mWrappedObj), newViewStructure2);
        }
    }

    public void notifyViewsDisappeared(@NonNull long[] jArr) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            ContentCaptureSession a9 = b.a(this.mWrappedObj);
            AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            Api29Impl.notifyViewsDisappeared(a9, autofillId.toAutofillId(), jArr);
            return;
        }
        if (i8 >= 29) {
            ViewStructure newViewStructure = Api29Impl.newViewStructure(b.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(b.a(this.mWrappedObj), newViewStructure);
            ContentCaptureSession a10 = b.a(this.mWrappedObj);
            AutofillIdCompat autofillId2 = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId2);
            Api29Impl.notifyViewsDisappeared(a10, autofillId2.toAutofillId(), jArr);
            ViewStructure newViewStructure2 = Api29Impl.newViewStructure(b.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(b.a(this.mWrappedObj), newViewStructure2);
        }
    }

    @NonNull
    @RequiresApi(29)
    public ContentCaptureSession toContentCaptureSession() {
        return b.a(this.mWrappedObj);
    }
}
