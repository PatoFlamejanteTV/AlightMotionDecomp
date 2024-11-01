package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SupportSQLiteCompat {

    @RequiresApi(16)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void cancel(CancellationSignal cancellationSignal) {
            AbstractC3292y.i(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean deleteDatabase(File file) {
            AbstractC3292y.i(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void disableWriteAheadLogging(SQLiteDatabase sQLiteDatabase) {
            AbstractC3292y.i(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean isWriteAheadLoggingEnabled(SQLiteDatabase sQLiteDatabase) {
            AbstractC3292y.i(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
            AbstractC3292y.i(sQLiteDatabase, "sQLiteDatabase");
            AbstractC3292y.i(sql, "sql");
            AbstractC3292y.i(selectionArgs, "selectionArgs");
            AbstractC3292y.i(cancellationSignal, "cancellationSignal");
            AbstractC3292y.i(cursorFactory, "cursorFactory");
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
            AbstractC3292y.h(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return rawQueryWithFactory;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setForeignKeyConstraintsEnabled(SQLiteDatabase sQLiteDatabase, boolean z8) {
            AbstractC3292y.i(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z8);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setWriteAheadLoggingEnabled(SQLiteOpenHelper sQLiteOpenHelper, boolean z8) {
            AbstractC3292y.i(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z8);
        }
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final Uri getNotificationUri(Cursor cursor) {
            AbstractC3292y.i(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            AbstractC3292y.h(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            AbstractC3292y.i(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    @RequiresApi(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class Api21Impl {
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final File getNoBackupFilesDir(Context context) {
            AbstractC3292y.i(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            AbstractC3292y.h(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setExtras(Cursor cursor, Bundle extras) {
            AbstractC3292y.i(cursor, "cursor");
            AbstractC3292y.i(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final List<Uri> getNotificationUris(Cursor cursor) {
            AbstractC3292y.i(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            AbstractC3292y.f(notificationUris);
            return notificationUris;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setNotificationUris(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
            AbstractC3292y.i(cursor, "cursor");
            AbstractC3292y.i(cr, "cr");
            AbstractC3292y.i(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private SupportSQLiteCompat() {
    }
}
