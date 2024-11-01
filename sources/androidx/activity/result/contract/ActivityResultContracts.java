package androidx.activity.result.contract;

import Q5.p;
import Q5.r;
import Q5.x;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.Q;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ActivityResultContracts {

    /* loaded from: classes.dex */
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            AbstractC3292y.h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i8, Intent intent) {
            return Boolean.valueOf(i8 == -1);
        }
    }

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class CreateDocument extends ActivityResultContract<String, Uri> {
        private final String mimeType;

        public CreateDocument(String mimeType) {
            AbstractC3292y.i(mimeType, "mimeType");
            this.mimeType = mimeType;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", input);
            AbstractC3292y.h(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public CreateDocument() {
            this("*/*");
        }
    }

    /* loaded from: classes.dex */
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            AbstractC3292y.h(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(18)
    /* loaded from: classes.dex */
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {
        public static final Companion Companion = new Companion(null);

        @RequiresApi(18)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final List<Uri> getClipDataUris$activity_release(Intent intent) {
                AbstractC3292y.i(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return AbstractC1435t.m();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i8 = 0; i8 < itemCount; i8++) {
                        Uri uri = clipData.getItemAt(i8).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            AbstractC3292y.h(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i8, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i8 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = Companion.getClipDataUris$activity_release(intent)) == null) ? AbstractC1435t.m() : clipDataUris$activity_release;
        }
    }

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String[] input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String[] input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            AbstractC3292y.h(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Uri uri) {
            AbstractC3292y.i(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri uri) {
            AbstractC3292y.i(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String[] input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, String[] input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            AbstractC3292y.h(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i8, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i8 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? AbstractC1435t.m() : clipDataUris$activity_release;
        }
    }

    /* loaded from: classes.dex */
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Void r22) {
            AbstractC3292y.i(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            AbstractC3292y.h(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {
        public static final Companion Companion = new Companion(null);
        private final int maxItems;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int getMaxItems$activity_release() {
                int pickImagesMaxLimit;
                if (PickVisualMedia.Companion.isSystemPickerAvailable$activity_release()) {
                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                    return pickImagesMaxLimit;
                }
                return Integer.MAX_VALUE;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        public /* synthetic */ PickMultipleVisualMedia(int i8, int i9, AbstractC3284p abstractC3284p) {
            this((i9 & 1) != 0 ? Companion.getMaxItems$activity_release() : i8);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @CallSuper
        public Intent createIntent(Context context, PickVisualMediaRequest input) {
            int pickImagesMaxLimit;
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            PickVisualMedia.Companion companion = PickVisualMedia.Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                int i8 = this.maxItems;
                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                if (i8 <= pickImagesMaxLimit) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                    return intent;
                }
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release != null) {
                    ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                    Intent intent2 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                    intent2.putExtra(PickVisualMedia.EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX, this.maxItems);
                    return intent2;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release != null) {
                    ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                    Intent intent3 = new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES);
                    intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent3.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                    return intent3;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent4;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final List<Uri> parseResult(int i8, Intent intent) {
            List<Uri> clipDataUris$activity_release;
            if (i8 != -1) {
                intent = null;
            }
            return (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) ? AbstractC1435t.m() : clipDataUris$activity_release;
        }

        public PickMultipleVisualMedia(int i8) {
            this.maxItems = i8;
            if (i8 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }

            public final ResolveInfo getGmsPicker$activity_release(Context context) {
                AbstractC3292y.i(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES), 1114112);
            }

            public final ResolveInfo getSystemFallbackPicker$activity_release(Context context) {
                AbstractC3292y.i(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), 1114112);
            }

            public final String getVisualMimeType$activity_release(VisualMediaType input) {
                AbstractC3292y.i(input, "input");
                if (input instanceof ImageOnly) {
                    return "image/*";
                }
                if (input instanceof VideoOnly) {
                    return "video/*";
                }
                if (input instanceof SingleMimeType) {
                    return ((SingleMimeType) input).getMimeType();
                }
                if (input instanceof ImageAndVideo) {
                    return null;
                }
                throw new p();
            }

            public final boolean isGmsPickerAvailable$activity_release(Context context) {
                AbstractC3292y.i(context, "context");
                if (getGmsPicker$activity_release(context) != null) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            public final boolean isSystemFallbackPickerAvailable$activity_release(Context context) {
                AbstractC3292y.i(context, "context");
                if (getSystemFallbackPicker$activity_release(context) != null) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isSystemPickerAvailable$activity_release() {
                int extensionVersion;
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 33) {
                    return true;
                }
                if (i8 >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 2) {
                        return true;
                    }
                }
                return false;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable(Context context) {
                AbstractC3292y.i(context, "context");
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
            }
        }

        /* loaded from: classes.dex */
        public static final class ImageAndVideo implements VisualMediaType {
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        /* loaded from: classes.dex */
        public static final class ImageOnly implements VisualMediaType {
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        /* loaded from: classes.dex */
        public static final class SingleMimeType implements VisualMediaType {
            private final String mimeType;

            public SingleMimeType(String mimeType) {
                AbstractC3292y.i(mimeType, "mimeType");
                this.mimeType = mimeType;
            }

            public final String getMimeType() {
                return this.mimeType;
            }
        }

        /* loaded from: classes.dex */
        public static final class VideoOnly implements VisualMediaType {
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        /* loaded from: classes.dex */
        public interface VisualMediaType {
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable() {
            return Companion.isPhotoPickerAvailable();
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, PickVisualMediaRequest input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable(Context context) {
            return Companion.isPhotoPickerAvailable(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, PickVisualMediaRequest input) {
            Intent intent;
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Companion companion = Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                return intent2;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release != null) {
                    ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                    intent = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                    intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release != null) {
                    ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                    intent = new Intent(GMS_ACTION_PICK_IMAGES);
                    intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Uri parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) AbstractC1435t.o0(GetMultipleContents.Companion.getClipDataUris$activity_release(intent));
            }
            return data;
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final Intent createIntent$activity_release(String[] input) {
                AbstractC3292y.i(input, "input");
                Intent putExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, input);
                AbstractC3292y.h(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return Companion.createIntent$activity_release(input);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            if (input.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(Q.h());
            }
            for (String str : input) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(Q.d(input.length), 16));
            for (String str2 : input) {
                r a9 = x.a(str2, Boolean.TRUE);
                linkedHashMap.put(a9.c(), a9.d());
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Map<String, Boolean> parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                return Q.h();
            }
            if (intent == null) {
                return Q.h();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
            int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i9 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i9 == 0));
                }
                return Q.u(AbstractC1435t.e1(AbstractC1428l.Z(stringArrayExtra), arrayList));
            }
            return Q.h();
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return RequestMultiplePermissions.Companion.createIntent$activity_release(new String[]{input});
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            if (ContextCompat.checkSelfPermission(context, input) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Boolean parseResult(int i8, Intent intent) {
            if (intent != null && i8 == -1) {
                int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
                boolean z8 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        if (intArrayExtra[i9] == 0) {
                            z8 = true;
                            break;
                        }
                        i9++;
                    }
                }
                return Boolean.valueOf(z8);
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Intent input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return input;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i8, Intent intent) {
            return new ActivityResult(i8, intent);
        }
    }

    /* loaded from: classes.dex */
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final Companion Companion = new Companion(null);
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, IntentSenderRequest input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent putExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, input);
            AbstractC3292y.h(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i8, Intent intent) {
            return new ActivityResult(i8, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            AbstractC3292y.h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Boolean parseResult(int i8, Intent intent) {
            return Boolean.valueOf(i8 == -1);
        }
    }

    /* loaded from: classes.dex */
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Void r22) {
            AbstractC3292y.i(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Void r22) {
            AbstractC3292y.i(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra(DataSchemeDataSource.SCHEME_DATA);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Uri input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        public Intent createIntent(Context context, Uri input) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            AbstractC3292y.h(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Bitmap parseResult(int i8, Intent intent) {
            if (i8 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra(DataSchemeDataSource.SCHEME_DATA);
            }
            return null;
        }
    }

    private ActivityResultContracts() {
    }
}
